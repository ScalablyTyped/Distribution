package typings.vegaDashLite

import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgAxis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AxesEncodeNameRole extends js.Object {
  var axes: js.Array[VgAxis]
  var encode: Anon_Update
  var name: String
  var role: String
  var `type`: String
}

object Anon_AxesEncodeNameRole {
  @scala.inline
  def apply(axes: js.Array[VgAxis], encode: Anon_Update, name: String, role: String, `type`: String): Anon_AxesEncodeNameRole = {
    val __obj = js.Dynamic.literal(axes = axes, encode = encode, name = name, role = role)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_AxesEncodeNameRole]
  }
}

