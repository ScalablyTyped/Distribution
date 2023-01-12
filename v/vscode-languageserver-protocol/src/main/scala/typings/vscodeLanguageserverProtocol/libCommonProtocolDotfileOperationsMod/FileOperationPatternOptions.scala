package typings.vscodeLanguageserverProtocol.libCommonProtocolDotfileOperationsMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileOperationPatternOptions] (val x: Self) extends AnyVal {
    
    inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
    
    inline def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
  }
}
