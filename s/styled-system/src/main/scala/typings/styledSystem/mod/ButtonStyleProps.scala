package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonStyleProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  var variant: js.UndefOr[ResponsiveValue[String, ThemeType]] = js.native
}
object ButtonStyleProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): ButtonStyleProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonStyleProps[ThemeType]]
  }
  
  @scala.inline
  implicit class ButtonStylePropsMutableBuilder[Self <: ButtonStyleProps[_], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self with ButtonStyleProps[ThemeType]) extends AnyVal {
    
    @scala.inline
    def setVariant(value: ResponsiveValue[String, ThemeType]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantNull: Self = StObject.set(x, "variant", null)
    
    @scala.inline
    def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    
    @scala.inline
    def setVariantVarargs(value: (String | Null)*): Self = StObject.set(x, "variant", js.Array(value :_*))
  }
}
