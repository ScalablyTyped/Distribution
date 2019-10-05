package typings.winrtDashUwp.Windows.Networking.NetworkOperators

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
  
  /* 1 */ val embedded: typings.winrtDashUwp.Windows.Networking.NetworkOperators.MobileBroadbandDeviceType.embedded with Double = js.native
  /* 3 */ val remote: typings.winrtDashUwp.Windows.Networking.NetworkOperators.MobileBroadbandDeviceType.remote with Double = js.native
  /* 2 */ val removable: typings.winrtDashUwp.Windows.Networking.NetworkOperators.MobileBroadbandDeviceType.removable with Double = js.native
  /* 0 */ val unknown: typings.winrtDashUwp.Windows.Networking.NetworkOperators.MobileBroadbandDeviceType.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MobileBroadbandDeviceType with Double] = js.native
}

