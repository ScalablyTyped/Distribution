package typings.wicgFileSystemAccess.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChooseFileSystemEntriesFileOptions extends StObject {
  
  var accepts: js.UndefOr[js.Array[ChooseFileSystemEntriesOptionsAccepts]] = js.undefined
  
  var excludeAcceptAllOption: js.UndefOr[Boolean] = js.undefined
}
object ChooseFileSystemEntriesFileOptions {
  
  inline def apply(): ChooseFileSystemEntriesFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseFileSystemEntriesFileOptions]
  }
  
  extension [Self <: ChooseFileSystemEntriesFileOptions](x: Self) {
    
    inline def setAccepts(value: js.Array[ChooseFileSystemEntriesOptionsAccepts]): Self = StObject.set(x, "accepts", value.asInstanceOf[js.Any])
    
    inline def setAcceptsUndefined: Self = StObject.set(x, "accepts", js.undefined)
    
    inline def setAcceptsVarargs(value: ChooseFileSystemEntriesOptionsAccepts*): Self = StObject.set(x, "accepts", js.Array(value*))
    
    inline def setExcludeAcceptAllOption(value: Boolean): Self = StObject.set(x, "excludeAcceptAllOption", value.asInstanceOf[js.Any])
    
    inline def setExcludeAcceptAllOptionUndefined: Self = StObject.set(x, "excludeAcceptAllOption", js.undefined)
  }
}
