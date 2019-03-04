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
    getImageStream: js.Function0[winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream],
    originalImageFile: winrtLib.WindowsNs.FoundationNs.Uri,
    setImageFileAsync: js.Function1[
      winrtLib.WindowsNs.StorageNs.IStorageFile, 
      winrtLib.WindowsNs.FoundationNs.IAsyncAction
    ],
    setImageStreamAsync: js.Function1[
      winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream, 
      winrtLib.WindowsNs.FoundationNs.IAsyncAction
    ]
  ): ILockScreenStatics = {
    val __obj = js.Dynamic.literal(getImageStream = getImageStream, originalImageFile = originalImageFile, setImageFileAsync = setImageFileAsync, setImageStreamAsync = setImageStreamAsync)
  
    __obj.asInstanceOf[ILockScreenStatics]
  }
}

