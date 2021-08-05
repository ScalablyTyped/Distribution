package typings.themeUiCss.scalesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LetterSpacingsCSSProperties extends StObject {
  
  var letterSpacing: js.UndefOr[LetterSpacings] = js.undefined
}
object LetterSpacingsCSSProperties {
  
  inline def apply(): LetterSpacingsCSSProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LetterSpacingsCSSProperties]
  }
  
  extension [Self <: LetterSpacingsCSSProperties](x: Self) {
    
    inline def setLetterSpacing(value: LetterSpacings): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
  }
}
