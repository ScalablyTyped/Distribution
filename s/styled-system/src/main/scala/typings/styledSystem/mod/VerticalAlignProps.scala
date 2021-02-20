package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VerticalAlignProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  /**
    * The vertical-align CSS property specifies sets vertical alignment of an inline or table-cell box.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/vertical-align)
    */
  var verticalAlign: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}
object VerticalAlignProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): VerticalAlignProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerticalAlignProps[ThemeType, TVal]]
  }
  
  @scala.inline
  implicit class VerticalAlignPropsMutableBuilder[Self <: VerticalAlignProps[_, _], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] (val x: Self with (VerticalAlignProps[ThemeType, TVal])) extends AnyVal {
    
    @scala.inline
    def setVerticalAlign(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignNull: Self = StObject.set(x, "verticalAlign", null)
    
    @scala.inline
    def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    
    @scala.inline
    def setVerticalAlignVarargs(value: (TVal | Null)*): Self = StObject.set(x, "verticalAlign", js.Array(value :_*))
  }
}
