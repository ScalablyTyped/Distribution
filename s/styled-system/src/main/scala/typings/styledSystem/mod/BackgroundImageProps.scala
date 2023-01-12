package typings.styledSystem.mod

import typings.csstype.mod.Property.BackgroundImage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundImageProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The background-image CSS property sets one or more background images on an element.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-image)
    */
  var backgroundImage: js.UndefOr[ResponsiveValue[BackgroundImage, ThemeType]] = js.undefined
}
object BackgroundImageProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): BackgroundImageProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundImageProps[ThemeType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackgroundImageProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self & BackgroundImageProps[ThemeType]) extends AnyVal {
    
    inline def setBackgroundImage(value: ResponsiveValue[BackgroundImage, ThemeType]): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
    
    inline def setBackgroundImageNull: Self = StObject.set(x, "backgroundImage", null)
    
    inline def setBackgroundImageUndefined: Self = StObject.set(x, "backgroundImage", js.undefined)
    
    inline def setBackgroundImageVarargs(value: (BackgroundImage | Null)*): Self = StObject.set(x, "backgroundImage", js.Array(value*))
  }
}
