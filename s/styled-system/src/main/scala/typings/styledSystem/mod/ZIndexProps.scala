package typings.styledSystem.mod

import typings.csstype.mod.Property.ZIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZIndexProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The z-index CSS property sets the z-order of a positioned element and its descendants or
    * flex items. Overlapping elements with a larger z-index cover those with a smaller one.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/z-index)
    */
  var zIndex: js.UndefOr[ResponsiveValue[ZIndex, ThemeType]] = js.undefined
}
object ZIndexProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): ZIndexProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZIndexProps[ThemeType]]
  }
  
  extension [Self <: ZIndexProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */](x: Self & ZIndexProps[ThemeType]) {
    
    inline def setZIndex(value: ResponsiveValue[ZIndex, ThemeType]): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexNull: Self = StObject.set(x, "zIndex", null)
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    
    inline def setZIndexVarargs(value: (ZIndex | Null)*): Self = StObject.set(x, "zIndex", js.Array(value*))
  }
}
