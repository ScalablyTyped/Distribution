package typings.winrtUwp.global.Windows.Storage

import typings.winrtUwp.Windows.Devices.Geolocation.Geolocator
import typings.winrtUwp.Windows.Devices.Geolocation.Geopoint
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the properties of a file. */
@JSGlobal("Windows.Storage.FileProperties")
@js.native
object FileProperties extends js.Object {
  /** Provides access to the basic properties, like the size of the item or the date the item was last modified, of the item (like a file or folder). */
  @js.native
  abstract class BasicProperties ()
    extends typings.winrtUwp.Windows.Storage.FileProperties.BasicProperties
  
  /** Provides access to the document-related properties of an item (like a file or folder). */
  @js.native
  abstract class DocumentProperties ()
    extends typings.winrtUwp.Windows.Storage.FileProperties.DocumentProperties
  
  /** Provides methods for setting and retrieving geographic metadata for a file. */
  @js.native
  abstract class GeotagHelper ()
    extends typings.winrtUwp.Windows.Storage.FileProperties.GeotagHelper
  
  /** Provides access to the image-related properties of an item (like a file or folder). */
  @js.native
  abstract class ImageProperties ()
    extends typings.winrtUwp.Windows.Storage.FileProperties.ImageProperties
  
  /** Provides access to the music-related properties of an item (like a file or folder). */
  @js.native
  abstract class MusicProperties ()
    extends typings.winrtUwp.Windows.Storage.FileProperties.MusicProperties
  
  /** Provides access to the content-related properties of an item (like a file or folder). */
  @js.native
  abstract class StorageItemContentProperties ()
    extends typings.winrtUwp.Windows.Storage.FileProperties.StorageItemContentProperties
  
  /** Represents the thumbnail image associated with a system resource (like a file or folder). */
  @js.native
  abstract class StorageItemThumbnail ()
    extends typings.winrtUwp.Windows.Storage.FileProperties.StorageItemThumbnail
  
  /** Provides access to the video-related properties of an item (like a file or folder). */
  @js.native
  abstract class VideoProperties ()
    extends typings.winrtUwp.Windows.Storage.FileProperties.VideoProperties
  
  /* static members */
  @js.native
  object GeotagHelper extends js.Object {
    /**
      * Asynchronously retrieves a Geopoint representing the geographic metadata of a file, if present.
      * @param file The file from which the geographic metadata is retrieved.
      * @return An asynchronous operation that returns a Geopoint on successful completion.
      */
    def getGeotagAsync(file: IStorageFile): IPromiseWithIAsyncOperation[Geopoint] = js.native
    /**
      * Asynchronously sets the geographic metadata of a file from the provided Geopoint .
      * @param file The file into which the geographic metadata is set.
      * @param geopoint The Geopoint representing the geographic metadata to be set.
      * @return An asynchronous action.
      */
    def setGeotagAsync(file: IStorageFile, geopoint: Geopoint): IPromiseWithIAsyncAction = js.native
    /**
      * Asynchronously sets the geographic metadata of a file to the device's current location using the provided Geolocator object.
      * @param file The file into which the geographic metadata is set.
      * @param geolocator The Geolocator object that will be used to determine the device's current location.
      * @return An asychronous action.
      */
    def setGeotagFromGeolocatorAsync(file: IStorageFile, geolocator: Geolocator): IPromiseWithIAsyncAction = js.native
  }
  
  /** Indicates the Exchangeable Image File (EXIF) orientation flag of the photo. This flag describes how to rotate the photo to display it correctly. */
  @js.native
  object PhotoOrientation extends js.Object {
    /* 2 */ val flipHorizontal: typings.winrtUwp.Windows.Storage.FileProperties.PhotoOrientation.flipHorizontal with Double = js.native
    /* 4 */ val flipVertical: typings.winrtUwp.Windows.Storage.FileProperties.PhotoOrientation.flipVertical with Double = js.native
    /* 1 */ val normal: typings.winrtUwp.Windows.Storage.FileProperties.PhotoOrientation.normal with Double = js.native
    /* 3 */ val rotate180: typings.winrtUwp.Windows.Storage.FileProperties.PhotoOrientation.rotate180 with Double = js.native
    /* 6 */ val rotate270: typings.winrtUwp.Windows.Storage.FileProperties.PhotoOrientation.rotate270 with Double = js.native
    /* 8 */ val rotate90: typings.winrtUwp.Windows.Storage.FileProperties.PhotoOrientation.rotate90 with Double = js.native
    /* 5 */ val transpose: typings.winrtUwp.Windows.Storage.FileProperties.PhotoOrientation.transpose with Double = js.native
    /* 7 */ val transverse: typings.winrtUwp.Windows.Storage.FileProperties.PhotoOrientation.transverse with Double = js.native
    /* 0 */ val unspecified: typings.winrtUwp.Windows.Storage.FileProperties.PhotoOrientation.unspecified with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.FileProperties.PhotoOrientation with Double] = js.native
  }
  
  /** Indicates a system-defined group of file properties. */
  @js.native
  object PropertyPrefetchOptions extends js.Object {
    /* 5 */ val basicProperties: typings.winrtUwp.Windows.Storage.FileProperties.PropertyPrefetchOptions.basicProperties with Double = js.native
    /* 4 */ val documentProperties: typings.winrtUwp.Windows.Storage.FileProperties.PropertyPrefetchOptions.documentProperties with Double = js.native
    /* 3 */ val imageProperties: typings.winrtUwp.Windows.Storage.FileProperties.PropertyPrefetchOptions.imageProperties with Double = js.native
    /* 1 */ val musicProperties: typings.winrtUwp.Windows.Storage.FileProperties.PropertyPrefetchOptions.musicProperties with Double = js.native
    /* 0 */ val none: typings.winrtUwp.Windows.Storage.FileProperties.PropertyPrefetchOptions.none with Double = js.native
    /* 2 */ val videoProperties: typings.winrtUwp.Windows.Storage.FileProperties.PropertyPrefetchOptions.videoProperties with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Storage.FileProperties.PropertyPrefetchOptions with Double
      ] = js.native
  }
  
  /** Describes the purpose of the thumbnail to determine how to adjust the thumbnail image to retrieve. */
  @js.native
  object ThumbnailMode extends js.Object {
    /* 3 */ val documentsView: typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailMode.documentsView with Double = js.native
    /* 4 */ val listView: typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailMode.listView with Double = js.native
    /* 2 */ val musicView: typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailMode.musicView with Double = js.native
    /* 0 */ val picturesView: typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailMode.picturesView with Double = js.native
    /* 5 */ val singleItem: typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailMode.singleItem with Double = js.native
    /* 1 */ val videosView: typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailMode.videosView with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailMode with Double] = js.native
  }
  
  /** Describes the behavior used to retrieve and adjust thumbnails, including the size and quality of the image and how quickly the thumbnail image is retrieved. */
  @js.native
  object ThumbnailOptions extends js.Object {
    /* 0 */ val none: typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailOptions.none with Double = js.native
    /* 2 */ val resizeThumbnail: typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailOptions.resizeThumbnail with Double = js.native
    /* 1 */ val returnOnlyIfCached: typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailOptions.returnOnlyIfCached with Double = js.native
    /* 3 */ val useCurrentScale: typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailOptions.useCurrentScale with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailOptions with Double] = js.native
  }
  
  /** Indicates whether the thumbnail is an icon or an image. */
  @js.native
  object ThumbnailType extends js.Object {
    /* 1 */ val icon: typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailType.icon with Double = js.native
    /* 0 */ val image: typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailType.image with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailType with Double] = js.native
  }
  
  /** Indicates how to rotate the video to display it correctly. */
  @js.native
  object VideoOrientation extends js.Object {
    /* 0 */ val normal: typings.winrtUwp.Windows.Storage.FileProperties.VideoOrientation.normal with Double = js.native
    /* 2 */ val rotate180: typings.winrtUwp.Windows.Storage.FileProperties.VideoOrientation.rotate180 with Double = js.native
    /* 3 */ val rotate270: typings.winrtUwp.Windows.Storage.FileProperties.VideoOrientation.rotate270 with Double = js.native
    /* 1 */ val rotate90: typings.winrtUwp.Windows.Storage.FileProperties.VideoOrientation.rotate90 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.FileProperties.VideoOrientation with Double] = js.native
  }
  
}

