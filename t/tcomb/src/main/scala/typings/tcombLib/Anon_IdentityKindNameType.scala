package typings
package tcombLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdentityKindNameType[T] extends js.Object {
  var identity: scala.Boolean
  var kind: java.lang.String
  var name: java.lang.String
  var `type`: Constructor[T]
}

object Anon_IdentityKindNameType {
  @scala.inline
  def apply[T](identity: scala.Boolean, kind: java.lang.String, name: java.lang.String, `type`: Constructor[T]): Anon_IdentityKindNameType[T] = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("identity")(identity)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_IdentityKindNameType[T]]
  }
}

