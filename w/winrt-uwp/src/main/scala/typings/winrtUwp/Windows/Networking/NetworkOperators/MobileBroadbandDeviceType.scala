package typings.winrtUwp.Windows.Networking.NetworkOperators

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
  
}

