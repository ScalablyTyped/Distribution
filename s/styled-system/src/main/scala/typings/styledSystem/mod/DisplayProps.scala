package typings.styledSystem.mod

import typings.csstype.mod.Property.Display
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The display CSS property defines the display type of an element, which consists of the two basic qualities
    * of how an element generates boxes — the outer display type defining how the box participates in flow layout,
    * and the inner display type defining how the children of the box are laid out.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/display)
    */
  var display: js.UndefOr[ResponsiveValue[Display, ThemeType]] = js.undefined
}
object DisplayProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): DisplayProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayProps[ThemeType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisplayProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self & DisplayProps[ThemeType]) extends AnyVal {
    
    inline def setDisplay(value: ResponsiveValue[Display, ThemeType]): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayNull: Self = StObject.set(x, "display", null)
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setDisplayVarargs(value: (Display | Null)*): Self = StObject.set(x, "display", js.Array(value*))
  }
}
