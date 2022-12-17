package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridColumnGapProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  /**
    * The column-gap CSS property sets the size of the gap (gutter) between an element's columns.
    *
    * @deprecated use column-gap
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/column-gap)
    */
  var gridColumnGap: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}
object GridColumnGapProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): GridColumnGapProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumnGapProps[ThemeType, TVal]]
  }
  
  extension [Self <: GridColumnGapProps[?, ?], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](x: Self & (GridColumnGapProps[ThemeType, TVal])) {
    
    inline def setGridColumnGap(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "gridColumnGap", value.asInstanceOf[js.Any])
    
    inline def setGridColumnGapNull: Self = StObject.set(x, "gridColumnGap", null)
    
    inline def setGridColumnGapUndefined: Self = StObject.set(x, "gridColumnGap", js.undefined)
    
    inline def setGridColumnGapVarargs(value: (TVal | Null)*): Self = StObject.set(x, "gridColumnGap", js.Array(value*))
  }
}
