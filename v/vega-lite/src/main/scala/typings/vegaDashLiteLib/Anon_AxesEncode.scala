package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AxesEncode extends js.Object {
  var axes: js.Array[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgAxis]
  var encode: Anon_Update
  var from: Anon_Data
  var name: java.lang.String
  var role: java.lang.String
  var sort: vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgComparator
  var `type`: java.lang.String
}

object Anon_AxesEncode {
  @scala.inline
  def apply(
    axes: js.Array[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgAxis],
    encode: Anon_Update,
    from: Anon_Data,
    name: java.lang.String,
    role: java.lang.String,
    sort: vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgComparator,
    `type`: java.lang.String
  ): Anon_AxesEncode = {
    val __obj = js.Dynamic.literal(axes = axes, encode = encode, from = from, name = name, role = role, sort = sort)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_AxesEncode]
  }
}

