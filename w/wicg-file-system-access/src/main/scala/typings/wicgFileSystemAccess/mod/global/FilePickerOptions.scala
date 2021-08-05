package typings.wicgFileSystemAccess.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilePickerOptions extends StObject {
  
  var excludeAcceptAllOption: js.UndefOr[Boolean] = js.undefined
  
  var types: js.UndefOr[js.Array[FilePickerAcceptType]] = js.undefined
}
object FilePickerOptions {
  
  inline def apply(): FilePickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilePickerOptions]
  }
  
  extension [Self <: FilePickerOptions](x: Self) {
    
    inline def setExcludeAcceptAllOption(value: Boolean): Self = StObject.set(x, "excludeAcceptAllOption", value.asInstanceOf[js.Any])
    
    inline def setExcludeAcceptAllOptionUndefined: Self = StObject.set(x, "excludeAcceptAllOption", js.undefined)
    
    inline def setTypes(value: js.Array[FilePickerAcceptType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: FilePickerAcceptType*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
