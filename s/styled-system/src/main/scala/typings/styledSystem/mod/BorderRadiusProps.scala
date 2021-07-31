package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderRadiusProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  /**
    * The border-bottom-left-radius CSS property rounds the bottom-left corner of an element.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-left-radius)
    */
  var borderBottomLeftRadius: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
  
  /**
    * The border-bottom-right-radius CSS property rounds the bottom-right corner of an element.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-right-radius)
    */
  var borderBottomRightRadius: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
  
  /**
    * The border-radius CSS property rounds the corners of an element's outer border edge. You can set a single
    * radius to make circular corners, or two radii to make elliptical corners.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-radius)
    */
  var borderRadius: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
  
  /**
    * The border-top-left-radius CSS property rounds the top-left corner of an element.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-left-radius)
    */
  var borderTopLeftRadius: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
  
  /**
    * The border-top-right-radius CSS property rounds the top-right corner of an element.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-right-radius)
    */
  var borderTopRightRadius: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}
object BorderRadiusProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): BorderRadiusProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderRadiusProps[ThemeType, TVal]]
  }
  
  @scala.inline
  implicit class BorderRadiusPropsMutableBuilder[Self <: BorderRadiusProps[?, ?], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] (val x: Self & (BorderRadiusProps[ThemeType, TVal])) extends AnyVal {
    
    @scala.inline
    def setBorderBottomLeftRadius(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "borderBottomLeftRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBottomLeftRadiusNull: Self = StObject.set(x, "borderBottomLeftRadius", null)
    
    @scala.inline
    def setBorderBottomLeftRadiusUndefined: Self = StObject.set(x, "borderBottomLeftRadius", js.undefined)
    
    @scala.inline
    def setBorderBottomLeftRadiusVarargs(value: (TVal | Null)*): Self = StObject.set(x, "borderBottomLeftRadius", js.Array(value :_*))
    
    @scala.inline
    def setBorderBottomRightRadius(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "borderBottomRightRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBottomRightRadiusNull: Self = StObject.set(x, "borderBottomRightRadius", null)
    
    @scala.inline
    def setBorderBottomRightRadiusUndefined: Self = StObject.set(x, "borderBottomRightRadius", js.undefined)
    
    @scala.inline
    def setBorderBottomRightRadiusVarargs(value: (TVal | Null)*): Self = StObject.set(x, "borderBottomRightRadius", js.Array(value :_*))
    
    @scala.inline
    def setBorderRadius(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRadiusNull: Self = StObject.set(x, "borderRadius", null)
    
    @scala.inline
    def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    @scala.inline
    def setBorderRadiusVarargs(value: (TVal | Null)*): Self = StObject.set(x, "borderRadius", js.Array(value :_*))
    
    @scala.inline
    def setBorderTopLeftRadius(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "borderTopLeftRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTopLeftRadiusNull: Self = StObject.set(x, "borderTopLeftRadius", null)
    
    @scala.inline
    def setBorderTopLeftRadiusUndefined: Self = StObject.set(x, "borderTopLeftRadius", js.undefined)
    
    @scala.inline
    def setBorderTopLeftRadiusVarargs(value: (TVal | Null)*): Self = StObject.set(x, "borderTopLeftRadius", js.Array(value :_*))
    
    @scala.inline
    def setBorderTopRightRadius(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "borderTopRightRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTopRightRadiusNull: Self = StObject.set(x, "borderTopRightRadius", null)
    
    @scala.inline
    def setBorderTopRightRadiusUndefined: Self = StObject.set(x, "borderTopRightRadius", js.undefined)
    
    @scala.inline
    def setBorderTopRightRadiusVarargs(value: (TVal | Null)*): Self = StObject.set(x, "borderTopRightRadius", js.Array(value :_*))
  }
}
