package typings.winrtUwp.global.Windows.Media

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.IStorageFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The Windows.Media.Import namespace provides APIs for discovering and importing photos and videos from devices including cameras, mass storage devices, phones, and other devices that support photo import. */
object Import {
  
  /** Specifies the access mode with which photos are imported. */
  @JSGlobal("Windows.Media.Import.PhotoImportAccessMode")
  @js.native
  object PhotoImportAccessMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Import.PhotoImportAccessMode with Double] = js.native
    
    /* 2 */ val readAndDelete: typings.winrtUwp.Windows.Media.Import.PhotoImportAccessMode.readAndDelete with Double = js.native
    
    /* 1 */ val readOnly: typings.winrtUwp.Windows.Media.Import.PhotoImportAccessMode.readOnly with Double = js.native
    
    /* 0 */ val readWrite: typings.winrtUwp.Windows.Media.Import.PhotoImportAccessMode.readWrite with Double = js.native
  }
  
  /** Specifies the connection transport used for photo import. */
  @JSGlobal("Windows.Media.Import.PhotoImportConnectionTransport")
  @js.native
  object PhotoImportConnectionTransport extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Import.PhotoImportConnectionTransport with Double] = js.native
    
    /* 3 */ val bluetooth: typings.winrtUwp.Windows.Media.Import.PhotoImportConnectionTransport.bluetooth with Double = js.native
    
    /* 2 */ val ip: typings.winrtUwp.Windows.Media.Import.PhotoImportConnectionTransport.ip with Double = js.native
    
    /* 0 */ val unknown: typings.winrtUwp.Windows.Media.Import.PhotoImportConnectionTransport.unknown with Double = js.native
    
    /* 1 */ val usb: typings.winrtUwp.Windows.Media.Import.PhotoImportConnectionTransport.usb with Double = js.native
  }
  
  /** Specifies the content type of an imported item. */
  @JSGlobal("Windows.Media.Import.PhotoImportContentType")
  @js.native
  object PhotoImportContentType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Import.PhotoImportContentType with Double] = js.native
    
    /* 1 */ val image: typings.winrtUwp.Windows.Media.Import.PhotoImportContentType.image with Double = js.native
    
    /* 0 */ val unknown: typings.winrtUwp.Windows.Media.Import.PhotoImportContentType.unknown with Double = js.native
    
    /* 2 */ val video: typings.winrtUwp.Windows.Media.Import.PhotoImportContentType.video with Double = js.native
  }
  
  /** Specifies the content types that are included in a photo import operation. */
  @JSGlobal("Windows.Media.Import.PhotoImportContentTypeFilter")
  @js.native
  object PhotoImportContentTypeFilter extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Import.PhotoImportContentTypeFilter with Double] = js.native
    
    /* 2 */ val imagesAndVideos: typings.winrtUwp.Windows.Media.Import.PhotoImportContentTypeFilter.imagesAndVideos with Double = js.native
    
    /* 0 */ val onlyImages: typings.winrtUwp.Windows.Media.Import.PhotoImportContentTypeFilter.onlyImages with Double = js.native
    
    /* 1 */ val onlyVideos: typings.winrtUwp.Windows.Media.Import.PhotoImportContentTypeFilter.onlyVideos with Double = js.native
  }
  
  /** Represents the result of a operation that deletes imported media items from the source. */
  @JSGlobal("Windows.Media.Import.PhotoImportDeleteImportedItemsFromSourceResult")
  @js.native
  abstract class PhotoImportDeleteImportedItemsFromSourceResult ()
    extends typings.winrtUwp.Windows.Media.Import.PhotoImportDeleteImportedItemsFromSourceResult
  
  /** Represents the result of a operation that finds media items on a source. */
  @JSGlobal("Windows.Media.Import.PhotoImportFindItemsResult")
  @js.native
  abstract class PhotoImportFindItemsResult ()
    extends typings.winrtUwp.Windows.Media.Import.PhotoImportFindItemsResult
  
  /** Represents the result of a operation that imports media items from the source. */
  @JSGlobal("Windows.Media.Import.PhotoImportImportItemsResult")
  @js.native
  abstract class PhotoImportImportItemsResult ()
    extends typings.winrtUwp.Windows.Media.Import.PhotoImportImportItemsResult
  
  /** Specifies the types of files that are included in an import operation. */
  @JSGlobal("Windows.Media.Import.PhotoImportImportMode")
  @js.native
  object PhotoImportImportMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Import.PhotoImportImportMode with Double] = js.native
    
    /* 2 */ val ignoreSiblings: typings.winrtUwp.Windows.Media.Import.PhotoImportImportMode.ignoreSiblings with Double = js.native
    
    /* 1 */ val ignoreSidecars: typings.winrtUwp.Windows.Media.Import.PhotoImportImportMode.ignoreSidecars with Double = js.native
    
    /* 3 */ val ignoreSidecarsAndSiblings: typings.winrtUwp.Windows.Media.Import.PhotoImportImportMode.ignoreSidecarsAndSiblings with Double = js.native
    
    /* 0 */ val importEverything: typings.winrtUwp.Windows.Media.Import.PhotoImportImportMode.importEverything with Double = js.native
  }
  
  /** Represents an media item that has been imported from a source. */
  @JSGlobal("Windows.Media.Import.PhotoImportItem")
  @js.native
  abstract class PhotoImportItem ()
    extends typings.winrtUwp.Windows.Media.Import.PhotoImportItem
  
  /** Provides data for the PhotoImportFindItemsResult::ItemImported event. */
  @JSGlobal("Windows.Media.Import.PhotoImportItemImportedEventArgs")
  @js.native
  abstract class PhotoImportItemImportedEventArgs ()
    extends typings.winrtUwp.Windows.Media.Import.PhotoImportItemImportedEventArgs
  
  /** Specifies the initial selection state for items that are discovered using PhotoImportSession::FindItemsAsync . */
  @JSGlobal("Windows.Media.Import.PhotoImportItemSelectionMode")
  @js.native
  object PhotoImportItemSelectionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Import.PhotoImportItemSelectionMode with Double] = js.native
    
    /* 0 */ val selectAll: typings.winrtUwp.Windows.Media.Import.PhotoImportItemSelectionMode.selectAll with Double = js.native
    
    /* 2 */ val selectNew: typings.winrtUwp.Windows.Media.Import.PhotoImportItemSelectionMode.selectNew with Double = js.native
    
    /* 1 */ val selectNone: typings.winrtUwp.Windows.Media.Import.PhotoImportItemSelectionMode.selectNone with Double = js.native
  }
  
  /** Provides APIs for determining if photo import is supported on the current device, finding sources from which to import photos, and getting references to any pending photo import operations. */
  @JSGlobal("Windows.Media.Import.PhotoImportManager")
  @js.native
  abstract class PhotoImportManager ()
    extends typings.winrtUwp.Windows.Media.Import.PhotoImportManager
  object PhotoImportManager {
    
    /**
      * Finds all currently available sources from which photos can be imported.
      * @return An asynchronous operation that returns a list of available sources on successful completion.
      */
    /* static member */
    @JSGlobal("Windows.Media.Import.PhotoImportManager.findAllSourcesAsync")
    @js.native
    def findAllSourcesAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    
    /**
      * Gets the list of all pending photo import operations.
      * @return The list of all pending photo operations.
      */
    /* static member */
    @JSGlobal("Windows.Media.Import.PhotoImportManager.getPendingOperations")
    @js.native
    def getPendingOperations(): IVectorView[typings.winrtUwp.Windows.Media.Import.PhotoImportOperation] = js.native
    
    /**
      * Gets a value indicating if photo import is supported on the current device.
      * @return An asynchronous operation that returns true if photo import is supported. Otherwise, returns false.
      */
    /* static member */
    @JSGlobal("Windows.Media.Import.PhotoImportManager.isSupportedAsync")
    @js.native
    def isSupportedAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  }
  
  /** Represents an in-progress photo import operation. */
  @JSGlobal("Windows.Media.Import.PhotoImportOperation")
  @js.native
  abstract class PhotoImportOperation ()
    extends typings.winrtUwp.Windows.Media.Import.PhotoImportOperation
  
  /** Specifies the current power source of the source device containing items to be imported. */
  @JSGlobal("Windows.Media.Import.PhotoImportPowerSource")
  @js.native
  object PhotoImportPowerSource extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Import.PhotoImportPowerSource with Double] = js.native
    
    /* 1 */ val battery: typings.winrtUwp.Windows.Media.Import.PhotoImportPowerSource.battery with Double = js.native
    
    /* 2 */ val external: typings.winrtUwp.Windows.Media.Import.PhotoImportPowerSource.external with Double = js.native
    
    /* 0 */ val unknown: typings.winrtUwp.Windows.Media.Import.PhotoImportPowerSource.unknown with Double = js.native
  }
  
  /** Provides data for the PhotoImportFindItemsResult::SelectionChanged event. */
  @JSGlobal("Windows.Media.Import.PhotoImportSelectionChangedEventArgs")
  @js.native
  abstract class PhotoImportSelectionChangedEventArgs ()
    extends typings.winrtUwp.Windows.Media.Import.PhotoImportSelectionChangedEventArgs
  
  /** Represents a photo import session with a photo import source. */
  @JSGlobal("Windows.Media.Import.PhotoImportSession")
  @js.native
  abstract class PhotoImportSession ()
    extends typings.winrtUwp.Windows.Media.Import.PhotoImportSession
  
  /** Represents a sidecar file or a sibling file to a PhotoImportItem . */
  @JSGlobal("Windows.Media.Import.PhotoImportSidecar")
  @js.native
  abstract class PhotoImportSidecar ()
    extends typings.winrtUwp.Windows.Media.Import.PhotoImportSidecar
  
  /** Represents the source device for a photo import session. */
  @JSGlobal("Windows.Media.Import.PhotoImportSource")
  @js.native
  abstract class PhotoImportSource ()
    extends typings.winrtUwp.Windows.Media.Import.PhotoImportSource
  object PhotoImportSource {
    
    /**
      * Creates a new instance of PhotoImportSource from the specified root folder.
      * @param sourceRootFolder The root folder from which the photo import source is created.
      * @return An asynchronous operation that returns a PhotoImportSource upon successful completion.
      */
    /* static member */
    @JSGlobal("Windows.Media.Import.PhotoImportSource.fromFolderAsync")
    @js.native
    def fromFolderAsync(sourceRootFolder: IStorageFolder): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.Import.PhotoImportSource] = js.native
    
    /**
      * Creates a new instance of PhotoImportSource from the specified device ID.
      * @param sourceId The root folder from which the photo import source is created.
      * @return An asynchronous operation that returns a PhotoImportSource upon successful completion.
      */
    /* static member */
    @JSGlobal("Windows.Media.Import.PhotoImportSource.fromIdAsync")
    @js.native
    def fromIdAsync(sourceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.Import.PhotoImportSource] = js.native
  }
  
  /** Specifies the type of device that is being used as a photo import source. */
  @JSGlobal("Windows.Media.Import.PhotoImportSourceType")
  @js.native
  object PhotoImportSourceType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Import.PhotoImportSourceType with Double] = js.native
    
    /* 6 */ val audioRecorder: typings.winrtUwp.Windows.Media.Import.PhotoImportSourceType.audioRecorder with Double = js.native
    
    /* 1 */ val camera: typings.winrtUwp.Windows.Media.Import.PhotoImportSourceType.camera with Double = js.native
    
    /* 0 */ val generic: typings.winrtUwp.Windows.Media.Import.PhotoImportSourceType.generic with Double = js.native
    
    /* 2 */ val mediaPlayer: typings.winrtUwp.Windows.Media.Import.PhotoImportSourceType.mediaPlayer with Double = js.native
    
    /* 5 */ val personalInfoManager: typings.winrtUwp.Windows.Media.Import.PhotoImportSourceType.personalInfoManager with Double = js.native
    
    /* 3 */ val phone: typings.winrtUwp.Windows.Media.Import.PhotoImportSourceType.phone with Double = js.native
    
    /* 4 */ val video: typings.winrtUwp.Windows.Media.Import.PhotoImportSourceType.video with Double = js.native
  }
  
  /** Specifies the stages of the photo import process. */
  @JSGlobal("Windows.Media.Import.PhotoImportStage")
  @js.native
  object PhotoImportStage extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Import.PhotoImportStage with Double] = js.native
    
    /* 3 */ val deletingImportedItemsFromSource: typings.winrtUwp.Windows.Media.Import.PhotoImportStage.deletingImportedItemsFromSource with Double = js.native
    
    /* 1 */ val findingItems: typings.winrtUwp.Windows.Media.Import.PhotoImportStage.findingItems with Double = js.native
    
    /* 2 */ val importingItems: typings.winrtUwp.Windows.Media.Import.PhotoImportStage.importingItems with Double = js.native
    
    /* 0 */ val notStarted: typings.winrtUwp.Windows.Media.Import.PhotoImportStage.notStarted with Double = js.native
  }
  
  /** Represents a storage medium exposed by a photo import source device. */
  @JSGlobal("Windows.Media.Import.PhotoImportStorageMedium")
  @js.native
  abstract class PhotoImportStorageMedium ()
    extends typings.winrtUwp.Windows.Media.Import.PhotoImportStorageMedium
  
  /** Specifies the type of a storage medium. */
  @JSGlobal("Windows.Media.Import.PhotoImportStorageMediumType")
  @js.native
  object PhotoImportStorageMediumType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Import.PhotoImportStorageMediumType with Double] = js.native
    
    /* 1 */ val fixed: typings.winrtUwp.Windows.Media.Import.PhotoImportStorageMediumType.fixed with Double = js.native
    
    /* 2 */ val removable: typings.winrtUwp.Windows.Media.Import.PhotoImportStorageMediumType.removable with Double = js.native
    
    /* 0 */ val undefined: typings.winrtUwp.Windows.Media.Import.PhotoImportStorageMediumType.undefined with Double = js.native
  }
  
  /** Specifies the method used for naming subfolders within the destination folder. */
  @JSGlobal("Windows.Media.Import.PhotoImportSubfolderCreationMode")
  @js.native
  object PhotoImportSubfolderCreationMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Media.Import.PhotoImportSubfolderCreationMode with Double
      ] = js.native
    
    /* 2 */ val createSubfoldersFromExifDate: typings.winrtUwp.Windows.Media.Import.PhotoImportSubfolderCreationMode.createSubfoldersFromExifDate with Double = js.native
    
    /* 1 */ val createSubfoldersFromFileDate: typings.winrtUwp.Windows.Media.Import.PhotoImportSubfolderCreationMode.createSubfoldersFromFileDate with Double = js.native
    
    /* 0 */ val doNotCreateSubfolders: typings.winrtUwp.Windows.Media.Import.PhotoImportSubfolderCreationMode.doNotCreateSubfolders with Double = js.native
    
    /* 3 */ val keepOriginalFolderStructure: typings.winrtUwp.Windows.Media.Import.PhotoImportSubfolderCreationMode.keepOriginalFolderStructure with Double = js.native
  }
  
  /** Represents an imported video segment. */
  @JSGlobal("Windows.Media.Import.PhotoImportVideoSegment")
  @js.native
  abstract class PhotoImportVideoSegment ()
    extends typings.winrtUwp.Windows.Media.Import.PhotoImportVideoSegment
}
