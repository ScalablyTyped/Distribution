package typings.summernote.mod.global.Summernote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyMapPcOptions extends StObject {
  
  var options: js.UndefOr[js.Any] = js.undefined
}
object KeyMapPcOptions {
  
  inline def apply(): KeyMapPcOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyMapPcOptions]
  }
  
  extension [Self <: KeyMapPcOptions](x: Self) {
    
    inline def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
