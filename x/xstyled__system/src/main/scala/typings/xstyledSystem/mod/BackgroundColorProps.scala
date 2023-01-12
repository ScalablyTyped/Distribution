package typings.xstyledSystem.mod

import typings.csstype.mod.Property.Background
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundColorProps[TLength] extends StObject {
  
  val backgroundColor: js.UndefOr[ResponsiveValue[Background[TLength]]] = js.undefined
  
  val bg: js.UndefOr[ResponsiveValue[Background[TLength]]] = js.undefined
}
object BackgroundColorProps {
  
  inline def apply[TLength](): BackgroundColorProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColorProps[TLength]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackgroundColorProps[?], TLength] (val x: Self & BackgroundColorProps[TLength]) extends AnyVal {
    
    inline def setBackgroundColor(value: ResponsiveValue[Background[TLength]]): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBackgroundColorVarargs(value: Background[TLength]*): Self = StObject.set(x, "backgroundColor", js.Array(value*))
    
    inline def setBg(value: ResponsiveValue[Background[TLength]]): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
    
    inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
    
    inline def setBgVarargs(value: Background[TLength]*): Self = StObject.set(x, "bg", js.Array(value*))
  }
}
