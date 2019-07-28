package typings.winrt.WindowsNs.SystemNs.UserProfileNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncAction
import typings.winrt.WindowsNs.FoundationNs.Uri
import typings.winrt.WindowsNs.StorageNs.IStorageFile
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream
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

