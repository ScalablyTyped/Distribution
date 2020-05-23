package typings.tcomb.anon

import typings.tcomb.mod.Constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type[T] extends js.Object {
  var identity: Boolean
  var kind: String
  var name: String
  var `type`: Constructor[T]
}

object Type {
  @scala.inline
  def apply[T](identity: Boolean, kind: String, name: String, `type`: Constructor[T]): Type[T] = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type[T]]
  }
}

