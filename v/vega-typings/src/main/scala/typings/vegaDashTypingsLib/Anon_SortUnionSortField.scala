package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SortUnionSortField extends js.Object {
  var sort: js.UndefOr[vegaDashTypingsLib.typesSpecScaleMod.UnionSortField] = js.undefined
}

object Anon_SortUnionSortField {
  @scala.inline
  def apply(sort: vegaDashTypingsLib.typesSpecScaleMod.UnionSortField = null): Anon_SortUnionSortField = {
    val __obj = js.Dynamic.literal()
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_SortUnionSortField]
  }
}

