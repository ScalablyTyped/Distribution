package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal]
  extends StObject
     with BackgroundImageProps[ThemeType]
     with BackgroundSizeProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundSize<TLengthStyledSystem> */ js.Any
    ]
     with BackgroundPositionProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundPosition<TLengthStyledSystem> */ js.Any
    ]
     with BackgroundRepeatProps[ThemeType] {
  
  /**
    * The background shorthand CSS property sets all background style properties at once,
    * such as color, image, origin and size, repeat method, and others.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background)
    */
  var background: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}
object BackgroundProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): BackgroundProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundProps[ThemeType, TVal]]
  }
  
  extension [Self <: BackgroundProps[?, ?], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](x: Self & (BackgroundProps[ThemeType, TVal])) {
    
    inline def setBackground(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundNull: Self = StObject.set(x, "background", null)
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBackgroundVarargs(value: (TVal | Null)*): Self = StObject.set(x, "background", js.Array(value :_*))
  }
}
