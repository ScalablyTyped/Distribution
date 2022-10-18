package typings.winrtUwp.global.Windows.Graphics

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IMemoryBufferReference
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Foundation.PropertyType
import typings.winrtUwp.Windows.Graphics.DirectX.Direct3D11.IDirect3DSurface
import typings.winrtUwp.Windows.Graphics.Imaging.BitmapAlphaMode
import typings.winrtUwp.Windows.Graphics.Imaging.BitmapBounds
import typings.winrtUwp.Windows.Graphics.Imaging.BitmapBufferAccessMode
import typings.winrtUwp.Windows.Graphics.Imaging.BitmapFlip
import typings.winrtUwp.Windows.Graphics.Imaging.BitmapInterpolationMode
import typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat
import typings.winrtUwp.Windows.Graphics.Imaging.BitmapPlaneDescription
import typings.winrtUwp.Windows.Graphics.Imaging.BitmapRotation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Storage.Streams.IOutputStream
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typings.winrtUwp.Windows.Storage.Streams.InputStreamOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables the decoding, editing, and encoding of image files. */
object Imaging {
  
  /** Specifies the alpha mode of pixel data. */
  @JSGlobal("Windows.Graphics.Imaging.BitmapAlphaMode")
  @js.native
  object BitmapAlphaMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Graphics.Imaging.BitmapAlphaMode & Double] = js.native
    
    /* 2 */ val ignore: typings.winrtUwp.Windows.Graphics.Imaging.BitmapAlphaMode.ignore & Double = js.native
    
    /* 0 */ val premultiplied: typings.winrtUwp.Windows.Graphics.Imaging.BitmapAlphaMode.premultiplied & Double = js.native
    
    /* 1 */ val straight: typings.winrtUwp.Windows.Graphics.Imaging.BitmapAlphaMode.straight & Double = js.native
  }
  
  /** Represents the pixel data buffer of a bitmap. */
  /* note: abstract class */ @JSGlobal("Windows.Graphics.Imaging.BitmapBuffer")
  @js.native
  open class BitmapBuffer ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Imaging.BitmapBuffer {
    
    /** Disposes of the object and associated resources. */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /**
      * Creates a reference to the underlying memory buffer.
      * @return A reference to the underlying memory buffer.
      */
    /* CompleteClass */
    override def createReference(): IMemoryBufferReference = js.native
    
    /**
      * Gets the number of bit planes in the bitmap buffer.
      * @return The number of bit planes in the bitmap buffer.
      */
    /* CompleteClass */
    override def getPlaneCount(): Double = js.native
    
    /**
      * Gets a BitmapPlaneDescription object that describes the size, offset, and stride of the bitmap data in the bit plane with the specified index.
      * @param index The index of the bit plane for which the description is retrieved.
      * @return The bit plane description.
      */
    /* CompleteClass */
    override def getPlaneDescription(index: Double): BitmapPlaneDescription = js.native
  }
  
  /** Specifies the access mode of a BitmapBuffer . */
  @JSGlobal("Windows.Graphics.Imaging.BitmapBufferAccessMode")
  @js.native
  object BitmapBufferAccessMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Graphics.Imaging.BitmapBufferAccessMode & Double] = js.native
    
    /* 0 */ val read: typings.winrtUwp.Windows.Graphics.Imaging.BitmapBufferAccessMode.read & Double = js.native
    
    /* 1 */ val readWrite: typings.winrtUwp.Windows.Graphics.Imaging.BitmapBufferAccessMode.readWrite & Double = js.native
    
    /* 2 */ val write: typings.winrtUwp.Windows.Graphics.Imaging.BitmapBufferAccessMode.write & Double = js.native
  }
  
  /** Provides access to information about a decoder or encoder. */
  /* note: abstract class */ @JSGlobal("Windows.Graphics.Imaging.BitmapCodecInformation")
  @js.native
  open class BitmapCodecInformation ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Imaging.BitmapCodecInformation {
    
    /** The unique identifier of the decoder or encoder. Methods like BitmapDecoder::CreateAsync and BitmapEncoder::CreateAsync use the codec identifier to determine which codec to create. */
    /* CompleteClass */
    var codecId: String = js.native
    
    /** A collection of all the file extensions supported by the decoder or encoder. */
    /* CompleteClass */
    var fileExtensions: IVectorView[String] = js.native
    
    /** The friendly name of the decoder or encoder. */
    /* CompleteClass */
    var friendlyName: String = js.native
    
    /** A collection of all the MIME/content types supported by the decoder or encoder. MIME type is synonymous with content type . */
    /* CompleteClass */
    var mimeTypes: IVectorView[String] = js.native
  }
  
  /** Provides read access to bitmap container data as well as data from the first frame. */
  /* note: abstract class */ @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder")
  @js.native
  open class BitmapDecoder ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Imaging.BitmapDecoder
  object BitmapDecoder {
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder")
    @js.native
    val ^ : js.Any = js.native
    
    /** The unique identifier of the BMP decoder. */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.bmpDecoderId")
    @js.native
    def bmpDecoderId: String = js.native
    inline def bmpDecoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bmpDecoderId")(x.asInstanceOf[js.Any])
    
    /**
      * Asynchronously creates a new BitmapDecoder using a specific bitmap codec and initializes it using a stream.
      * @param decoderId The unique identifier of the specified bitmap codec.
      * @param stream The stream containing the image file to be decoded.
      * @return An object that manages the asynchronous creation of a new BitmapDecoder .
      */
    /* static member */
    inline def createAsync(decoderId: String, stream: IRandomAccessStream): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Graphics.Imaging.BitmapDecoder] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAsync")(decoderId.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Graphics.Imaging.BitmapDecoder]]
    /**
      * Asynchronously creates a new BitmapDecoder and initializes it using a stream.
      * @param stream The stream containing the image file to be decoded.
      * @return An object that manages the asynchronous creation of a new BitmapDecoder .
      */
    /* static member */
    inline def createAsync(stream: IRandomAccessStream): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Graphics.Imaging.BitmapDecoder] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAsync")(stream.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Graphics.Imaging.BitmapDecoder]]
    
    /**
      * The bitmap decoders installed on the system and information about them.
      * @return A list of BitmapCodecInformation objects containing information about each decoder.
      */
    /* static member */
    inline def getDecoderInformationEnumerator(): IVectorView[typings.winrtUwp.Windows.Graphics.Imaging.BitmapCodecInformation] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDecoderInformationEnumerator")().asInstanceOf[IVectorView[typings.winrtUwp.Windows.Graphics.Imaging.BitmapCodecInformation]]
    
    /** The unique identifier of the GIF decoder. */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.gifDecoderId")
    @js.native
    def gifDecoderId: String = js.native
    inline def gifDecoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gifDecoderId")(x.asInstanceOf[js.Any])
    
    /** The unique identifier of the ICO decoder. */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.icoDecoderId")
    @js.native
    def icoDecoderId: String = js.native
    inline def icoDecoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("icoDecoderId")(x.asInstanceOf[js.Any])
    
    /** The unique identifier of the JPEG decoder. */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.jpegDecoderId")
    @js.native
    def jpegDecoderId: String = js.native
    inline def jpegDecoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jpegDecoderId")(x.asInstanceOf[js.Any])
    
    /** The unique identifier of the JPEG-XR decoder. */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.jpegXRDecoderId")
    @js.native
    def jpegXRDecoderId: String = js.native
    inline def jpegXRDecoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jpegXRDecoderId")(x.asInstanceOf[js.Any])
    
    /** The unique identifier of the PNG decoder. */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.pngDecoderId")
    @js.native
    def pngDecoderId: String = js.native
    inline def pngDecoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pngDecoderId")(x.asInstanceOf[js.Any])
    
    /** The unique identifier of the TIFF decoder. */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.tiffDecoderId")
    @js.native
    def tiffDecoderId: String = js.native
    inline def tiffDecoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tiffDecoderId")(x.asInstanceOf[js.Any])
  }
  
  /** Contains methods to create, edit and save images. */
  /* note: abstract class */ @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder")
  @js.native
  open class BitmapEncoder ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Imaging.BitmapEncoder
  object BitmapEncoder {
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder")
    @js.native
    val ^ : js.Any = js.native
    
    /** The unique identifier of the built-in BMP encoder. */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder.bmpEncoderId")
    @js.native
    def bmpEncoderId: String = js.native
    inline def bmpEncoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bmpEncoderId")(x.asInstanceOf[js.Any])
    
    /**
      * Asynchronously creates a new BitmapEncoder .
      * @param encoderId The unique identifier of the specified encoder.
      * @param stream The output stream.
      * @return An object that manages the asynchronous creation of a new BitmapEncoder .
      */
    /* static member */
    inline def createAsync(encoderId: String, stream: IRandomAccessStream): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Graphics.Imaging.BitmapEncoder] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAsync")(encoderId.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Graphics.Imaging.BitmapEncoder]]
    /**
      * Asynchronously creates a new BitmapEncoder for the specified codec with the specified encoding options and initializes it on a stream.
      * @param encoderId The unique identifier of the specified encoder.
      * @param stream A stream representing where the image file is to be written.
      * @param encodingOptions A collection of key-value pairs containing one or more codec-specific encoding options and the desired values.
      * @return An object that manages the asynchronous creation of a new BitmapEncoder .
      */
    /* static member */
    inline def createAsync(
      encoderId: String,
      stream: IRandomAccessStream,
      encodingOptions: IIterable[IKeyValuePair[Any, Any]]
    ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Graphics.Imaging.BitmapEncoder] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAsync")(encoderId.asInstanceOf[js.Any], stream.asInstanceOf[js.Any], encodingOptions.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Graphics.Imaging.BitmapEncoder]]
    
    /**
      * Asynchronously creates a new BitmapEncoder for in-place property and metadata editing. The new encoder can only edit bitmap properties in-place and will fail for any other uses.
      * @param bitmapDecoder A BitmapDecoder containing the image data to be edited. This parameter must be created on a stream with an access mode of ReadWrite .
      * @return An object that manages the asynchronous initialization of a new BitmapEncoder using data from an existing BitmapDecoder .
      */
    /* static member */
    inline def createForInPlacePropertyEncodingAsync(bitmapDecoder: typings.winrtUwp.Windows.Graphics.Imaging.BitmapDecoder): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Graphics.Imaging.BitmapEncoder] = ^.asInstanceOf[js.Dynamic].applyDynamic("createForInPlacePropertyEncodingAsync")(bitmapDecoder.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Graphics.Imaging.BitmapEncoder]]
    
    /**
      * Asynchronously creates a new BitmapEncoder and initializes it using data from an existing BitmapDecoder .
      * @param stream The output stream.
      * @param bitmapDecoder A BitmapDecoder containing the image data to be copied.
      * @return An object that manages the asynchronous creation of a new BitmapEncoder using data from an existing BitmapDecoder .
      */
    /* static member */
    inline def createForTranscodingAsync(
      stream: IRandomAccessStream,
      bitmapDecoder: typings.winrtUwp.Windows.Graphics.Imaging.BitmapDecoder
    ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Graphics.Imaging.BitmapEncoder] = (^.asInstanceOf[js.Dynamic].applyDynamic("createForTranscodingAsync")(stream.asInstanceOf[js.Any], bitmapDecoder.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Graphics.Imaging.BitmapEncoder]]
    
    /**
      * A list of the bitmap encoders installed on the system and information about them.
      * @return A list of BitmapCodecInformation objects containing information about each encoder.
      */
    /* static member */
    inline def getEncoderInformationEnumerator(): IVectorView[typings.winrtUwp.Windows.Graphics.Imaging.BitmapCodecInformation] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEncoderInformationEnumerator")().asInstanceOf[IVectorView[typings.winrtUwp.Windows.Graphics.Imaging.BitmapCodecInformation]]
    
    /** The unique identifier of the built-in GIF encoder. */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder.gifEncoderId")
    @js.native
    def gifEncoderId: String = js.native
    inline def gifEncoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gifEncoderId")(x.asInstanceOf[js.Any])
    
    /** The unique identifier of the built-in JPEG encoder. */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder.jpegEncoderId")
    @js.native
    def jpegEncoderId: String = js.native
    inline def jpegEncoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jpegEncoderId")(x.asInstanceOf[js.Any])
    
    /** The unique identifier of the built-in JPEG-XR encoder. */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder.jpegXREncoderId")
    @js.native
    def jpegXREncoderId: String = js.native
    inline def jpegXREncoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jpegXREncoderId")(x.asInstanceOf[js.Any])
    
    /** The unique identifier of the built-in PNG encoder. */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder.pngEncoderId")
    @js.native
    def pngEncoderId: String = js.native
    inline def pngEncoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pngEncoderId")(x.asInstanceOf[js.Any])
    
    /** The unique identifier of the built-in TIFF encoder. */
    /* static member */
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder.tiffEncoderId")
    @js.native
    def tiffEncoderId: String = js.native
    inline def tiffEncoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tiffEncoderId")(x.asInstanceOf[js.Any])
  }
  
  /** Specifies the flip operation to be performed on pixel data. */
  @JSGlobal("Windows.Graphics.Imaging.BitmapFlip")
  @js.native
  object BitmapFlip extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Graphics.Imaging.BitmapFlip & Double] = js.native
    
    /* 1 */ val horizontal: typings.winrtUwp.Windows.Graphics.Imaging.BitmapFlip.horizontal & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Graphics.Imaging.BitmapFlip.none & Double = js.native
    
    /* 2 */ val vertical: typings.winrtUwp.Windows.Graphics.Imaging.BitmapFlip.vertical & Double = js.native
  }
  
  /** Provides read access to data within a single frame. */
  /* note: abstract class */ @JSGlobal("Windows.Graphics.Imaging.BitmapFrame")
  @js.native
  open class BitmapFrame ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Imaging.BitmapFrame
  
  /** Specifies the interpolation mode used for scaling pixel data. */
  @JSGlobal("Windows.Graphics.Imaging.BitmapInterpolationMode")
  @js.native
  object BitmapInterpolationMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Graphics.Imaging.BitmapInterpolationMode & Double] = js.native
    
    /* 2 */ val cubic: typings.winrtUwp.Windows.Graphics.Imaging.BitmapInterpolationMode.cubic & Double = js.native
    
    /* 3 */ val fant: typings.winrtUwp.Windows.Graphics.Imaging.BitmapInterpolationMode.fant & Double = js.native
    
    /* 1 */ val linear: typings.winrtUwp.Windows.Graphics.Imaging.BitmapInterpolationMode.linear & Double = js.native
    
    /* 0 */ val nearestNeighbor: typings.winrtUwp.Windows.Graphics.Imaging.BitmapInterpolationMode.nearestNeighbor & Double = js.native
  }
  
  /** Specifies the pixel format of pixel data. Each enumeration value defines a channel ordering, bit depth, and data type. */
  @JSGlobal("Windows.Graphics.Imaging.BitmapPixelFormat")
  @js.native
  object BitmapPixelFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat & Double] = js.native
    
    /* 5 */ val bgra8: typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat.bgra8 & Double = js.native
    
    /* 3 */ val gray16: typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat.gray16 & Double = js.native
    
    /* 4 */ val gray8: typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat.gray8 & Double = js.native
    
    /* 6 */ val nv12: typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat.nv12 & Double = js.native
    
    /* 1 */ val rgba16: typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat.rgba16 & Double = js.native
    
    /* 2 */ val rgba8: typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat.rgba8 & Double = js.native
    
    /* 0 */ val unknown: typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat.unknown & Double = js.native
    
    /* 7 */ val yuy2: typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat.yuy2 & Double = js.native
  }
  
  /** Provides read and write access to image properties and metadata. */
  /* note: abstract class */ @JSGlobal("Windows.Graphics.Imaging.BitmapProperties")
  @js.native
  open class BitmapProperties ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Imaging.BitmapProperties {
    
    /**
      * Asynchronously retrieves one or more bitmap properties.
      * @param propertiesToRetrieve A collection of strings containing the specified property keys.
      * @return Object that manages the asynchronous retrieval of the bitmap properties.
      */
    /* CompleteClass */
    override def getPropertiesAsync(propertiesToRetrieve: IIterable[String]): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Graphics.Imaging.BitmapPropertySet] = js.native
    
    /**
      * Asynchronously sets one or more bitmap properties.
      * @param propertiesToSet A collection of key-value pairs representing the bitmap properties to be set. Each key is a string containing the Windows property or metadata query, and the corresponding value is a BitmapTypedValue with the data and the correct PropertyType .
      * @return Object that manages the setting of the bitmap properties asynchronously.
      */
    /* CompleteClass */
    override def setPropertiesAsync(propertiesToSet: IIterable[IKeyValuePair[Any, Any]]): IPromiseWithIAsyncAction = js.native
  }
  
  /** Provides read access to image properties and metadata. A particular instance of BitmapPropertiesView may represent the entire contents of the frame metadata, or any nested metadata block within the frame. */
  /* note: abstract class */ @JSGlobal("Windows.Graphics.Imaging.BitmapPropertiesView")
  @js.native
  open class BitmapPropertiesView ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Imaging.BitmapPropertiesView {
    
    /**
      * Asynchronously retrieves one or more bitmap properties.
      * @param propertiesToRetrieve A collection of strings representing the property keys or queries that are being requested. Valid strings include Windows properties and Windows Imaging Component metadata queries.
      * @return Object that manages the asynchronous retrieval of the bitmap properties.
      */
    /* CompleteClass */
    override def getPropertiesAsync(propertiesToRetrieve: IIterable[String]): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Graphics.Imaging.BitmapPropertySet] = js.native
  }
  
  /** Represents a property set of BitmapTypedValue objects. */
  @JSGlobal("Windows.Graphics.Imaging.BitmapPropertySet")
  @js.native
  /** Creates and initializes a new instance of the bitmap property set. */
  open class BitmapPropertySet ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Imaging.BitmapPropertySet
  
  /** Specifies the rotation operation to be performed on pixel data. */
  @JSGlobal("Windows.Graphics.Imaging.BitmapRotation")
  @js.native
  object BitmapRotation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Graphics.Imaging.BitmapRotation & Double] = js.native
    
    /* 2 */ val clockwise180Degrees: typings.winrtUwp.Windows.Graphics.Imaging.BitmapRotation.clockwise180Degrees & Double = js.native
    
    /* 3 */ val clockwise270Degrees: typings.winrtUwp.Windows.Graphics.Imaging.BitmapRotation.clockwise270Degrees & Double = js.native
    
    /* 1 */ val clockwise90Degrees: typings.winrtUwp.Windows.Graphics.Imaging.BitmapRotation.clockwise90Degrees & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Graphics.Imaging.BitmapRotation.none & Double = js.native
  }
  
  /** Contains transformations that can be applied to pixel data. */
  @JSGlobal("Windows.Graphics.Imaging.BitmapTransform")
  @js.native
  /** Creates a new BitmapTransform object. */
  open class BitmapTransform ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Imaging.BitmapTransform {
    
    /** Specifies the bounding rectangle that is used to crop the bitmap. This rectangle is defined in the coordinate space after scale, rotation, and flip are applied. */
    /* CompleteClass */
    var bounds: BitmapBounds = js.native
    
    /** Specifies the flip operation that is used to transform the bitmap. */
    /* CompleteClass */
    var flip: BitmapFlip = js.native
    
    /** Specifies the interpolation mode that is used to scale the bitmap. */
    /* CompleteClass */
    var interpolationMode: BitmapInterpolationMode = js.native
    
    /** Specifies the rotation operation that is used to transform the bitmap. */
    /* CompleteClass */
    var rotation: BitmapRotation = js.native
    
    /** Specifies the height, in pixels, of the bitmap after it is scaled. This is defined in the coordinate space of the source image, before rotation and flip are applied. */
    /* CompleteClass */
    var scaledHeight: Double = js.native
    
    /** Specifies the width, in pixels, of the bitmap after it is scaled. This is defined in the coordinate space of the source image, before rotation and flip are applied. */
    /* CompleteClass */
    var scaledWidth: Double = js.native
  }
  
  /** A value along with an enumeration specifying its data type. */
  @JSGlobal("Windows.Graphics.Imaging.BitmapTypedValue")
  @js.native
  open class BitmapTypedValue protected ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Imaging.BitmapTypedValue {
    /**
      * Creates a new BitmapTypedValue object.
      * @param value The value to store.
      * @param type The type of the value parameter.
      */
    def this(value: Any, `type`: PropertyType) = this()
    
    /** Gets the PropertyType of the stored value. */
    /* CompleteClass */
    var `type`: PropertyType = js.native
    
    /** Gets the stored value. */
    /* CompleteClass */
    var value: Any = js.native
  }
  
  /** Specifies the color management behavior when obtaining pixel data. */
  @JSGlobal("Windows.Graphics.Imaging.ColorManagementMode")
  @js.native
  object ColorManagementMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Graphics.Imaging.ColorManagementMode & Double] = js.native
    
    /* 1 */ val colorManageToSRgb: typings.winrtUwp.Windows.Graphics.Imaging.ColorManagementMode.colorManageToSRgb & Double = js.native
    
    /* 0 */ val doNotColorManage: typings.winrtUwp.Windows.Graphics.Imaging.ColorManagementMode.doNotColorManage & Double = js.native
  }
  
  /** Specifies the EXIF orientation flag behavior when obtaining pixel data. */
  @JSGlobal("Windows.Graphics.Imaging.ExifOrientationMode")
  @js.native
  object ExifOrientationMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Graphics.Imaging.ExifOrientationMode & Double] = js.native
    
    /* 0 */ val ignoreExifOrientation: typings.winrtUwp.Windows.Graphics.Imaging.ExifOrientationMode.ignoreExifOrientation & Double = js.native
    
    /* 1 */ val respectExifOrientation: typings.winrtUwp.Windows.Graphics.Imaging.ExifOrientationMode.respectExifOrientation & Double = js.native
  }
  
  /** An implementation of IRandomAccessStreamWithContent type used in the Imaging namespace. */
  /* note: abstract class */ @JSGlobal("Windows.Graphics.Imaging.ImageStream")
  @js.native
  open class ImageStream ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Imaging.ImageStream {
    
    /** Indicates if you can read the stream. */
    /* CompleteClass */
    var canRead: Boolean = js.native
    
    /** Indicates if you can write to the stream. */
    /* CompleteClass */
    var canWrite: Boolean = js.native
    
    /**
      * Returns the file stream for the ImageStream .
      * @return The file stream for the image.
      */
    /* CompleteClass */
    override def cloneStream(): IRandomAccessStream = js.native
    
    /** Closes the ImageStream . */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /** Returns the data format of the stream. */
    /* CompleteClass */
    var contentType: String = js.native
    
    /**
      * Asynchronously commits the current frame data and flushes all of the data on the image stream.
      * @return An object that manages the asynchronous flush operation.
      */
    /* CompleteClass */
    override def flushAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
    
    /**
      * Returns an input stream at a specified location in a stream.
      * @param position The location in the stream at which to begin.
      * @return The input stream.
      */
    /* CompleteClass */
    override def getInputStreamAt(position: Double): IInputStream = js.native
    
    /**
      * Returns an output stream at a specified location in a stream.
      * @param position The location in the output stream at which to begin.
      * @return The output stream.
      */
    /* CompleteClass */
    override def getOutputStreamAt(position: Double): IOutputStream = js.native
    
    /** Gets the byte offset of the stream. */
    /* CompleteClass */
    var position: Double = js.native
    
    /**
      * Reads data asynchronously from a sequential stream.
      * @param buffer The buffer into which the asynchronous read operation stores the data.
      * @param count The size of the buffer.
      * @param options The options for the stream to be read.
      * @return The byte reader operation.
      */
    /* CompleteClass */
    override def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
    
    /**
      * Sets the position of the stream to the specified value.
      * @param position The new position of the stream.
      */
    /* CompleteClass */
    override def seek(position: Double): Unit = js.native
    
    /** Gets or sets the size of the random access stream. */
    /* CompleteClass */
    var size: Double = js.native
    
    /**
      * Writes data asynchronously in a sequential stream.
      * @param buffer The buffer into which the asynchronous writer operation writes.
      * @return The byte writer operation.
      */
    /* CompleteClass */
    override def writeAsync(buffer: IBuffer): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
  }
  
  /** Specifies which chroma subsampling mode will be used for image compression in JPEG images. */
  @JSGlobal("Windows.Graphics.Imaging.JpegSubsamplingMode")
  @js.native
  object JpegSubsamplingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Graphics.Imaging.JpegSubsamplingMode & Double] = js.native
    
    /* 0 */ val default: typings.winrtUwp.Windows.Graphics.Imaging.JpegSubsamplingMode.default & Double = js.native
    
    /* 1 */ val y4Cb2Cr0: typings.winrtUwp.Windows.Graphics.Imaging.JpegSubsamplingMode.y4Cb2Cr0 & Double = js.native
    
    /* 2 */ val y4Cb2Cr2: typings.winrtUwp.Windows.Graphics.Imaging.JpegSubsamplingMode.y4Cb2Cr2 & Double = js.native
    
    /* 3 */ val y4Cb4Cr4: typings.winrtUwp.Windows.Graphics.Imaging.JpegSubsamplingMode.y4Cb4Cr4 & Double = js.native
  }
  
  /** Provides access to the pixel data from a bitmap frame. */
  /* note: abstract class */ @JSGlobal("Windows.Graphics.Imaging.PixelDataProvider")
  @js.native
  open class PixelDataProvider ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Imaging.PixelDataProvider {
    
    /**
      * Returns the internally-stored pixel data.
      * @return The pixel data.
      */
    /* CompleteClass */
    override def detachPixelData(): js.Array[Double] = js.native
  }
  
  /** Specifies the filter used to optimize the image prior to image compression in PNG images. */
  @JSGlobal("Windows.Graphics.Imaging.PngFilterMode")
  @js.native
  object PngFilterMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Graphics.Imaging.PngFilterMode & Double] = js.native
    
    /* 6 */ val adaptive: typings.winrtUwp.Windows.Graphics.Imaging.PngFilterMode.adaptive & Double = js.native
    
    /* 0 */ val automatic: typings.winrtUwp.Windows.Graphics.Imaging.PngFilterMode.automatic & Double = js.native
    
    /* 4 */ val average: typings.winrtUwp.Windows.Graphics.Imaging.PngFilterMode.average & Double = js.native
    
    /* 1 */ val none: typings.winrtUwp.Windows.Graphics.Imaging.PngFilterMode.none & Double = js.native
    
    /* 5 */ val paeth: typings.winrtUwp.Windows.Graphics.Imaging.PngFilterMode.paeth & Double = js.native
    
    /* 2 */ val sub: typings.winrtUwp.Windows.Graphics.Imaging.PngFilterMode.sub & Double = js.native
    
    /* 3 */ val up: typings.winrtUwp.Windows.Graphics.Imaging.PngFilterMode.up & Double = js.native
  }
  
  /** Represents an uncompressed bitmap. */
  @JSGlobal("Windows.Graphics.Imaging.SoftwareBitmap")
  @js.native
  open class SoftwareBitmap protected ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap {
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
    
    /** Gets the alpha mode of the software bitmap. */
    /* CompleteClass */
    var bitmapAlphaMode: BitmapAlphaMode = js.native
    
    /** Gets the pixel format of the software bitmap. */
    /* CompleteClass */
    var bitmapPixelFormat: BitmapPixelFormat = js.native
    
    /** Disposes of the object and associated resources. */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /**
      * Copies the pixel data from an IBuffer into the SoftwareBitmap .
      * @param buffer The buffer containing the pixel data to be copied.
      */
    /* CompleteClass */
    override def copyFromBuffer(buffer: IBuffer): Unit = js.native
    
    /**
      * Copies the current SoftwareBitmap into the provided SoftwareBitmap object.
      * @param bitmap The target software bitmap into which the data will be copied.
      */
    /* CompleteClass */
    override def copyTo(bitmap: typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap): Unit = js.native
    
    /**
      * Copies the software bitmap pixel data into the specified IBuffer .
      * @param buffer The target buffer to which the pixel data will be copied.
      */
    /* CompleteClass */
    override def copyToBuffer(buffer: IBuffer): Unit = js.native
    
    /** Gets or sets the dots per inch of the software bitmap in the X direction. */
    /* CompleteClass */
    var dpiX: Double = js.native
    
    /** Gets or sets the dots per inch of the software bitmap in the Y direction. */
    /* CompleteClass */
    var dpiY: Double = js.native
    
    /**
      * Gets a read-only representation of the SoftwareBitmap object.
      * @return A read-only representation of the SoftwareBitmap object.
      */
    /* CompleteClass */
    override def getReadOnlyView(): typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap = js.native
    
    /** Gets a value indicating whether the software bitmap can be modified. */
    /* CompleteClass */
    var isReadOnly: Boolean = js.native
    
    /**
      * Gets a BitmapBuffer object that allows you to operate directly on the software bitmap's pixel data.
      * @param mode A value indicating the access mode of the returned buffer.
      * @return The buffer containing pixel data.
      */
    /* CompleteClass */
    override def lockBuffer(mode: BitmapBufferAccessMode): typings.winrtUwp.Windows.Graphics.Imaging.BitmapBuffer = js.native
    
    /** Gets the height of the software bitmap, in pixels. */
    /* CompleteClass */
    var pixelHeight: Double = js.native
    
    /** Gets the width of the software bitmap, in pixels. */
    /* CompleteClass */
    var pixelWidth: Double = js.native
  }
  object SoftwareBitmap {
    
    @JSGlobal("Windows.Graphics.Imaging.SoftwareBitmap")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Converts an existing SoftwareBitmap to a SoftwareBitmap with a different pixel format.
      * @param source The software bitmap to convert.
      * @param format The pixel format of the new software bitmap.
      * @return The converted software bitmap.
      */
    /* static member */
    inline def convert(source: typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap, format: BitmapPixelFormat): typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(source.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap]
    /**
      * Converts an existing SoftwareBitmap to a SoftwareBitmap with a different pixel format or alpha mode.
      * @param source The software bitmap to convert.
      * @param format The pixel format of the new software bitmap.
      * @param alpha The alpha mode of the new software bitmap.
      * @return The converted software bitmap.
      */
    /* static member */
    inline def convert(
      source: typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap,
      format: BitmapPixelFormat,
      alpha: BitmapAlphaMode
    ): typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(source.asInstanceOf[js.Any], format.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap]
    
    /**
      * Creates a copy of the provided SoftwareBitmap object.
      * @param source The software bitmap to copy.
      * @return The newly created copy of the software bitmap.
      */
    /* static member */
    inline def copy(source: typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap): typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(source.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap]
    
    /**
      * Creates a new SoftwareBitmap by performing a deep copy of the provided buffer. Modifications to the data in the new SoftwareBitmap will not effect the buffer from which it was created.
      * @param source The source buffer from which the copy will be created.
      * @param format The pixel format of the software bitmap.
      * @param width The width of the software bitmap, in pixels.
      * @param height The height of the software bitmap, in pixels.
      * @return The new software bitmap.
      */
    /* static member */
    inline def createCopyFromBuffer(source: IBuffer, format: BitmapPixelFormat, width: Double, height: Double): typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap = (^.asInstanceOf[js.Dynamic].applyDynamic("createCopyFromBuffer")(source.asInstanceOf[js.Any], format.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap]
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
    inline def createCopyFromBuffer(source: IBuffer, format: BitmapPixelFormat, width: Double, height: Double, alpha: BitmapAlphaMode): typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap = (^.asInstanceOf[js.Dynamic].applyDynamic("createCopyFromBuffer")(source.asInstanceOf[js.Any], format.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap]
    
    /**
      * Asynchronously creates a new SoftwareBitmap by performing a deep copy of the provided IDirect3DSurface . Modifications to the data in the new SoftwareBitmap will not effect the surface from which it was created.
      * @param surface The source surface from which the copy will be created.
      * @return An asynchronous operation that returns a SoftwareBitmap on successful completion.
      */
    /* static member */
    inline def createCopyFromSurfaceAsync(surface: IDirect3DSurface): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCopyFromSurfaceAsync")(surface.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap]]
    /**
      * Asynchronously creates a new SoftwareBitmap by performing a deep copy of the provided IDirect3DSurface . Modifications to the data in the new SoftwareBitmap will not effect the surface from which it was created.
      * @param surface The source surface from which the copy will be created.
      * @param alpha The alpha mode of the software bitmap.
      * @return An asynchronous operation that returns a SoftwareBitmap on successful completion.
      */
    /* static member */
    inline def createCopyFromSurfaceAsync(surface: IDirect3DSurface, alpha: BitmapAlphaMode): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCopyFromSurfaceAsync")(surface.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap]]
  }
  
  /** Specifies the compression mode used for TIFF images. */
  @JSGlobal("Windows.Graphics.Imaging.TiffCompressionMode")
  @js.native
  object TiffCompressionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Graphics.Imaging.TiffCompressionMode & Double] = js.native
    
    /* 0 */ val automatic: typings.winrtUwp.Windows.Graphics.Imaging.TiffCompressionMode.automatic & Double = js.native
    
    /* 2 */ val ccitt3: typings.winrtUwp.Windows.Graphics.Imaging.TiffCompressionMode.ccitt3 & Double = js.native
    
    /* 3 */ val ccitt4: typings.winrtUwp.Windows.Graphics.Imaging.TiffCompressionMode.ccitt4 & Double = js.native
    
    /* 4 */ val lzw: typings.winrtUwp.Windows.Graphics.Imaging.TiffCompressionMode.lzw & Double = js.native
    
    /* 7 */ val lzwhDifferencing: typings.winrtUwp.Windows.Graphics.Imaging.TiffCompressionMode.lzwhDifferencing & Double = js.native
    
    /* 1 */ val none: typings.winrtUwp.Windows.Graphics.Imaging.TiffCompressionMode.none & Double = js.native
    
    /* 5 */ val rle: typings.winrtUwp.Windows.Graphics.Imaging.TiffCompressionMode.rle & Double = js.native
    
    /* 6 */ val zip: typings.winrtUwp.Windows.Graphics.Imaging.TiffCompressionMode.zip & Double = js.native
  }
}
