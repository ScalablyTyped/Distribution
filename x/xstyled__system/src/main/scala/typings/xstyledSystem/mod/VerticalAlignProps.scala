package typings.xstyledSystem.mod

import typings.csstype.mod.Property.VerticalAlign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerticalAlignProps[TLength] extends StObject {
  
  val verticalAlign: js.UndefOr[ResponsiveValue[VerticalAlign[TLength]]] = js.undefined
}
object VerticalAlignProps {
  
  inline def apply[TLength](): VerticalAlignProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerticalAlignProps[TLength]]
  }
  
  extension [Self <: VerticalAlignProps[?], TLength](x: Self & VerticalAlignProps[TLength]) {
    
    inline def setVerticalAlign(value: ResponsiveValue[VerticalAlign[TLength]]): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    
    inline def setVerticalAlignVarargs(value: VerticalAlign[TLength]*): Self = StObject.set(x, "verticalAlign", js.Array(value*))
  }
}
