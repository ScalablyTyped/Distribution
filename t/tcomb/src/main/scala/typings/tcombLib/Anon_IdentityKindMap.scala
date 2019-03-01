package typings
package tcombLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdentityKindMap extends js.Object {
  var identity: scala.Boolean
  var kind: java.lang.String
  var map: js.Object
  var name: java.lang.String
}

object Anon_IdentityKindMap {
  @scala.inline
  def apply(identity: scala.Boolean, kind: java.lang.String, map: js.Object, name: java.lang.String): Anon_IdentityKindMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("identity")(identity)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_IdentityKindMap]
  }
}

