package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderColorProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  /**
    * The border-bottom-color CSS property sets the color of an element's bottom border. It can also be set with the shorthand CSS properties border-color or border-bottom.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-color)
    */
  var borderBottomColor: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
  
  /**
    * The border-color shorthand CSS property sets the color of all sides of an element's border.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-color)
    */
  var borderColor: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
  
  /**
    * The border-left-color CSS property sets the color of an element's left border. It can also be set with the shorthand CSS properties border-color or border-left.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-left-color)
    */
  var borderLeftColor: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
  
  /**
    * The border-right-color CSS property sets the color of an element's right border. It can also be set with the shorthand CSS properties border-color or border-right.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-right-color)
    */
  var borderRightColor: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
  
  /**
    * The border-top-color CSS property sets the color of an element's top border. It can also be set with the shorthand CSS properties border-color or border-top.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-color)
    */
  var borderTopColor: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}
object BorderColorProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): BorderColorProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderColorProps[ThemeType, TVal]]
  }
  
  extension [Self <: BorderColorProps[?, ?], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](x: Self & (BorderColorProps[ThemeType, TVal])) {
    
    inline def setBorderBottomColor(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "borderBottomColor", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomColorNull: Self = StObject.set(x, "borderBottomColor", null)
    
    inline def setBorderBottomColorUndefined: Self = StObject.set(x, "borderBottomColor", js.undefined)
    
    inline def setBorderBottomColorVarargs(value: (TVal | Null)*): Self = StObject.set(x, "borderBottomColor", js.Array(value :_*))
    
    inline def setBorderColor(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorNull: Self = StObject.set(x, "borderColor", null)
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderColorVarargs(value: (TVal | Null)*): Self = StObject.set(x, "borderColor", js.Array(value :_*))
    
    inline def setBorderLeftColor(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "borderLeftColor", value.asInstanceOf[js.Any])
    
    inline def setBorderLeftColorNull: Self = StObject.set(x, "borderLeftColor", null)
    
    inline def setBorderLeftColorUndefined: Self = StObject.set(x, "borderLeftColor", js.undefined)
    
    inline def setBorderLeftColorVarargs(value: (TVal | Null)*): Self = StObject.set(x, "borderLeftColor", js.Array(value :_*))
    
    inline def setBorderRightColor(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "borderRightColor", value.asInstanceOf[js.Any])
    
    inline def setBorderRightColorNull: Self = StObject.set(x, "borderRightColor", null)
    
    inline def setBorderRightColorUndefined: Self = StObject.set(x, "borderRightColor", js.undefined)
    
    inline def setBorderRightColorVarargs(value: (TVal | Null)*): Self = StObject.set(x, "borderRightColor", js.Array(value :_*))
    
    inline def setBorderTopColor(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "borderTopColor", value.asInstanceOf[js.Any])
    
    inline def setBorderTopColorNull: Self = StObject.set(x, "borderTopColor", null)
    
    inline def setBorderTopColorUndefined: Self = StObject.set(x, "borderTopColor", js.undefined)
    
    inline def setBorderTopColorVarargs(value: (TVal | Null)*): Self = StObject.set(x, "borderTopColor", js.Array(value :_*))
  }
}
