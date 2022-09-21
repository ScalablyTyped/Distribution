package typings.summernote.mod.global.Summernote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyMapMacOptions extends StObject {
  
  var options: js.UndefOr[Any] = js.undefined
}
object KeyMapMacOptions {
  
  inline def apply(): KeyMapMacOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyMapMacOptions]
  }
  
  extension [Self <: KeyMapMacOptions](x: Self) {
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
