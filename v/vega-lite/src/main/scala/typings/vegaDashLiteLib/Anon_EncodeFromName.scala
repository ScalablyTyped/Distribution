package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncodeFromName extends js.Object {
  var encode: Anon_Update
  var from: Anon_Data
  var name: java.lang.String
  var role: java.lang.String
  var sort: vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgComparator
  var `type`: java.lang.String
}

object Anon_EncodeFromName {
  @scala.inline
  def apply(
    encode: Anon_Update,
    from: Anon_Data,
    name: java.lang.String,
    role: java.lang.String,
    sort: vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgComparator,
    `type`: java.lang.String
  ): Anon_EncodeFromName = {
    val __obj = js.Dynamic.literal(encode = encode, from = from, name = name, role = role, sort = sort)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_EncodeFromName]
  }
}

