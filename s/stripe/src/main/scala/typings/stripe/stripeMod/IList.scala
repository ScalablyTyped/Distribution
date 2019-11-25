package typings.stripe.stripeMod

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
  var has_more: Boolean
  /**
    * Value is 'list'
    */
  var `object`: String
  /**
    * The total number of items available. This value is not included by default,
    * but you can request it by specifying ?include[]=total_count
    */
  var total_count: js.UndefOr[Double] = js.undefined
  /**
    * The URL for accessing this list.
    */
  var url: String
}

object IList {
  @scala.inline
  def apply[T](
    data: js.Array[T],
    has_more: Boolean,
    `object`: String,
    url: String,
    total_count: Int | Double = null
  ): IList[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], has_more = has_more.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (total_count != null) __obj.updateDynamic("total_count")(total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[IList[T]]
  }
}

