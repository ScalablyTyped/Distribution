package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WiFiDirectServiceAdvertisementStatus extends js.Object

/** Values used for WiFiDirectServiceAdvertiser.AdvertisementStatus . */
@JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceAdvertisementStatus")
@js.native
object WiFiDirectServiceAdvertisementStatus extends js.Object {
  /** Advertiser has been aborted. The advertiser object's ServiceError property has a specific error code describing the reason. */
  @js.native
  sealed trait aborted
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceAdvertisementStatus
  
  /** Advertiser has been created. */
  @js.native
  sealed trait created
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceAdvertisementStatus
  
  /** Advertiser has been started. */
  @js.native
  sealed trait started
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceAdvertisementStatus
  
  /** Advertiser has been stopped. */
  @js.native
  sealed trait stopped
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceAdvertisementStatus
  
  val aborted: aborted with java.lang.String = js.native
  val created: created with java.lang.String = js.native
  val started: started with java.lang.String = js.native
  val stopped: stopped with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceAdvertisementStatus with java.lang.String
  ] = js.native
}

