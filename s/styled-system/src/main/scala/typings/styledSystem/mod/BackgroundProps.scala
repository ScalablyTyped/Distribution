package typings.styledSystem.mod

import typings.csstype.mod.Property.BackgroundPosition
import typings.csstype.mod.Property.BackgroundSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal]
  extends StObject
     with BackgroundImageProps[ThemeType]
     with BackgroundSizeProps[ThemeType, BackgroundSize[TLengthStyledSystem]]
     with BackgroundPositionProps[ThemeType, BackgroundPosition[TLengthStyledSystem]]
     with BackgroundRepeatProps[ThemeType] {
  
  /**
    * The background shorthand CSS property sets all background style properties at once,
    * such as color, image, origin and size, repeat method, and others.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background)
    */
  var background: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}
object BackgroundProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): BackgroundProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundProps[ThemeType, TVal]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackgroundProps[?, ?], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] (val x: Self & (BackgroundProps[ThemeType, TVal])) extends AnyVal {
    
    inline def setBackground(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundNull: Self = StObject.set(x, "background", null)
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBackgroundVarargs(value: (TVal | Null)*): Self = StObject.set(x, "background", js.Array(value*))
  }
}
