package typings.xstyledSystem.mod

import typings.csstype.mod.Property.Width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WidthProps[TLength] extends StObject {
  
  val width: js.UndefOr[ResponsiveValue[Width[TLength]]] = js.undefined
}
object WidthProps {
  
  inline def apply[TLength](): WidthProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WidthProps[TLength]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WidthProps[?], TLength] (val x: Self & WidthProps[TLength]) extends AnyVal {
    
    inline def setWidth(value: ResponsiveValue[Width[TLength]]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWidthVarargs(value: Width[TLength]*): Self = StObject.set(x, "width", js.Array(value*))
  }
}
