package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionOptions extends js.Object {
  var highlightEdges: js.UndefOr[Boolean] = js.native
  var unselectAll: js.UndefOr[Boolean] = js.native
}

object SelectionOptions {
  @scala.inline
  def apply(): SelectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectionOptions]
  }
  @scala.inline
  implicit class SelectionOptionsOps[Self <: SelectionOptions] (val x: Self) extends AnyVal {
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
    def setHighlightEdges(value: Boolean): Self = this.set("highlightEdges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightEdges: Self = this.set("highlightEdges", js.undefined)
    @scala.inline
    def setUnselectAll(value: Boolean): Self = this.set("unselectAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnselectAll: Self = this.set("unselectAll", js.undefined)
  }
  
}

