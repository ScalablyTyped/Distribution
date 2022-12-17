package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridAutoRowsProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  /**
    * The grid-auto-rows CSS property specifies the size of an implicitly-created grid row track.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-rows)
    */
  var gridAutoRows: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}
object GridAutoRowsProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): GridAutoRowsProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridAutoRowsProps[ThemeType, TVal]]
  }
  
  extension [Self <: GridAutoRowsProps[?, ?], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](x: Self & (GridAutoRowsProps[ThemeType, TVal])) {
    
    inline def setGridAutoRows(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "gridAutoRows", value.asInstanceOf[js.Any])
    
    inline def setGridAutoRowsNull: Self = StObject.set(x, "gridAutoRows", null)
    
    inline def setGridAutoRowsUndefined: Self = StObject.set(x, "gridAutoRows", js.undefined)
    
    inline def setGridAutoRowsVarargs(value: (TVal | Null)*): Self = StObject.set(x, "gridAutoRows", js.Array(value*))
  }
}
