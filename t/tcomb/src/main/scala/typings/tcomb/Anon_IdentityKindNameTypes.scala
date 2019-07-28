package typings.tcomb

import typings.tcomb.tcombMod.Constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdentityKindNameTypes extends js.Object {
  var identity: Boolean
  var kind: String
  var name: String
  var types: js.Array[Constructor[_]]
}

object Anon_IdentityKindNameTypes {
  @scala.inline
  def apply(identity: Boolean, kind: String, name: String, types: js.Array[Constructor[_]]): Anon_IdentityKindNameTypes = {
    val __obj = js.Dynamic.literal(identity = identity, kind = kind, name = name, types = types)
  
    __obj.asInstanceOf[Anon_IdentityKindNameTypes]
  }
}

