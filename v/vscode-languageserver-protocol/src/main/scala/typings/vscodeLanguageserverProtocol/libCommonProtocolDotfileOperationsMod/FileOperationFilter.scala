package typings.vscodeLanguageserverProtocol.libCommonProtocolDotfileOperationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileOperationFilter extends StObject {
  
  /**
    * The actual file operation pattern.
    */
  var pattern: FileOperationPattern
  
  /**
    * A Uri scheme like `file` or `untitled`.
    */
  var scheme: js.UndefOr[String] = js.undefined
}
object FileOperationFilter {
  
  inline def apply(pattern: FileOperationPattern): FileOperationFilter = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileOperationFilter]
  }
  
  extension [Self <: FileOperationFilter](x: Self) {
    
    inline def setPattern(value: FileOperationPattern): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
  }
}
