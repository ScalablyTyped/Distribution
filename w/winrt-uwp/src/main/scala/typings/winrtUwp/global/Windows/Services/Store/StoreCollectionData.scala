package typings.winrtUwp.global.Windows.Services.Store

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides additional data for a product SKU that the user has an entitlement to use. */
@JSGlobal("Windows.Services.Store.StoreCollectionData")
@js.native
abstract class StoreCollectionData ()
  extends typings.winrtUwp.Windows.Services.Store.StoreCollectionData {
  /** Gets the date on which the product SKU was acquired. */
  /* CompleteClass */
  override var acquiredDate: Date = js.native
  /** Gets the promotion campaign ID that is associated with the product SKU. */
  /* CompleteClass */
  override var campaignId: String = js.native
  /** Gets the developer offer ID that is associated with the product SKU. */
  /* CompleteClass */
  override var developerOfferId: String = js.native
  /** Gets the end date of the trial for the product SKU, if the SKU is a trial version or a durable add-on that expires after a set duration. */
  /* CompleteClass */
  override var endDate: Date = js.native
  /** Gets complete collection data for the product SKU in JSON format. */
  /* CompleteClass */
  override var extendedJsonData: String = js.native
  /** Gets a value that indicates whether the product SKU is a trial version. */
  /* CompleteClass */
  override var isTrial: Boolean = js.native
  /** Gets the start date of the trial for the product SKU, if the SKU is a trial version or a durable add-on that expires after a set duration. */
  /* CompleteClass */
  override var startDate: Date = js.native
  /** Gets the remaining trial time for the product SKU. */
  /* CompleteClass */
  override var trialTimeRemaining: Double = js.native
}

