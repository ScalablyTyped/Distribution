package typings.xstyledSystem.mod

import typings.csstype.mod.Property.BackgroundPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundPositionProps[TLength] extends StObject {
  
  val backgroundPosition: js.UndefOr[ResponsiveValue[BackgroundPosition[TLength]]] = js.undefined
}
object BackgroundPositionProps {
  
  inline def apply[TLength](): BackgroundPositionProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundPositionProps[TLength]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackgroundPositionProps[?], TLength] (val x: Self & BackgroundPositionProps[TLength]) extends AnyVal {
    
    inline def setBackgroundPosition(value: ResponsiveValue[BackgroundPosition[TLength]]): Self = StObject.set(x, "backgroundPosition", value.asInstanceOf[js.Any])
    
    inline def setBackgroundPositionUndefined: Self = StObject.set(x, "backgroundPosition", js.undefined)
    
    inline def setBackgroundPositionVarargs(value: BackgroundPosition[TLength]*): Self = StObject.set(x, "backgroundPosition", js.Array(value*))
  }
}
