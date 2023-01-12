package typings.vueRuntimeDom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasHTMLAttributes
  extends StObject
     with HTMLAttributes {
  
  var height: js.UndefOr[Numberish] = js.undefined
  
  var width: js.UndefOr[Numberish] = js.undefined
}
object CanvasHTMLAttributes {
  
  inline def apply(): CanvasHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasHTMLAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanvasHTMLAttributes] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Numberish): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(value: Numberish): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
