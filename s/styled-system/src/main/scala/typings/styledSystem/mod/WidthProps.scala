package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WidthProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  /**
    *   The width utility parses a component's `width` prop and converts it into a CSS width declaration.
    *
    *   - Numbers from 0-1 are converted to percentage widths.
    *   - Numbers greater than 1 are converted to pixel values.
    *   - String values are passed as raw CSS values.
    *   - And arrays are converted to responsive width styles.
    */
  var width: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}
object WidthProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): WidthProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WidthProps[ThemeType, TVal]]
  }
  
  extension [Self <: WidthProps[?, ?], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](x: Self & (WidthProps[ThemeType, TVal])) {
    
    inline def setWidth(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthNull: Self = StObject.set(x, "width", null)
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWidthVarargs(value: (TVal | Null)*): Self = StObject.set(x, "width", js.Array(value :_*))
  }
}
