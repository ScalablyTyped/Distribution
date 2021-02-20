package typings.wicgFileSystemAccess.mod.global

import typings.wicgFileSystemAccess.wicgFileSystemAccessStrings.sandbox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSystemDirectoryOptions extends StObject {
  
  var `type`: sandbox = js.native
}
object GetSystemDirectoryOptions {
  
  @scala.inline
  def apply(`type`: sandbox): GetSystemDirectoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSystemDirectoryOptions]
  }
  
  @scala.inline
  implicit class GetSystemDirectoryOptionsMutableBuilder[Self <: GetSystemDirectoryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: sandbox): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
