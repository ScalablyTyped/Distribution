package typings.xstyledSystem.mod

import typings.csstype.mod.Property.LetterSpacing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LetterSpacingProps[TLength] extends StObject {
  
  val letterSpacing: js.UndefOr[ResponsiveValue[LetterSpacing[TLength]]] = js.undefined
}
object LetterSpacingProps {
  
  inline def apply[TLength](): LetterSpacingProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LetterSpacingProps[TLength]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LetterSpacingProps[?], TLength] (val x: Self & LetterSpacingProps[TLength]) extends AnyVal {
    
    inline def setLetterSpacing(value: ResponsiveValue[LetterSpacing[TLength]]): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
    
    inline def setLetterSpacingVarargs(value: LetterSpacing[TLength]*): Self = StObject.set(x, "letterSpacing", js.Array(value*))
  }
}
