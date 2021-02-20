package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundColorProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  var backgroundColor: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  
  /**
    * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
    * By default the raw value of the prop is returned.
    *
    * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
    * Array values are converted into responsive values.
    *
    * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-color)
    */
  var bg: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}
object BackgroundColorProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): BackgroundColorProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColorProps[ThemeType, TVal]]
  }
  
  @scala.inline
  implicit class BackgroundColorPropsMutableBuilder[Self <: BackgroundColorProps[_, _], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] (val x: Self with (BackgroundColorProps[ThemeType, TVal])) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorNull: Self = StObject.set(x, "backgroundColor", null)
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundColorVarargs(value: (TVal | Null)*): Self = StObject.set(x, "backgroundColor", js.Array(value :_*))
    
    @scala.inline
    def setBg(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgNull: Self = StObject.set(x, "bg", null)
    
    @scala.inline
    def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
    
    @scala.inline
    def setBgVarargs(value: (TVal | Null)*): Self = StObject.set(x, "bg", js.Array(value :_*))
  }
}
