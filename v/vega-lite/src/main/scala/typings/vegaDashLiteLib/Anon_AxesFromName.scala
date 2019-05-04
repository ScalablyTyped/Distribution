package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AxesFromName extends js.Object {
  var axes: js.Array[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgAxis]
  var from: Anon_Data
  var name: java.lang.String
  var role: java.lang.String
  var sort: vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgComparator
  var `type`: java.lang.String
}

object Anon_AxesFromName {
  @scala.inline
  def apply(
    axes: js.Array[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgAxis],
    from: Anon_Data,
    name: java.lang.String,
    role: java.lang.String,
    sort: vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgComparator,
    `type`: java.lang.String
  ): Anon_AxesFromName = {
    val __obj = js.Dynamic.literal(axes = axes, from = from, name = name, role = role, sort = sort)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_AxesFromName]
  }
}

