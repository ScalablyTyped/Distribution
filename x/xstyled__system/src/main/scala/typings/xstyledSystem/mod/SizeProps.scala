package typings.xstyledSystem.mod

import typings.csstype.mod.Property.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeProps[TLength] extends StObject {
  
  val size: js.UndefOr[ResponsiveValue[Height[TLength]]] = js.undefined
}
object SizeProps {
  
  inline def apply[TLength](): SizeProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeProps[TLength]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SizeProps[?], TLength] (val x: Self & SizeProps[TLength]) extends AnyVal {
    
    inline def setSize(value: ResponsiveValue[Height[TLength]]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSizeVarargs(value: Height[TLength]*): Self = StObject.set(x, "size", js.Array(value*))
  }
}
