package typings.winrt.Windows.Graphics.Printing

import typings.winrt.Windows.Foundation.Rect
import typings.winrt.Windows.Foundation.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintPageDescription extends js.Object {
  var dpiX: Double = js.native
  var dpiY: Double = js.native
  var imageableRect: Rect = js.native
  var pageSize: Size = js.native
}

object PrintPageDescription {
  @scala.inline
  def apply(dpiX: Double, dpiY: Double, imageableRect: Rect, pageSize: Size): PrintPageDescription = {
    val __obj = js.Dynamic.literal(dpiX = dpiX.asInstanceOf[js.Any], dpiY = dpiY.asInstanceOf[js.Any], imageableRect = imageableRect.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintPageDescription]
  }
  @scala.inline
  implicit class PrintPageDescriptionOps[Self <: PrintPageDescription] (val x: Self) extends AnyVal {
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
    def setDpiX(value: Double): Self = this.set("dpiX", value.asInstanceOf[js.Any])
    @scala.inline
    def setDpiY(value: Double): Self = this.set("dpiY", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageableRect(value: Rect): Self = this.set("imageableRect", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageSize(value: Size): Self = this.set("pageSize", value.asInstanceOf[js.Any])
  }
  
}

