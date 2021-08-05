package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextColorProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  /**
    * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
    * By default the raw value of the prop is returned.
    *
    * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
    * Array values are converted into responsive values.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/color)
    */
  var color: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}
object TextColorProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): TextColorProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextColorProps[ThemeType, TVal]]
  }
  
  extension [Self <: TextColorProps[?, ?], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](x: Self & (TextColorProps[ThemeType, TVal])) {
    
    inline def setColor(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorNull: Self = StObject.set(x, "color", null)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: (TVal | Null)*): Self = StObject.set(x, "color", js.Array(value :_*))
  }
}
