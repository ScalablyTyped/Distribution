package typings.vegaDashLite

import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgAxis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AxesEncodeName extends js.Object {
  var axes: js.Array[VgAxis]
  var encode: Anon_Update
  var name: String
  var role: String
  var title: Anon_Encode | Anon_OffsetOrient
  var `type`: String
}

object Anon_AxesEncodeName {
  @scala.inline
  def apply(
    axes: js.Array[VgAxis],
    encode: Anon_Update,
    name: String,
    role: String,
    title: Anon_Encode | Anon_OffsetOrient,
    `type`: String
  ): Anon_AxesEncodeName = {
    val __obj = js.Dynamic.literal(axes = axes, encode = encode, name = name, role = role, title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_AxesEncodeName]
  }
}

