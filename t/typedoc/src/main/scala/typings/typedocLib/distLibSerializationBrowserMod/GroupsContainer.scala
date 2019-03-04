package typings
package typedocLib.distLibSerializationBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupsContainer[T] extends js.Object {
  var groups: js.Array[T]
}

object GroupsContainer {
  @scala.inline
  def apply[T](groups: js.Array[T]): GroupsContainer[T] = {
    val __obj = js.Dynamic.literal(groups = groups)
  
    __obj.asInstanceOf[GroupsContainer[T]]
  }
}

