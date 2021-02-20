package typings.winrtUwp.Windows.Devices.WiFiDirect.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WiFiDirectServiceAdvertisementStatus extends StObject
/** Values used for WiFiDirectServiceAdvertiser.AdvertisementStatus . */
@JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceAdvertisementStatus")
@js.native
object WiFiDirectServiceAdvertisementStatus extends StObject {
  
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
}
