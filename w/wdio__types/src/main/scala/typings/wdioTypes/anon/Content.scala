package typings.wdioTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content extends StObject {
  
  var content: js.UndefOr[Boolean] = js.undefined
  
  var layout: js.UndefOr[Boolean] = js.undefined
  
  var minLayoutDimension: js.UndefOr[Double] = js.undefined
  
  var minLayoutPosition: js.UndefOr[Double] = js.undefined
  
  var structure: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[Boolean] = js.undefined
}
object Content {
  
  inline def apply(): Content = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Content]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Boolean): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setLayout(value: Boolean): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setMinLayoutDimension(value: Double): Self = StObject.set(x, "minLayoutDimension", value.asInstanceOf[js.Any])
    
    inline def setMinLayoutDimensionUndefined: Self = StObject.set(x, "minLayoutDimension", js.undefined)
    
    inline def setMinLayoutPosition(value: Double): Self = StObject.set(x, "minLayoutPosition", value.asInstanceOf[js.Any])
    
    inline def setMinLayoutPositionUndefined: Self = StObject.set(x, "minLayoutPosition", js.undefined)
    
    inline def setStructure(value: Boolean): Self = StObject.set(x, "structure", value.asInstanceOf[js.Any])
    
    inline def setStructureUndefined: Self = StObject.set(x, "structure", js.undefined)
    
    inline def setStyle(value: Boolean): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
