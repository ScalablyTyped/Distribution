package typings.winrt.global.Windows.Media

import typings.winrt.Windows.Foundation.Collections.IIterator
import typings.winrt.Windows.Foundation.Collections.IKeyValuePair
import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Media.MediaProperties.AudioEncodingQuality
import typings.winrt.Windows.Media.MediaProperties.VideoEncodingQuality
import typings.winrt.Windows.Storage.IStorageFile
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MediaProperties {
  
  @JSGlobal("Windows.Media.MediaProperties.AudioEncodingProperties")
  @js.native
  class AudioEncodingProperties ()
    extends StObject
       with typings.winrt.Windows.Media.MediaProperties.AudioEncodingProperties {
    
    /* CompleteClass */
    var bitrate: Double = js.native
    
    /* CompleteClass */
    var bitsPerSample: Double = js.native
    
    /* CompleteClass */
    var channelCount: Double = js.native
    
    /* CompleteClass */
    var properties: typings.winrt.Windows.Media.MediaProperties.MediaPropertySet = js.native
    
    /* CompleteClass */
    var sampleRate: Double = js.native
    
    /* CompleteClass */
    var subtype: String = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
  }
  
  @JSGlobal("Windows.Media.MediaProperties.AudioEncodingQuality")
  @js.native
  object AudioEncodingQuality extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.MediaProperties.AudioEncodingQuality & Double] = js.native
    
    /* 0 */ val auto: typings.winrt.Windows.Media.MediaProperties.AudioEncodingQuality.auto & Double = js.native
    
    /* 1 */ val high: typings.winrt.Windows.Media.MediaProperties.AudioEncodingQuality.high & Double = js.native
    
    /* 3 */ val low: typings.winrt.Windows.Media.MediaProperties.AudioEncodingQuality.low & Double = js.native
    
    /* 2 */ val medium: typings.winrt.Windows.Media.MediaProperties.AudioEncodingQuality.medium & Double = js.native
  }
  
  @JSGlobal("Windows.Media.MediaProperties.ContainerEncodingProperties")
  @js.native
  class ContainerEncodingProperties ()
    extends StObject
       with typings.winrt.Windows.Media.MediaProperties.ContainerEncodingProperties {
    
    /* CompleteClass */
    var properties: typings.winrt.Windows.Media.MediaProperties.MediaPropertySet = js.native
    
    /* CompleteClass */
    var subtype: String = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
  }
  
  @JSGlobal("Windows.Media.MediaProperties.ImageEncodingProperties")
  @js.native
  class ImageEncodingProperties ()
    extends StObject
       with typings.winrt.Windows.Media.MediaProperties.ImageEncodingProperties {
    
    /* CompleteClass */
    var height: Double = js.native
    
    /* CompleteClass */
    var properties: typings.winrt.Windows.Media.MediaProperties.MediaPropertySet = js.native
    
    /* CompleteClass */
    var subtype: String = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
    
    /* CompleteClass */
    var width: Double = js.native
  }
  /* static members */
  object ImageEncodingProperties {
    
    @JSGlobal("Windows.Media.MediaProperties.ImageEncodingProperties")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createJpeg(): typings.winrt.Windows.Media.MediaProperties.ImageEncodingProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("createJpeg")().asInstanceOf[typings.winrt.Windows.Media.MediaProperties.ImageEncodingProperties]
    
    inline def createJpegXR(): typings.winrt.Windows.Media.MediaProperties.ImageEncodingProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("createJpegXR")().asInstanceOf[typings.winrt.Windows.Media.MediaProperties.ImageEncodingProperties]
    
    inline def createPng(): typings.winrt.Windows.Media.MediaProperties.ImageEncodingProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("createPng")().asInstanceOf[typings.winrt.Windows.Media.MediaProperties.ImageEncodingProperties]
  }
  
  @JSGlobal("Windows.Media.MediaProperties.MediaEncodingProfile")
  @js.native
  class MediaEncodingProfile ()
    extends StObject
       with typings.winrt.Windows.Media.MediaProperties.MediaEncodingProfile {
    
    /* CompleteClass */
    var audio: typings.winrt.Windows.Media.MediaProperties.AudioEncodingProperties = js.native
    
    /* CompleteClass */
    var container: typings.winrt.Windows.Media.MediaProperties.ContainerEncodingProperties = js.native
    
    /* CompleteClass */
    var video: typings.winrt.Windows.Media.MediaProperties.VideoEncodingProperties = js.native
  }
  /* static members */
  object MediaEncodingProfile {
    
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingProfile")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createFromFileAsync(file: IStorageFile): IAsyncOperation[typings.winrt.Windows.Media.MediaProperties.MediaEncodingProfile] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromFileAsync")(file.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[typings.winrt.Windows.Media.MediaProperties.MediaEncodingProfile]]
    
    inline def createFromStreamAsync(stream: IRandomAccessStream): IAsyncOperation[typings.winrt.Windows.Media.MediaProperties.MediaEncodingProfile] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromStreamAsync")(stream.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[typings.winrt.Windows.Media.MediaProperties.MediaEncodingProfile]]
    
    inline def createM4a(quality: AudioEncodingQuality): typings.winrt.Windows.Media.MediaProperties.MediaEncodingProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("createM4a")(quality.asInstanceOf[js.Any]).asInstanceOf[typings.winrt.Windows.Media.MediaProperties.MediaEncodingProfile]
    
    inline def createMp3(quality: AudioEncodingQuality): typings.winrt.Windows.Media.MediaProperties.MediaEncodingProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("createMp3")(quality.asInstanceOf[js.Any]).asInstanceOf[typings.winrt.Windows.Media.MediaProperties.MediaEncodingProfile]
    
    inline def createMp4(quality: VideoEncodingQuality): typings.winrt.Windows.Media.MediaProperties.MediaEncodingProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("createMp4")(quality.asInstanceOf[js.Any]).asInstanceOf[typings.winrt.Windows.Media.MediaProperties.MediaEncodingProfile]
    
    inline def createWma(quality: AudioEncodingQuality): typings.winrt.Windows.Media.MediaProperties.MediaEncodingProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("createWma")(quality.asInstanceOf[js.Any]).asInstanceOf[typings.winrt.Windows.Media.MediaProperties.MediaEncodingProfile]
    
    inline def createWmv(quality: VideoEncodingQuality): typings.winrt.Windows.Media.MediaProperties.MediaEncodingProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("createWmv")(quality.asInstanceOf[js.Any]).asInstanceOf[typings.winrt.Windows.Media.MediaProperties.MediaEncodingProfile]
  }
  
  @JSGlobal("Windows.Media.MediaProperties.MediaPropertySet")
  @js.native
  class MediaPropertySet ()
    extends StObject
       with typings.winrt.Windows.Media.MediaProperties.MediaPropertySet {
    
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
    
    /* CompleteClass */
    var size: Double = js.native
  }
  
  @JSGlobal("Windows.Media.MediaProperties.MediaRatio")
  @js.native
  class MediaRatio ()
    extends StObject
       with typings.winrt.Windows.Media.MediaProperties.MediaRatio {
    
    /* CompleteClass */
    var denominator: Double = js.native
    
    /* CompleteClass */
    var numerator: Double = js.native
  }
  
  @JSGlobal("Windows.Media.MediaProperties.VideoEncodingProperties")
  @js.native
  class VideoEncodingProperties ()
    extends StObject
       with typings.winrt.Windows.Media.MediaProperties.VideoEncodingProperties {
    
    /* CompleteClass */
    var bitrate: Double = js.native
    
    /* CompleteClass */
    var frameRate: typings.winrt.Windows.Media.MediaProperties.MediaRatio = js.native
    
    /* CompleteClass */
    var height: Double = js.native
    
    /* CompleteClass */
    var pixelAspectRatio: typings.winrt.Windows.Media.MediaProperties.MediaRatio = js.native
    
    /* CompleteClass */
    var properties: typings.winrt.Windows.Media.MediaProperties.MediaPropertySet = js.native
    
    /* CompleteClass */
    var subtype: String = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
    
    /* CompleteClass */
    var width: Double = js.native
  }
  
  @JSGlobal("Windows.Media.MediaProperties.VideoEncodingQuality")
  @js.native
  object VideoEncodingQuality extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.MediaProperties.VideoEncodingQuality & Double] = js.native
    
    /* 0 */ val auto: typings.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.auto & Double = js.native
    
    /* 1 */ val hD1080p: typings.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.hD1080p & Double = js.native
    
    /* 2 */ val hD720p: typings.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.hD720p & Double = js.native
    
    /* 4 */ val ntsc: typings.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.ntsc & Double = js.native
    
    /* 5 */ val pal: typings.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.pal & Double = js.native
    
    /* 7 */ val qvga: typings.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.qvga & Double = js.native
    
    /* 6 */ val vga: typings.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.vga & Double = js.native
    
    /* 3 */ val wvga: typings.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.wvga & Double = js.native
  }
}
