package typings.vue2DashDatepicker.vue2DashDatepickerMod.DatepickerNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shortcuts extends js.Object {
  var end: Date
  var start: Date
  var text: String
}

object Shortcuts {
  @scala.inline
  def apply(end: Date, start: Date, text: String): Shortcuts = {
    val __obj = js.Dynamic.literal(end = end, start = start, text = text)
  
    __obj.asInstanceOf[Shortcuts]
  }
}

