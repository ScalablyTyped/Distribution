package typings.vegaDashLite

import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgComparator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncodeFrom extends js.Object {
  var encode: Anon_Update
  var from: Anon_Data
  var name: String
  var role: String
  var sort: VgComparator
  var title: Anon_Encode | Anon_OffsetOrient
  var `type`: String
}

object Anon_EncodeFrom {
  @scala.inline
  def apply(
    encode: Anon_Update,
    from: Anon_Data,
    name: String,
    role: String,
    sort: VgComparator,
    title: Anon_Encode | Anon_OffsetOrient,
    `type`: String
  ): Anon_EncodeFrom = {
    val __obj = js.Dynamic.literal(encode = encode, from = from, name = name, role = role, sort = sort, title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_EncodeFrom]
  }
}

