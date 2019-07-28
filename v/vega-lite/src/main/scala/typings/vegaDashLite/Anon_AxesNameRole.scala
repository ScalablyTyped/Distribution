package typings.vegaDashLite

import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgAxis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AxesNameRole extends js.Object {
  var axes: js.Array[VgAxis]
  var name: String
  var role: String
  var `type`: String
}

object Anon_AxesNameRole {
  @scala.inline
  def apply(axes: js.Array[VgAxis], name: String, role: String, `type`: String): Anon_AxesNameRole = {
    val __obj = js.Dynamic.literal(axes = axes, name = name, role = role)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_AxesNameRole]
  }
}

