package typings.winrt.Windows.System.UserProfile

import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.IStorageFile
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.System.UserProfile.LockScreen")
@js.native
class LockScreen () extends js.Object

/* static members */
@JSGlobal("Windows.System.UserProfile.LockScreen")
@js.native
object LockScreen extends js.Object {
  var originalImageFile: Uri = js.native
  def getImageStream(): IRandomAccessStream = js.native
  def setImageFileAsync(value: IStorageFile): IAsyncAction = js.native
  def setImageStreamAsync(value: IRandomAccessStream): IAsyncAction = js.native
}

