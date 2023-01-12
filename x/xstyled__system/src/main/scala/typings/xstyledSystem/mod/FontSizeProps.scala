package typings.xstyledSystem.mod

import typings.csstype.mod.Property.FontSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontSizeProps[TLength] extends StObject {
  
  val fontSize: js.UndefOr[ResponsiveValue[FontSize[TLength]]] = js.undefined
}
object FontSizeProps {
  
  inline def apply[TLength](): FontSizeProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontSizeProps[TLength]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontSizeProps[?], TLength] (val x: Self & FontSizeProps[TLength]) extends AnyVal {
    
    inline def setFontSize(value: ResponsiveValue[FontSize[TLength]]): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontSizeVarargs(value: FontSize[TLength]*): Self = StObject.set(x, "fontSize", js.Array(value*))
  }
}
