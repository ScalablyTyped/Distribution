package typings.xstyledSystem.mod

import typings.csstype.mod.Property.PaddingLeft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaddingLeftProps[TLength] extends StObject {
  
  val paddingLeft: js.UndefOr[ResponsiveValue[PaddingLeft[TLength]]] = js.undefined
  
  val pl: js.UndefOr[ResponsiveValue[PaddingLeft[TLength]]] = js.undefined
}
object PaddingLeftProps {
  
  inline def apply[TLength](): PaddingLeftProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingLeftProps[TLength]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaddingLeftProps[?], TLength] (val x: Self & PaddingLeftProps[TLength]) extends AnyVal {
    
    inline def setPaddingLeft(value: ResponsiveValue[PaddingLeft[TLength]]): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
    
    inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
    
    inline def setPaddingLeftVarargs(value: PaddingLeft[TLength]*): Self = StObject.set(x, "paddingLeft", js.Array(value*))
    
    inline def setPl(value: ResponsiveValue[PaddingLeft[TLength]]): Self = StObject.set(x, "pl", value.asInstanceOf[js.Any])
    
    inline def setPlUndefined: Self = StObject.set(x, "pl", js.undefined)
    
    inline def setPlVarargs(value: PaddingLeft[TLength]*): Self = StObject.set(x, "pl", js.Array(value*))
  }
}
