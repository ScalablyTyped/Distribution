package typings.vscodeLanguageserverProtocol.protocolFileOperationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileOperationPatternOptions extends StObject {
  
  /**
    * The pattern should be matched ignoring casing.
    */
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
}
object FileOperationPatternOptions {
  
  inline def apply(): FileOperationPatternOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileOperationPatternOptions]
  }
  
  extension [Self <: FileOperationPatternOptions](x: Self) {
    
    inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
    
    inline def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
  }
}
