package typings
package tinymceLib.tinymceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Theme extends js.Object {
  def renderUI(obj: js.Object): js.Object
}

object Theme {
  @scala.inline
  def apply(renderUI: js.Object => js.Object): Theme = {
    val __obj = js.Dynamic.literal(renderUI = js.Any.fromFunction1(renderUI))
  
    __obj.asInstanceOf[Theme]
  }
}

