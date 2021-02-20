package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridAutoColumnsProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  /**
    * The grid-auto-columns CSS property specifies the size of an implicitly-created grid column track.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-columns)
    */
  var gridAutoColumns: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}
object GridAutoColumnsProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): GridAutoColumnsProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridAutoColumnsProps[ThemeType, TVal]]
  }
  
  @scala.inline
  implicit class GridAutoColumnsPropsMutableBuilder[Self <: GridAutoColumnsProps[_, _], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] (val x: Self with (GridAutoColumnsProps[ThemeType, TVal])) extends AnyVal {
    
    @scala.inline
    def setGridAutoColumns(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "gridAutoColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridAutoColumnsNull: Self = StObject.set(x, "gridAutoColumns", null)
    
    @scala.inline
    def setGridAutoColumnsUndefined: Self = StObject.set(x, "gridAutoColumns", js.undefined)
    
    @scala.inline
    def setGridAutoColumnsVarargs(value: (TVal | Null)*): Self = StObject.set(x, "gridAutoColumns", js.Array(value :_*))
  }
}
