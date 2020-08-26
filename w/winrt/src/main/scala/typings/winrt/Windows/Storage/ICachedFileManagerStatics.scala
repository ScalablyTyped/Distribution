package typings.winrt.Windows.Storage

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.Provider.FileUpdateStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICachedFileManagerStatics extends js.Object {
  def completeUpdatesAsync(file: IStorageFile): IAsyncOperation[FileUpdateStatus] = js.native
  def deferUpdates(file: IStorageFile): Unit = js.native
}

object ICachedFileManagerStatics {
  @scala.inline
  def apply(
    completeUpdatesAsync: IStorageFile => IAsyncOperation[FileUpdateStatus],
    deferUpdates: IStorageFile => Unit
  ): ICachedFileManagerStatics = {
    val __obj = js.Dynamic.literal(completeUpdatesAsync = js.Any.fromFunction1(completeUpdatesAsync), deferUpdates = js.Any.fromFunction1(deferUpdates))
    __obj.asInstanceOf[ICachedFileManagerStatics]
  }
  @scala.inline
  implicit class ICachedFileManagerStaticsOps[Self <: ICachedFileManagerStatics] (val x: Self) extends AnyVal {
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
    def setCompleteUpdatesAsync(value: IStorageFile => IAsyncOperation[FileUpdateStatus]): Self = this.set("completeUpdatesAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setDeferUpdates(value: IStorageFile => Unit): Self = this.set("deferUpdates", js.Any.fromFunction1(value))
  }
  
}

