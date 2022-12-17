package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderWidthProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  /**
    * The border-bottom-width CSS property sets the width of the bottom border of an element.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-width)
    */
  var borderBottomWidth: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
  
  /**
    * The border-left-width CSS property sets the width of the left border of an element.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-left-width)
    */
  var borderLeftWidth: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
  
  /**
    * The border-right-width CSS property sets the width of the right border of an element.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-right-width)
    */
  var borderRightWidth: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
  
  /**
    * The border-top-width CSS property sets the width of the top border of an element.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-width)
    */
  var borderTopWidth: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
  
  /**
    * The border-width shorthand CSS property sets the width of all sides of an element's border.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-width)
    */
  var borderWidth: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}
object BorderWidthProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): BorderWidthProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderWidthProps[ThemeType, TVal]]
  }
  
  extension [Self <: BorderWidthProps[?, ?], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](x: Self & (BorderWidthProps[ThemeType, TVal])) {
    
    inline def setBorderBottomWidth(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "borderBottomWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomWidthNull: Self = StObject.set(x, "borderBottomWidth", null)
    
    inline def setBorderBottomWidthUndefined: Self = StObject.set(x, "borderBottomWidth", js.undefined)
    
    inline def setBorderBottomWidthVarargs(value: (TVal | Null)*): Self = StObject.set(x, "borderBottomWidth", js.Array(value*))
    
    inline def setBorderLeftWidth(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "borderLeftWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderLeftWidthNull: Self = StObject.set(x, "borderLeftWidth", null)
    
    inline def setBorderLeftWidthUndefined: Self = StObject.set(x, "borderLeftWidth", js.undefined)
    
    inline def setBorderLeftWidthVarargs(value: (TVal | Null)*): Self = StObject.set(x, "borderLeftWidth", js.Array(value*))
    
    inline def setBorderRightWidth(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "borderRightWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderRightWidthNull: Self = StObject.set(x, "borderRightWidth", null)
    
    inline def setBorderRightWidthUndefined: Self = StObject.set(x, "borderRightWidth", js.undefined)
    
    inline def setBorderRightWidthVarargs(value: (TVal | Null)*): Self = StObject.set(x, "borderRightWidth", js.Array(value*))
    
    inline def setBorderTopWidth(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "borderTopWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderTopWidthNull: Self = StObject.set(x, "borderTopWidth", null)
    
    inline def setBorderTopWidthUndefined: Self = StObject.set(x, "borderTopWidth", js.undefined)
    
    inline def setBorderTopWidthVarargs(value: (TVal | Null)*): Self = StObject.set(x, "borderTopWidth", js.Array(value*))
    
    inline def setBorderWidth(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthNull: Self = StObject.set(x, "borderWidth", null)
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setBorderWidthVarargs(value: (TVal | Null)*): Self = StObject.set(x, "borderWidth", js.Array(value*))
  }
}
