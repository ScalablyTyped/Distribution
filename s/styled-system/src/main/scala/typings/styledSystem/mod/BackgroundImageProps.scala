package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundImageProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The background-image CSS property sets one or more background images on an element.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-image)
    */
  var backgroundImage: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundImage */ js.Any, 
      ThemeType
    ]
  ] = js.undefined
}
object BackgroundImageProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): BackgroundImageProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundImageProps[ThemeType]]
  }
  
  extension [Self <: BackgroundImageProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */](x: Self & BackgroundImageProps[ThemeType]) {
    
    inline def setBackgroundImage(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundImage */ js.Any, 
          ThemeType
        ]
    ): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
    
    inline def setBackgroundImageNull: Self = StObject.set(x, "backgroundImage", null)
    
    inline def setBackgroundImageUndefined: Self = StObject.set(x, "backgroundImage", js.undefined)
    
    inline def setBackgroundImageVarargs(
      value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundImage */ js.Any) | Null)*
    ): Self = StObject.set(x, "backgroundImage", js.Array(value :_*))
  }
}
