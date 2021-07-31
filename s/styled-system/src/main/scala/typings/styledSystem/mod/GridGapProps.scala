package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridGapProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  /**
    * The gap CSS property sets the gaps (gutters) between rows and columns. It is a shorthand for row-gap
    * and column-gap.
    *
    * @deprecated use gap
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/gap)
    */
  var gridGap: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}
object GridGapProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): GridGapProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridGapProps[ThemeType, TVal]]
  }
  
  @scala.inline
  implicit class GridGapPropsMutableBuilder[Self <: GridGapProps[?, ?], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] (val x: Self & (GridGapProps[ThemeType, TVal])) extends AnyVal {
    
    @scala.inline
    def setGridGap(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "gridGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridGapNull: Self = StObject.set(x, "gridGap", null)
    
    @scala.inline
    def setGridGapUndefined: Self = StObject.set(x, "gridGap", js.undefined)
    
    @scala.inline
    def setGridGapVarargs(value: (TVal | Null)*): Self = StObject.set(x, "gridGap", js.Array(value :_*))
  }
}
