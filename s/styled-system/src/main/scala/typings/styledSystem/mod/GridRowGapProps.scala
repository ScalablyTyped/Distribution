package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridRowGapProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  /**
    * The row-gap CSS property sets the size of the gap (gutter) between an element's rows.
    *
    * @deprecated use row-gap
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/row-gap)
    */
  var gridRowGap: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}
object GridRowGapProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): GridRowGapProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridRowGapProps[ThemeType, TVal]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridRowGapProps[?, ?], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] (val x: Self & (GridRowGapProps[ThemeType, TVal])) extends AnyVal {
    
    inline def setGridRowGap(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "gridRowGap", value.asInstanceOf[js.Any])
    
    inline def setGridRowGapNull: Self = StObject.set(x, "gridRowGap", null)
    
    inline def setGridRowGapUndefined: Self = StObject.set(x, "gridRowGap", js.undefined)
    
    inline def setGridRowGapVarargs(value: (TVal | Null)*): Self = StObject.set(x, "gridRowGap", js.Array(value*))
  }
}
