package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncodeName extends js.Object {
  var encode: Anon_Update
  var name: java.lang.String
  var role: java.lang.String
  var title: Anon_Encode | Anon_OffsetOrient
  var `type`: java.lang.String
}

object Anon_EncodeName {
  @scala.inline
  def apply(
    encode: Anon_Update,
    name: java.lang.String,
    role: java.lang.String,
    title: Anon_Encode | Anon_OffsetOrient,
    `type`: java.lang.String
  ): Anon_EncodeName = {
    val __obj = js.Dynamic.literal(encode = encode, name = name, role = role, title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_EncodeName]
  }
}

