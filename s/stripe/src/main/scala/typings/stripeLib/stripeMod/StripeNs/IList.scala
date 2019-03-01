package typings
package stripeLib.stripeMod.StripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IList[T] extends js.Object {
  /**
    * An array containing the actual response elements, paginated by any request parameters.
    */
  var data: js.Array[T]
  /**
    * Whether or not there are more elements available after this set. If false, this set comprises the end of the list.
    */
  var has_more: scala.Boolean
  /**
    * Value is 'list'
    */
  var `object`: java.lang.String
  /**
    * The total number of items available. This value is not included by default,
    * but you can request it by specifying ?include[]=total_count
    */
  var total_count: js.UndefOr[scala.Double] = js.undefined
  /**
    * The URL for accessing this list.
    */
  var url: java.lang.String
}

object IList {
  @scala.inline
  def apply[T](
    data: js.Array[T],
    has_more: scala.Boolean,
    `object`: java.lang.String,
    url: java.lang.String,
    total_count: scala.Int | scala.Double = null
  ): IList[T] = {
    val __obj = js.Dynamic.literal(`object` = `object`)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("has_more")(has_more)
    __obj.updateDynamic("url")(url)
    if (total_count != null) __obj.updateDynamic("total_count")(total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[IList[T]]
  }
}

