package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AxesNameRole extends js.Object {
  var axes: js.Array[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgAxis]
  var name: java.lang.String
  var role: java.lang.String
  var `type`: java.lang.String
}

object Anon_AxesNameRole {
  @scala.inline
  def apply(
    axes: js.Array[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgAxis],
    name: java.lang.String,
    role: java.lang.String,
    `type`: java.lang.String
  ): Anon_AxesNameRole = {
    val __obj = js.Dynamic.literal(axes = axes, name = name, role = role)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_AxesNameRole]
  }
}

