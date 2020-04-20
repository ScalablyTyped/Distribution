package typings.vue2Editor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueEditorWatch extends js.Object {
  def disabled(status: Boolean): Unit
  def value(`val`: js.Any): Unit
}

object VueEditorWatch {
  @scala.inline
  def apply(disabled: Boolean => Unit, value: js.Any => Unit): VueEditorWatch = {
    val __obj = js.Dynamic.literal(disabled = js.Any.fromFunction1(disabled), value = js.Any.fromFunction1(value))
    __obj.asInstanceOf[VueEditorWatch]
  }
}

