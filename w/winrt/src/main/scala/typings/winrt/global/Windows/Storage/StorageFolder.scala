package typings.winrt.global.Windows.Storage

import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.StorageFolder")
@js.native
class StorageFolder ()
  extends typings.winrt.Windows.Storage.StorageFolder

/* static members */
@JSGlobal("Windows.Storage.StorageFolder")
@js.native
object StorageFolder extends js.Object {
  def getFolderFromPathAsync(path: String): IAsyncOperation[typings.winrt.Windows.Storage.StorageFolder] = js.native
}

