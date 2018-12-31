package typings
package stripeLib.stripeMod.StripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IListOptions extends IDataOptions {
  /**
    * A cursor for use in pagination. ending_before is an object ID that defines your place in the list. For instance, if you make
    * a list request and receive 100 objects, starting with obj_bar, your subsequent call can include ending_before=obj_bar in
    * order to fetch the previous page of the list.
    */
  var ending_before: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A limit on the number of objects to be returned. Limit can range between 1 and 100 items.
    */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /**
    * A cursor for use in pagination. starting_after is an object ID that defines your place in the list. For instance, if you make
    * a list request and receive 100 objects, ending with obj_foo, your subsequent call can include starting_after=obj_foo in order
    * to fetch the next page of the list.
    */
  var starting_after: js.UndefOr[java.lang.String] = js.undefined
}

