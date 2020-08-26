package typings.winrtUwp.Windows.Services.Store

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides additional data for a product SKU that the user has an entitlement to use. */
@js.native
trait StoreCollectionData extends js.Object {
  /** Gets the date on which the product SKU was acquired. */
  var acquiredDate: Date = js.native
  /** Gets the promotion campaign ID that is associated with the product SKU. */
  var campaignId: String = js.native
  /** Gets the developer offer ID that is associated with the product SKU. */
  var developerOfferId: String = js.native
  /** Gets the end date of the trial for the product SKU, if the SKU is a trial version or a durable add-on that expires after a set duration. */
  var endDate: Date = js.native
  /** Gets complete collection data for the product SKU in JSON format. */
  var extendedJsonData: String = js.native
  /** Gets a value that indicates whether the product SKU is a trial version. */
  var isTrial: Boolean = js.native
  /** Gets the start date of the trial for the product SKU, if the SKU is a trial version or a durable add-on that expires after a set duration. */
  var startDate: Date = js.native
  /** Gets the remaining trial time for the product SKU. */
  var trialTimeRemaining: Double = js.native
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
  @scala.inline
  implicit class StoreCollectionDataOps[Self <: StoreCollectionData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAcquiredDate(value: Date): Self = this.set("acquiredDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setCampaignId(value: String): Self = this.set("campaignId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeveloperOfferId(value: String): Self = this.set("developerOfferId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndDate(value: Date): Self = this.set("endDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtendedJsonData(value: String): Self = this.set("extendedJsonData", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsTrial(value: Boolean): Self = this.set("isTrial", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartDate(value: Date): Self = this.set("startDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrialTimeRemaining(value: Double): Self = this.set("trialTimeRemaining", value.asInstanceOf[js.Any])
  }
  
}

