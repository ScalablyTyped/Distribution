package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxHeightProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  /**
    * The max-height CSS property sets the maximum height of an element. It prevents the used value of the height
    * property from becoming larger than the value specified for max-height.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/max-height)
    */
  var maxHeight: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}
object MaxHeightProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): MaxHeightProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxHeightProps[ThemeType, TVal]]
  }
  
  @scala.inline
  implicit class MaxHeightPropsMutableBuilder[Self <: MaxHeightProps[?, ?], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] (val x: Self & (MaxHeightProps[ThemeType, TVal])) extends AnyVal {
    
    @scala.inline
    def setMaxHeight(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightNull: Self = StObject.set(x, "maxHeight", null)
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setMaxHeightVarargs(value: (TVal | Null)*): Self = StObject.set(x, "maxHeight", js.Array(value :_*))
  }
}
