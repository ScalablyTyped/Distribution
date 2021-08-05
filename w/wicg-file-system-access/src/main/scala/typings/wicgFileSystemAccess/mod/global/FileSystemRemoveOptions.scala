package typings.wicgFileSystemAccess.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemRemoveOptions extends StObject {
  
  var recursive: js.UndefOr[Boolean] = js.undefined
}
object FileSystemRemoveOptions {
  
  inline def apply(): FileSystemRemoveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemRemoveOptions]
  }
  
  extension [Self <: FileSystemRemoveOptions](x: Self) {
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
  }
}
