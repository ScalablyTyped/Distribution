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

