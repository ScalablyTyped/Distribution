package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LetterSpacingProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  /**
    * The letter-spacing CSS property sets the spacing behavior between text characters.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/letter-spacing)
    */
  var letterSpacing: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}
object LetterSpacingProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): LetterSpacingProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LetterSpacingProps[ThemeType, TVal]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LetterSpacingProps[?, ?], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] (val x: Self & (LetterSpacingProps[ThemeType, TVal])) extends AnyVal {
    
    inline def setLetterSpacing(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacingNull: Self = StObject.set(x, "letterSpacing", null)
    
    inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
    
    inline def setLetterSpacingVarargs(value: (TVal | Null)*): Self = StObject.set(x, "letterSpacing", js.Array(value*))
  }
}
