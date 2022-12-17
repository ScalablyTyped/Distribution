package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  var size: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}
object SizeProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): SizeProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeProps[ThemeType, TVal]]
  }
  
  extension [Self <: SizeProps[?, ?], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](x: Self & (SizeProps[ThemeType, TVal])) {
    
    inline def setSize(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeNull: Self = StObject.set(x, "size", null)
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSizeVarargs(value: (TVal | Null)*): Self = StObject.set(x, "size", js.Array(value*))
  }
}
