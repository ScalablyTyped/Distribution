package typings.stripe.stripeMod.usageRecords

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUsageRecordCreationOptions extends js.Object {
  /**
    * Valid values are increment (default) or set. When using increment the specified quantity will be added to the usage at the specified
    * timestamp. The set action will overwrite the usage quantity at that timestamp.
    */
  var action: js.UndefOr[IUsageRecordAction] = js.undefined
  /**
    * The usage quantity for the specified timestamp
    */
  var quantity: Double
  /**
    * The timestamp for the usage event. This timestamp must be within the current billing period of the subscription of the provided subscription_item
    */
  var timestamp: Double
}

object IUsageRecordCreationOptions {
  @scala.inline
  def apply(quantity: Double, timestamp: Double, action: IUsageRecordAction = null): IUsageRecordCreationOptions = {
    val __obj = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUsageRecordCreationOptions]
  }
}

