package typings.xstyledSystem.mod

import typings.csstype.mod.Property.BorderWidth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderWidthProps[TLength] extends StObject {
  
  val borderWidth: js.UndefOr[ResponsiveValue[BorderWidth[TLength]]] = js.undefined
}
object BorderWidthProps {
  
  inline def apply[TLength](): BorderWidthProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderWidthProps[TLength]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BorderWidthProps[?], TLength] (val x: Self & BorderWidthProps[TLength]) extends AnyVal {
    
    inline def setBorderWidth(value: ResponsiveValue[BorderWidth[TLength]]): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setBorderWidthVarargs(value: BorderWidth[TLength]*): Self = StObject.set(x, "borderWidth", js.Array(value*))
  }
}
