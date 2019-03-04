package typings
package winrtLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICachedFileManagerStatics extends js.Object {
  def completeUpdatesAsync(file: IStorageFile): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.ProviderNs.FileUpdateStatus]
  def deferUpdates(file: IStorageFile): scala.Unit
}

object ICachedFileManagerStatics {
  @scala.inline
  def apply(
    completeUpdatesAsync: js.Function1[
      IStorageFile, 
      winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.ProviderNs.FileUpdateStatus]
    ],
    deferUpdates: js.Function1[IStorageFile, scala.Unit]
  ): ICachedFileManagerStatics = {
    val __obj = js.Dynamic.literal(completeUpdatesAsync = completeUpdatesAsync, deferUpdates = deferUpdates)
  
    __obj.asInstanceOf[ICachedFileManagerStatics]
  }
}

