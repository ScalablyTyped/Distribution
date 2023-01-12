package typings.xstyledSystem.mod

import typings.csstype.mod.Property.FlexBasis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexBasisProps[TLength] extends StObject {
  
  val flexBasis: js.UndefOr[ResponsiveValue[FlexBasis[TLength]]] = js.undefined
}
object FlexBasisProps {
  
  inline def apply[TLength](): FlexBasisProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexBasisProps[TLength]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlexBasisProps[?], TLength] (val x: Self & FlexBasisProps[TLength]) extends AnyVal {
    
    inline def setFlexBasis(value: ResponsiveValue[FlexBasis[TLength]]): Self = StObject.set(x, "flexBasis", value.asInstanceOf[js.Any])
    
    inline def setFlexBasisUndefined: Self = StObject.set(x, "flexBasis", js.undefined)
    
    inline def setFlexBasisVarargs(value: FlexBasis[TLength]*): Self = StObject.set(x, "flexBasis", js.Array(value*))
  }
}
