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
  def apply(renderUI: js.Function1[js.Object, js.Object]): Theme = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("renderUI")(renderUI)
    __obj.asInstanceOf[Theme]
  }
}

