package typings.tablesorter.resizingOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizingOptions extends js.Object {
  /**
    * A value indicating whether column widths are saved locally.
    */
  var resizable: js.UndefOr[Boolean] = js.native
  /**
    * A value indicating whether the last column should have a resize-handle.
    */
  var resizable_addLastColumn: js.UndefOr[Boolean] = js.native
  /**
    * A value indicating whether the user can resize the columns inside the footer.
    */
  var resizable_includeFooter: js.UndefOr[Boolean] = js.native
  /**
    * A value indicating whether always the last column should shrink when resizing.
    */
  var resizable_targetLast: js.UndefOr[Boolean] = js.native
  /**
    * The number of milliseconds to wait before raising the `mousemove`-event.
    */
  var resizable_throttle: js.UndefOr[Boolean | Double] = js.native
  /**
    * The initial widths of the columns.
    */
  var resizable_widths: js.UndefOr[js.Array[String]] = js.native
}

object ResizingOptions {
  @scala.inline
  def apply(): ResizingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizingOptions]
  }
  @scala.inline
  implicit class ResizingOptionsOps[Self <: ResizingOptions] (val x: Self) extends AnyVal {
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
    def setResizable(value: Boolean): Self = this.set("resizable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    @scala.inline
    def setResizable_addLastColumn(value: Boolean): Self = this.set("resizable_addLastColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizable_addLastColumn: Self = this.set("resizable_addLastColumn", js.undefined)
    @scala.inline
    def setResizable_includeFooter(value: Boolean): Self = this.set("resizable_includeFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizable_includeFooter: Self = this.set("resizable_includeFooter", js.undefined)
    @scala.inline
    def setResizable_targetLast(value: Boolean): Self = this.set("resizable_targetLast", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizable_targetLast: Self = this.set("resizable_targetLast", js.undefined)
    @scala.inline
    def setResizable_throttle(value: Boolean | Double): Self = this.set("resizable_throttle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizable_throttle: Self = this.set("resizable_throttle", js.undefined)
    @scala.inline
    def setResizable_widthsVarargs(value: String*): Self = this.set("resizable_widths", js.Array(value :_*))
    @scala.inline
    def setResizable_widths(value: js.Array[String]): Self = this.set("resizable_widths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizable_widths: Self = this.set("resizable_widths", js.undefined)
  }
  
}

