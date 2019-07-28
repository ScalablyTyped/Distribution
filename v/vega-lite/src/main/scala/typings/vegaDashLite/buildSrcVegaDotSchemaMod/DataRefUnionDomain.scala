package typings.vegaDashLite.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataRefUnionDomain extends _VgDomain {
  var fields: js.Array[js.Array[_] | VgDataRef | VgSignalRef]
  var sort: js.UndefOr[VgUnionSortField] = js.undefined
}

object DataRefUnionDomain {
  @scala.inline
  def apply(fields: js.Array[js.Array[_] | VgDataRef | VgSignalRef], sort: VgUnionSortField = null): DataRefUnionDomain = {
    val __obj = js.Dynamic.literal(fields = fields)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[DataRefUnionDomain]
  }
}

