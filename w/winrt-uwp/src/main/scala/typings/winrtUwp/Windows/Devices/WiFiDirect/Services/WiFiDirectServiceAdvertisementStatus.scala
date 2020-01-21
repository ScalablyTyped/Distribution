package typings.winrtUwp.Windows.Devices.WiFiDirect.Services

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WiFiDirectServiceAdvertisementStatus with Double] = js.native
  /* 3 */ @js.native
  object aborted extends TopLevel[aborted with Double]
  
  /* 0 */ @js.native
  object created extends TopLevel[created with Double]
  
  /* 1 */ @js.native
  object started extends TopLevel[started with Double]
  
  /* 2 */ @js.native
  object stopped extends TopLevel[stopped with Double]
  
}

