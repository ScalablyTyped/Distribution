package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderStyleProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The border-bottom-style CSS property sets the line style of an element's bottom border.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-style)
    */
  var borderBottomStyle: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderBottomStyle */ _, 
      ThemeType
    ]
  ] = js.native
  
  /**
    * The border-left-style CSS property sets the line style of an element's left border.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-left-style)
    */
  var borderLeftStyle: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderLeftStyle */ _, 
      ThemeType
    ]
  ] = js.native
  
  /**
    * The border-right-style CSS property sets the line style of an element's right border.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-right-style)
    */
  var borderRightStyle: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRightStyle */ _, 
      ThemeType
    ]
  ] = js.native
  
  /**
    * The border-style shorthand CSS property sets the style of all sides of an element's border.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-style)
    */
  var borderStyle: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderStyle */ _, 
      ThemeType
    ]
  ] = js.native
  
  /**
    * The border-top-style CSS property sets the line style of an element's top border.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-style)
    */
  var borderTopStyle: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderTopStyle */ _, 
      ThemeType
    ]
  ] = js.native
}
object BorderStyleProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): BorderStyleProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderStyleProps[ThemeType]]
  }
  
  @scala.inline
  implicit class BorderStylePropsMutableBuilder[Self <: BorderStyleProps[_], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self with BorderStyleProps[ThemeType]) extends AnyVal {
    
    @scala.inline
    def setBorderBottomStyle(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderBottomStyle */ _, 
          ThemeType
        ]
    ): Self = StObject.set(x, "borderBottomStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBottomStyleNull: Self = StObject.set(x, "borderBottomStyle", null)
    
    @scala.inline
    def setBorderBottomStyleUndefined: Self = StObject.set(x, "borderBottomStyle", js.undefined)
    
    @scala.inline
    def setBorderBottomStyleVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "borderBottomStyle", js.Array(value :_*))
    
    @scala.inline
    def setBorderLeftStyle(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderLeftStyle */ _, 
          ThemeType
        ]
    ): Self = StObject.set(x, "borderLeftStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderLeftStyleNull: Self = StObject.set(x, "borderLeftStyle", null)
    
    @scala.inline
    def setBorderLeftStyleUndefined: Self = StObject.set(x, "borderLeftStyle", js.undefined)
    
    @scala.inline
    def setBorderLeftStyleVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "borderLeftStyle", js.Array(value :_*))
    
    @scala.inline
    def setBorderRightStyle(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRightStyle */ _, 
          ThemeType
        ]
    ): Self = StObject.set(x, "borderRightStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRightStyleNull: Self = StObject.set(x, "borderRightStyle", null)
    
    @scala.inline
    def setBorderRightStyleUndefined: Self = StObject.set(x, "borderRightStyle", js.undefined)
    
    @scala.inline
    def setBorderRightStyleVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "borderRightStyle", js.Array(value :_*))
    
    @scala.inline
    def setBorderStyle(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderStyle */ _, 
          ThemeType
        ]
    ): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderStyleNull: Self = StObject.set(x, "borderStyle", null)
    
    @scala.inline
    def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
    
    @scala.inline
    def setBorderStyleVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "borderStyle", js.Array(value :_*))
    
    @scala.inline
    def setBorderTopStyle(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderTopStyle */ _, 
          ThemeType
        ]
    ): Self = StObject.set(x, "borderTopStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTopStyleNull: Self = StObject.set(x, "borderTopStyle", null)
    
    @scala.inline
    def setBorderTopStyleUndefined: Self = StObject.set(x, "borderTopStyle", js.undefined)
    
    @scala.inline
    def setBorderTopStyleVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "borderTopStyle", js.Array(value :_*))
  }
}
