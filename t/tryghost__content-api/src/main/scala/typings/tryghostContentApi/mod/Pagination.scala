package typings.tryghostContentApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pagination extends js.Object {
  var limit: Double
  var next: Nullable[Double]
  var page: Double
  var pages: Double
  var prev: Nullable[Double]
  var total: Double
}

object Pagination {
  @scala.inline
  def apply(
    limit: Double,
    page: Double,
    pages: Double,
    total: Double,
    next: Int | Double = null,
    prev: Int | Double = null
  ): Pagination = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (prev != null) __obj.updateDynamic("prev")(prev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pagination]
  }
}

