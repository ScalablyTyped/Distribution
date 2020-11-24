package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderStyleProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  
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
  implicit class BorderStylePropsOps[Self <: BorderStyleProps[_], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self with BorderStyleProps[ThemeType]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBorderBottomStyleVarargs(value: (js.Any | Null)*): Self = this.set("borderBottomStyle", js.Array(value :_*))
    
    @scala.inline
    def setBorderBottomStyle(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderBottomStyle */ _, 
          ThemeType
        ]
    ): Self = this.set("borderBottomStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderBottomStyle: Self = this.set("borderBottomStyle", js.undefined)
    
    @scala.inline
    def setBorderBottomStyleNull: Self = this.set("borderBottomStyle", null)
    
    @scala.inline
    def setBorderLeftStyleVarargs(value: (js.Any | Null)*): Self = this.set("borderLeftStyle", js.Array(value :_*))
    
    @scala.inline
    def setBorderLeftStyle(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderLeftStyle */ _, 
          ThemeType
        ]
    ): Self = this.set("borderLeftStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderLeftStyle: Self = this.set("borderLeftStyle", js.undefined)
    
    @scala.inline
    def setBorderLeftStyleNull: Self = this.set("borderLeftStyle", null)
    
    @scala.inline
    def setBorderRightStyleVarargs(value: (js.Any | Null)*): Self = this.set("borderRightStyle", js.Array(value :_*))
    
    @scala.inline
    def setBorderRightStyle(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRightStyle */ _, 
          ThemeType
        ]
    ): Self = this.set("borderRightStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderRightStyle: Self = this.set("borderRightStyle", js.undefined)
    
    @scala.inline
    def setBorderRightStyleNull: Self = this.set("borderRightStyle", null)
    
    @scala.inline
    def setBorderStyleVarargs(value: (js.Any | Null)*): Self = this.set("borderStyle", js.Array(value :_*))
    
    @scala.inline
    def setBorderStyle(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderStyle */ _, 
          ThemeType
        ]
    ): Self = this.set("borderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderStyle: Self = this.set("borderStyle", js.undefined)
    
    @scala.inline
    def setBorderStyleNull: Self = this.set("borderStyle", null)
    
    @scala.inline
    def setBorderTopStyleVarargs(value: (js.Any | Null)*): Self = this.set("borderTopStyle", js.Array(value :_*))
    
    @scala.inline
    def setBorderTopStyle(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderTopStyle */ _, 
          ThemeType
        ]
    ): Self = this.set("borderTopStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderTopStyle: Self = this.set("borderTopStyle", js.undefined)
    
    @scala.inline
    def setBorderTopStyleNull: Self = this.set("borderTopStyle", null)
  }
}
