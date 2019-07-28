package typings.vegaDashLite

import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgAxis
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgComparator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AxesFrom extends js.Object {
  var axes: js.Array[VgAxis]
  var from: Anon_Data
  var name: String
  var role: String
  var sort: VgComparator
  var title: Anon_Encode | Anon_OffsetOrient
  var `type`: String
}

object Anon_AxesFrom {
  @scala.inline
  def apply(
    axes: js.Array[VgAxis],
    from: Anon_Data,
    name: String,
    role: String,
    sort: VgComparator,
    title: Anon_Encode | Anon_OffsetOrient,
    `type`: String
  ): Anon_AxesFrom = {
    val __obj = js.Dynamic.literal(axes = axes, from = from, name = name, role = role, sort = sort, title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_AxesFrom]
  }
}

