package typings.wicgFileSystemAccess.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemRemoveOptions extends StObject {
  
  var recursive: js.UndefOr[Boolean] = js.native
}
object FileSystemRemoveOptions {
  
  @scala.inline
  def apply(): FileSystemRemoveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemRemoveOptions]
  }
  
  @scala.inline
  implicit class FileSystemRemoveOptionsMutableBuilder[Self <: FileSystemRemoveOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
  }
}
