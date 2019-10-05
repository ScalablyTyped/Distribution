package typings.winrtDashUwp.Windows.Devices.WiFiDirect.Services

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
  sealed trait aborted extends WiFiDirectServiceAdvertisementStatus
  
  /** Advertiser has been created. */
  @js.native
  sealed trait created extends WiFiDirectServiceAdvertisementStatus
  
  /** Advertiser has been started. */
  @js.native
  sealed trait started extends WiFiDirectServiceAdvertisementStatus
  
  /** Advertiser has been stopped. */
  @js.native
  sealed trait stopped extends WiFiDirectServiceAdvertisementStatus
  
  /* 3 */ val aborted: typings.winrtDashUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceAdvertisementStatus.aborted with Double = js.native
  /* 0 */ val created: typings.winrtDashUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceAdvertisementStatus.created with Double = js.native
  /* 1 */ val started: typings.winrtDashUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceAdvertisementStatus.started with Double = js.native
  /* 2 */ val stopped: typings.winrtDashUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceAdvertisementStatus.stopped with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WiFiDirectServiceAdvertisementStatus with Double] = js.native
}

