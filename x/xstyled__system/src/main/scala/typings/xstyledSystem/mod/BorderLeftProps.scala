package typings.xstyledSystem.mod

import typings.csstype.mod.Property.BorderLeft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderLeftProps[TLength] extends StObject {
  
  val borderLeft: js.UndefOr[ResponsiveValue[BorderLeft[TLength]]] = js.undefined
}
object BorderLeftProps {
  
  inline def apply[TLength](): BorderLeftProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderLeftProps[TLength]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BorderLeftProps[?], TLength] (val x: Self & BorderLeftProps[TLength]) extends AnyVal {
    
    inline def setBorderLeft(value: ResponsiveValue[BorderLeft[TLength]]): Self = StObject.set(x, "borderLeft", value.asInstanceOf[js.Any])
    
    inline def setBorderLeftUndefined: Self = StObject.set(x, "borderLeft", js.undefined)
    
    inline def setBorderLeftVarargs(value: BorderLeft[TLength]*): Self = StObject.set(x, "borderLeft", js.Array(value*))
  }
}
