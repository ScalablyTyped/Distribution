package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The order CSS property sets the order to lay out an item in a flex or grid container. Items in a container
    * are sorted by ascending order value and then by their source code order.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/order)
    */
  var order: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Order */ js.Any, 
      ThemeType
    ]
  ] = js.undefined
}
object OrderProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): OrderProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderProps[ThemeType]]
  }
  
  extension [Self <: OrderProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */](x: Self & OrderProps[ThemeType]) {
    
    inline def setOrder(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Order */ js.Any, 
          ThemeType
        ]
    ): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderNull: Self = StObject.set(x, "order", null)
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setOrderVarargs(
      value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Order */ js.Any) | Null)*
    ): Self = StObject.set(x, "order", js.Array(value :_*))
  }
}
