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
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_IdentityKindMap]
  }
}

