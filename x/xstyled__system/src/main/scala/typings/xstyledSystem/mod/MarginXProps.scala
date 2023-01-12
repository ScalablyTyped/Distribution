package typings.xstyledSystem.mod

import typings.csstype.mod.Property.MarginLeft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarginXProps[TLength] extends StObject {
  
  val mx: js.UndefOr[ResponsiveValue[MarginLeft[TLength]]] = js.undefined
}
object MarginXProps {
  
  inline def apply[TLength](): MarginXProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginXProps[TLength]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MarginXProps[?], TLength] (val x: Self & MarginXProps[TLength]) extends AnyVal {
    
    inline def setMx(value: ResponsiveValue[MarginLeft[TLength]]): Self = StObject.set(x, "mx", value.asInstanceOf[js.Any])
    
    inline def setMxUndefined: Self = StObject.set(x, "mx", js.undefined)
    
    inline def setMxVarargs(value: MarginLeft[TLength]*): Self = StObject.set(x, "mx", js.Array(value*))
  }
}
