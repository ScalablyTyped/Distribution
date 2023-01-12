package typings.styledSystem.mod

import typings.csstype.mod.Property.FlexShrink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexShrinkProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The flex-shrink CSS property sets the flex shrink factor of a flex item. If the size of all flex items is larger
    * than the flex container, items shrink to fit according to flex-shrink.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/flex-shrink)
    */
  var flexShrink: js.UndefOr[ResponsiveValue[FlexShrink, ThemeType]] = js.undefined
}
object FlexShrinkProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): FlexShrinkProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexShrinkProps[ThemeType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlexShrinkProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self & FlexShrinkProps[ThemeType]) extends AnyVal {
    
    inline def setFlexShrink(value: ResponsiveValue[FlexShrink, ThemeType]): Self = StObject.set(x, "flexShrink", value.asInstanceOf[js.Any])
    
    inline def setFlexShrinkNull: Self = StObject.set(x, "flexShrink", null)
    
    inline def setFlexShrinkUndefined: Self = StObject.set(x, "flexShrink", js.undefined)
    
    inline def setFlexShrinkVarargs(value: (FlexShrink | Null)*): Self = StObject.set(x, "flexShrink", js.Array(value*))
  }
}
