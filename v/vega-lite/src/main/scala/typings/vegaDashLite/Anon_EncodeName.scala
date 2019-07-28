package typings.vegaDashLite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncodeName extends js.Object {
  var encode: Anon_Update
  var name: String
  var role: String
  var title: Anon_Encode | Anon_OffsetOrient
  var `type`: String
}

object Anon_EncodeName {
  @scala.inline
  def apply(
    encode: Anon_Update,
    name: String,
    role: String,
    title: Anon_Encode | Anon_OffsetOrient,
    `type`: String
  ): Anon_EncodeName = {
    val __obj = js.Dynamic.literal(encode = encode, name = name, role = role, title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_EncodeName]
  }
}

