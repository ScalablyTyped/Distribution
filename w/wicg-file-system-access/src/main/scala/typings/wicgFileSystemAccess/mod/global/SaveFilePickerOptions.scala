package typings.wicgFileSystemAccess.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveFilePickerOptions
  extends StObject
     with FilePickerOptions {
  
  var suggestedName: js.UndefOr[String] = js.undefined
}
object SaveFilePickerOptions {
  
  inline def apply(): SaveFilePickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveFilePickerOptions]
  }
  
  extension [Self <: SaveFilePickerOptions](x: Self) {
    
    inline def setSuggestedName(value: String): Self = StObject.set(x, "suggestedName", value.asInstanceOf[js.Any])
    
    inline def setSuggestedNameUndefined: Self = StObject.set(x, "suggestedName", js.undefined)
  }
}
