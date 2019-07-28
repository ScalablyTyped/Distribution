package typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MobileBroadbandDeviceType extends js.Object

/** Describes different types of Mobile Broadband devices. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandDeviceType")
@js.native
object MobileBroadbandDeviceType extends js.Object {
  /** The device is embedded in the system. */
  @js.native
  sealed trait embedded extends MobileBroadbandDeviceType
  
  /** The device is remote. For example, a tethered cellular phone modem. */
  @js.native
  sealed trait remote extends MobileBroadbandDeviceType
  
  /** The device is removable. */
  @js.native
  sealed trait removable extends MobileBroadbandDeviceType
  
  /** The device type is unknown. */
  @js.native
  sealed trait unknown extends MobileBroadbandDeviceType
  
  /* 1 */ val embedded: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandDeviceType.embedded with Double = js.native
  /* 3 */ val remote: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandDeviceType.remote with Double = js.native
  /* 2 */ val removable: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandDeviceType.removable with Double = js.native
  /* 0 */ val unknown: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandDeviceType.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MobileBroadbandDeviceType with Double] = js.native
}

