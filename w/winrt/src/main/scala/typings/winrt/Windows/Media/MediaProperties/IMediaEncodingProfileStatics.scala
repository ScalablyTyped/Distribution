package typings.winrt.Windows.Media.MediaProperties

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.IStorageFile
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMediaEncodingProfileStatics extends js.Object {
  
  def createFromFileAsync(file: IStorageFile): IAsyncOperation[MediaEncodingProfile] = js.native
  
  def createFromStreamAsync(stream: IRandomAccessStream): IAsyncOperation[MediaEncodingProfile] = js.native
  
  def createM4a(quality: AudioEncodingQuality): MediaEncodingProfile = js.native
  
  def createMp3(quality: AudioEncodingQuality): MediaEncodingProfile = js.native
  
  def createMp4(quality: VideoEncodingQuality): MediaEncodingProfile = js.native
  
  def createWma(quality: AudioEncodingQuality): MediaEncodingProfile = js.native
  
  def createWmv(quality: VideoEncodingQuality): MediaEncodingProfile = js.native
}
object IMediaEncodingProfileStatics {
  
  @scala.inline
  def apply(
    createFromFileAsync: IStorageFile => IAsyncOperation[MediaEncodingProfile],
    createFromStreamAsync: IRandomAccessStream => IAsyncOperation[MediaEncodingProfile],
    createM4a: AudioEncodingQuality => MediaEncodingProfile,
    createMp3: AudioEncodingQuality => MediaEncodingProfile,
    createMp4: VideoEncodingQuality => MediaEncodingProfile,
    createWma: AudioEncodingQuality => MediaEncodingProfile,
    createWmv: VideoEncodingQuality => MediaEncodingProfile
  ): IMediaEncodingProfileStatics = {
    val __obj = js.Dynamic.literal(createFromFileAsync = js.Any.fromFunction1(createFromFileAsync), createFromStreamAsync = js.Any.fromFunction1(createFromStreamAsync), createM4a = js.Any.fromFunction1(createM4a), createMp3 = js.Any.fromFunction1(createMp3), createMp4 = js.Any.fromFunction1(createMp4), createWma = js.Any.fromFunction1(createWma), createWmv = js.Any.fromFunction1(createWmv))
    __obj.asInstanceOf[IMediaEncodingProfileStatics]
  }
  
  @scala.inline
  implicit class IMediaEncodingProfileStaticsOps[Self <: IMediaEncodingProfileStatics] (val x: Self) extends AnyVal {
    
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
    def setCreateFromFileAsync(value: IStorageFile => IAsyncOperation[MediaEncodingProfile]): Self = this.set("createFromFileAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateFromStreamAsync(value: IRandomAccessStream => IAsyncOperation[MediaEncodingProfile]): Self = this.set("createFromStreamAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateM4a(value: AudioEncodingQuality => MediaEncodingProfile): Self = this.set("createM4a", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateMp3(value: AudioEncodingQuality => MediaEncodingProfile): Self = this.set("createMp3", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateMp4(value: VideoEncodingQuality => MediaEncodingProfile): Self = this.set("createMp4", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateWma(value: AudioEncodingQuality => MediaEncodingProfile): Self = this.set("createWma", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateWmv(value: VideoEncodingQuality => MediaEncodingProfile): Self = this.set("createWmv", js.Any.fromFunction1(value))
  }
}
