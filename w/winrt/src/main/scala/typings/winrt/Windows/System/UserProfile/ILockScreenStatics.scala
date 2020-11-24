package typings.winrt.Windows.System.UserProfile

import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.IStorageFile
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILockScreenStatics extends js.Object {
  
  def getImageStream(): IRandomAccessStream = js.native
  
  var originalImageFile: Uri = js.native
  
  def setImageFileAsync(value: IStorageFile): IAsyncAction = js.native
  
  def setImageStreamAsync(value: IRandomAccessStream): IAsyncAction = js.native
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
  
  @scala.inline
  implicit class ILockScreenStaticsOps[Self <: ILockScreenStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetImageStream(value: () => IRandomAccessStream): Self = this.set("getImageStream", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOriginalImageFile(value: Uri): Self = this.set("originalImageFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetImageFileAsync(value: IStorageFile => IAsyncAction): Self = this.set("setImageFileAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetImageStreamAsync(value: IRandomAccessStream => IAsyncAction): Self = this.set("setImageStreamAsync", js.Any.fromFunction1(value))
  }
}
