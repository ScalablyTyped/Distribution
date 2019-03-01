package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Sort extends js.Object {
  var sort: js.UndefOr[vegaDashTypingsLib.typesSpecScaleMod.SortField] = js.undefined
}

object Anon_Sort {
  @scala.inline
  def apply(sort: vegaDashTypingsLib.typesSpecScaleMod.SortField = null): Anon_Sort = {
    val __obj = js.Dynamic.literal()
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Sort]
  }
}

