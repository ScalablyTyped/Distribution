package typings.stripe

import typings.stripe.mod.IDateFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFulfilled extends js.Object {
  /**
    * A filter on the list based on the object canceled field. The value can be a string with an integer Unix timestamp,
    * or it can be a dictionary with the following options:
    */
  var canceled: js.UndefOr[IDateFilter] = js.undefined
  /**
    * A filter on the list based on the object fulfilled field. The value can be a string with an integer Unix timestamp,
    * or it can be a dictionary with the following options:
    */
  var fulfilled: js.UndefOr[IDateFilter] = js.undefined
  /**
    * A filter on the list based on the object paid field. The value can be a string with an integer Unix timestamp,
    * or it can be a dictionary with the following options:
    */
  var paid: js.UndefOr[IDateFilter] = js.undefined
  /**
    * A filter on the list based on the object returned field. The value can be a string with an integer Unix timestamp,
    * or it can be a dictionary with the following options:
    */
  var returned: js.UndefOr[IDateFilter] = js.undefined
}

object AnonFulfilled {
  @scala.inline
  def apply(
    canceled: IDateFilter = null,
    fulfilled: IDateFilter = null,
    paid: IDateFilter = null,
    returned: IDateFilter = null
  ): AnonFulfilled = {
    val __obj = js.Dynamic.literal()
    if (canceled != null) __obj.updateDynamic("canceled")(canceled.asInstanceOf[js.Any])
    if (fulfilled != null) __obj.updateDynamic("fulfilled")(fulfilled.asInstanceOf[js.Any])
    if (paid != null) __obj.updateDynamic("paid")(paid.asInstanceOf[js.Any])
    if (returned != null) __obj.updateDynamic("returned")(returned.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFulfilled]
  }
}

