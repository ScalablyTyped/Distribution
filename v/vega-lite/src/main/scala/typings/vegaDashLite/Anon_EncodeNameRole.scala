package typings.vegaDashLite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncodeNameRole extends js.Object {
  var encode: Anon_Update
  var name: String
  var role: String
  var `type`: String
}

object Anon_EncodeNameRole {
  @scala.inline
  def apply(encode: Anon_Update, name: String, role: String, `type`: String): Anon_EncodeNameRole = {
    val __obj = js.Dynamic.literal(encode = encode, name = name, role = role)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_EncodeNameRole]
  }
}

