package typings.tcomb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdentityKindMap extends js.Object {
  var identity: Boolean
  var kind: String
  var map: js.Object
  var name: String
}

object Anon_IdentityKindMap {
  @scala.inline
  def apply(identity: Boolean, kind: String, map: js.Object, name: String): Anon_IdentityKindMap = {
    val __obj = js.Dynamic.literal(identity = identity, kind = kind, map = map, name = name)
  
    __obj.asInstanceOf[Anon_IdentityKindMap]
  }
}

