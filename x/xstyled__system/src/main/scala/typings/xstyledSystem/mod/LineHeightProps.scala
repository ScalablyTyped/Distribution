package typings.xstyledSystem.mod

import typings.csstype.mod.Property.LineHeight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineHeightProps[TLength] extends StObject {
  
  val lineHeight: js.UndefOr[ResponsiveValue[LineHeight[TLength]]] = js.undefined
}
object LineHeightProps {
  
  inline def apply[TLength](): LineHeightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineHeightProps[TLength]]
  }
  
  extension [Self <: LineHeightProps[?], TLength](x: Self & LineHeightProps[TLength]) {
    
    inline def setLineHeight(value: ResponsiveValue[LineHeight[TLength]]): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    inline def setLineHeightVarargs(value: LineHeight[TLength]*): Self = StObject.set(x, "lineHeight", js.Array(value*))
  }
}
