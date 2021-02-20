package typings.wicgFileSystemAccess.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataTransferItem extends StObject {
  
  def getAsFileSystemHandle(): js.Promise[FileSystemHandle | Null] = js.native
}
object DataTransferItem {
  
  @scala.inline
  def apply(getAsFileSystemHandle: () => js.Promise[FileSystemHandle | Null]): DataTransferItem = {
    val __obj = js.Dynamic.literal(getAsFileSystemHandle = js.Any.fromFunction0(getAsFileSystemHandle))
    __obj.asInstanceOf[DataTransferItem]
  }
  
  @scala.inline
  implicit class DataTransferItemMutableBuilder[Self <: DataTransferItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAsFileSystemHandle(value: () => js.Promise[FileSystemHandle | Null]): Self = StObject.set(x, "getAsFileSystemHandle", js.Any.fromFunction0(value))
  }
}
