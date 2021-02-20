package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlexBasisProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  // TODO: The FlexBasisValue currently really only exists for documentation
  //       purposes, because flex-basis also accepts `Nem` and `Npx` strings.
  //       Not sure there’s a way to still have the union values show up as
  //       auto-completion results.
  var flexBasis: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}
object FlexBasisProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): FlexBasisProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexBasisProps[ThemeType, TVal]]
  }
  
  @scala.inline
  implicit class FlexBasisPropsMutableBuilder[Self <: FlexBasisProps[_, _], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] (val x: Self with (FlexBasisProps[ThemeType, TVal])) extends AnyVal {
    
    @scala.inline
    def setFlexBasis(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "flexBasis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexBasisNull: Self = StObject.set(x, "flexBasis", null)
    
    @scala.inline
    def setFlexBasisUndefined: Self = StObject.set(x, "flexBasis", js.undefined)
    
    @scala.inline
    def setFlexBasisVarargs(value: (TVal | Null)*): Self = StObject.set(x, "flexBasis", js.Array(value :_*))
  }
}
