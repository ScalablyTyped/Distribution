package typings.winrt.Windows.Graphics.Printing

import typings.winrt.Windows.Foundation.Rect
import typings.winrt.Windows.Foundation.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrintPageDescription extends StObject {
  
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
