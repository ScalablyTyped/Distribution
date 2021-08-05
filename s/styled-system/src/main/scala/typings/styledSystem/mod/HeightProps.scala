package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeightProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  /**
    * The height CSS property specifies the height of an element. By default, the property defines the height of the
    * content area. If box-sizing is set to border-box, however, it instead determines the height of the border area.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/height)
    */
  var height: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}
object HeightProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): HeightProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeightProps[ThemeType, TVal]]
  }
  
  extension [Self <: HeightProps[?, ?], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](x: Self & (HeightProps[ThemeType, TVal])) {
    
    inline def setHeight(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightNull: Self = StObject.set(x, "height", null)
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHeightVarargs(value: (TVal | Null)*): Self = StObject.set(x, "height", js.Array(value :_*))
  }
}
