package typings.wicgFileSystemAccess.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemCreateWritableOptions extends StObject {
  
  var keepExistingData: js.UndefOr[Boolean] = js.native
}
object FileSystemCreateWritableOptions {
  
  @scala.inline
  def apply(): FileSystemCreateWritableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemCreateWritableOptions]
  }
  
  @scala.inline
  implicit class FileSystemCreateWritableOptionsMutableBuilder[Self <: FileSystemCreateWritableOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeepExistingData(value: Boolean): Self = StObject.set(x, "keepExistingData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepExistingDataUndefined: Self = StObject.set(x, "keepExistingData", js.undefined)
  }
}
