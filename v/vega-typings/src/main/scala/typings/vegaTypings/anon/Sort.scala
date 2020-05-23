package typings.vegaTypings.anon

import typings.vegaTypings.scaleMod.SortField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sort extends js.Object {
  var sort: js.UndefOr[SortField] = js.undefined
}

object Sort {
  @scala.inline
  def apply(sort: SortField = null): Sort = {
    val __obj = js.Dynamic.literal()
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sort]
  }
}

