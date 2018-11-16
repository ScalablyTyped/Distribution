package typings
package winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides additional data for a product SKU that the user has an entitlement to use. */
@JSGlobal("Windows.Services.Store.StoreCollectionData")
@js.native
abstract class StoreCollectionData () extends js.Object {
  /** Gets the date on which the product SKU was acquired. */
  var acquiredDate: stdLib.Date = js.native
  /** Gets the promotion campaign ID that is associated with the product SKU. */
  var campaignId: java.lang.String = js.native
  /** Gets the developer offer ID that is associated with the product SKU. */
  var developerOfferId: java.lang.String = js.native
  /** Gets the end date of the trial for the product SKU, if the SKU is a trial version or a durable add-on that expires after a set duration. */
  var endDate: stdLib.Date = js.native
  /** Gets complete collection data for the product SKU in JSON format. */
  var extendedJsonData: java.lang.String = js.native
  /** Gets a value that indicates whether the product SKU is a trial version. */
  var isTrial: scala.Boolean = js.native
  /** Gets the start date of the trial for the product SKU, if the SKU is a trial version or a durable add-on that expires after a set duration. */
  var startDate: stdLib.Date = js.native
  /** Gets the remaining trial time for the product SKU. */
  var trialTimeRemaining: scala.Double = js.native
}

