package typings.winrtUwp.global.Windows.Media

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Media.Import.PhotoImportAccessMode
import typings.winrtUwp.Windows.Media.Import.PhotoImportConnectionTransport
import typings.winrtUwp.Windows.Media.Import.PhotoImportContentType
import typings.winrtUwp.Windows.Media.Import.PhotoImportContentTypeFilter
import typings.winrtUwp.Windows.Media.Import.PhotoImportItemSelectionMode
import typings.winrtUwp.Windows.Media.Import.PhotoImportPowerSource
import typings.winrtUwp.Windows.Media.Import.PhotoImportProgress
import typings.winrtUwp.Windows.Media.Import.PhotoImportSourceType
import typings.winrtUwp.Windows.Media.Import.PhotoImportStage
import typings.winrtUwp.Windows.Media.Import.PhotoImportStorageMediumType
import typings.winrtUwp.Windows.Media.Import.PhotoImportSubfolderCreationMode
import typings.winrtUwp.Windows.Storage.IStorageFolder
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The Windows.Media.Import namespace provides APIs for discovering and importing photos and videos from devices including cameras, mass storage devices, phones, and other devices that support photo import. */
object Import {
  
  /** Specifies the access mode with which photos are imported. */
  @JSGlobal("Windows.Media.Import.PhotoImportAccessMode")
  @js.native
  object PhotoImportAccessMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Import.PhotoImportAccessMode & Double] = js.native
    
    /* 2 */ val readAndDelete: typings.winrtUwp.Windows.Media.Import.PhotoImportAccessMode.readAndDelete & Double = js.native
    
    /* 1 */ val readOnly: typings.winrtUwp.Windows.Media.Import.PhotoImportAccessMode.readOnly & Double = js.native
    
    /* 0 */ val readWrite: typings.winrtUwp.Windows.Media.Import.PhotoImportAccessMode.readWrite & Double = js.native
  }
  
  /** Specifies the connection transport used for photo import. */
  @JSGlobal("Windows.Media.Import.PhotoImportConnectionTransport")
  @js.native
  object PhotoImportConnectionTransport extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Import.PhotoImportConnectionTransport & Double] = js.native
    
    /* 3 */ val bluetooth: typings.winrtUwp.Windows.Media.Import.PhotoImportConnectionTransport.bluetooth & Double = js.native
    
    /* 2 */ val ip: typings.winrtUwp.Windows.Media.Import.PhotoImportConnectionTransport.ip & Double = js.native
    
    /* 0 */ val unknown: typings.winrtUwp.Windows.Media.Import.PhotoImportConnectionTransport.unknown & Double = js.native
    
    /* 1 */ val usb: typings.winrtUwp.Windows.Media.Import.PhotoImportConnectionTransport.usb & Double = js.native
  }
  
  /** Specifies the content type of an imported item. */
  @JSGlobal("Windows.Media.Import.PhotoImportContentType")
  @js.native
  object PhotoImportContentType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Import.PhotoImportContentType & Double] = js.native
    
    /* 1 */ val image: typings.winrtUwp.Windows.Media.Import.PhotoImportContentType.image & Double = js.native
    
    /* 0 */ val unknown: typings.winrtUwp.Windows.Media.Import.PhotoImportContentType.unknown & Double = js.native
    
    /* 2 */ val video: typings.winrtUwp.Windows.Media.Import.PhotoImportContentType.video & Double = js.native
  }
  
  /** Specifies the content types that are included in a photo import operation. */
  @JSGlobal("Windows.Media.Import.PhotoImportContentTypeFilter")
  @js.native
  object PhotoImportContentTypeFilter extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Import.PhotoImportContentTypeFilter & Double] = js.native
    
    /* 2 */ val imagesAndVideos: typings.winrtUwp.Windows.Media.Import.PhotoImportContentTypeFilter.imagesAndVideos & Double = js.native
    
    /* 0 */ val onlyImages: typings.winrtUwp.Windows.Media.Import.PhotoImportContentTypeFilter.onlyImages & Double = js.native
    
    /* 1 */ val onlyVideos: typings.winrtUwp.Windows.Media.Import.PhotoImportContentTypeFilter.onlyVideos & Double = js.native
  }
  
  /** Represents the result of a operation that deletes imported media items from the source. */
  @JSGlobal("Windows.Media.Import.PhotoImportDeleteImportedItemsFromSourceResult")
  @js.native
  abstract class PhotoImportDeleteImportedItemsFromSourceResult ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Import.PhotoImportDeleteImportedItemsFromSourceResult {
    
    /** Gets a list of items that were deleted from the source. */
    /* CompleteClass */
    var deletedItems: IVectorView[typings.winrtUwp.Windows.Media.Import.PhotoImportItem] = js.native
    
    /** Gets a value indicating whether the delete operation has succeeded. */
    /* CompleteClass */
    var hasSucceeded: Boolean = js.native
    
    /** Gets the number of photos deleted in the operation. */
    /* CompleteClass */
    var photosCount: Double = js.native
    
    /** Gets the size of the deleted photos, in bytes. */
    /* CompleteClass */
    var photosSizeInBytes: Double = js.native
    
    /** Gets the photo import session associated with the delete operation. */
    /* CompleteClass */
    var session: typings.winrtUwp.Windows.Media.Import.PhotoImportSession = js.native
    
    /** Gets the number of sibling files deleted in the operation. */
    /* CompleteClass */
    var siblingsCount: Double = js.native
    
    /** Gets the size of the deleted sibling files, in bytes. */
    /* CompleteClass */
    var siblingsSizeInBytes: Double = js.native
    
    /** Gets the number of sidecar files deleted in the operation. */
    /* CompleteClass */
    var sidecarsCount: Double = js.native
    
    /** Gets the size of the deleted sidecar files, in bytes. */
    /* CompleteClass */
    var sidecarsSizeInBytes: Double = js.native
    
    /** Gets the total number of items deleted in the operation. */
    /* CompleteClass */
    var totalCount: Double = js.native
    
    /** Gets the total size of the all deleted items, in bytes. */
    /* CompleteClass */
    var totalSizeInBytes: Double = js.native
    
    /** Gets the number of videos deleted in the operation. */
    /* CompleteClass */
    var videosCount: Double = js.native
    
    /** Gets the size of the deleted videos, in bytes. */
    /* CompleteClass */
    var videosSizeInBytes: Double = js.native
  }
  
  /** Represents the result of a operation that finds media items on a source. */
  @JSGlobal("Windows.Media.Import.PhotoImportFindItemsResult")
  @js.native
  abstract class PhotoImportFindItemsResult ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Import.PhotoImportFindItemsResult
  
  /** Represents the result of a operation that imports media items from the source. */
  @JSGlobal("Windows.Media.Import.PhotoImportImportItemsResult")
  @js.native
  abstract class PhotoImportImportItemsResult ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Import.PhotoImportImportItemsResult {
    
    /**
      * Asynchronously deletes the items that were imported from the source.
      * @return An asynchronous operation that returns a PhotoImportDeleteImportedItemsFromSourceResult on successful completion.
      */
    /* CompleteClass */
    override def deleteImportedItemsFromSourceAsync(): IPromiseWithIAsyncOperationWithProgress[
        typings.winrtUwp.Windows.Media.Import.PhotoImportDeleteImportedItemsFromSourceResult, 
        Double
      ] = js.native
    
    /** Gets a value indicating whether the import operation has succeeded. */
    /* CompleteClass */
    var hasSucceeded: Boolean = js.native
    
    /** Gets a list of items that were imported from the source. */
    /* CompleteClass */
    var importedItems: IVectorView[typings.winrtUwp.Windows.Media.Import.PhotoImportItem] = js.native
    
    /** Gets the number of photos imported in the operation. */
    /* CompleteClass */
    var photosCount: Double = js.native
    
    /** Gets the size of the imported photos, in bytes. */
    /* CompleteClass */
    var photosSizeInBytes: Double = js.native
    
    /** Gets the photo import session associated with the import operation. */
    /* CompleteClass */
    var session: typings.winrtUwp.Windows.Media.Import.PhotoImportSession = js.native
    
    /** Gets the number of sibling files imported in the operation. */
    /* CompleteClass */
    var siblingsCount: Double = js.native
    
    /** Gets the size of the imported sidecar files, in bytes. */
    /* CompleteClass */
    var siblingsSizeInBytes: Double = js.native
    
    /** Gets the number of sidecar files imported in the operation. */
    /* CompleteClass */
    var sidecarsCount: Double = js.native
    
    /** Gets the size of the imported sidecar files, in bytes. */
    /* CompleteClass */
    var sidecarsSizeInBytes: Double = js.native
    
    /** Gets the total number of items imported in the operation. */
    /* CompleteClass */
    var totalCount: Double = js.native
    
    /** Gets the total size of the all imported items, in bytes. */
    /* CompleteClass */
    var totalSizeInBytes: Double = js.native
    
    /** Gets the number of videos imported in the operation. */
    /* CompleteClass */
    var videosCount: Double = js.native
    
    /** Gets the size of the imported videos, in bytes. */
    /* CompleteClass */
    var videosSizeInBytes: Double = js.native
  }
  
  /** Specifies the types of files that are included in an import operation. */
  @JSGlobal("Windows.Media.Import.PhotoImportImportMode")
  @js.native
  object PhotoImportImportMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Import.PhotoImportImportMode & Double] = js.native
    
    /* 2 */ val ignoreSiblings: typings.winrtUwp.Windows.Media.Import.PhotoImportImportMode.ignoreSiblings & Double = js.native
    
    /* 1 */ val ignoreSidecars: typings.winrtUwp.Windows.Media.Import.PhotoImportImportMode.ignoreSidecars & Double = js.native
    
    /* 3 */ val ignoreSidecarsAndSiblings: typings.winrtUwp.Windows.Media.Import.PhotoImportImportMode.ignoreSidecarsAndSiblings & Double = js.native
    
    /* 0 */ val importEverything: typings.winrtUwp.Windows.Media.Import.PhotoImportImportMode.importEverything & Double = js.native
  }
  
  /** Represents an media item that has been imported from a source. */
  @JSGlobal("Windows.Media.Import.PhotoImportItem")
  @js.native
  abstract class PhotoImportItem ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Import.PhotoImportItem {
    
    /** Gets the content type of the imported item. */
    /* CompleteClass */
    var contentType: PhotoImportContentType = js.native
    
    /** Gets the creation date of the imported item. */
    /* CompleteClass */
    var date: Date = js.native
    
    /** Gets a list of the names of files associated with this item that were deleted. */
    /* CompleteClass */
    var deletedFileNames: IVectorView[String] = js.native
    
    /** Gets a list of the names of files associated with this item that were imported. */
    /* CompleteClass */
    var importedFileNames: IVectorView[String] = js.native
    
    /** Gets a value indicating whether the item is currently selected for import. */
    /* CompleteClass */
    var isSelected: Boolean = js.native
    
    /** Gets the key used to identify the item. */
    /* CompleteClass */
    var itemKey: Double = js.native
    
    /** Gets the name of the item. */
    /* CompleteClass */
    var name: String = js.native
    
    /** Gets the sibling file associated with the item, if one exists. */
    /* CompleteClass */
    var sibling: typings.winrtUwp.Windows.Media.Import.PhotoImportSidecar = js.native
    
    /** Gets the list of sidecar files associated with the item, if any exists. */
    /* CompleteClass */
    var sidecars: IVectorView[typings.winrtUwp.Windows.Media.Import.PhotoImportSidecar] = js.native
    
    /** Gets the size of the item, in bytes. */
    /* CompleteClass */
    var sizeInBytes: Double = js.native
    
    /** Gets a random access stream containing the thumbnail image associated with the item. */
    /* CompleteClass */
    var thumbnail: IRandomAccessStreamReference = js.native
    
    /** Gets the list of video segments associated with the item. */
    /* CompleteClass */
    var videoSegments: IVectorView[typings.winrtUwp.Windows.Media.Import.PhotoImportVideoSegment] = js.native
  }
  
  /** Provides data for the PhotoImportFindItemsResult::ItemImported event. */
  @JSGlobal("Windows.Media.Import.PhotoImportItemImportedEventArgs")
  @js.native
  abstract class PhotoImportItemImportedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Import.PhotoImportItemImportedEventArgs {
    
    /** Gets the imported item associated with the PhotoImportFindItemsResult::ItemImported event. */
    /* CompleteClass */
    var importedItem: typings.winrtUwp.Windows.Media.Import.PhotoImportItem = js.native
  }
  
  /** Specifies the initial selection state for items that are discovered using PhotoImportSession::FindItemsAsync . */
  @JSGlobal("Windows.Media.Import.PhotoImportItemSelectionMode")
  @js.native
  object PhotoImportItemSelectionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Import.PhotoImportItemSelectionMode & Double] = js.native
    
    /* 0 */ val selectAll: typings.winrtUwp.Windows.Media.Import.PhotoImportItemSelectionMode.selectAll & Double = js.native
    
    /* 2 */ val selectNew: typings.winrtUwp.Windows.Media.Import.PhotoImportItemSelectionMode.selectNew & Double = js.native
    
    /* 1 */ val selectNone: typings.winrtUwp.Windows.Media.Import.PhotoImportItemSelectionMode.selectNone & Double = js.native
  }
  
  /** Provides APIs for determining if photo import is supported on the current device, finding sources from which to import photos, and getting references to any pending photo import operations. */
  @JSGlobal("Windows.Media.Import.PhotoImportManager")
  @js.native
  abstract class PhotoImportManager ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Import.PhotoImportManager
  object PhotoImportManager {
    
    @JSGlobal("Windows.Media.Import.PhotoImportManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Finds all currently available sources from which photos can be imported.
      * @return An asynchronous operation that returns a list of available sources on successful completion.
      */
    /* static member */
    @scala.inline
    def findAllSourcesAsync(): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllSourcesAsync")().asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[js.Any]]]
    
    /**
      * Gets the list of all pending photo import operations.
      * @return The list of all pending photo operations.
      */
    /* static member */
    @scala.inline
    def getPendingOperations(): IVectorView[typings.winrtUwp.Windows.Media.Import.PhotoImportOperation] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPendingOperations")().asInstanceOf[IVectorView[typings.winrtUwp.Windows.Media.Import.PhotoImportOperation]]
    
    /**
      * Gets a value indicating if photo import is supported on the current device.
      * @return An asynchronous operation that returns true if photo import is supported. Otherwise, returns false.
      */
    /* static member */
    @scala.inline
    def isSupportedAsync(): IPromiseWithIAsyncOperation[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupportedAsync")().asInstanceOf[IPromiseWithIAsyncOperation[Boolean]]
  }
  
  /** Represents an in-progress photo import operation. */
  @JSGlobal("Windows.Media.Import.PhotoImportOperation")
  @js.native
  abstract class PhotoImportOperation ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Import.PhotoImportOperation {
    
    /** Causes in-progress delete from source operations to continue. */
    /* CompleteClass */
    var continueDeletingImportedItemsFromSourceAsync: IAsyncOperationWithProgress[
        typings.winrtUwp.Windows.Media.Import.PhotoImportDeleteImportedItemsFromSourceResult, 
        Double
      ] = js.native
    
    /** Causes in-progress find operations to continue. */
    /* CompleteClass */
    var continueFindingItemsAsync: IAsyncOperationWithProgress[typings.winrtUwp.Windows.Media.Import.PhotoImportFindItemsResult, Double] = js.native
    
    /** Causes in-progress import items operations to continue. */
    /* CompleteClass */
    var continueImportingItemsAsync: IAsyncOperationWithProgress[
        typings.winrtUwp.Windows.Media.Import.PhotoImportImportItemsResult, 
        PhotoImportProgress
      ] = js.native
    
    /** Gets the photo import session associated with the operation. */
    /* CompleteClass */
    var session: typings.winrtUwp.Windows.Media.Import.PhotoImportSession = js.native
    
    /** Gets the current stage of the in-progress operation. */
    /* CompleteClass */
    var stage: PhotoImportStage = js.native
  }
  
  /** Specifies the current power source of the source device containing items to be imported. */
  @JSGlobal("Windows.Media.Import.PhotoImportPowerSource")
  @js.native
  object PhotoImportPowerSource extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Import.PhotoImportPowerSource & Double] = js.native
    
    /* 1 */ val battery: typings.winrtUwp.Windows.Media.Import.PhotoImportPowerSource.battery & Double = js.native
    
    /* 2 */ val external: typings.winrtUwp.Windows.Media.Import.PhotoImportPowerSource.external & Double = js.native
    
    /* 0 */ val unknown: typings.winrtUwp.Windows.Media.Import.PhotoImportPowerSource.unknown & Double = js.native
  }
  
  /** Provides data for the PhotoImportFindItemsResult::SelectionChanged event. */
  @JSGlobal("Windows.Media.Import.PhotoImportSelectionChangedEventArgs")
  @js.native
  abstract class PhotoImportSelectionChangedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Import.PhotoImportSelectionChangedEventArgs {
    
    /** Gets a value indicating whether no items are selected after the selection has changed. */
    /* CompleteClass */
    var isSelectionEmpty: Boolean = js.native
  }
  
  /** Represents a photo import session with a photo import source. */
  @JSGlobal("Windows.Media.Import.PhotoImportSession")
  @js.native
  abstract class PhotoImportSession ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Import.PhotoImportSession {
    
    /** Gets or sets a value specifying whether the session date should be appended to the destination folder name. */
    /* CompleteClass */
    var appendSessionDateToDestinationFolder: Boolean = js.native
    
    /** Closes the photo import session and releases associated resources. */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /** Gets or sets the prefix for the destination file name. */
    /* CompleteClass */
    var destinationFileNamePrefix: String = js.native
    
    /** Gets or sets the destination folder for the photo import session. */
    /* CompleteClass */
    var destinationFolder: IStorageFolder = js.native
    
    /**
      * Asynchronously finds items on the source device that are available for import.
      * @param contentTypeFilter A value indicating whether the find operation includes images, videos, or both in the results.
      * @param itemSelectionMode A value indicating whether all items, no items, or only new items in the results are initially marked as selected.
      * @return An asynchronous operation that returns a PhotoImportFindItemsResult on successful completion.
      */
    /* CompleteClass */
    override def findItemsAsync(contentTypeFilter: PhotoImportContentTypeFilter, itemSelectionMode: PhotoImportItemSelectionMode): IPromiseWithIAsyncOperationWithProgress[typings.winrtUwp.Windows.Media.Import.PhotoImportFindItemsResult, Double] = js.native
    
    /** Gets a unique identifier for the import session. */
    /* CompleteClass */
    var sessionId: String = js.native
    
    /** Gets an object representing the source device associated with the photo import session. */
    /* CompleteClass */
    var source: typings.winrtUwp.Windows.Media.Import.PhotoImportSource = js.native
    
    /** Gets or sets a value indicating the method used for naming subfolders within the destination folder. */
    /* CompleteClass */
    var subfolderCreationMode: PhotoImportSubfolderCreationMode = js.native
  }
  
  /** Represents a sidecar file or a sibling file to a PhotoImportItem . */
  @JSGlobal("Windows.Media.Import.PhotoImportSidecar")
  @js.native
  abstract class PhotoImportSidecar ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Import.PhotoImportSidecar {
    
    /** Gets the date of the sidecar or sibling file. */
    /* CompleteClass */
    var date: Date = js.native
    
    /** Gets the name of the sidecar or sibling file. */
    /* CompleteClass */
    var name: String = js.native
    
    /** Gets the size of the sidecar or sibling file, in bytes. */
    /* CompleteClass */
    var sizeInBytes: Double = js.native
  }
  
  /** Represents the source device for a photo import session. */
  @JSGlobal("Windows.Media.Import.PhotoImportSource")
  @js.native
  abstract class PhotoImportSource ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Import.PhotoImportSource {
    
    /** The battery level of the source device. */
    /* CompleteClass */
    var batteryLevelPercent: Double = js.native
    
    /** Gets the connection protocol that is being used to communicate with the source device. */
    /* CompleteClass */
    var connectionProtocol: String = js.native
    
    /** Gets a value indicating the transport mechanism that is being used for importing items from the source device. */
    /* CompleteClass */
    var connectionTransport: PhotoImportConnectionTransport = js.native
    
    /**
      * Creates a new photo import session.
      * @return The new PhotoImportSession object.
      */
    /* CompleteClass */
    override def createImportSession(): typings.winrtUwp.Windows.Media.Import.PhotoImportSession = js.native
    
    /** Gets the current date and time on the device. */
    /* CompleteClass */
    var dateTime: Date = js.native
    
    /** Gets a human-readable description of the source device. */
    /* CompleteClass */
    var description: String = js.native
    
    /** Gets the human-readable display name for the source device. */
    /* CompleteClass */
    var displayName: String = js.native
    
    /** Gets a unique 16-byte identifier that is common across multiple transports supported by the device. */
    /* CompleteClass */
    var id: String = js.native
    
    /** Gets a value indicating if the source device is locked. */
    /* CompleteClass */
    var isLocked: Boolean = js.native
    
    /** Gets a value indicating if the source device is a mass storage device. */
    /* CompleteClass */
    var isMassStorage: Boolean = js.native
    
    /** Gets the source device's human-readable manufacturer name. */
    /* CompleteClass */
    var manufacturer: String = js.native
    
    /** Gets the device model name. */
    /* CompleteClass */
    var model: String = js.native
    
    /** Gets a value indicating the type of power source being used by the source device, if it is known. */
    /* CompleteClass */
    var powerSource: PhotoImportPowerSource = js.native
    
    /** Gets the serial number of the device. */
    /* CompleteClass */
    var serialNumber: String = js.native
    
    /** Gets a list of objects representing the different storage media exposed by the source device. */
    /* CompleteClass */
    var storageMedia: IVectorView[typings.winrtUwp.Windows.Media.Import.PhotoImportStorageMedium] = js.native
    
    /** Gets a reference to a stream containing the thumbnail image for the source device. */
    /* CompleteClass */
    var thumbnail: IRandomAccessStreamReference = js.native
    
    /** Gets a value indicating the type of the source device. */
    /* CompleteClass */
    var `type`: PhotoImportSourceType = js.native
  }
  object PhotoImportSource {
    
    @JSGlobal("Windows.Media.Import.PhotoImportSource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new instance of PhotoImportSource from the specified root folder.
      * @param sourceRootFolder The root folder from which the photo import source is created.
      * @return An asynchronous operation that returns a PhotoImportSource upon successful completion.
      */
    /* static member */
    @scala.inline
    def fromFolderAsync(sourceRootFolder: IStorageFolder): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.Import.PhotoImportSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFolderAsync")(sourceRootFolder.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.Import.PhotoImportSource]]
    
    /**
      * Creates a new instance of PhotoImportSource from the specified device ID.
      * @param sourceId The root folder from which the photo import source is created.
      * @return An asynchronous operation that returns a PhotoImportSource upon successful completion.
      */
    /* static member */
    @scala.inline
    def fromIdAsync(sourceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.Import.PhotoImportSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIdAsync")(sourceId.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.Import.PhotoImportSource]]
  }
  
  /** Specifies the type of device that is being used as a photo import source. */
  @JSGlobal("Windows.Media.Import.PhotoImportSourceType")
  @js.native
  object PhotoImportSourceType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Import.PhotoImportSourceType & Double] = js.native
    
    /* 6 */ val audioRecorder: typings.winrtUwp.Windows.Media.Import.PhotoImportSourceType.audioRecorder & Double = js.native
    
    /* 1 */ val camera: typings.winrtUwp.Windows.Media.Import.PhotoImportSourceType.camera & Double = js.native
    
    /* 0 */ val generic: typings.winrtUwp.Windows.Media.Import.PhotoImportSourceType.generic & Double = js.native
    
    /* 2 */ val mediaPlayer: typings.winrtUwp.Windows.Media.Import.PhotoImportSourceType.mediaPlayer & Double = js.native
    
    /* 5 */ val personalInfoManager: typings.winrtUwp.Windows.Media.Import.PhotoImportSourceType.personalInfoManager & Double = js.native
    
    /* 3 */ val phone: typings.winrtUwp.Windows.Media.Import.PhotoImportSourceType.phone & Double = js.native
    
    /* 4 */ val video: typings.winrtUwp.Windows.Media.Import.PhotoImportSourceType.video & Double = js.native
  }
  
  /** Specifies the stages of the photo import process. */
  @JSGlobal("Windows.Media.Import.PhotoImportStage")
  @js.native
  object PhotoImportStage extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Import.PhotoImportStage & Double] = js.native
    
    /* 3 */ val deletingImportedItemsFromSource: typings.winrtUwp.Windows.Media.Import.PhotoImportStage.deletingImportedItemsFromSource & Double = js.native
    
    /* 1 */ val findingItems: typings.winrtUwp.Windows.Media.Import.PhotoImportStage.findingItems & Double = js.native
    
    /* 2 */ val importingItems: typings.winrtUwp.Windows.Media.Import.PhotoImportStage.importingItems & Double = js.native
    
    /* 0 */ val notStarted: typings.winrtUwp.Windows.Media.Import.PhotoImportStage.notStarted & Double = js.native
  }
  
  /** Represents a storage medium exposed by a photo import source device. */
  @JSGlobal("Windows.Media.Import.PhotoImportStorageMedium")
  @js.native
  abstract class PhotoImportStorageMedium ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Import.PhotoImportStorageMedium {
    
    /** Gets the available space on the storage medium, in bytes. */
    /* CompleteClass */
    var availableSpaceInBytes: Double = js.native
    
    /** Gets the capacity of the storage media, in bytes. */
    /* CompleteClass */
    var capacityInBytes: Double = js.native
    
    /** Gets a description of the storage medium. */
    /* CompleteClass */
    var description: String = js.native
    
    /** Gets the name of the storage medium. */
    /* CompleteClass */
    var name: String = js.native
    
    /** Refreshes the information about the storage medium. */
    /* CompleteClass */
    override def refresh(): Unit = js.native
    
    /** Gets the serial number of the storage medium. */
    /* CompleteClass */
    var serialNumber: String = js.native
    
    /** Gets the type of the storage medium. */
    /* CompleteClass */
    var storageMediumType: PhotoImportStorageMediumType = js.native
    
    /** Gets a value indicating the access modes supported by the storage medium. */
    /* CompleteClass */
    var supportedAccessMode: PhotoImportAccessMode = js.native
  }
  
  /** Specifies the type of a storage medium. */
  @JSGlobal("Windows.Media.Import.PhotoImportStorageMediumType")
  @js.native
  object PhotoImportStorageMediumType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Import.PhotoImportStorageMediumType & Double] = js.native
    
    /* 1 */ val fixed: typings.winrtUwp.Windows.Media.Import.PhotoImportStorageMediumType.fixed & Double = js.native
    
    /* 2 */ val removable: typings.winrtUwp.Windows.Media.Import.PhotoImportStorageMediumType.removable & Double = js.native
    
    /* 0 */ val undefined: typings.winrtUwp.Windows.Media.Import.PhotoImportStorageMediumType.undefined & Double = js.native
  }
  
  /** Specifies the method used for naming subfolders within the destination folder. */
  @JSGlobal("Windows.Media.Import.PhotoImportSubfolderCreationMode")
  @js.native
  object PhotoImportSubfolderCreationMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Import.PhotoImportSubfolderCreationMode & Double] = js.native
    
    /* 2 */ val createSubfoldersFromExifDate: typings.winrtUwp.Windows.Media.Import.PhotoImportSubfolderCreationMode.createSubfoldersFromExifDate & Double = js.native
    
    /* 1 */ val createSubfoldersFromFileDate: typings.winrtUwp.Windows.Media.Import.PhotoImportSubfolderCreationMode.createSubfoldersFromFileDate & Double = js.native
    
    /* 0 */ val doNotCreateSubfolders: typings.winrtUwp.Windows.Media.Import.PhotoImportSubfolderCreationMode.doNotCreateSubfolders & Double = js.native
    
    /* 3 */ val keepOriginalFolderStructure: typings.winrtUwp.Windows.Media.Import.PhotoImportSubfolderCreationMode.keepOriginalFolderStructure & Double = js.native
  }
  
  /** Represents an imported video segment. */
  @JSGlobal("Windows.Media.Import.PhotoImportVideoSegment")
  @js.native
  abstract class PhotoImportVideoSegment ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Import.PhotoImportVideoSegment {
    
    /** Gets the date of the imported video segment. */
    /* CompleteClass */
    var date: Date = js.native
    
    /** Gets the name of the imported video segment. */
    /* CompleteClass */
    var name: String = js.native
    
    /** Gets the sibling file associated with the imported video segment. */
    /* CompleteClass */
    var sibling: typings.winrtUwp.Windows.Media.Import.PhotoImportSidecar = js.native
    
    /** Gets the sidecar file associated with the imported video segment. */
    /* CompleteClass */
    var sidecars: IVectorView[typings.winrtUwp.Windows.Media.Import.PhotoImportSidecar] = js.native
    
    /** Gets the size of the imported video segment, in bytes. */
    /* CompleteClass */
    var sizeInBytes: Double = js.native
  }
}
