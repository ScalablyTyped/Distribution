package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AxesName extends js.Object {
  var axes: js.Array[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgAxis]
  var name: java.lang.String
  var role: java.lang.String
  var title: Anon_Encode | Anon_OffsetOrient
  var `type`: java.lang.String
}

object Anon_AxesName {
  @scala.inline
  def apply(
    axes: js.Array[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgAxis],
    name: java.lang.String,
    role: java.lang.String,
    title: Anon_Encode | Anon_OffsetOrient,
    `type`: java.lang.String
  ): Anon_AxesName = {
    val __obj = js.Dynamic.literal(axes = axes, name = name, role = role, title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_AxesName]
  }
}

