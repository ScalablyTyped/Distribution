package typings.winrtUwp.global.Windows.Storage

import typings.winrtUwp.Windows.Devices.Geolocation.Geolocator
import typings.winrtUwp.Windows.Devices.Geolocation.Geopoint
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailType
import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Storage.Streams.IOutputStream
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typings.winrtUwp.Windows.Storage.Streams.InputStreamOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to the properties of a file. */
object FileProperties {
  
  /** Provides access to the basic properties, like the size of the item or the date the item was last modified, of the item (like a file or folder). */
  /* note: abstract class */ @JSGlobal("Windows.Storage.FileProperties.BasicProperties")
  @js.native
  open class BasicProperties ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.FileProperties.BasicProperties
  
  /** Provides access to the document-related properties of an item (like a file or folder). */
  /* note: abstract class */ @JSGlobal("Windows.Storage.FileProperties.DocumentProperties")
  @js.native
  open class DocumentProperties ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.FileProperties.DocumentProperties
  
  /** Provides methods for setting and retrieving geographic metadata for a file. */
  /* note: abstract class */ @JSGlobal("Windows.Storage.FileProperties.GeotagHelper")
  @js.native
  open class GeotagHelper ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.FileProperties.GeotagHelper
  object GeotagHelper {
    
    @JSGlobal("Windows.Storage.FileProperties.GeotagHelper")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Asynchronously retrieves a Geopoint representing the geographic metadata of a file, if present.
      * @param file The file from which the geographic metadata is retrieved.
      * @return An asynchronous operation that returns a Geopoint on successful completion.
      */
    /* static member */
    inline def getGeotagAsync(file: IStorageFile): IPromiseWithIAsyncOperation[Geopoint] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGeotagAsync")(file.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[Geopoint]]
    
    /**
      * Asynchronously sets the geographic metadata of a file from the provided Geopoint .
      * @param file The file into which the geographic metadata is set.
      * @param geopoint The Geopoint representing the geographic metadata to be set.
      * @return An asynchronous action.
      */
    /* static member */
    inline def setGeotagAsync(file: IStorageFile, geopoint: Geopoint): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("setGeotagAsync")(file.asInstanceOf[js.Any], geopoint.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
    
    /**
      * Asynchronously sets the geographic metadata of a file to the device's current location using the provided Geolocator object.
      * @param file The file into which the geographic metadata is set.
      * @param geolocator The Geolocator object that will be used to determine the device's current location.
      * @return An asychronous action.
      */
    /* static member */
    inline def setGeotagFromGeolocatorAsync(file: IStorageFile, geolocator: Geolocator): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("setGeotagFromGeolocatorAsync")(file.asInstanceOf[js.Any], geolocator.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
  }
  
  /** Provides access to the image-related properties of an item (like a file or folder). */
  /* note: abstract class */ @JSGlobal("Windows.Storage.FileProperties.ImageProperties")
  @js.native
  open class ImageProperties ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.FileProperties.ImageProperties
  
  /** Provides access to the music-related properties of an item (like a file or folder). */
  /* note: abstract class */ @JSGlobal("Windows.Storage.FileProperties.MusicProperties")
  @js.native
  open class MusicProperties ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.FileProperties.MusicProperties
  
  /** Indicates the Exchangeable Image File (EXIF) orientation flag of the photo. This flag describes how to rotate the photo to display it correctly. */
  @JSGlobal("Windows.Storage.FileProperties.PhotoOrientation")
  @js.native
  object PhotoOrientation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.FileProperties.PhotoOrientation & Double] = js.native
    
    /* 2 */ val flipHorizontal: typings.winrtUwp.Windows.Storage.FileProperties.PhotoOrientation.flipHorizontal & Double = js.native
    
    /* 4 */ val flipVertical: typings.winrtUwp.Windows.Storage.FileProperties.PhotoOrientation.flipVertical & Double = js.native
    
    /* 1 */ val normal: typings.winrtUwp.Windows.Storage.FileProperties.PhotoOrientation.normal & Double = js.native
    
    /* 3 */ val rotate180: typings.winrtUwp.Windows.Storage.FileProperties.PhotoOrientation.rotate180 & Double = js.native
    
    /* 6 */ val rotate270: typings.winrtUwp.Windows.Storage.FileProperties.PhotoOrientation.rotate270 & Double = js.native
    
    /* 8 */ val rotate90: typings.winrtUwp.Windows.Storage.FileProperties.PhotoOrientation.rotate90 & Double = js.native
    
    /* 5 */ val transpose: typings.winrtUwp.Windows.Storage.FileProperties.PhotoOrientation.transpose & Double = js.native
    
    /* 7 */ val transverse: typings.winrtUwp.Windows.Storage.FileProperties.PhotoOrientation.transverse & Double = js.native
    
    /* 0 */ val unspecified: typings.winrtUwp.Windows.Storage.FileProperties.PhotoOrientation.unspecified & Double = js.native
  }
  
  /** Indicates a system-defined group of file properties. */
  @JSGlobal("Windows.Storage.FileProperties.PropertyPrefetchOptions")
  @js.native
  object PropertyPrefetchOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.FileProperties.PropertyPrefetchOptions & Double] = js.native
    
    /* 5 */ val basicProperties: typings.winrtUwp.Windows.Storage.FileProperties.PropertyPrefetchOptions.basicProperties & Double = js.native
    
    /* 4 */ val documentProperties: typings.winrtUwp.Windows.Storage.FileProperties.PropertyPrefetchOptions.documentProperties & Double = js.native
    
    /* 3 */ val imageProperties: typings.winrtUwp.Windows.Storage.FileProperties.PropertyPrefetchOptions.imageProperties & Double = js.native
    
    /* 1 */ val musicProperties: typings.winrtUwp.Windows.Storage.FileProperties.PropertyPrefetchOptions.musicProperties & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Storage.FileProperties.PropertyPrefetchOptions.none & Double = js.native
    
    /* 2 */ val videoProperties: typings.winrtUwp.Windows.Storage.FileProperties.PropertyPrefetchOptions.videoProperties & Double = js.native
  }
  
  /** Provides access to the content-related properties of an item (like a file or folder). */
  /* note: abstract class */ @JSGlobal("Windows.Storage.FileProperties.StorageItemContentProperties")
  @js.native
  open class StorageItemContentProperties ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.FileProperties.StorageItemContentProperties
  
  /** Represents the thumbnail image associated with a system resource (like a file or folder). */
  /* note: abstract class */ @JSGlobal("Windows.Storage.FileProperties.StorageItemThumbnail")
  @js.native
  open class StorageItemThumbnail ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.FileProperties.StorageItemThumbnail {
    
    /** Gets a value that indicates whether the thumbnail stream can be read from. */
    /* CompleteClass */
    var canRead: Boolean = js.native
    
    /** Gets a value that indicates whether the thumbnail stream can be written to. */
    /* CompleteClass */
    var canWrite: Boolean = js.native
    
    /**
      * Creates a new stream over the thumbnail that is represented by the current storageItemThumbnail object.
      * @return The new thumbnail stream. The initial, internal position of the stream is 0.
      */
    /* CompleteClass */
    override def cloneStream(): IRandomAccessStream = js.native
    
    /** Releases system resources that are exposed by a Windows Runtime object. */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /** Gets the MIME content type of the thumbnail image. */
    /* CompleteClass */
    var contentType: String = js.native
    
    /**
      * Flushes data asynchronously in a sequential stream.
      * @return The stream flush operation.
      */
    /* CompleteClass */
    override def flushAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
    
    /**
      * Retrieves the thumbnail image data as an undecoded stream.
      * @param position The position in the storage item to start reading thumbnail image data.
      * @return An object for reading the thumbnail image data.
      */
    /* CompleteClass */
    override def getInputStreamAt(position: Double): IInputStream = js.native
    
    /**
      * Retrieves an output stream object for writing thumbnail image data to a storage item.
      * @param position The position in the storage item to start writing thumbnail image data.
      * @return The output stream.
      */
    /* CompleteClass */
    override def getOutputStreamAt(position: Double): IOutputStream = js.native
    
    /** Gets the original (not scaled) height of the thumbnail image. */
    /* CompleteClass */
    var originalHeight: Double = js.native
    
    /** Gets the original (not scaled) width of the thumbnail image. */
    /* CompleteClass */
    var originalWidth: Double = js.native
    
    /** Gets the byte offset of the thumbnail stream. */
    /* CompleteClass */
    var position: Double = js.native
    
    /**
      * Returns an asynchronous byte reader object.
      * @param buffer The buffer into which the asynchronous read operation places the bytes that are read.
      * @param count The number of bytes to read that is less than or equal to the Capacity value.
      * @param options Specifies the type of the asynchronous read operation.
      * @return The asynchronous operation.
      */
    /* CompleteClass */
    override def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
    
    /** Gets a value that indicates whether the thumbnail image returned was a cached version with a smaller size. */
    /* CompleteClass */
    var returnedSmallerCachedSize: Boolean = js.native
    
    /**
      * Sets the offset of the thumbnail stream to the specified value.
      * @param position The number of bytes from the start of the thumbnail stream where the position of the thumbnail stream is set.
      */
    /* CompleteClass */
    override def seek(position: Double): Unit = js.native
    
    /** Gets or sets the size of the thumbnail image. */
    /* CompleteClass */
    var size: Double = js.native
    
    /** Gets a value that indicates if the thumbnail is an icon or an image. */
    /* CompleteClass */
    var `type`: ThumbnailType = js.native
    
    /**
      * Writes data asynchronously in a sequential stream.
      * @param buffer The buffer into which the asynchronous writer operation writes.
      * @return The byte writer operation.
      */
    /* CompleteClass */
    override def writeAsync(buffer: IBuffer): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
  }
  
  /** Describes the purpose of the thumbnail to determine how to adjust the thumbnail image to retrieve. */
  @JSGlobal("Windows.Storage.FileProperties.ThumbnailMode")
  @js.native
  object ThumbnailMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailMode & Double] = js.native
    
    /* 3 */ val documentsView: typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailMode.documentsView & Double = js.native
    
    /* 4 */ val listView: typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailMode.listView & Double = js.native
    
    /* 2 */ val musicView: typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailMode.musicView & Double = js.native
    
    /* 0 */ val picturesView: typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailMode.picturesView & Double = js.native
    
    /* 5 */ val singleItem: typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailMode.singleItem & Double = js.native
    
    /* 1 */ val videosView: typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailMode.videosView & Double = js.native
  }
  
  /** Describes the behavior used to retrieve and adjust thumbnails, including the size and quality of the image and how quickly the thumbnail image is retrieved. */
  @JSGlobal("Windows.Storage.FileProperties.ThumbnailOptions")
  @js.native
  object ThumbnailOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailOptions & Double] = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailOptions.none & Double = js.native
    
    /* 2 */ val resizeThumbnail: typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailOptions.resizeThumbnail & Double = js.native
    
    /* 1 */ val returnOnlyIfCached: typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailOptions.returnOnlyIfCached & Double = js.native
    
    /* 3 */ val useCurrentScale: typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailOptions.useCurrentScale & Double = js.native
  }
  
  /** Indicates whether the thumbnail is an icon or an image. */
  @JSGlobal("Windows.Storage.FileProperties.ThumbnailType")
  @js.native
  object ThumbnailType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailType & Double] = js.native
    
    /* 1 */ val icon: typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailType.icon & Double = js.native
    
    /* 0 */ val image: typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailType.image & Double = js.native
  }
  
  /** Indicates how to rotate the video to display it correctly. */
  @JSGlobal("Windows.Storage.FileProperties.VideoOrientation")
  @js.native
  object VideoOrientation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.FileProperties.VideoOrientation & Double] = js.native
    
    /* 0 */ val normal: typings.winrtUwp.Windows.Storage.FileProperties.VideoOrientation.normal & Double = js.native
    
    /* 2 */ val rotate180: typings.winrtUwp.Windows.Storage.FileProperties.VideoOrientation.rotate180 & Double = js.native
    
    /* 3 */ val rotate270: typings.winrtUwp.Windows.Storage.FileProperties.VideoOrientation.rotate270 & Double = js.native
    
    /* 1 */ val rotate90: typings.winrtUwp.Windows.Storage.FileProperties.VideoOrientation.rotate90 & Double = js.native
  }
  
  /** Provides access to the video-related properties of an item (like a file or folder). */
  /* note: abstract class */ @JSGlobal("Windows.Storage.FileProperties.VideoProperties")
  @js.native
  open class VideoProperties ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.FileProperties.VideoProperties
}
