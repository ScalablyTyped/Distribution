package typings.vegaDashLite

import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgComparator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncodeFromName extends js.Object {
  var encode: Anon_Update
  var from: Anon_Data
  var name: String
  var role: String
  var sort: VgComparator
  var `type`: String
}

object Anon_EncodeFromName {
  @scala.inline
  def apply(
    encode: Anon_Update,
    from: Anon_Data,
    name: String,
    role: String,
    sort: VgComparator,
    `type`: String
  ): Anon_EncodeFromName = {
    val __obj = js.Dynamic.literal(encode = encode, from = from, name = name, role = role, sort = sort)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_EncodeFromName]
  }
}

