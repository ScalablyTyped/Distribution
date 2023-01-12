package typings.wicgFileSystemAccess.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageManager extends StObject {
  
  def getDirectory(): js.Promise[FileSystemDirectoryHandle]
}
object StorageManager {
  
  inline def apply(getDirectory: () => js.Promise[FileSystemDirectoryHandle]): StorageManager = {
    val __obj = js.Dynamic.literal(getDirectory = js.Any.fromFunction0(getDirectory))
    __obj.asInstanceOf[StorageManager]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StorageManager] (val x: Self) extends AnyVal {
    
    inline def setGetDirectory(value: () => js.Promise[FileSystemDirectoryHandle]): Self = StObject.set(x, "getDirectory", js.Any.fromFunction0(value))
  }
}
