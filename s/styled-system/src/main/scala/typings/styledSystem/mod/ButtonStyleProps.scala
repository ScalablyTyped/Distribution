package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonStyleProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  var variant: js.UndefOr[ResponsiveValue[String, ThemeType]] = js.undefined
}
object ButtonStyleProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): ButtonStyleProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonStyleProps[ThemeType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ButtonStyleProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self & ButtonStyleProps[ThemeType]) extends AnyVal {
    
    inline def setVariant(value: ResponsiveValue[String, ThemeType]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantNull: Self = StObject.set(x, "variant", null)
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    
    inline def setVariantVarargs(value: (String | Null)*): Self = StObject.set(x, "variant", js.Array(value*))
  }
}
