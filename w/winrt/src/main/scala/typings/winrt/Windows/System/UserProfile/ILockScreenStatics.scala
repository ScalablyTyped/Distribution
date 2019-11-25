package typings.winrt.Windows.System.UserProfile

import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.IStorageFile
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILockScreenStatics extends js.Object {
  var originalImageFile: Uri
  def getImageStream(): IRandomAccessStream
  def setImageFileAsync(value: IStorageFile): IAsyncAction
  def setImageStreamAsync(value: IRandomAccessStream): IAsyncAction
}

object ILockScreenStatics {
  @scala.inline
  def apply(
    getImageStream: () => IRandomAccessStream,
    originalImageFile: Uri,
    setImageFileAsync: IStorageFile => IAsyncAction,
    setImageStreamAsync: IRandomAccessStream => IAsyncAction
  ): ILockScreenStatics = {
    val __obj = js.Dynamic.literal(getImageStream = js.Any.fromFunction0(getImageStream), originalImageFile = originalImageFile.asInstanceOf[js.Any], setImageFileAsync = js.Any.fromFunction1(setImageFileAsync), setImageStreamAsync = js.Any.fromFunction1(setImageStreamAsync))
  
    __obj.asInstanceOf[ILockScreenStatics]
  }
}

