package typings.winrt.global.Windows.Media

import typings.winrt.Windows.Foundation.Collections.IIterator
import typings.winrt.Windows.Foundation.Collections.IKeyValuePair
import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Media.MediaProperties.AudioEncodingQuality
import typings.winrt.Windows.Media.MediaProperties.VideoEncodingQuality
import typings.winrt.Windows.Storage.IStorageFile
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.MediaProperties")
@js.native
object MediaProperties extends js.Object {
  @js.native
  class AudioEncodingProperties ()
    extends typings.winrt.Windows.Media.MediaProperties.AudioEncodingProperties {
    /* CompleteClass */
    override var bitrate: Double = js.native
    /* CompleteClass */
    override var bitsPerSample: Double = js.native
    /* CompleteClass */
    override var channelCount: Double = js.native
    /* CompleteClass */
    override var properties: typings.winrt.Windows.Media.MediaProperties.MediaPropertySet = js.native
    /* CompleteClass */
    override var sampleRate: Double = js.native
    /* CompleteClass */
    override var subtype: String = js.native
    /* CompleteClass */
    override var `type`: String = js.native
  }
  
  @js.native
  class ContainerEncodingProperties ()
    extends typings.winrt.Windows.Media.MediaProperties.ContainerEncodingProperties {
    /* CompleteClass */
    override var properties: typings.winrt.Windows.Media.MediaProperties.MediaPropertySet = js.native
    /* CompleteClass */
    override var subtype: String = js.native
    /* CompleteClass */
    override var `type`: String = js.native
  }
  
  @js.native
  class ImageEncodingProperties ()
    extends typings.winrt.Windows.Media.MediaProperties.ImageEncodingProperties {
    /* CompleteClass */
    override var height: Double = js.native
    /* CompleteClass */
    override var properties: typings.winrt.Windows.Media.MediaProperties.MediaPropertySet = js.native
    /* CompleteClass */
    override var subtype: String = js.native
    /* CompleteClass */
    override var `type`: String = js.native
    /* CompleteClass */
    override var width: Double = js.native
  }
  
  @js.native
  class MediaEncodingProfile ()
    extends typings.winrt.Windows.Media.MediaProperties.MediaEncodingProfile {
    /* CompleteClass */
    override var audio: typings.winrt.Windows.Media.MediaProperties.AudioEncodingProperties = js.native
    /* CompleteClass */
    override var container: typings.winrt.Windows.Media.MediaProperties.ContainerEncodingProperties = js.native
    /* CompleteClass */
    override var video: typings.winrt.Windows.Media.MediaProperties.VideoEncodingProperties = js.native
  }
  
  @js.native
  class MediaPropertySet ()
    extends typings.winrt.Windows.Media.MediaProperties.MediaPropertySet {
    /* CompleteClass */
    override var size: Double = js.native
    /* CompleteClass */
    override def clear(): Unit = js.native
    /* CompleteClass */
    override def first(): IIterator[IKeyValuePair[String, js.Any]] = js.native
    /* CompleteClass */
    override def getView(): IMapView[String, js.Any] = js.native
    /* CompleteClass */
    override def hasKey(key: String): Boolean = js.native
    /* CompleteClass */
    override def insert(key: String, value: js.Any): Boolean = js.native
    /* CompleteClass */
    override def lookup(key: String): js.Any = js.native
    /* CompleteClass */
    override def remove(key: String): Unit = js.native
  }
  
  @js.native
  class MediaRatio ()
    extends typings.winrt.Windows.Media.MediaProperties.MediaRatio {
    /* CompleteClass */
    override var denominator: Double = js.native
    /* CompleteClass */
    override var numerator: Double = js.native
  }
  
  @js.native
  class VideoEncodingProperties ()
    extends typings.winrt.Windows.Media.MediaProperties.VideoEncodingProperties {
    /* CompleteClass */
    override var bitrate: Double = js.native
    /* CompleteClass */
    override var frameRate: typings.winrt.Windows.Media.MediaProperties.MediaRatio = js.native
    /* CompleteClass */
    override var height: Double = js.native
    /* CompleteClass */
    override var pixelAspectRatio: typings.winrt.Windows.Media.MediaProperties.MediaRatio = js.native
    /* CompleteClass */
    override var properties: typings.winrt.Windows.Media.MediaProperties.MediaPropertySet = js.native
    /* CompleteClass */
    override var subtype: String = js.native
    /* CompleteClass */
    override var `type`: String = js.native
    /* CompleteClass */
    override var width: Double = js.native
  }
  
  @js.native
  object AudioEncodingQuality extends js.Object {
    /* 0 */ val auto: typings.winrt.Windows.Media.MediaProperties.AudioEncodingQuality.auto with Double = js.native
    /* 1 */ val high: typings.winrt.Windows.Media.MediaProperties.AudioEncodingQuality.high with Double = js.native
    /* 3 */ val low: typings.winrt.Windows.Media.MediaProperties.AudioEncodingQuality.low with Double = js.native
    /* 2 */ val medium: typings.winrt.Windows.Media.MediaProperties.AudioEncodingQuality.medium with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.MediaProperties.AudioEncodingQuality with Double] = js.native
  }
  
  /* static members */
  @js.native
  object ImageEncodingProperties extends js.Object {
    def createJpeg(): typings.winrt.Windows.Media.MediaProperties.ImageEncodingProperties = js.native
    def createJpegXR(): typings.winrt.Windows.Media.MediaProperties.ImageEncodingProperties = js.native
    def createPng(): typings.winrt.Windows.Media.MediaProperties.ImageEncodingProperties = js.native
  }
  
  /* static members */
  @js.native
  object MediaEncodingProfile extends js.Object {
    def createFromFileAsync(file: IStorageFile): IAsyncOperation[typings.winrt.Windows.Media.MediaProperties.MediaEncodingProfile] = js.native
    def createFromStreamAsync(stream: IRandomAccessStream): IAsyncOperation[typings.winrt.Windows.Media.MediaProperties.MediaEncodingProfile] = js.native
    def createM4a(quality: AudioEncodingQuality): typings.winrt.Windows.Media.MediaProperties.MediaEncodingProfile = js.native
    def createMp3(quality: AudioEncodingQuality): typings.winrt.Windows.Media.MediaProperties.MediaEncodingProfile = js.native
    def createMp4(quality: VideoEncodingQuality): typings.winrt.Windows.Media.MediaProperties.MediaEncodingProfile = js.native
    def createWma(quality: AudioEncodingQuality): typings.winrt.Windows.Media.MediaProperties.MediaEncodingProfile = js.native
    def createWmv(quality: VideoEncodingQuality): typings.winrt.Windows.Media.MediaProperties.MediaEncodingProfile = js.native
  }
  
  @js.native
  object VideoEncodingQuality extends js.Object {
    /* 0 */ val auto: typings.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.auto with Double = js.native
    /* 1 */ val hD1080p: typings.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.hD1080p with Double = js.native
    /* 2 */ val hD720p: typings.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.hD720p with Double = js.native
    /* 4 */ val ntsc: typings.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.ntsc with Double = js.native
    /* 5 */ val pal: typings.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.pal with Double = js.native
    /* 7 */ val qvga: typings.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.qvga with Double = js.native
    /* 6 */ val vga: typings.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.vga with Double = js.native
    /* 3 */ val wvga: typings.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.wvga with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.MediaProperties.VideoEncodingQuality with Double] = js.native
  }
  
}

