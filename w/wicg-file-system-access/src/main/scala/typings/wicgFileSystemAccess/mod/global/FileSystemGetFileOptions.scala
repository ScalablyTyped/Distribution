package typings.wicgFileSystemAccess.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemGetFileOptions extends StObject {
  
  var create: js.UndefOr[Boolean] = js.undefined
}
object FileSystemGetFileOptions {
  
  @scala.inline
  def apply(): FileSystemGetFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemGetFileOptions]
  }
  
  @scala.inline
  implicit class FileSystemGetFileOptionsMutableBuilder[Self <: FileSystemGetFileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: Boolean): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
  }
}
