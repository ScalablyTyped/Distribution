package typings.vue2DashDatepicker.vue2DashDatepickerMod.Datepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shortcuts extends js.Object {
  var text: String
  def onClick(): js.Any
}

object Shortcuts {
  @scala.inline
  def apply(onClick: () => js.Any, text: String): Shortcuts = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction0(onClick), text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Shortcuts]
  }
}

