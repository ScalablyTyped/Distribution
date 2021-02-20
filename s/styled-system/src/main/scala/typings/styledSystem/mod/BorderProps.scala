package typings.styledSystem.mod

import typings.styledSystem.styledSystemStrings.borderWidths
import typings.styledSystem.styledSystemStrings.colors
import typings.styledSystem.styledSystemStrings.radii
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal]
  extends BorderWidthProps[ThemeType, ThemeValue[borderWidths, ThemeType, js.Any]]
     with BorderStyleProps[ThemeType]
     with BorderColorProps[ThemeType, ThemeValue[colors, ThemeType, js.Any]]
     with BorderRadiusProps[ThemeType, ThemeValue[radii, ThemeType, js.Any]]
     with BorderTopProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderTop<TLengthStyledSystem> */ js.Any
    ]
     with BorderRightProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRight<TLengthStyledSystem> */ js.Any
    ]
     with BorderBottomProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderBottom<TLengthStyledSystem> */ js.Any
    ]
     with BorderLeftProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderLeft<TLengthStyledSystem> */ js.Any
    ] {
  
  /**
    * The border CSS property sets an element's border. It's a shorthand for border-width, border-style,
    * and border-color.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border)
    */
  var border: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  
  var borderX: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  
  var borderY: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}
object BorderProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): BorderProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderProps[ThemeType, TVal]]
  }
  
  @scala.inline
  implicit class BorderPropsMutableBuilder[Self <: BorderProps[_, _], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] (val x: Self with (BorderProps[ThemeType, TVal])) extends AnyVal {
    
    @scala.inline
    def setBorder(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderNull: Self = StObject.set(x, "border", null)
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setBorderVarargs(value: (TVal | Null)*): Self = StObject.set(x, "border", js.Array(value :_*))
    
    @scala.inline
    def setBorderX(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "borderX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderXNull: Self = StObject.set(x, "borderX", null)
    
    @scala.inline
    def setBorderXUndefined: Self = StObject.set(x, "borderX", js.undefined)
    
    @scala.inline
    def setBorderXVarargs(value: (TVal | Null)*): Self = StObject.set(x, "borderX", js.Array(value :_*))
    
    @scala.inline
    def setBorderY(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "borderY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderYNull: Self = StObject.set(x, "borderY", null)
    
    @scala.inline
    def setBorderYUndefined: Self = StObject.set(x, "borderY", js.undefined)
    
    @scala.inline
    def setBorderYVarargs(value: (TVal | Null)*): Self = StObject.set(x, "borderY", js.Array(value :_*))
  }
}
