package typings
package vegaDashLiteLib.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgFieldRefUnionDomain extends _VgDomain {
  var data: java.lang.String
  var fields: js.Array[VgFieldRef]
  var sort: js.UndefOr[VgUnionSortField] = js.undefined
}

object VgFieldRefUnionDomain {
  @scala.inline
  def apply(data: java.lang.String, fields: js.Array[VgFieldRef], sort: VgUnionSortField = null): VgFieldRefUnionDomain = {
    val __obj = js.Dynamic.literal(data = data, fields = fields)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[VgFieldRefUnionDomain]
  }
}

