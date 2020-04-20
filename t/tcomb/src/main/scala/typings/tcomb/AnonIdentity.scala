package typings.tcomb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdentity extends js.Object {
  var identity: Boolean
  var kind: String
  var name: String
}

object AnonIdentity {
  @scala.inline
  def apply(identity: Boolean, kind: String, name: String): AnonIdentity = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIdentity]
  }
}

