package typings.styledSystem.mod

import typings.styledSystem.styledSystemStrings.borderWidths
import typings.styledSystem.styledSystemStrings.colors
import typings.styledSystem.styledSystemStrings.radii
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal]
  extends StObject
     with BorderWidthProps[ThemeType, ThemeValue[borderWidths, ThemeType, js.Any]]
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
  var border: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
  
  var borderX: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
  
  var borderY: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}
object BorderProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): BorderProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderProps[ThemeType, TVal]]
  }
  
  extension [Self <: BorderProps[?, ?], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](x: Self & (BorderProps[ThemeType, TVal])) {
    
    inline def setBorder(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderNull: Self = StObject.set(x, "border", null)
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setBorderVarargs(value: (TVal | Null)*): Self = StObject.set(x, "border", js.Array(value :_*))
    
    inline def setBorderX(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "borderX", value.asInstanceOf[js.Any])
    
    inline def setBorderXNull: Self = StObject.set(x, "borderX", null)
    
    inline def setBorderXUndefined: Self = StObject.set(x, "borderX", js.undefined)
    
    inline def setBorderXVarargs(value: (TVal | Null)*): Self = StObject.set(x, "borderX", js.Array(value :_*))
    
    inline def setBorderY(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "borderY", value.asInstanceOf[js.Any])
    
    inline def setBorderYNull: Self = StObject.set(x, "borderY", null)
    
    inline def setBorderYUndefined: Self = StObject.set(x, "borderY", js.undefined)
    
    inline def setBorderYVarargs(value: (TVal | Null)*): Self = StObject.set(x, "borderY", js.Array(value :_*))
  }
}
