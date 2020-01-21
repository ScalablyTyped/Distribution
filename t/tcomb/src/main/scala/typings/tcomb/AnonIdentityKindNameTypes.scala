package typings.tcomb

import typings.tcomb.mod.Constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdentityKindNameTypes extends js.Object {
  var identity: Boolean
  var kind: String
  var name: String
  var types: js.Array[Constructor[_]]
}

object AnonIdentityKindNameTypes {
  @scala.inline
  def apply(identity: Boolean, kind: String, name: String, types: js.Array[Constructor[_]]): AnonIdentityKindNameTypes = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIdentityKindNameTypes]
  }
}

