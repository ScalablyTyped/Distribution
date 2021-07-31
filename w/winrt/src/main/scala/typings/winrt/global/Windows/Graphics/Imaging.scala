package typings.winrt.global.Windows.Graphics

import typings.std.Uint8Array
import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Collections.IIterator
import typings.winrt.Windows.Foundation.Collections.IKeyValuePair
import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrt.Windows.Foundation.PropertyType
import typings.winrt.Windows.Graphics.Imaging.BitmapBounds
import typings.winrt.Windows.Graphics.Imaging.BitmapFlip
import typings.winrt.Windows.Graphics.Imaging.BitmapInterpolationMode
import typings.winrt.Windows.Graphics.Imaging.BitmapRotation
import typings.winrt.Windows.Storage.Streams.IBuffer
import typings.winrt.Windows.Storage.Streams.IInputStream
import typings.winrt.Windows.Storage.Streams.IOutputStream
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import typings.winrt.Windows.Storage.Streams.InputStreamOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Imaging {
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapAlphaMode")
  @js.native
  object BitmapAlphaMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Graphics.Imaging.BitmapAlphaMode & Double] = js.native
    
    /* 2 */ val ignore: typings.winrt.Windows.Graphics.Imaging.BitmapAlphaMode.ignore & Double = js.native
    
    /* 0 */ val premultiplied: typings.winrt.Windows.Graphics.Imaging.BitmapAlphaMode.premultiplied & Double = js.native
    
    /* 1 */ val straight: typings.winrt.Windows.Graphics.Imaging.BitmapAlphaMode.straight & Double = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapCodecInformation")
  @js.native
  class BitmapCodecInformation ()
    extends StObject
       with typings.winrt.Windows.Graphics.Imaging.BitmapCodecInformation {
    
    /* CompleteClass */
    var codecId: String = js.native
    
    /* CompleteClass */
    var fileExtensions: IVectorView[String] = js.native
    
    /* CompleteClass */
    var friendlyName: String = js.native
    
    /* CompleteClass */
    var mimeTypes: IVectorView[String] = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder")
  @js.native
  class BitmapDecoder ()
    extends StObject
       with typings.winrt.Windows.Graphics.Imaging.BitmapDecoder {
    
    /* CompleteClass */
    var bitmapContainerProperties: typings.winrt.Windows.Graphics.Imaging.BitmapPropertiesView = js.native
    
    /* CompleteClass */
    var decoderInformation: typings.winrt.Windows.Graphics.Imaging.BitmapCodecInformation = js.native
    
    /* CompleteClass */
    var frameCount: Double = js.native
    
    /* CompleteClass */
    override def getFrameAsync(frameIndex: Double): IAsyncOperation[typings.winrt.Windows.Graphics.Imaging.BitmapFrame] = js.native
    
    /* CompleteClass */
    override def getPreviewAsync(): IAsyncOperation[typings.winrt.Windows.Graphics.Imaging.ImageStream] = js.native
  }
  /* static members */
  object BitmapDecoder {
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.bmpDecoderId")
    @js.native
    def bmpDecoderId: String = js.native
    @scala.inline
    def bmpDecoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bmpDecoderId")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def createAsync(decoderId: String, stream: IRandomAccessStream): IAsyncOperation[typings.winrt.Windows.Graphics.Imaging.BitmapDecoder] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAsync")(decoderId.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[typings.winrt.Windows.Graphics.Imaging.BitmapDecoder]]
    @scala.inline
    def createAsync(stream: IRandomAccessStream): IAsyncOperation[typings.winrt.Windows.Graphics.Imaging.BitmapDecoder] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAsync")(stream.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[typings.winrt.Windows.Graphics.Imaging.BitmapDecoder]]
    
    @scala.inline
    def getDecoderInformationEnumerator(): IVectorView[typings.winrt.Windows.Graphics.Imaging.BitmapCodecInformation] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDecoderInformationEnumerator")().asInstanceOf[IVectorView[typings.winrt.Windows.Graphics.Imaging.BitmapCodecInformation]]
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.gifDecoderId")
    @js.native
    def gifDecoderId: String = js.native
    @scala.inline
    def gifDecoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gifDecoderId")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.icoDecoderId")
    @js.native
    def icoDecoderId: String = js.native
    @scala.inline
    def icoDecoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("icoDecoderId")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.jpegDecoderId")
    @js.native
    def jpegDecoderId: String = js.native
    @scala.inline
    def jpegDecoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jpegDecoderId")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.jpegXRDecoderId")
    @js.native
    def jpegXRDecoderId: String = js.native
    @scala.inline
    def jpegXRDecoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jpegXRDecoderId")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.pngDecoderId")
    @js.native
    def pngDecoderId: String = js.native
    @scala.inline
    def pngDecoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pngDecoderId")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.tiffDecoderId")
    @js.native
    def tiffDecoderId: String = js.native
    @scala.inline
    def tiffDecoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tiffDecoderId")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder")
  @js.native
  class BitmapEncoder ()
    extends StObject
       with typings.winrt.Windows.Graphics.Imaging.BitmapEncoder
  /* static members */
  object BitmapEncoder {
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder.bmpEncoderId")
    @js.native
    def bmpEncoderId: String = js.native
    @scala.inline
    def bmpEncoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bmpEncoderId")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def createAsync(encoderId: String, stream: IRandomAccessStream): IAsyncOperation[typings.winrt.Windows.Graphics.Imaging.BitmapEncoder] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAsync")(encoderId.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[typings.winrt.Windows.Graphics.Imaging.BitmapEncoder]]
    @scala.inline
    def createAsync(
      encoderId: String,
      stream: IRandomAccessStream,
      encodingOptions: IIterable[IKeyValuePair[String, typings.winrt.Windows.Graphics.Imaging.BitmapTypedValue]]
    ): IAsyncOperation[typings.winrt.Windows.Graphics.Imaging.BitmapEncoder] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAsync")(encoderId.asInstanceOf[js.Any], stream.asInstanceOf[js.Any], encodingOptions.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[typings.winrt.Windows.Graphics.Imaging.BitmapEncoder]]
    
    @scala.inline
    def createForInPlacePropertyEncodingAsync(bitmapDecoder: typings.winrt.Windows.Graphics.Imaging.BitmapDecoder): IAsyncOperation[typings.winrt.Windows.Graphics.Imaging.BitmapEncoder] = ^.asInstanceOf[js.Dynamic].applyDynamic("createForInPlacePropertyEncodingAsync")(bitmapDecoder.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[typings.winrt.Windows.Graphics.Imaging.BitmapEncoder]]
    
    @scala.inline
    def createForTranscodingAsync(stream: IRandomAccessStream, bitmapDecoder: typings.winrt.Windows.Graphics.Imaging.BitmapDecoder): IAsyncOperation[typings.winrt.Windows.Graphics.Imaging.BitmapEncoder] = (^.asInstanceOf[js.Dynamic].applyDynamic("createForTranscodingAsync")(stream.asInstanceOf[js.Any], bitmapDecoder.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[typings.winrt.Windows.Graphics.Imaging.BitmapEncoder]]
    
    @scala.inline
    def getEncoderInformationEnumerator(): IVectorView[typings.winrt.Windows.Graphics.Imaging.BitmapCodecInformation] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEncoderInformationEnumerator")().asInstanceOf[IVectorView[typings.winrt.Windows.Graphics.Imaging.BitmapCodecInformation]]
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder.gifEncoderId")
    @js.native
    def gifEncoderId: String = js.native
    @scala.inline
    def gifEncoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gifEncoderId")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder.jpegEncoderId")
    @js.native
    def jpegEncoderId: String = js.native
    @scala.inline
    def jpegEncoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jpegEncoderId")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder.jpegXREncoderId")
    @js.native
    def jpegXREncoderId: String = js.native
    @scala.inline
    def jpegXREncoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jpegXREncoderId")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder.pngEncoderId")
    @js.native
    def pngEncoderId: String = js.native
    @scala.inline
    def pngEncoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pngEncoderId")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder.tiffEncoderId")
    @js.native
    def tiffEncoderId: String = js.native
    @scala.inline
    def tiffEncoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tiffEncoderId")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapFlip")
  @js.native
  object BitmapFlip extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Graphics.Imaging.BitmapFlip & Double] = js.native
    
    /* 1 */ val horizontal: typings.winrt.Windows.Graphics.Imaging.BitmapFlip.horizontal & Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.Graphics.Imaging.BitmapFlip.none & Double = js.native
    
    /* 2 */ val vertical: typings.winrt.Windows.Graphics.Imaging.BitmapFlip.vertical & Double = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapFrame")
  @js.native
  class BitmapFrame ()
    extends StObject
       with typings.winrt.Windows.Graphics.Imaging.BitmapFrame
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapInterpolationMode")
  @js.native
  object BitmapInterpolationMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Graphics.Imaging.BitmapInterpolationMode & Double] = js.native
    
    /* 2 */ val cubic: typings.winrt.Windows.Graphics.Imaging.BitmapInterpolationMode.cubic & Double = js.native
    
    /* 3 */ val fant: typings.winrt.Windows.Graphics.Imaging.BitmapInterpolationMode.fant & Double = js.native
    
    /* 1 */ val linear: typings.winrt.Windows.Graphics.Imaging.BitmapInterpolationMode.linear & Double = js.native
    
    /* 0 */ val nearestNeighbor: typings.winrt.Windows.Graphics.Imaging.BitmapInterpolationMode.nearestNeighbor & Double = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapPixelFormat")
  @js.native
  object BitmapPixelFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Graphics.Imaging.BitmapPixelFormat & Double] = js.native
    
    /* 3 */ val bgra8: typings.winrt.Windows.Graphics.Imaging.BitmapPixelFormat.bgra8 & Double = js.native
    
    /* 1 */ val rgba16: typings.winrt.Windows.Graphics.Imaging.BitmapPixelFormat.rgba16 & Double = js.native
    
    /* 2 */ val rgba8: typings.winrt.Windows.Graphics.Imaging.BitmapPixelFormat.rgba8 & Double = js.native
    
    /* 0 */ val unknown: typings.winrt.Windows.Graphics.Imaging.BitmapPixelFormat.unknown & Double = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapProperties")
  @js.native
  class BitmapProperties ()
    extends StObject
       with typings.winrt.Windows.Graphics.Imaging.BitmapProperties {
    
    /* CompleteClass */
    override def getPropertiesAsync(propertiesToRetrieve: IIterable[String]): IAsyncOperation[typings.winrt.Windows.Graphics.Imaging.BitmapPropertySet] = js.native
    
    /* CompleteClass */
    override def setPropertiesAsync(
      propertiesToSet: IIterable[IKeyValuePair[String, typings.winrt.Windows.Graphics.Imaging.BitmapTypedValue]]
    ): IAsyncAction = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapPropertiesView")
  @js.native
  class BitmapPropertiesView ()
    extends StObject
       with typings.winrt.Windows.Graphics.Imaging.BitmapPropertiesView {
    
    /* CompleteClass */
    override def getPropertiesAsync(propertiesToRetrieve: IIterable[String]): IAsyncOperation[typings.winrt.Windows.Graphics.Imaging.BitmapPropertySet] = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapPropertySet")
  @js.native
  class BitmapPropertySet ()
    extends StObject
       with typings.winrt.Windows.Graphics.Imaging.BitmapPropertySet {
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def first(): IIterator[IKeyValuePair[String, typings.winrt.Windows.Graphics.Imaging.BitmapTypedValue]] = js.native
    
    /* CompleteClass */
    override def getView(): IMapView[String, typings.winrt.Windows.Graphics.Imaging.BitmapTypedValue] = js.native
    
    /* CompleteClass */
    override def hasKey(key: String): Boolean = js.native
    
    /* CompleteClass */
    override def insert(key: String, value: typings.winrt.Windows.Graphics.Imaging.BitmapTypedValue): Boolean = js.native
    
    /* CompleteClass */
    override def lookup(key: String): typings.winrt.Windows.Graphics.Imaging.BitmapTypedValue = js.native
    
    /* CompleteClass */
    override def remove(key: String): Unit = js.native
    
    /* CompleteClass */
    var size: Double = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapRotation")
  @js.native
  object BitmapRotation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Graphics.Imaging.BitmapRotation & Double] = js.native
    
    /* 2 */ val clockwise180Degrees: typings.winrt.Windows.Graphics.Imaging.BitmapRotation.clockwise180Degrees & Double = js.native
    
    /* 3 */ val clockwise270Degrees: typings.winrt.Windows.Graphics.Imaging.BitmapRotation.clockwise270Degrees & Double = js.native
    
    /* 1 */ val clockwise90Degrees: typings.winrt.Windows.Graphics.Imaging.BitmapRotation.clockwise90Degrees & Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.Graphics.Imaging.BitmapRotation.none & Double = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapTransform")
  @js.native
  class BitmapTransform ()
    extends StObject
       with typings.winrt.Windows.Graphics.Imaging.BitmapTransform {
    
    /* CompleteClass */
    var bounds: BitmapBounds = js.native
    
    /* CompleteClass */
    var flip: BitmapFlip = js.native
    
    /* CompleteClass */
    var interpolationMode: BitmapInterpolationMode = js.native
    
    /* CompleteClass */
    var rotation: BitmapRotation = js.native
    
    /* CompleteClass */
    var scaledHeight: Double = js.native
    
    /* CompleteClass */
    var scaledWidth: Double = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapTypedValue")
  @js.native
  class BitmapTypedValue protected ()
    extends StObject
       with typings.winrt.Windows.Graphics.Imaging.BitmapTypedValue {
    def this(value: js.Any, `type`: PropertyType) = this()
    
    /* CompleteClass */
    var `type`: PropertyType = js.native
    
    /* CompleteClass */
    var value: js.Any = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.ColorManagementMode")
  @js.native
  object ColorManagementMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Graphics.Imaging.ColorManagementMode & Double] = js.native
    
    /* 1 */ val colorManageToSRgb: typings.winrt.Windows.Graphics.Imaging.ColorManagementMode.colorManageToSRgb & Double = js.native
    
    /* 0 */ val doNotColorManage: typings.winrt.Windows.Graphics.Imaging.ColorManagementMode.doNotColorManage & Double = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.ExifOrientationMode")
  @js.native
  object ExifOrientationMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Graphics.Imaging.ExifOrientationMode & Double] = js.native
    
    /* 0 */ val ignoreExifOrientation: typings.winrt.Windows.Graphics.Imaging.ExifOrientationMode.ignoreExifOrientation & Double = js.native
    
    /* 1 */ val respectExifOrientation: typings.winrt.Windows.Graphics.Imaging.ExifOrientationMode.respectExifOrientation & Double = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.ImageStream")
  @js.native
  class ImageStream ()
    extends StObject
       with typings.winrt.Windows.Graphics.Imaging.ImageStream {
    
    /* CompleteClass */
    var canRead: Boolean = js.native
    
    /* CompleteClass */
    var canWrite: Boolean = js.native
    
    /* CompleteClass */
    override def cloneStream(): IRandomAccessStream = js.native
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    var contentType: String = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def flushAsync(): IAsyncOperation[Boolean] = js.native
    
    /* CompleteClass */
    override def getInputStreamAt(position: Double): IInputStream = js.native
    
    /* CompleteClass */
    override def getOutputStreamAt(position: Double): IOutputStream = js.native
    
    /* CompleteClass */
    var position: Double = js.native
    
    /* CompleteClass */
    override def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IAsyncOperationWithProgress[IBuffer, Double] = js.native
    
    /* CompleteClass */
    override def seek(position: Double): Unit = js.native
    
    /* CompleteClass */
    var size: Double = js.native
    
    /* CompleteClass */
    override def writeAsync(buffer: IBuffer): IAsyncOperationWithProgress[Double, Double] = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.JpegSubsamplingMode")
  @js.native
  object JpegSubsamplingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Graphics.Imaging.JpegSubsamplingMode & Double] = js.native
    
    /* 0 */ val default: typings.winrt.Windows.Graphics.Imaging.JpegSubsamplingMode.default & Double = js.native
    
    /* 1 */ val y4Cb2Cr0: typings.winrt.Windows.Graphics.Imaging.JpegSubsamplingMode.y4Cb2Cr0 & Double = js.native
    
    /* 2 */ val y4Cb2Cr2: typings.winrt.Windows.Graphics.Imaging.JpegSubsamplingMode.y4Cb2Cr2 & Double = js.native
    
    /* 3 */ val y4Cb4Cr4: typings.winrt.Windows.Graphics.Imaging.JpegSubsamplingMode.y4Cb4Cr4 & Double = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.PixelDataProvider")
  @js.native
  class PixelDataProvider ()
    extends StObject
       with typings.winrt.Windows.Graphics.Imaging.PixelDataProvider {
    
    /* CompleteClass */
    override def detachPixelData(): Uint8Array = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.PngFilterMode")
  @js.native
  object PngFilterMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Graphics.Imaging.PngFilterMode & Double] = js.native
    
    /* 6 */ val adaptive: typings.winrt.Windows.Graphics.Imaging.PngFilterMode.adaptive & Double = js.native
    
    /* 0 */ val automatic: typings.winrt.Windows.Graphics.Imaging.PngFilterMode.automatic & Double = js.native
    
    /* 4 */ val average: typings.winrt.Windows.Graphics.Imaging.PngFilterMode.average & Double = js.native
    
    /* 1 */ val none: typings.winrt.Windows.Graphics.Imaging.PngFilterMode.none & Double = js.native
    
    /* 5 */ val paeth: typings.winrt.Windows.Graphics.Imaging.PngFilterMode.paeth & Double = js.native
    
    /* 2 */ val sub: typings.winrt.Windows.Graphics.Imaging.PngFilterMode.sub & Double = js.native
    
    /* 3 */ val up: typings.winrt.Windows.Graphics.Imaging.PngFilterMode.up & Double = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.TiffCompressionMode")
  @js.native
  object TiffCompressionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Graphics.Imaging.TiffCompressionMode & Double] = js.native
    
    /* 0 */ val automatic: typings.winrt.Windows.Graphics.Imaging.TiffCompressionMode.automatic & Double = js.native
    
    /* 2 */ val ccitt3: typings.winrt.Windows.Graphics.Imaging.TiffCompressionMode.ccitt3 & Double = js.native
    
    /* 3 */ val ccitt4: typings.winrt.Windows.Graphics.Imaging.TiffCompressionMode.ccitt4 & Double = js.native
    
    /* 4 */ val lzw: typings.winrt.Windows.Graphics.Imaging.TiffCompressionMode.lzw & Double = js.native
    
    /* 7 */ val lzwhDifferencing: typings.winrt.Windows.Graphics.Imaging.TiffCompressionMode.lzwhDifferencing & Double = js.native
    
    /* 1 */ val none: typings.winrt.Windows.Graphics.Imaging.TiffCompressionMode.none & Double = js.native
    
    /* 5 */ val rle: typings.winrt.Windows.Graphics.Imaging.TiffCompressionMode.rle & Double = js.native
    
    /* 6 */ val zip: typings.winrt.Windows.Graphics.Imaging.TiffCompressionMode.zip & Double = js.native
  }
}
