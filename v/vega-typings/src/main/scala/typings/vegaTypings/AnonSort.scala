package typings.vegaTypings

import typings.vegaTypings.scaleMod.SortField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSort extends js.Object {
  var sort: js.UndefOr[SortField] = js.undefined
}

object AnonSort {
  @scala.inline
  def apply(sort: SortField = null): AnonSort = {
    val __obj = js.Dynamic.literal()
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSort]
  }
}

