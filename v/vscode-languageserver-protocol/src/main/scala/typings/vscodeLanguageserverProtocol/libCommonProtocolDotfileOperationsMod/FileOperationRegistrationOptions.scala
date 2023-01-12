package typings.vscodeLanguageserverProtocol.libCommonProtocolDotfileOperationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileOperationRegistrationOptions extends StObject {
  
  /**
    * The actual filters.
    */
  var filters: js.Array[FileOperationFilter]
}
object FileOperationRegistrationOptions {
  
  inline def apply(filters: js.Array[FileOperationFilter]): FileOperationRegistrationOptions = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileOperationRegistrationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileOperationRegistrationOptions] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: js.Array[FileOperationFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersVarargs(value: FileOperationFilter*): Self = StObject.set(x, "filters", js.Array(value*))
  }
}
