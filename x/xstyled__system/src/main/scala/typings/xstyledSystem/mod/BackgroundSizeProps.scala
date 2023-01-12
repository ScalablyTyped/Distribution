package typings.xstyledSystem.mod

import typings.csstype.mod.Property.BackgroundSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundSizeProps[TLength] extends StObject {
  
  val backgroundSize: js.UndefOr[ResponsiveValue[BackgroundSize[TLength]]] = js.undefined
}
object BackgroundSizeProps {
  
  inline def apply[TLength](): BackgroundSizeProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundSizeProps[TLength]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackgroundSizeProps[?], TLength] (val x: Self & BackgroundSizeProps[TLength]) extends AnyVal {
    
    inline def setBackgroundSize(value: ResponsiveValue[BackgroundSize[TLength]]): Self = StObject.set(x, "backgroundSize", value.asInstanceOf[js.Any])
    
    inline def setBackgroundSizeUndefined: Self = StObject.set(x, "backgroundSize", js.undefined)
    
    inline def setBackgroundSizeVarargs(value: BackgroundSize[TLength]*): Self = StObject.set(x, "backgroundSize", js.Array(value*))
  }
}
