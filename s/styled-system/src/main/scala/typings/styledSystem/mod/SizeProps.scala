package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SizeProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  var size: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}
object SizeProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): SizeProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeProps[ThemeType, TVal]]
  }
  
  @scala.inline
  implicit class SizePropsMutableBuilder[Self <: SizeProps[_, _], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] (val x: Self with (SizeProps[ThemeType, TVal])) extends AnyVal {
    
    @scala.inline
    def setSize(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeNull: Self = StObject.set(x, "size", null)
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSizeVarargs(value: (TVal | Null)*): Self = StObject.set(x, "size", js.Array(value :_*))
  }
}
