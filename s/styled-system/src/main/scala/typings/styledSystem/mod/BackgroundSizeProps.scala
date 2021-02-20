package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundSizeProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  /**
    * The background-size CSS property sets the size of the element's background image. The
    * image can be left to its natural size, stretched, or constrained to fit the available space.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-size)
    */
  var backgroundSize: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}
object BackgroundSizeProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): BackgroundSizeProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundSizeProps[ThemeType, TVal]]
  }
  
  @scala.inline
  implicit class BackgroundSizePropsMutableBuilder[Self <: BackgroundSizeProps[_, _], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] (val x: Self with (BackgroundSizeProps[ThemeType, TVal])) extends AnyVal {
    
    @scala.inline
    def setBackgroundSize(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "backgroundSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundSizeNull: Self = StObject.set(x, "backgroundSize", null)
    
    @scala.inline
    def setBackgroundSizeUndefined: Self = StObject.set(x, "backgroundSize", js.undefined)
    
    @scala.inline
    def setBackgroundSizeVarargs(value: (TVal | Null)*): Self = StObject.set(x, "backgroundSize", js.Array(value :_*))
  }
}
