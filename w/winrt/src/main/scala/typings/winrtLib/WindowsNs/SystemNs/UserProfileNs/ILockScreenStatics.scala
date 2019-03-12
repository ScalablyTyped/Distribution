package typings
package winrtLib.WindowsNs.SystemNs.UserProfileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILockScreenStatics extends js.Object {
  var originalImageFile: winrtLib.WindowsNs.FoundationNs.Uri
  def getImageStream(): winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream
  def setImageFileAsync(value: winrtLib.WindowsNs.StorageNs.IStorageFile): winrtLib.WindowsNs.FoundationNs.IAsyncAction
  def setImageStreamAsync(value: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream): winrtLib.WindowsNs.FoundationNs.IAsyncAction
}

object ILockScreenStatics {
  @scala.inline
  def apply(
    getImageStream: () => winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream,
    originalImageFile: winrtLib.WindowsNs.FoundationNs.Uri,
    setImageFileAsync: winrtLib.WindowsNs.StorageNs.IStorageFile => winrtLib.WindowsNs.FoundationNs.IAsyncAction,
    setImageStreamAsync: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream => winrtLib.WindowsNs.FoundationNs.IAsyncAction
  ): ILockScreenStatics = {
    val __obj = js.Dynamic.literal(getImageStream = js.Any.fromFunction0(getImageStream), originalImageFile = originalImageFile, setImageFileAsync = js.Any.fromFunction1(setImageFileAsync), setImageStreamAsync = js.Any.fromFunction1(setImageStreamAsync))
  
    __obj.asInstanceOf[ILockScreenStatics]
  }
}

