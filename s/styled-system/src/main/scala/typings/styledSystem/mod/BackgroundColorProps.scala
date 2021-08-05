package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundColorProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  var backgroundColor: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
  
  /**
    * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
    * By default the raw value of the prop is returned.
    *
    * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
    * Array values are converted into responsive values.
    *
    * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-color)
    */
  var bg: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}
object BackgroundColorProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): BackgroundColorProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColorProps[ThemeType, TVal]]
  }
  
  extension [Self <: BackgroundColorProps[?, ?], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](x: Self & (BackgroundColorProps[ThemeType, TVal])) {
    
    inline def setBackgroundColor(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorNull: Self = StObject.set(x, "backgroundColor", null)
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBackgroundColorVarargs(value: (TVal | Null)*): Self = StObject.set(x, "backgroundColor", js.Array(value :_*))
    
    inline def setBg(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
    
    inline def setBgNull: Self = StObject.set(x, "bg", null)
    
    inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
    
    inline def setBgVarargs(value: (TVal | Null)*): Self = StObject.set(x, "bg", js.Array(value :_*))
  }
}
