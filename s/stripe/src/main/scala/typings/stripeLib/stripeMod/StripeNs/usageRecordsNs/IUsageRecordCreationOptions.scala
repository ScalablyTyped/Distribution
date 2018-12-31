package typings
package stripeLib.stripeMod.StripeNs.usageRecordsNs

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
  var quantity: scala.Double
  /**
    * The timestamp for the usage event. This timestamp must be within the current billing period of the subscription of the provided subscription_item
    */
  var timestamp: scala.Double
}

