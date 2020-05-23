package typings.tcomb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identity extends js.Object {
  var identity: Boolean
  var kind: String
  var name: String
}

object Identity {
  @scala.inline
  def apply(identity: Boolean, kind: String, name: String): Identity = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identity]
  }
}

