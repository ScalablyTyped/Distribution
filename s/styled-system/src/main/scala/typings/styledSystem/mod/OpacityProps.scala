package typings.styledSystem.mod

import typings.csstype.mod.Property.Opacity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpacityProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The opacity CSS property sets the transparency of an element or the degree to which content
    * behind an element is visible.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/opacity)
    */
  var opacity: js.UndefOr[ResponsiveValue[Opacity, ThemeType]] = js.undefined
}
object OpacityProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): OpacityProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpacityProps[ThemeType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpacityProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self & OpacityProps[ThemeType]) extends AnyVal {
    
    inline def setOpacity(value: ResponsiveValue[Opacity, ThemeType]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityNull: Self = StObject.set(x, "opacity", null)
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setOpacityVarargs(value: (Opacity | Null)*): Self = StObject.set(x, "opacity", js.Array(value*))
  }
}
