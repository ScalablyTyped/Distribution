package typings.winrtUwp.Windows.Services.Store

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides additional data for a product SKU that the user has an entitlement to use. */
trait StoreCollectionData extends js.Object {
  /** Gets the date on which the product SKU was acquired. */
  var acquiredDate: Date
  /** Gets the promotion campaign ID that is associated with the product SKU. */
  var campaignId: String
  /** Gets the developer offer ID that is associated with the product SKU. */
  var developerOfferId: String
  /** Gets the end date of the trial for the product SKU, if the SKU is a trial version or a durable add-on that expires after a set duration. */
  var endDate: Date
  /** Gets complete collection data for the product SKU in JSON format. */
  var extendedJsonData: String
  /** Gets a value that indicates whether the product SKU is a trial version. */
  var isTrial: Boolean
  /** Gets the start date of the trial for the product SKU, if the SKU is a trial version or a durable add-on that expires after a set duration. */
  var startDate: Date
  /** Gets the remaining trial time for the product SKU. */
  var trialTimeRemaining: Double
}

object StoreCollectionData {
  @scala.inline
  def apply(
    acquiredDate: Date,
    campaignId: String,
    developerOfferId: String,
    endDate: Date,
    extendedJsonData: String,
    isTrial: Boolean,
    startDate: Date,
    trialTimeRemaining: Double
  ): StoreCollectionData = {
    val __obj = js.Dynamic.literal(acquiredDate = acquiredDate.asInstanceOf[js.Any], campaignId = campaignId.asInstanceOf[js.Any], developerOfferId = developerOfferId.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], extendedJsonData = extendedJsonData.asInstanceOf[js.Any], isTrial = isTrial.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], trialTimeRemaining = trialTimeRemaining.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreCollectionData]
  }
}

