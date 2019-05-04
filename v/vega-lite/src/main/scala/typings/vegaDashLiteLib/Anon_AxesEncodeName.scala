package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AxesEncodeName extends js.Object {
  var axes: js.Array[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgAxis]
  var encode: Anon_Update
  var name: java.lang.String
  var role: java.lang.String
  var title: Anon_Encode | Anon_OffsetOrient
  var `type`: java.lang.String
}

object Anon_AxesEncodeName {
  @scala.inline
  def apply(
    axes: js.Array[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgAxis],
    encode: Anon_Update,
    name: java.lang.String,
    role: java.lang.String,
    title: Anon_Encode | Anon_OffsetOrient,
    `type`: java.lang.String
  ): Anon_AxesEncodeName = {
    val __obj = js.Dynamic.literal(axes = axes, encode = encode, name = name, role = role, title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_AxesEncodeName]
  }
}

