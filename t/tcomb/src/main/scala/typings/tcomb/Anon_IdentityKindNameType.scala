package typings.tcomb

import typings.tcomb.tcombMod.Constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdentityKindNameType[T] extends js.Object {
  var identity: Boolean
  var kind: String
  var name: String
  var `type`: Constructor[T]
}

object Anon_IdentityKindNameType {
  @scala.inline
  def apply[T](identity: Boolean, kind: String, name: String, `type`: Constructor[T]): Anon_IdentityKindNameType[T] = {
    val __obj = js.Dynamic.literal(identity = identity, kind = kind, name = name)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IdentityKindNameType[T]]
  }
}

