package typings.winrt.global.Windows.Media

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Media.MediaProperties.AudioEncodingQuality
import typings.winrt.Windows.Media.MediaProperties.VideoEncodingQuality
import typings.winrt.Windows.Storage.IStorageFile
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MediaProperties {
  
  @JSGlobal("Windows.Media.MediaProperties.AudioEncodingProperties")
  @js.native
  class AudioEncodingProperties ()
    extends typings.winrt.Windows.Media.MediaProperties.AudioEncodingProperties
  
  @JSGlobal("Windows.Media.MediaProperties.AudioEncodingQuality")
  @js.native
  object AudioEncodingQuality extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.MediaProperties.AudioEncodingQuality with Double] = js.native
    
    /* 0 */ val auto: typings.winrt.Windows.Media.MediaProperties.AudioEncodingQuality.auto with Double = js.native
    
    /* 1 */ val high: typings.winrt.Windows.Media.MediaProperties.AudioEncodingQuality.high with Double = js.native
    
    /* 3 */ val low: typings.winrt.Windows.Media.MediaProperties.AudioEncodingQuality.low with Double = js.native
    
    /* 2 */ val medium: typings.winrt.Windows.Media.MediaProperties.AudioEncodingQuality.medium with Double = js.native
  }
  
  @JSGlobal("Windows.Media.MediaProperties.ContainerEncodingProperties")
  @js.native
  class ContainerEncodingProperties ()
    extends typings.winrt.Windows.Media.MediaProperties.ContainerEncodingProperties
  
  @JSGlobal("Windows.Media.MediaProperties.ImageEncodingProperties")
  @js.native
  class ImageEncodingProperties ()
    extends typings.winrt.Windows.Media.MediaProperties.ImageEncodingProperties
  /* static members */
  object ImageEncodingProperties {
    
    @JSGlobal("Windows.Media.MediaProperties.ImageEncodingProperties.createJpeg")
    @js.native
    def createJpeg(): typings.winrt.Windows.Media.MediaProperties.ImageEncodingProperties = js.native
    
    @JSGlobal("Windows.Media.MediaProperties.ImageEncodingProperties.createJpegXR")
    @js.native
    def createJpegXR(): typings.winrt.Windows.Media.MediaProperties.ImageEncodingProperties = js.native
    
    @JSGlobal("Windows.Media.MediaProperties.ImageEncodingProperties.createPng")
    @js.native
    def createPng(): typings.winrt.Windows.Media.MediaProperties.ImageEncodingProperties = js.native
  }
  
  @JSGlobal("Windows.Media.MediaProperties.MediaEncodingProfile")
  @js.native
  class MediaEncodingProfile ()
    extends typings.winrt.Windows.Media.MediaProperties.MediaEncodingProfile
  /* static members */
  object MediaEncodingProfile {
    
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingProfile.createFromFileAsync")
    @js.native
    def createFromFileAsync(file: IStorageFile): IAsyncOperation[typings.winrt.Windows.Media.MediaProperties.MediaEncodingProfile] = js.native
    
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingProfile.createFromStreamAsync")
    @js.native
    def createFromStreamAsync(stream: IRandomAccessStream): IAsyncOperation[typings.winrt.Windows.Media.MediaProperties.MediaEncodingProfile] = js.native
    
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingProfile.createM4a")
    @js.native
    def createM4a(quality: AudioEncodingQuality): typings.winrt.Windows.Media.MediaProperties.MediaEncodingProfile = js.native
    
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingProfile.createMp3")
    @js.native
    def createMp3(quality: AudioEncodingQuality): typings.winrt.Windows.Media.MediaProperties.MediaEncodingProfile = js.native
    
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingProfile.createMp4")
    @js.native
    def createMp4(quality: VideoEncodingQuality): typings.winrt.Windows.Media.MediaProperties.MediaEncodingProfile = js.native
    
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingProfile.createWma")
    @js.native
    def createWma(quality: AudioEncodingQuality): typings.winrt.Windows.Media.MediaProperties.MediaEncodingProfile = js.native
    
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingProfile.createWmv")
    @js.native
    def createWmv(quality: VideoEncodingQuality): typings.winrt.Windows.Media.MediaProperties.MediaEncodingProfile = js.native
  }
  
  @JSGlobal("Windows.Media.MediaProperties.MediaPropertySet")
  @js.native
  class MediaPropertySet ()
    extends typings.winrt.Windows.Media.MediaProperties.MediaPropertySet
  
  @JSGlobal("Windows.Media.MediaProperties.MediaRatio")
  @js.native
  class MediaRatio ()
    extends typings.winrt.Windows.Media.MediaProperties.MediaRatio
  
  @JSGlobal("Windows.Media.MediaProperties.VideoEncodingProperties")
  @js.native
  class VideoEncodingProperties ()
    extends typings.winrt.Windows.Media.MediaProperties.VideoEncodingProperties
  
  @JSGlobal("Windows.Media.MediaProperties.VideoEncodingQuality")
  @js.native
  object VideoEncodingQuality extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.MediaProperties.VideoEncodingQuality with Double] = js.native
    
    /* 0 */ val auto: typings.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.auto with Double = js.native
    
    /* 1 */ val hD1080p: typings.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.hD1080p with Double = js.native
    
    /* 2 */ val hD720p: typings.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.hD720p with Double = js.native
    
    /* 4 */ val ntsc: typings.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.ntsc with Double = js.native
    
    /* 5 */ val pal: typings.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.pal with Double = js.native
    
    /* 7 */ val qvga: typings.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.qvga with Double = js.native
    
    /* 6 */ val vga: typings.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.vga with Double = js.native
    
    /* 3 */ val wvga: typings.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.wvga with Double = js.native
  }
}
