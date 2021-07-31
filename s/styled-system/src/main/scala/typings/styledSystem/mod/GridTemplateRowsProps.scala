package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridTemplateRowsProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  /**
    * The grid-template-rows CSS property defines the line names and track sizing functions of the grid rows.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/row-template-rows)
    */
  var gridTemplateRows: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}
object GridTemplateRowsProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): GridTemplateRowsProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridTemplateRowsProps[ThemeType, TVal]]
  }
  
  @scala.inline
  implicit class GridTemplateRowsPropsMutableBuilder[Self <: GridTemplateRowsProps[?, ?], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] (val x: Self & (GridTemplateRowsProps[ThemeType, TVal])) extends AnyVal {
    
    @scala.inline
    def setGridTemplateRows(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "gridTemplateRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridTemplateRowsNull: Self = StObject.set(x, "gridTemplateRows", null)
    
    @scala.inline
    def setGridTemplateRowsUndefined: Self = StObject.set(x, "gridTemplateRows", js.undefined)
    
    @scala.inline
    def setGridTemplateRowsVarargs(value: (TVal | Null)*): Self = StObject.set(x, "gridTemplateRows", js.Array(value :_*))
  }
}
