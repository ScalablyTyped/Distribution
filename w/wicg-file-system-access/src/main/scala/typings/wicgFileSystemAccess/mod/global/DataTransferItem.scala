package typings.wicgFileSystemAccess.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataTransferItem extends js.Object {
  
  def getAsFileSystemHandle(): js.Promise[FileSystemHandle | Null] = js.native
}
object DataTransferItem {
  
  @scala.inline
  def apply(getAsFileSystemHandle: () => js.Promise[FileSystemHandle | Null]): DataTransferItem = {
    val __obj = js.Dynamic.literal(getAsFileSystemHandle = js.Any.fromFunction0(getAsFileSystemHandle))
    __obj.asInstanceOf[DataTransferItem]
  }
  
  @scala.inline
  implicit class DataTransferItemOps[Self <: DataTransferItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetAsFileSystemHandle(value: () => js.Promise[FileSystemHandle | Null]): Self = this.set("getAsFileSystemHandle", js.Any.fromFunction0(value))
  }
}
