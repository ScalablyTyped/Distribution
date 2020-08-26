package typings.winjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Inline extends js.Object {
  /**
    * When the pane is closed, it occupies space leaving less room for the SplitView's content.
    **/
  var `inline`: String = js.native
  /**
    * When the pane is closed, it is not visible and doesn't take up any space.
    **/
  var none: String = js.native
}

object Inline {
  @scala.inline
  def apply(`inline`: String, none: String): Inline = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any])
    __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inline]
  }
  @scala.inline
  implicit class InlineOps[Self <: Inline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInline(value: String): Self = this.set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def setNone(value: String): Self = this.set("none", value.asInstanceOf[js.Any])
  }
  
}

