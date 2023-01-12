package typings.xstyledSystem.mod

import typings.csstype.mod.Property.MaxWidth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxWidthProps[TLength] extends StObject {
  
  val maxWidth: js.UndefOr[ResponsiveValue[MaxWidth[TLength]]] = js.undefined
}
object MaxWidthProps {
  
  inline def apply[TLength](): MaxWidthProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxWidthProps[TLength]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaxWidthProps[?], TLength] (val x: Self & MaxWidthProps[TLength]) extends AnyVal {
    
    inline def setMaxWidth(value: ResponsiveValue[MaxWidth[TLength]]): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMaxWidthVarargs(value: MaxWidth[TLength]*): Self = StObject.set(x, "maxWidth", js.Array(value*))
  }
}
