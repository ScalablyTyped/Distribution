package typings
package stripeLib.stripeMod.StripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IListOptionsCreated extends IListOptions {
  /**
    * A filter on the list based on the object created field. The value can be a string with an integer Unix timestamp, or it can
    * be a dictionary.
    */
  var created: js.UndefOr[java.lang.String | IDateFilter] = js.undefined
}

