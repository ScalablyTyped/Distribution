package typings.wicgFileSystemAccess.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageManager extends js.Object {
  
  def getDirectory(): js.Promise[FileSystemDirectoryHandle] = js.native
}
object StorageManager {
  
  @scala.inline
  def apply(getDirectory: () => js.Promise[FileSystemDirectoryHandle]): StorageManager = {
    val __obj = js.Dynamic.literal(getDirectory = js.Any.fromFunction0(getDirectory))
    __obj.asInstanceOf[StorageManager]
  }
  
  @scala.inline
  implicit class StorageManagerOps[Self <: StorageManager] (val x: Self) extends AnyVal {
    
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
    def setGetDirectory(value: () => js.Promise[FileSystemDirectoryHandle]): Self = this.set("getDirectory", js.Any.fromFunction0(value))
  }
}
