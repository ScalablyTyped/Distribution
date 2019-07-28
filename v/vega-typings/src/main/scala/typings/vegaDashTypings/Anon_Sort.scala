package typings.vegaDashTypings

import typings.vegaDashTypings.typesSpecScaleMod.SortField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Sort extends js.Object {
  var sort: js.UndefOr[SortField] = js.undefined
}

object Anon_Sort {
  @scala.inline
  def apply(sort: SortField = null): Anon_Sort = {
    val __obj = js.Dynamic.literal()
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Sort]
  }
}

