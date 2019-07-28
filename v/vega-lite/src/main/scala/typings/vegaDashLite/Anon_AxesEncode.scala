package typings.vegaDashLite

import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgAxis
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgComparator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AxesEncode extends js.Object {
  var axes: js.Array[VgAxis]
  var encode: Anon_Update
  var from: Anon_Data
  var name: String
  var role: String
  var sort: VgComparator
  var `type`: String
}

object Anon_AxesEncode {
  @scala.inline
  def apply(
    axes: js.Array[VgAxis],
    encode: Anon_Update,
    from: Anon_Data,
    name: String,
    role: String,
    sort: VgComparator,
    `type`: String
  ): Anon_AxesEncode = {
    val __obj = js.Dynamic.literal(axes = axes, encode = encode, from = from, name = name, role = role, sort = sort)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_AxesEncode]
  }
}

