package typings.styledSystem.mod

import typings.csstype.mod.Property.Order
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
  var order: js.UndefOr[ResponsiveValue[Order, ThemeType]] = js.undefined
}
object OrderProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): OrderProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderProps[ThemeType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrderProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self & OrderProps[ThemeType]) extends AnyVal {
    
    inline def setOrder(value: ResponsiveValue[Order, ThemeType]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderNull: Self = StObject.set(x, "order", null)
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setOrderVarargs(value: (Order | Null)*): Self = StObject.set(x, "order", js.Array(value*))
  }
}
