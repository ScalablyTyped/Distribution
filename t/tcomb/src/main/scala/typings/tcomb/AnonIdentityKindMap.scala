package typings.tcomb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdentityKindMap extends js.Object {
  var identity: Boolean
  var kind: String
  var map: js.Object
  var name: String
}

object AnonIdentityKindMap {
  @scala.inline
  def apply(identity: Boolean, kind: String, map: js.Object, name: String): AnonIdentityKindMap = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIdentityKindMap]
  }
}

