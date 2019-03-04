package typings
package typedocLib.distLibSerializationBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerReflectionContainer[TChildren] extends js.Object {
  var children: js.Array[TChildren]
}

object ContainerReflectionContainer {
  @scala.inline
  def apply[TChildren](children: js.Array[TChildren]): ContainerReflectionContainer[TChildren] = {
    val __obj = js.Dynamic.literal(children = children)
  
    __obj.asInstanceOf[ContainerReflectionContainer[TChildren]]
  }
}

