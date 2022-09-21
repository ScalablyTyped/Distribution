package typings.xstyledSystem.mod

import typings.csstype.mod.Property.Top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopProps[TLength] extends StObject {
  
  val top: js.UndefOr[ResponsiveValue[Top[TLength]]] = js.undefined
}
object TopProps {
  
  inline def apply[TLength](): TopProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopProps[TLength]]
  }
  
  extension [Self <: TopProps[?], TLength](x: Self & TopProps[TLength]) {
    
    inline def setTop(value: ResponsiveValue[Top[TLength]]): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setTopVarargs(value: Top[TLength]*): Self = StObject.set(x, "top", js.Array(value*))
  }
}
