package typings.vegaDashLite

import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgAxis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AxesName extends js.Object {
  var axes: js.Array[VgAxis]
  var name: String
  var role: String
  var title: Anon_Encode | Anon_OffsetOrient
  var `type`: String
}

object Anon_AxesName {
  @scala.inline
  def apply(
    axes: js.Array[VgAxis],
    name: String,
    role: String,
    title: Anon_Encode | Anon_OffsetOrient,
    `type`: String
  ): Anon_AxesName = {
    val __obj = js.Dynamic.literal(axes = axes, name = name, role = role, title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_AxesName]
  }
}

