package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  /**
    * The flex CSS property specifies how a flex item will grow or shrink so as to fit the space available in
    * its flex container. This is a shorthand property that sets flex-grow, flex-shrink, and flex-basis.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/flex)
    */
  var flex: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}
object FlexProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): FlexProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexProps[ThemeType, TVal]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlexProps[?, ?], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] (val x: Self & (FlexProps[ThemeType, TVal])) extends AnyVal {
    
    inline def setFlex(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    inline def setFlexNull: Self = StObject.set(x, "flex", null)
    
    inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
    
    inline def setFlexVarargs(value: (TVal | Null)*): Self = StObject.set(x, "flex", js.Array(value*))
  }
}
