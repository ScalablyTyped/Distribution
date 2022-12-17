package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundPositionProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  /**
    * The background-position CSS property sets the initial position for each background image. The
    * position is relative to the position layer set by background-origin.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-position)
    */
  var backgroundPosition: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}
object BackgroundPositionProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): BackgroundPositionProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundPositionProps[ThemeType, TVal]]
  }
  
  extension [Self <: BackgroundPositionProps[?, ?], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](x: Self & (BackgroundPositionProps[ThemeType, TVal])) {
    
    inline def setBackgroundPosition(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "backgroundPosition", value.asInstanceOf[js.Any])
    
    inline def setBackgroundPositionNull: Self = StObject.set(x, "backgroundPosition", null)
    
    inline def setBackgroundPositionUndefined: Self = StObject.set(x, "backgroundPosition", js.undefined)
    
    inline def setBackgroundPositionVarargs(value: (TVal | Null)*): Self = StObject.set(x, "backgroundPosition", js.Array(value*))
  }
}
