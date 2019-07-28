package typings.winrt.WindowsNs.StorageNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStorageFolder2 extends js.Object {
  def tryGetItemAsync(name: String): IAsyncOperation[IStorageItem]
}

object IStorageFolder2 {
  @scala.inline
  def apply(tryGetItemAsync: String => IAsyncOperation[IStorageItem]): IStorageFolder2 = {
    val __obj = js.Dynamic.literal(tryGetItemAsync = js.Any.fromFunction1(tryGetItemAsync))
  
    __obj.asInstanceOf[IStorageFolder2]
  }
}

