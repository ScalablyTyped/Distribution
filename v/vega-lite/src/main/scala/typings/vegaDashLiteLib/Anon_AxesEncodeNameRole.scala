package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AxesEncodeNameRole extends js.Object {
  var axes: js.Array[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgAxis]
  var encode: Anon_Update
  var name: java.lang.String
  var role: java.lang.String
  var `type`: java.lang.String
}

object Anon_AxesEncodeNameRole {
  @scala.inline
  def apply(
    axes: js.Array[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgAxis],
    encode: Anon_Update,
    name: java.lang.String,
    role: java.lang.String,
    `type`: java.lang.String
  ): Anon_AxesEncodeNameRole = {
    val __obj = js.Dynamic.literal(axes = axes, encode = encode, name = name, role = role)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_AxesEncodeNameRole]
  }
}

