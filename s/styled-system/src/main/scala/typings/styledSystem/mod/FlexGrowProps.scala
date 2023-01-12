package typings.styledSystem.mod

import typings.csstype.mod.Property.FlexGrow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexGrowProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The flex-grow CSS property sets the flex grow factor of a flex item main size. It specifies how much of the
    * remaining space in the flex container should be assigned to the item (the flex grow factor).
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/flex-grow)
    */
  var flexGrow: js.UndefOr[ResponsiveValue[FlexGrow, ThemeType]] = js.undefined
}
object FlexGrowProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): FlexGrowProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexGrowProps[ThemeType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlexGrowProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self & FlexGrowProps[ThemeType]) extends AnyVal {
    
    inline def setFlexGrow(value: ResponsiveValue[FlexGrow, ThemeType]): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
    
    inline def setFlexGrowNull: Self = StObject.set(x, "flexGrow", null)
    
    inline def setFlexGrowUndefined: Self = StObject.set(x, "flexGrow", js.undefined)
    
    inline def setFlexGrowVarargs(value: (FlexGrow | Null)*): Self = StObject.set(x, "flexGrow", js.Array(value*))
  }
}
