package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundImageProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The background-image CSS property sets one or more background images on an element.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-image)
    */
  var backgroundImage: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundImage */ _, 
      ThemeType
    ]
  ] = js.native
}
object BackgroundImageProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): BackgroundImageProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundImageProps[ThemeType]]
  }
  
  @scala.inline
  implicit class BackgroundImagePropsMutableBuilder[Self <: BackgroundImageProps[_], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self with BackgroundImageProps[ThemeType]) extends AnyVal {
    
    @scala.inline
    def setBackgroundImage(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundImage */ _, 
          ThemeType
        ]
    ): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundImageNull: Self = StObject.set(x, "backgroundImage", null)
    
    @scala.inline
    def setBackgroundImageUndefined: Self = StObject.set(x, "backgroundImage", js.undefined)
    
    @scala.inline
    def setBackgroundImageVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "backgroundImage", js.Array(value :_*))
  }
}
