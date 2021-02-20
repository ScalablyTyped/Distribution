package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridColumnGapProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  /**
    * The column-gap CSS property sets the size of the gap (gutter) between an element's columns.
    *
    * @deprecated use column-gap
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/column-gap)
    */
  var gridColumnGap: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}
object GridColumnGapProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): GridColumnGapProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumnGapProps[ThemeType, TVal]]
  }
  
  @scala.inline
  implicit class GridColumnGapPropsMutableBuilder[Self <: GridColumnGapProps[_, _], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] (val x: Self with (GridColumnGapProps[ThemeType, TVal])) extends AnyVal {
    
    @scala.inline
    def setGridColumnGap(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "gridColumnGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridColumnGapNull: Self = StObject.set(x, "gridColumnGap", null)
    
    @scala.inline
    def setGridColumnGapUndefined: Self = StObject.set(x, "gridColumnGap", js.undefined)
    
    @scala.inline
    def setGridColumnGapVarargs(value: (TVal | Null)*): Self = StObject.set(x, "gridColumnGap", js.Array(value :_*))
  }
}
