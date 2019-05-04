package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncodeNameRole extends js.Object {
  var encode: Anon_Update
  var name: java.lang.String
  var role: java.lang.String
  var `type`: java.lang.String
}

object Anon_EncodeNameRole {
  @scala.inline
  def apply(encode: Anon_Update, name: java.lang.String, role: java.lang.String, `type`: java.lang.String): Anon_EncodeNameRole = {
    val __obj = js.Dynamic.literal(encode = encode, name = name, role = role)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_EncodeNameRole]
  }
}

