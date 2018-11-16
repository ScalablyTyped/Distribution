package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

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
  sealed trait embedded
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandDeviceType
  
  /** The device is remote. For example, a tethered cellular phone modem. */
  @js.native
  sealed trait remote
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandDeviceType
  
  /** The device is removable. */
  @js.native
  sealed trait removable
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandDeviceType
  
  /** The device type is unknown. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandDeviceType
  
  val embedded: embedded with java.lang.String = js.native
  val remote: remote with java.lang.String = js.native
  val removable: removable with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandDeviceType with java.lang.String
  ] = js.native
}

