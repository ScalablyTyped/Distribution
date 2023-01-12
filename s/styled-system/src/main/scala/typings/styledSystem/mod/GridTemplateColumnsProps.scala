package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridTemplateColumnsProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  /**
    * The grid-template-columns CSS property defines the line names and track sizing functions of the grid columns.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template-columns)
    */
  var gridTemplateColumns: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}
object GridTemplateColumnsProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): GridTemplateColumnsProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridTemplateColumnsProps[ThemeType, TVal]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridTemplateColumnsProps[?, ?], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] (val x: Self & (GridTemplateColumnsProps[ThemeType, TVal])) extends AnyVal {
    
    inline def setGridTemplateColumns(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "gridTemplateColumns", value.asInstanceOf[js.Any])
    
    inline def setGridTemplateColumnsNull: Self = StObject.set(x, "gridTemplateColumns", null)
    
    inline def setGridTemplateColumnsUndefined: Self = StObject.set(x, "gridTemplateColumns", js.undefined)
    
    inline def setGridTemplateColumnsVarargs(value: (TVal | Null)*): Self = StObject.set(x, "gridTemplateColumns", js.Array(value*))
  }
}
