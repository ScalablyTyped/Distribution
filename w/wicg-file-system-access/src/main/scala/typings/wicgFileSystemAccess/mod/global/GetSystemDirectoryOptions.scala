package typings.wicgFileSystemAccess.mod.global

import typings.wicgFileSystemAccess.wicgFileSystemAccessStrings.sandbox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSystemDirectoryOptions extends StObject {
  
  var `type`: sandbox
}
object GetSystemDirectoryOptions {
  
  inline def apply(): GetSystemDirectoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("sandbox")
    __obj.asInstanceOf[GetSystemDirectoryOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSystemDirectoryOptions] (val x: Self) extends AnyVal {
    
    inline def setType(value: sandbox): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
