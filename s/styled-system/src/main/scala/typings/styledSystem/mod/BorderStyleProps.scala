package typings.styledSystem.mod

import typings.csstype.mod.Property.BorderBottomStyle
import typings.csstype.mod.Property.BorderLeftStyle
import typings.csstype.mod.Property.BorderRightStyle
import typings.csstype.mod.Property.BorderStyle
import typings.csstype.mod.Property.BorderTopStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderStyleProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The border-bottom-style CSS property sets the line style of an element's bottom border.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-style)
    */
  var borderBottomStyle: js.UndefOr[ResponsiveValue[BorderBottomStyle, ThemeType]] = js.undefined
  
  /**
    * The border-left-style CSS property sets the line style of an element's left border.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-left-style)
    */
  var borderLeftStyle: js.UndefOr[ResponsiveValue[BorderLeftStyle, ThemeType]] = js.undefined
  
  /**
    * The border-right-style CSS property sets the line style of an element's right border.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-right-style)
    */
  var borderRightStyle: js.UndefOr[ResponsiveValue[BorderRightStyle, ThemeType]] = js.undefined
  
  /**
    * The border-style shorthand CSS property sets the style of all sides of an element's border.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-style)
    */
  var borderStyle: js.UndefOr[ResponsiveValue[BorderStyle, ThemeType]] = js.undefined
  
  /**
    * The border-top-style CSS property sets the line style of an element's top border.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-style)
    */
  var borderTopStyle: js.UndefOr[ResponsiveValue[BorderTopStyle, ThemeType]] = js.undefined
}
object BorderStyleProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): BorderStyleProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderStyleProps[ThemeType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BorderStyleProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self & BorderStyleProps[ThemeType]) extends AnyVal {
    
    inline def setBorderBottomStyle(value: ResponsiveValue[BorderBottomStyle, ThemeType]): Self = StObject.set(x, "borderBottomStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomStyleNull: Self = StObject.set(x, "borderBottomStyle", null)
    
    inline def setBorderBottomStyleUndefined: Self = StObject.set(x, "borderBottomStyle", js.undefined)
    
    inline def setBorderBottomStyleVarargs(value: (BorderBottomStyle | Null)*): Self = StObject.set(x, "borderBottomStyle", js.Array(value*))
    
    inline def setBorderLeftStyle(value: ResponsiveValue[BorderLeftStyle, ThemeType]): Self = StObject.set(x, "borderLeftStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderLeftStyleNull: Self = StObject.set(x, "borderLeftStyle", null)
    
    inline def setBorderLeftStyleUndefined: Self = StObject.set(x, "borderLeftStyle", js.undefined)
    
    inline def setBorderLeftStyleVarargs(value: (BorderLeftStyle | Null)*): Self = StObject.set(x, "borderLeftStyle", js.Array(value*))
    
    inline def setBorderRightStyle(value: ResponsiveValue[BorderRightStyle, ThemeType]): Self = StObject.set(x, "borderRightStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderRightStyleNull: Self = StObject.set(x, "borderRightStyle", null)
    
    inline def setBorderRightStyleUndefined: Self = StObject.set(x, "borderRightStyle", js.undefined)
    
    inline def setBorderRightStyleVarargs(value: (BorderRightStyle | Null)*): Self = StObject.set(x, "borderRightStyle", js.Array(value*))
    
    inline def setBorderStyle(value: ResponsiveValue[BorderStyle, ThemeType]): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderStyleNull: Self = StObject.set(x, "borderStyle", null)
    
    inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
    
    inline def setBorderStyleVarargs(value: (BorderStyle | Null)*): Self = StObject.set(x, "borderStyle", js.Array(value*))
    
    inline def setBorderTopStyle(value: ResponsiveValue[BorderTopStyle, ThemeType]): Self = StObject.set(x, "borderTopStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderTopStyleNull: Self = StObject.set(x, "borderTopStyle", null)
    
    inline def setBorderTopStyleUndefined: Self = StObject.set(x, "borderTopStyle", js.undefined)
    
    inline def setBorderTopStyleVarargs(value: (BorderTopStyle | Null)*): Self = StObject.set(x, "borderTopStyle", js.Array(value*))
  }
}
