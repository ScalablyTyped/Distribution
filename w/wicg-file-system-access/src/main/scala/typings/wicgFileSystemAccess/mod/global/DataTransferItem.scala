package typings.wicgFileSystemAccess.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTransferItem extends StObject {
  
  def getAsFileSystemHandle(): js.Promise[FileSystemHandle | Null]
}
object DataTransferItem {
  
  inline def apply(getAsFileSystemHandle: () => js.Promise[FileSystemHandle | Null]): DataTransferItem = {
    val __obj = js.Dynamic.literal(getAsFileSystemHandle = js.Any.fromFunction0(getAsFileSystemHandle))
    __obj.asInstanceOf[DataTransferItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTransferItem] (val x: Self) extends AnyVal {
    
    inline def setGetAsFileSystemHandle(value: () => js.Promise[FileSystemHandle | Null]): Self = StObject.set(x, "getAsFileSystemHandle", js.Any.fromFunction0(value))
  }
}
