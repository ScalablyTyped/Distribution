package typings
package vue2DashEditorLib.vue2DashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueEditorWatch extends js.Object {
  def disabled(status: scala.Boolean): scala.Unit
  def value(`val`: js.Any): scala.Unit
}

object VueEditorWatch {
  @scala.inline
  def apply(disabled: scala.Boolean => scala.Unit, value: js.Any => scala.Unit): VueEditorWatch = {
    val __obj = js.Dynamic.literal(disabled = js.Any.fromFunction1(disabled), value = js.Any.fromFunction1(value))
  
    __obj.asInstanceOf[VueEditorWatch]
  }
}

