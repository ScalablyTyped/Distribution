package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderTopProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  /**
    * The border-top CSS property is a shorthand that sets the values of border-top-width, border-top-style,
    * and border-top-color. These properties describe an element's top border.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-top)
    */
  var borderTop: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}
object BorderTopProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): BorderTopProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderTopProps[ThemeType, TVal]]
  }
  
  @scala.inline
  implicit class BorderTopPropsMutableBuilder[Self <: BorderTopProps[?, ?], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] (val x: Self & (BorderTopProps[ThemeType, TVal])) extends AnyVal {
    
    @scala.inline
    def setBorderTop(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "borderTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTopNull: Self = StObject.set(x, "borderTop", null)
    
    @scala.inline
    def setBorderTopUndefined: Self = StObject.set(x, "borderTop", js.undefined)
    
    @scala.inline
    def setBorderTopVarargs(value: (TVal | Null)*): Self = StObject.set(x, "borderTop", js.Array(value :_*))
  }
}
