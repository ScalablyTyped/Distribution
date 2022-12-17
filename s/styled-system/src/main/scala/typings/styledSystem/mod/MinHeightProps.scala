package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinHeightProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  /**
    * The min-height CSS property sets the minimum height of an element. It prevents the used value of the height
    * property from becoming smaller than the value specified for min-height.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/display)
    */
  var minHeight: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}
object MinHeightProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): MinHeightProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinHeightProps[ThemeType, TVal]]
  }
  
  extension [Self <: MinHeightProps[?, ?], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](x: Self & (MinHeightProps[ThemeType, TVal])) {
    
    inline def setMinHeight(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightNull: Self = StObject.set(x, "minHeight", null)
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setMinHeightVarargs(value: (TVal | Null)*): Self = StObject.set(x, "minHeight", js.Array(value*))
  }
}
