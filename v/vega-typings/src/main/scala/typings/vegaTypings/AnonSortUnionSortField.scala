package typings.vegaTypings

import typings.vegaTypings.scaleMod.UnionSortField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSortUnionSortField extends js.Object {
  var sort: js.UndefOr[UnionSortField] = js.undefined
}

object AnonSortUnionSortField {
  @scala.inline
  def apply(sort: UnionSortField = null): AnonSortUnionSortField = {
    val __obj = js.Dynamic.literal()
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSortUnionSortField]
  }
}

