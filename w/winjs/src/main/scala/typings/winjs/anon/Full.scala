package typings.winjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Full extends js.Object {
  /**
    * When the ToolBar is closed, the height of the ToolBar is reduced such that button commands are still visible, but their labels are hidden.
    **/
  var compact: String = js.native
  /**
    * When the ToolBar is closed, the height of the ToolBar is always sized to content.
    **/
  var full: String = js.native
}

object Full {
  @scala.inline
  def apply(compact: String, full: String): Full = {
    val __obj = js.Dynamic.literal(compact = compact.asInstanceOf[js.Any], full = full.asInstanceOf[js.Any])
    __obj.asInstanceOf[Full]
  }
  @scala.inline
  implicit class FullOps[Self <: Full] (val x: Self) extends AnyVal {
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
    def setCompact(value: String): Self = this.set("compact", value.asInstanceOf[js.Any])
    @scala.inline
    def setFull(value: String): Self = this.set("full", value.asInstanceOf[js.Any])
  }
  
}

