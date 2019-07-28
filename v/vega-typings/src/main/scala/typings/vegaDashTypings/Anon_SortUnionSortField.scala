package typings.vegaDashTypings

import typings.vegaDashTypings.typesSpecScaleMod.UnionSortField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SortUnionSortField extends js.Object {
  var sort: js.UndefOr[UnionSortField] = js.undefined
}

object Anon_SortUnionSortField {
  @scala.inline
  def apply(sort: UnionSortField = null): Anon_SortUnionSortField = {
    val __obj = js.Dynamic.literal()
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_SortUnionSortField]
  }
}

