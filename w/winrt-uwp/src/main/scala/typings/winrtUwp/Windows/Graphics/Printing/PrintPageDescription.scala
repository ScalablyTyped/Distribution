package typings.winrtUwp.Windows.Graphics.Printing

import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.Foundation.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the data that describes a document page. */
@js.native
trait PrintPageDescription extends js.Object {
  
  /** The resolution in dots per inch (DPI) for the X dimension of the page. */
  var dpiX: Double = js.native
  
  /** The resolution in dots per inch (DPI) for the Y dimension of the page. */
  var dpiY: Double = js.native
  
  /** The Rect within the page size on which content may actually be printed. Content outside of the ImageableRect, whether less or greater than the page size, will be cropped by the print target. The ImageableRect is specified in device independent pixels (DIPs). */
  var imageableRect: Rect = js.native
  
  /** The page size in device independent pixels (DIPs). */
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
