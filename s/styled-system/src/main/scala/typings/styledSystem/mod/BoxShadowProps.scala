package typings.styledSystem.mod

import typings.csstype.mod.Property.BoxShadow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoxShadowProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The box-shadow CSS property adds shadow effects around an element's frame. You can set multiple effects separated
    * by commas. A box shadow is described by X and Y offsets relative to the element, blur and spread radii and color.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/box-shadow)
    */
  var boxShadow: js.UndefOr[ResponsiveValue[BoxShadow | Double, ThemeType]] = js.undefined
}
object BoxShadowProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): BoxShadowProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoxShadowProps[ThemeType]]
  }
  
  extension [Self <: BoxShadowProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */](x: Self & BoxShadowProps[ThemeType]) {
    
    inline def setBoxShadow(value: ResponsiveValue[BoxShadow | Double, ThemeType]): Self = StObject.set(x, "boxShadow", value.asInstanceOf[js.Any])
    
    inline def setBoxShadowNull: Self = StObject.set(x, "boxShadow", null)
    
    inline def setBoxShadowUndefined: Self = StObject.set(x, "boxShadow", js.undefined)
    
    inline def setBoxShadowVarargs(value: ((BoxShadow | Double) | Null)*): Self = StObject.set(x, "boxShadow", js.Array(value*))
  }
}
