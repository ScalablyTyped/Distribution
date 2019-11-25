package typings.tcomb

import typings.tcomb.tcombMod.Constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdentityKindNameTypesArray[T] extends js.Object {
  var identity: Boolean
  var kind: String
  var name: String
  var types: js.Array[Constructor[T]]
}

object Anon_IdentityKindNameTypesArray {
  @scala.inline
  def apply[T](identity: Boolean, kind: String, name: String, types: js.Array[Constructor[T]]): Anon_IdentityKindNameTypesArray[T] = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_IdentityKindNameTypesArray[T]]
  }
}

