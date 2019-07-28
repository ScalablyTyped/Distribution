package typings.winrt.WindowsNs.StorageNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStorageFolderStatics extends js.Object {
  def getFolderFromPathAsync(path: String): IAsyncOperation[StorageFolder]
}

object IStorageFolderStatics {
  @scala.inline
  def apply(getFolderFromPathAsync: String => IAsyncOperation[StorageFolder]): IStorageFolderStatics = {
    val __obj = js.Dynamic.literal(getFolderFromPathAsync = js.Any.fromFunction1(getFolderFromPathAsync))
  
    __obj.asInstanceOf[IStorageFolderStatics]
  }
}

