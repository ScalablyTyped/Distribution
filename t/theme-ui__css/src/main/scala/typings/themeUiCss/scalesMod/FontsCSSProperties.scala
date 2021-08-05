package typings.themeUiCss.scalesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontsCSSProperties extends StObject {
  
  var fontFamily: js.UndefOr[Fonts] = js.undefined
}
object FontsCSSProperties {
  
  inline def apply(): FontsCSSProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontsCSSProperties]
  }
  
  extension [Self <: FontsCSSProperties](x: Self) {
    
    inline def setFontFamily(value: Fonts): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
  }
}
