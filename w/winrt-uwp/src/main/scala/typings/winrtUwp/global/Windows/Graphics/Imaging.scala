package typings.winrtUwp.global.Windows.Graphics

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.PropertyType
import typings.winrtUwp.Windows.Graphics.DirectX.Direct3D11.IDirect3DSurface
import typings.winrtUwp.Windows.Graphics.Imaging.BitmapAlphaMode
import typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables the decoding, editing, and encoding of image files. */
object Imaging {
  
  /** Specifies the alpha mode of pixel data. */
  @JSGlobal("Windows.Graphics.Imaging.BitmapAlphaMode")
  @js.native
  object BitmapAlphaMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Graphics.Imaging.BitmapAlphaMode with Double] = js.native
    
    /* 2 */ val ignore: typings.winrtUwp.Windows.Graphics.Imaging.BitmapAlphaMode.ignore with Double = js.native
    
    /* 0 */ val premultiplied: typings.winrtUwp.Windows.Graphics.Imaging.BitmapAlphaMode.premultiplied with Double = js.native
    
    /* 1 */ val straight: typings.winrtUwp.Windows.Graphics.Imaging.BitmapAlphaMode.straight with Double = js.native
  }
  
  /** Represents the pixel data buffer of a bitmap. */
  @JSGlobal("Windows.Graphics.Imaging.BitmapBuffer")
  @js.native
  abstract class BitmapBuffer ()
    extends typings.winrtUwp.Windows.Graphics.Imaging.BitmapBuffer
  
  /** Specifies the access mode of a BitmapBuffer . */
  @JSGlobal("Windows.Graphics.Imaging.BitmapBufferAccessMode")
  @js.native
  object BitmapBufferAccessMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Graphics.Imaging.BitmapBufferAccessMode with Double] = js.native
    
    /* 0 */ val read: typings.winrtUwp.Windows.Graphics.Imaging.BitmapBufferAccessMode.read with Double = js.native
    
    /* 1 */ val readWrite: typings.winrtUwp.Windows.Graphics.Imaging.BitmapBufferAccessMode.readWrite with Double = js.native
    
    /* 2 */ val write: typings.winrtUwp.Windows.Graphics.Imaging.BitmapBufferAccessMode.write with Double = js.native
  }
  
  /** Provides access to information about a decoder or encoder. */
  @JSGlobal("Windows.Graphics.Imaging.BitmapCodecInformation")
  @js.native
  abstract class BitmapCodecInformation ()
    extends typings.winrtUwp.Windows.Graphics.Imaging.BitmapCodecInformation
  
  /** Provides read access to bitmap container data as well as data from the first frame. */
  @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder")
  @js.native
  abstract class BitmapDecoder ()
    extends typings.winrtUwp.Windows.Graphics.Imaging.BitmapDecoder
  object BitmapDecoder {
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder")
    @js.native
    val ^ : js.Any = js.native
    
    /** The unique identifier of the BMP decoder. */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.bmpDecoderId")
    @js.native
    def bmpDecoderId: String = js.native
    @scala.inline
    def bmpDecoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bmpDecoderId")(x.asInstanceOf[js.Any])
    
    /**
      * Asynchronously creates a new BitmapDecoder using a specific bitmap codec and initializes it using a stream.
      * @param decoderId The unique identifier of the specified bitmap codec.
      * @param stream The stream containing the image file to be decoded.
      * @return An object that manages the asynchronous creation of a new BitmapDecoder .
      */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.createAsync")
    @js.native
    def createAsync(decoderId: String, stream: IRandomAccessStream): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Graphics.Imaging.BitmapDecoder] = js.native
    /**
      * Asynchronously creates a new BitmapDecoder and initializes it using a stream.
      * @param stream The stream containing the image file to be decoded.
      * @return An object that manages the asynchronous creation of a new BitmapDecoder .
      */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.createAsync")
    @js.native
    def createAsync(stream: IRandomAccessStream): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Graphics.Imaging.BitmapDecoder] = js.native
    
    /**
      * The bitmap decoders installed on the system and information about them.
      * @return A list of BitmapCodecInformation objects containing information about each decoder.
      */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.getDecoderInformationEnumerator")
    @js.native
    def getDecoderInformationEnumerator(): IVectorView[typings.winrtUwp.Windows.Graphics.Imaging.BitmapCodecInformation] = js.native
    
    /** The unique identifier of the GIF decoder. */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.gifDecoderId")
    @js.native
    def gifDecoderId: String = js.native
    @scala.inline
    def gifDecoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gifDecoderId")(x.asInstanceOf[js.Any])
    
    /** The unique identifier of the ICO decoder. */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.icoDecoderId")
    @js.native
    def icoDecoderId: String = js.native
    @scala.inline
    def icoDecoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("icoDecoderId")(x.asInstanceOf[js.Any])
    
    /** The unique identifier of the JPEG decoder. */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.jpegDecoderId")
    @js.native
    def jpegDecoderId: String = js.native
    @scala.inline
    def jpegDecoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jpegDecoderId")(x.asInstanceOf[js.Any])
    
    /** The unique identifier of the JPEG-XR decoder. */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.jpegXRDecoderId")
    @js.native
    def jpegXRDecoderId: String = js.native
    @scala.inline
    def jpegXRDecoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jpegXRDecoderId")(x.asInstanceOf[js.Any])
    
    /** The unique identifier of the PNG decoder. */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.pngDecoderId")
    @js.native
    def pngDecoderId: String = js.native
    @scala.inline
    def pngDecoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pngDecoderId")(x.asInstanceOf[js.Any])
    
    /** The unique identifier of the TIFF decoder. */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.tiffDecoderId")
    @js.native
    def tiffDecoderId: String = js.native
    @scala.inline
    def tiffDecoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tiffDecoderId")(x.asInstanceOf[js.Any])
  }
  
  /** Contains methods to create, edit and save images. */
  @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder")
  @js.native
  abstract class BitmapEncoder ()
    extends typings.winrtUwp.Windows.Graphics.Imaging.BitmapEncoder
  object BitmapEncoder {
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder")
    @js.native
    val ^ : js.Any = js.native
    
    /** The unique identifier of the built-in BMP encoder. */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder.bmpEncoderId")
    @js.native
    def bmpEncoderId: String = js.native
    @scala.inline
    def bmpEncoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bmpEncoderId")(x.asInstanceOf[js.Any])
    
    /**
      * Asynchronously creates a new BitmapEncoder .
      * @param encoderId The unique identifier of the specified encoder.
      * @param stream The output stream.
      * @return An object that manages the asynchronous creation of a new BitmapEncoder .
      */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder.createAsync")
    @js.native
    def createAsync(encoderId: String, stream: IRandomAccessStream): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Graphics.Imaging.BitmapEncoder] = js.native
    /**
      * Asynchronously creates a new BitmapEncoder for the specified codec with the specified encoding options and initializes it on a stream.
      * @param encoderId The unique identifier of the specified encoder.
      * @param stream A stream representing where the image file is to be written.
      * @param encodingOptions A collection of key-value pairs containing one or more codec-specific encoding options and the desired values.
      * @return An object that manages the asynchronous creation of a new BitmapEncoder .
      */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder.createAsync")
    @js.native
    def createAsync(encoderId: String, stream: IRandomAccessStream, encodingOptions: IIterable[IKeyValuePair[_, _]]): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Graphics.Imaging.BitmapEncoder] = js.native
    
    /**
      * Asynchronously creates a new BitmapEncoder for in-place property and metadata editing. The new encoder can only edit bitmap properties in-place and will fail for any other uses.
      * @param bitmapDecoder A BitmapDecoder containing the image data to be edited. This parameter must be created on a stream with an access mode of ReadWrite .
      * @return An object that manages the asynchronous initialization of a new BitmapEncoder using data from an existing BitmapDecoder .
      */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder.createForInPlacePropertyEncodingAsync")
    @js.native
    def createForInPlacePropertyEncodingAsync(bitmapDecoder: typings.winrtUwp.Windows.Graphics.Imaging.BitmapDecoder): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Graphics.Imaging.BitmapEncoder] = js.native
    
    /**
      * Asynchronously creates a new BitmapEncoder and initializes it using data from an existing BitmapDecoder .
      * @param stream The output stream.
      * @param bitmapDecoder A BitmapDecoder containing the image data to be copied.
      * @return An object that manages the asynchronous creation of a new BitmapEncoder using data from an existing BitmapDecoder .
      */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder.createForTranscodingAsync")
    @js.native
    def createForTranscodingAsync(
      stream: IRandomAccessStream,
      bitmapDecoder: typings.winrtUwp.Windows.Graphics.Imaging.BitmapDecoder
    ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Graphics.Imaging.BitmapEncoder] = js.native
    
    /**
      * A list of the bitmap encoders installed on the system and information about them.
      * @return A list of BitmapCodecInformation objects containing information about each encoder.
      */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder.getEncoderInformationEnumerator")
    @js.native
    def getEncoderInformationEnumerator(): IVectorView[typings.winrtUwp.Windows.Graphics.Imaging.BitmapCodecInformation] = js.native
    
    /** The unique identifier of the built-in GIF encoder. */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder.gifEncoderId")
    @js.native
    def gifEncoderId: String = js.native
    @scala.inline
    def gifEncoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gifEncoderId")(x.asInstanceOf[js.Any])
    
    /** The unique identifier of the built-in JPEG encoder. */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder.jpegEncoderId")
    @js.native
    def jpegEncoderId: String = js.native
    @scala.inline
    def jpegEncoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jpegEncoderId")(x.asInstanceOf[js.Any])
    
    /** The unique identifier of the built-in JPEG-XR encoder. */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder.jpegXREncoderId")
    @js.native
    def jpegXREncoderId: String = js.native
    @scala.inline
    def jpegXREncoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jpegXREncoderId")(x.asInstanceOf[js.Any])
    
    /** The unique identifier of the built-in PNG encoder. */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder.pngEncoderId")
    @js.native
    def pngEncoderId: String = js.native
    @scala.inline
    def pngEncoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pngEncoderId")(x.asInstanceOf[js.Any])
    
    /** The unique identifier of the built-in TIFF encoder. */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder.tiffEncoderId")
    @js.native
    def tiffEncoderId: String = js.native
    @scala.inline
    def tiffEncoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tiffEncoderId")(x.asInstanceOf[js.Any])
  }
  
  /** Specifies the flip operation to be performed on pixel data. */
  @JSGlobal("Windows.Graphics.Imaging.BitmapFlip")
  @js.native
  object BitmapFlip extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Graphics.Imaging.BitmapFlip with Double] = js.native
    
    /* 1 */ val horizontal: typings.winrtUwp.Windows.Graphics.Imaging.BitmapFlip.horizontal with Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Graphics.Imaging.BitmapFlip.none with Double = js.native
    
    /* 2 */ val vertical: typings.winrtUwp.Windows.Graphics.Imaging.BitmapFlip.vertical with Double = js.native
  }
  
  /** Provides read access to data within a single frame. */
  @JSGlobal("Windows.Graphics.Imaging.BitmapFrame")
  @js.native
  abstract class BitmapFrame ()
    extends typings.winrtUwp.Windows.Graphics.Imaging.BitmapFrame
  
  /** Specifies the interpolation mode used for scaling pixel data. */
  @JSGlobal("Windows.Graphics.Imaging.BitmapInterpolationMode")
  @js.native
  object BitmapInterpolationMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Graphics.Imaging.BitmapInterpolationMode with Double] = js.native
    
    /* 2 */ val cubic: typings.winrtUwp.Windows.Graphics.Imaging.BitmapInterpolationMode.cubic with Double = js.native
    
    /* 3 */ val fant: typings.winrtUwp.Windows.Graphics.Imaging.BitmapInterpolationMode.fant with Double = js.native
    
    /* 1 */ val linear: typings.winrtUwp.Windows.Graphics.Imaging.BitmapInterpolationMode.linear with Double = js.native
    
    /* 0 */ val nearestNeighbor: typings.winrtUwp.Windows.Graphics.Imaging.BitmapInterpolationMode.nearestNeighbor with Double = js.native
  }
  
  /** Specifies the pixel format of pixel data. Each enumeration value defines a channel ordering, bit depth, and data type. */
  @JSGlobal("Windows.Graphics.Imaging.BitmapPixelFormat")
  @js.native
  object BitmapPixelFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat with Double] = js.native
    
    /* 5 */ val bgra8: typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat.bgra8 with Double = js.native
    
    /* 3 */ val gray16: typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat.gray16 with Double = js.native
    
    /* 4 */ val gray8: typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat.gray8 with Double = js.native
    
    /* 6 */ val nv12: typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat.nv12 with Double = js.native
    
    /* 1 */ val rgba16: typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat.rgba16 with Double = js.native
    
    /* 2 */ val rgba8: typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat.rgba8 with Double = js.native
    
    /* 0 */ val unknown: typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat.unknown with Double = js.native
    
    /* 7 */ val yuy2: typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat.yuy2 with Double = js.native
  }
  
  /** Provides read and write access to image properties and metadata. */
  @JSGlobal("Windows.Graphics.Imaging.BitmapProperties")
  @js.native
  abstract class BitmapProperties ()
    extends typings.winrtUwp.Windows.Graphics.Imaging.BitmapProperties
  
  /** Provides read access to image properties and metadata. A particular instance of BitmapPropertiesView may represent the entire contents of the frame metadata, or any nested metadata block within the frame. */
  @JSGlobal("Windows.Graphics.Imaging.BitmapPropertiesView")
  @js.native
  abstract class BitmapPropertiesView ()
    extends typings.winrtUwp.Windows.Graphics.Imaging.BitmapPropertiesView
  
  /** Represents a property set of BitmapTypedValue objects. */
  @JSGlobal("Windows.Graphics.Imaging.BitmapPropertySet")
  @js.native
  /** Creates and initializes a new instance of the bitmap property set. */
  class BitmapPropertySet ()
    extends typings.winrtUwp.Windows.Graphics.Imaging.BitmapPropertySet
  
  /** Specifies the rotation operation to be performed on pixel data. */
  @JSGlobal("Windows.Graphics.Imaging.BitmapRotation")
  @js.native
  object BitmapRotation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Graphics.Imaging.BitmapRotation with Double] = js.native
    
    /* 2 */ val clockwise180Degrees: typings.winrtUwp.Windows.Graphics.Imaging.BitmapRotation.clockwise180Degrees with Double = js.native
    
    /* 3 */ val clockwise270Degrees: typings.winrtUwp.Windows.Graphics.Imaging.BitmapRotation.clockwise270Degrees with Double = js.native
    
    /* 1 */ val clockwise90Degrees: typings.winrtUwp.Windows.Graphics.Imaging.BitmapRotation.clockwise90Degrees with Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Graphics.Imaging.BitmapRotation.none with Double = js.native
  }
  
  /** Contains transformations that can be applied to pixel data. */
  @JSGlobal("Windows.Graphics.Imaging.BitmapTransform")
  @js.native
  /** Creates a new BitmapTransform object. */
  class BitmapTransform ()
    extends typings.winrtUwp.Windows.Graphics.Imaging.BitmapTransform
  
  /** A value along with an enumeration specifying its data type. */
  @JSGlobal("Windows.Graphics.Imaging.BitmapTypedValue")
  @js.native
  class BitmapTypedValue protected ()
    extends typings.winrtUwp.Windows.Graphics.Imaging.BitmapTypedValue {
    /**
      * Creates a new BitmapTypedValue object.
      * @param value The value to store.
      * @param type The type of the value parameter.
      */
    def this(value: js.Any, `type`: PropertyType) = this()
  }
  
  /** Specifies the color management behavior when obtaining pixel data. */
  @JSGlobal("Windows.Graphics.Imaging.ColorManagementMode")
  @js.native
  object ColorManagementMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Graphics.Imaging.ColorManagementMode with Double] = js.native
    
    /* 1 */ val colorManageToSRgb: typings.winrtUwp.Windows.Graphics.Imaging.ColorManagementMode.colorManageToSRgb with Double = js.native
    
    /* 0 */ val doNotColorManage: typings.winrtUwp.Windows.Graphics.Imaging.ColorManagementMode.doNotColorManage with Double = js.native
  }
  
  /** Specifies the EXIF orientation flag behavior when obtaining pixel data. */
  @JSGlobal("Windows.Graphics.Imaging.ExifOrientationMode")
  @js.native
  object ExifOrientationMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Graphics.Imaging.ExifOrientationMode with Double] = js.native
    
    /* 0 */ val ignoreExifOrientation: typings.winrtUwp.Windows.Graphics.Imaging.ExifOrientationMode.ignoreExifOrientation with Double = js.native
    
    /* 1 */ val respectExifOrientation: typings.winrtUwp.Windows.Graphics.Imaging.ExifOrientationMode.respectExifOrientation with Double = js.native
  }
  
  /** An implementation of IRandomAccessStreamWithContent type used in the Imaging namespace. */
  @JSGlobal("Windows.Graphics.Imaging.ImageStream")
  @js.native
  abstract class ImageStream ()
    extends typings.winrtUwp.Windows.Graphics.Imaging.ImageStream
  
  /** Specifies which chroma subsampling mode will be used for image compression in JPEG images. */
  @JSGlobal("Windows.Graphics.Imaging.JpegSubsamplingMode")
  @js.native
  object JpegSubsamplingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Graphics.Imaging.JpegSubsamplingMode with Double] = js.native
    
    /* 0 */ val default: typings.winrtUwp.Windows.Graphics.Imaging.JpegSubsamplingMode.default with Double = js.native
    
    /* 1 */ val y4Cb2Cr0: typings.winrtUwp.Windows.Graphics.Imaging.JpegSubsamplingMode.y4Cb2Cr0 with Double = js.native
    
    /* 2 */ val y4Cb2Cr2: typings.winrtUwp.Windows.Graphics.Imaging.JpegSubsamplingMode.y4Cb2Cr2 with Double = js.native
    
    /* 3 */ val y4Cb4Cr4: typings.winrtUwp.Windows.Graphics.Imaging.JpegSubsamplingMode.y4Cb4Cr4 with Double = js.native
  }
  
  /** Provides access to the pixel data from a bitmap frame. */
  @JSGlobal("Windows.Graphics.Imaging.PixelDataProvider")
  @js.native
  abstract class PixelDataProvider ()
    extends typings.winrtUwp.Windows.Graphics.Imaging.PixelDataProvider
  
  /** Specifies the filter used to optimize the image prior to image compression in PNG images. */
  @JSGlobal("Windows.Graphics.Imaging.PngFilterMode")
  @js.native
  object PngFilterMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Graphics.Imaging.PngFilterMode with Double] = js.native
    
    /* 6 */ val adaptive: typings.winrtUwp.Windows.Graphics.Imaging.PngFilterMode.adaptive with Double = js.native
    
    /* 0 */ val automatic: typings.winrtUwp.Windows.Graphics.Imaging.PngFilterMode.automatic with Double = js.native
    
    /* 4 */ val average: typings.winrtUwp.Windows.Graphics.Imaging.PngFilterMode.average with Double = js.native
    
    /* 1 */ val none: typings.winrtUwp.Windows.Graphics.Imaging.PngFilterMode.none with Double = js.native
    
    /* 5 */ val paeth: typings.winrtUwp.Windows.Graphics.Imaging.PngFilterMode.paeth with Double = js.native
    
    /* 2 */ val sub: typings.winrtUwp.Windows.Graphics.Imaging.PngFilterMode.sub with Double = js.native
    
    /* 3 */ val up: typings.winrtUwp.Windows.Graphics.Imaging.PngFilterMode.up with Double = js.native
  }
  
  /** Represents an uncompressed bitmap. */
  @JSGlobal("Windows.Graphics.Imaging.SoftwareBitmap")
  @js.native
  class SoftwareBitmap protected ()
    extends typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap {
    /**
      * Initializes a new instance of the SoftwareBitmap class.
      * @param format The pixel format of the new software bitmap.
      * @param width The width of the new software bitmap, in pixels.
      * @param height The height of the new software bitmap, in pixels.
      */
    def this(format: BitmapPixelFormat, width: Double, height: Double) = this()
    /**
      * Initializes a new instance of the SoftwareBitmap class.
      * @param format The pixel format of the new software bitmap.
      * @param width The width of the new software bitmap, in pixels.
      * @param height The height of the new software bitmap, in pixels.
      * @param alpha The alpha mode of the new software bitmap.
      */
    def this(format: BitmapPixelFormat, width: Double, height: Double, alpha: BitmapAlphaMode) = this()
  }
  object SoftwareBitmap {
    
    /**
      * Converts an existing SoftwareBitmap to a SoftwareBitmap with a different pixel format.
      * @param source The software bitmap to convert.
      * @param format The pixel format of the new software bitmap.
      * @return The converted software bitmap.
      */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.SoftwareBitmap.convert")
    @js.native
    def convert(source: typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap, format: BitmapPixelFormat): typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap = js.native
    /**
      * Converts an existing SoftwareBitmap to a SoftwareBitmap with a different pixel format or alpha mode.
      * @param source The software bitmap to convert.
      * @param format The pixel format of the new software bitmap.
      * @param alpha The alpha mode of the new software bitmap.
      * @return The converted software bitmap.
      */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.SoftwareBitmap.convert")
    @js.native
    def convert(
      source: typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap,
      format: BitmapPixelFormat,
      alpha: BitmapAlphaMode
    ): typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap = js.native
    
    /**
      * Creates a copy of the provided SoftwareBitmap object.
      * @param source The software bitmap to copy.
      * @return The newly created copy of the software bitmap.
      */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.SoftwareBitmap.copy")
    @js.native
    def copy(source: typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap): typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap = js.native
    
    /**
      * Creates a new SoftwareBitmap by performing a deep copy of the provided buffer. Modifications to the data in the new SoftwareBitmap will not effect the buffer from which it was created.
      * @param source The source buffer from which the copy will be created.
      * @param format The pixel format of the software bitmap.
      * @param width The width of the software bitmap, in pixels.
      * @param height The height of the software bitmap, in pixels.
      * @return The new software bitmap.
      */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.SoftwareBitmap.createCopyFromBuffer")
    @js.native
    def createCopyFromBuffer(source: IBuffer, format: BitmapPixelFormat, width: Double, height: Double): typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap = js.native
    /**
      * Creates a new SoftwareBitmap by performing a deep copy of the provided buffer. Modifications to the data in the new SoftwareBitmap will not effect the buffer from which it was created.
      * @param source The source buffer from which the copy will be created.
      * @param format The pixel format of the software bitmap.
      * @param width The width of the software bitmap, in pixels.
      * @param height The height of the software bitmap, in pixels.
      * @param alpha The alpha mode of the software bitmap.
      * @return The new software bitmap.
      */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.SoftwareBitmap.createCopyFromBuffer")
    @js.native
    def createCopyFromBuffer(source: IBuffer, format: BitmapPixelFormat, width: Double, height: Double, alpha: BitmapAlphaMode): typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap = js.native
    
    /**
      * Asynchronously creates a new SoftwareBitmap by performing a deep copy of the provided IDirect3DSurface . Modifications to the data in the new SoftwareBitmap will not effect the surface from which it was created.
      * @param surface The source surface from which the copy will be created.
      * @return An asynchronous operation that returns a SoftwareBitmap on successful completion.
      */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.SoftwareBitmap.createCopyFromSurfaceAsync")
    @js.native
    def createCopyFromSurfaceAsync(surface: IDirect3DSurface): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap] = js.native
    /**
      * Asynchronously creates a new SoftwareBitmap by performing a deep copy of the provided IDirect3DSurface . Modifications to the data in the new SoftwareBitmap will not effect the surface from which it was created.
      * @param surface The source surface from which the copy will be created.
      * @param alpha The alpha mode of the software bitmap.
      * @return An asynchronous operation that returns a SoftwareBitmap on successful completion.
      */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.SoftwareBitmap.createCopyFromSurfaceAsync")
    @js.native
    def createCopyFromSurfaceAsync(surface: IDirect3DSurface, alpha: BitmapAlphaMode): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap] = js.native
  }
  
  /** Specifies the compression mode used for TIFF images. */
  @JSGlobal("Windows.Graphics.Imaging.TiffCompressionMode")
  @js.native
  object TiffCompressionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Graphics.Imaging.TiffCompressionMode with Double] = js.native
    
    /* 0 */ val automatic: typings.winrtUwp.Windows.Graphics.Imaging.TiffCompressionMode.automatic with Double = js.native
    
    /* 2 */ val ccitt3: typings.winrtUwp.Windows.Graphics.Imaging.TiffCompressionMode.ccitt3 with Double = js.native
    
    /* 3 */ val ccitt4: typings.winrtUwp.Windows.Graphics.Imaging.TiffCompressionMode.ccitt4 with Double = js.native
    
    /* 4 */ val lzw: typings.winrtUwp.Windows.Graphics.Imaging.TiffCompressionMode.lzw with Double = js.native
    
    /* 7 */ val lzwhDifferencing: typings.winrtUwp.Windows.Graphics.Imaging.TiffCompressionMode.lzwhDifferencing with Double = js.native
    
    /* 1 */ val none: typings.winrtUwp.Windows.Graphics.Imaging.TiffCompressionMode.none with Double = js.native
    
    /* 5 */ val rle: typings.winrtUwp.Windows.Graphics.Imaging.TiffCompressionMode.rle with Double = js.native
    
    /* 6 */ val zip: typings.winrtUwp.Windows.Graphics.Imaging.TiffCompressionMode.zip with Double = js.native
  }
}
