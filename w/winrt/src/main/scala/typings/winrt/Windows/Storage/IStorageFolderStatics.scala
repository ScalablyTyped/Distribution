package typings.winrt.Windows.Storage

import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStorageFolderStatics extends js.Object {
  
  def getFolderFromPathAsync(path: String): IAsyncOperation[StorageFolder] = js.native
}
object IStorageFolderStatics {
  
  @scala.inline
  def apply(getFolderFromPathAsync: String => IAsyncOperation[StorageFolder]): IStorageFolderStatics = {
    val __obj = js.Dynamic.literal(getFolderFromPathAsync = js.Any.fromFunction1(getFolderFromPathAsync))
    __obj.asInstanceOf[IStorageFolderStatics]
  }
  
  @scala.inline
  implicit class IStorageFolderStaticsOps[Self <: IStorageFolderStatics] (val x: Self) extends AnyVal {
    
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
    def setGetFolderFromPathAsync(value: String => IAsyncOperation[StorageFolder]): Self = this.set("getFolderFromPathAsync", js.Any.fromFunction1(value))
  }
}
