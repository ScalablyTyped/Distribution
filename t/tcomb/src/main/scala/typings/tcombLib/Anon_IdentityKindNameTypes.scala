package typings
package tcombLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdentityKindNameTypes extends js.Object {
  var identity: scala.Boolean
  var kind: java.lang.String
  var name: java.lang.String
  var types: js.Array[Constructor[_]]
}

object Anon_IdentityKindNameTypes {
  @scala.inline
  def apply(
    identity: scala.Boolean,
    kind: java.lang.String,
    name: java.lang.String,
    types: js.Array[Constructor[_]]
  ): Anon_IdentityKindNameTypes = {
    val __obj = js.Dynamic.literal(identity = identity, kind = kind, name = name, types = types)
  
    __obj.asInstanceOf[Anon_IdentityKindNameTypes]
  }
}

