package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorStyleProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  var colors: js.UndefOr[ResponsiveValue[String, ThemeType]] = js.native
}
object ColorStyleProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): ColorStyleProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorStyleProps[ThemeType]]
  }
  
  @scala.inline
  implicit class ColorStylePropsMutableBuilder[Self <: ColorStyleProps[_], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self with ColorStyleProps[ThemeType]) extends AnyVal {
    
    @scala.inline
    def setColors(value: ResponsiveValue[String, ThemeType]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsNull: Self = StObject.set(x, "colors", null)
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: (String | Null)*): Self = StObject.set(x, "colors", js.Array(value :_*))
  }
}
