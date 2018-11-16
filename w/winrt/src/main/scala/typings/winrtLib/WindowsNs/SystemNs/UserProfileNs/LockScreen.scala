package typings
package winrtLib.WindowsNs.SystemNs.UserProfileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.System.UserProfile.LockScreen")
@js.native
class LockScreen () extends js.Object

@JSGlobal("Windows.System.UserProfile.LockScreen")
@js.native
object LockScreen extends js.Object {
  var originalImageFile: winrtLib.WindowsNs.FoundationNs.Uri = js.native
  def getImageStream(): winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream = js.native
  def setImageFileAsync(value: winrtLib.WindowsNs.StorageNs.IStorageFile): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def setImageStreamAsync(value: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
}

