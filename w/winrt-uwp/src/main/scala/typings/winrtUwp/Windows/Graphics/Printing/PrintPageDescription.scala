package typings.winrtUwp.Windows.Graphics.Printing

import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.Foundation.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the data that describes a document page. */
trait PrintPageDescription extends StObject {
  
  /** The resolution in dots per inch (DPI) for the X dimension of the page. */
  var dpiX: Double
  
  /** The resolution in dots per inch (DPI) for the Y dimension of the page. */
  var dpiY: Double
  
  /** The Rect within the page size on which content may actually be printed. Content outside of the ImageableRect, whether less or greater than the page size, will be cropped by the print target. The ImageableRect is specified in device independent pixels (DIPs). */
  var imageableRect: Rect
  
  /** The page size in device independent pixels (DIPs). */
  var pageSize: Size
}
object PrintPageDescription {
  
  @scala.inline
  def apply(dpiX: Double, dpiY: Double, imageableRect: Rect, pageSize: Size): PrintPageDescription = {
    val __obj = js.Dynamic.literal(dpiX = dpiX.asInstanceOf[js.Any], dpiY = dpiY.asInstanceOf[js.Any], imageableRect = imageableRect.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintPageDescription]
  }
  
  @scala.inline
  implicit class PrintPageDescriptionMutableBuilder[Self <: PrintPageDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDpiX(value: Double): Self = StObject.set(x, "dpiX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDpiY(value: Double): Self = StObject.set(x, "dpiY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageableRect(value: Rect): Self = StObject.set(x, "imageableRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSize(value: Size): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
  }
}
