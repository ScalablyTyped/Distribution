package typings.winrt.global.Windows.Storage

import typings.std.Date
import typings.winrt.Windows.Foundation.Collections.IIterator
import typings.winrt.Windows.Foundation.Collections.IKeyValuePair
import typings.winrt.Windows.Foundation.Collections.IMap
import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.Collections.ValueSet
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.IStorageFile
import typings.winrt.Windows.Storage.Pickers.PickerLocationId
import typings.winrt.Windows.Storage.Pickers.PickerViewMode
import typings.winrt.Windows.Storage.Pickers.Provider.AddFileResult
import typings.winrt.Windows.Storage.Pickers.Provider.FileSelectionMode
import typings.winrt.Windows.Storage.Pickers.Provider.SetFileNameResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pickers {
  
  @JSGlobal("Windows.Storage.Pickers.FileExtensionVector")
  @js.native
  class FileExtensionVector ()
    extends StObject
       with typings.winrt.Windows.Storage.Pickers.FileExtensionVector {
    
    /* CompleteClass */
    override def first(): IIterator[String] = js.native
  }
  
  @JSGlobal("Windows.Storage.Pickers.FileOpenPicker")
  @js.native
  class FileOpenPicker ()
    extends StObject
       with typings.winrt.Windows.Storage.Pickers.FileOpenPicker {
    
    /* CompleteClass */
    var commitButtonText: String = js.native
    
    /* CompleteClass */
    var continuationData: ValueSet = js.native
    
    /* CompleteClass */
    var fileTypeFilter: IVector[String] = js.native
    
    /* CompleteClass */
    override def pickMultipleFilesAndContinue(): Unit = js.native
    
    /* CompleteClass */
    override def pickMultipleFilesAsync(): IAsyncOperation[IVectorView[typings.winrt.Windows.Storage.StorageFile]] = js.native
    
    /* CompleteClass */
    override def pickSingleFileAndContinue(): Unit = js.native
    
    /* CompleteClass */
    override def pickSingleFileAsync(): IAsyncOperation[typings.winrt.Windows.Storage.StorageFile] = js.native
    
    /* CompleteClass */
    var settingsIdentifier: String = js.native
    
    /* CompleteClass */
    var suggestedStartLocation: PickerLocationId = js.native
    
    /* CompleteClass */
    var viewMode: PickerViewMode = js.native
  }
  
  @JSGlobal("Windows.Storage.Pickers.FilePickerFileTypesOrderedMap")
  @js.native
  class FilePickerFileTypesOrderedMap ()
    extends StObject
       with typings.winrt.Windows.Storage.Pickers.FilePickerFileTypesOrderedMap {
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def first(): IIterator[IKeyValuePair[String, IVector[String]]] = js.native
    
    /* CompleteClass */
    override def getView(): IMapView[String, IVector[String]] = js.native
    
    /* CompleteClass */
    override def hasKey(key: String): Boolean = js.native
    
    /* CompleteClass */
    override def insert(key: String, value: IVector[String]): Boolean = js.native
    
    /* CompleteClass */
    override def lookup(key: String): IVector[String] = js.native
    
    /* CompleteClass */
    override def remove(key: String): Unit = js.native
    
    /* CompleteClass */
    var size: Double = js.native
  }
  
  @JSGlobal("Windows.Storage.Pickers.FilePickerSelectedFilesArray")
  @js.native
  class FilePickerSelectedFilesArray ()
    extends StObject
       with typings.winrt.Windows.Storage.Pickers.FilePickerSelectedFilesArray {
    
    /* CompleteClass */
    override def first(): IIterator[typings.winrt.Windows.Storage.StorageFile] = js.native
  }
  
  @JSGlobal("Windows.Storage.Pickers.FileSavePicker")
  @js.native
  class FileSavePicker ()
    extends StObject
       with typings.winrt.Windows.Storage.Pickers.FileSavePicker {
    
    /* CompleteClass */
    var commitButtonText: String = js.native
    
    /* CompleteClass */
    var continuationData: ValueSet = js.native
    
    /* CompleteClass */
    var defaultFileExtension: String = js.native
    
    /* CompleteClass */
    var fileTypeChoices: IMap[String, IVector[String]] = js.native
    
    /* CompleteClass */
    override def pickSaveFileAndContinue(): Unit = js.native
    
    /* CompleteClass */
    override def pickSaveFileAsync(): IAsyncOperation[typings.winrt.Windows.Storage.StorageFile] = js.native
    
    /* CompleteClass */
    var settingsIdentifier: String = js.native
    
    /* CompleteClass */
    var suggestedFileName: String = js.native
    
    /* CompleteClass */
    var suggestedSaveFile: typings.winrt.Windows.Storage.StorageFile = js.native
    
    /* CompleteClass */
    var suggestedStartLocation: PickerLocationId = js.native
  }
  
  @JSGlobal("Windows.Storage.Pickers.FolderPicker")
  @js.native
  class FolderPicker ()
    extends StObject
       with typings.winrt.Windows.Storage.Pickers.FolderPicker {
    
    /* CompleteClass */
    var commitButtonText: String = js.native
    
    /* CompleteClass */
    var continuationData: ValueSet = js.native
    
    /* CompleteClass */
    var fileTypeFilter: IVector[String] = js.native
    
    /* CompleteClass */
    override def pickFolderAndContinue(): Unit = js.native
    
    /* CompleteClass */
    override def pickSingleFolderAsync(): IAsyncOperation[typings.winrt.Windows.Storage.StorageFolder] = js.native
    
    /* CompleteClass */
    var settingsIdentifier: String = js.native
    
    /* CompleteClass */
    var suggestedStartLocation: PickerLocationId = js.native
    
    /* CompleteClass */
    var viewMode: PickerViewMode = js.native
  }
  
  @JSGlobal("Windows.Storage.Pickers.PickerLocationId")
  @js.native
  object PickerLocationId extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.Pickers.PickerLocationId & Double] = js.native
    
    /* 1 */ val computerFolder: typings.winrt.Windows.Storage.Pickers.PickerLocationId.computerFolder & Double = js.native
    
    /* 2 */ val desktop: typings.winrt.Windows.Storage.Pickers.PickerLocationId.desktop & Double = js.native
    
    /* 0 */ val documentsLibrary: typings.winrt.Windows.Storage.Pickers.PickerLocationId.documentsLibrary & Double = js.native
    
    /* 3 */ val downloads: typings.winrt.Windows.Storage.Pickers.PickerLocationId.downloads & Double = js.native
    
    /* 4 */ val homeGroup: typings.winrt.Windows.Storage.Pickers.PickerLocationId.homeGroup & Double = js.native
    
    /* 5 */ val musicLibrary: typings.winrt.Windows.Storage.Pickers.PickerLocationId.musicLibrary & Double = js.native
    
    /* 6 */ val picturesLibrary: typings.winrt.Windows.Storage.Pickers.PickerLocationId.picturesLibrary & Double = js.native
    
    /* 7 */ val videosLibrary: typings.winrt.Windows.Storage.Pickers.PickerLocationId.videosLibrary & Double = js.native
  }
  
  @JSGlobal("Windows.Storage.Pickers.PickerViewMode")
  @js.native
  object PickerViewMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.Pickers.PickerViewMode & Double] = js.native
    
    /* 0 */ val list: typings.winrt.Windows.Storage.Pickers.PickerViewMode.list & Double = js.native
    
    /* 1 */ val thumbnail: typings.winrt.Windows.Storage.Pickers.PickerViewMode.thumbnail & Double = js.native
  }
  
  object Provider {
    
    @JSGlobal("Windows.Storage.Pickers.Provider.AddFileResult")
    @js.native
    object AddFileResult extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.Pickers.Provider.AddFileResult & Double] = js.native
      
      /* 0 */ val added: typings.winrt.Windows.Storage.Pickers.Provider.AddFileResult.added & Double = js.native
      
      /* 1 */ val alreadyAdded: typings.winrt.Windows.Storage.Pickers.Provider.AddFileResult.alreadyAdded & Double = js.native
      
      /* 2 */ val notAllowed: typings.winrt.Windows.Storage.Pickers.Provider.AddFileResult.notAllowed & Double = js.native
      
      /* 3 */ val unavailable: typings.winrt.Windows.Storage.Pickers.Provider.AddFileResult.unavailable & Double = js.native
    }
    
    @JSGlobal("Windows.Storage.Pickers.Provider.FileOpenPickerUI")
    @js.native
    class FileOpenPickerUI ()
      extends StObject
         with typings.winrt.Windows.Storage.Pickers.Provider.FileOpenPickerUI {
      
      /* CompleteClass */
      override def addFile(id: String, file: IStorageFile): AddFileResult = js.native
      
      /* CompleteClass */
      var allowedFileTypes: IVectorView[String] = js.native
      
      /* CompleteClass */
      override def canAddFile(file: IStorageFile): Boolean = js.native
      
      /* CompleteClass */
      override def containsFile(id: String): Boolean = js.native
      
      /* CompleteClass */
      var onclosing: js.Any = js.native
      
      /* CompleteClass */
      var onfileremoved: js.Any = js.native
      
      /* CompleteClass */
      override def removeFile(id: String): Unit = js.native
      
      /* CompleteClass */
      var selectionMode: FileSelectionMode = js.native
      
      /* CompleteClass */
      var settingsIdentifier: String = js.native
      
      /* CompleteClass */
      var title: String = js.native
    }
    
    @JSGlobal("Windows.Storage.Pickers.Provider.FileRemovedEventArgs")
    @js.native
    class FileRemovedEventArgs ()
      extends StObject
         with typings.winrt.Windows.Storage.Pickers.Provider.FileRemovedEventArgs {
      
      /* CompleteClass */
      var id: String = js.native
    }
    
    @JSGlobal("Windows.Storage.Pickers.Provider.FileSavePickerUI")
    @js.native
    class FileSavePickerUI ()
      extends StObject
         with typings.winrt.Windows.Storage.Pickers.Provider.FileSavePickerUI {
      
      /* CompleteClass */
      var allowedFileTypes: IVectorView[String] = js.native
      
      /* CompleteClass */
      var fileName: String = js.native
      
      /* CompleteClass */
      var onfilenamechanged: js.Any = js.native
      
      /* CompleteClass */
      var ontargetfilerequested: js.Any = js.native
      
      /* CompleteClass */
      var settingsIdentifier: String = js.native
      
      /* CompleteClass */
      var title: String = js.native
      
      /* CompleteClass */
      override def trySetFileName(value: String): SetFileNameResult = js.native
    }
    
    @JSGlobal("Windows.Storage.Pickers.Provider.FileSelectionMode")
    @js.native
    object FileSelectionMode extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.Pickers.Provider.FileSelectionMode & Double] = js.native
      
      /* 1 */ val multiple: typings.winrt.Windows.Storage.Pickers.Provider.FileSelectionMode.multiple & Double = js.native
      
      /* 0 */ val single: typings.winrt.Windows.Storage.Pickers.Provider.FileSelectionMode.single & Double = js.native
    }
    
    @JSGlobal("Windows.Storage.Pickers.Provider.PickerClosingDeferral")
    @js.native
    class PickerClosingDeferral ()
      extends StObject
         with typings.winrt.Windows.Storage.Pickers.Provider.PickerClosingDeferral {
      
      /* CompleteClass */
      override def complete(): Unit = js.native
    }
    
    @JSGlobal("Windows.Storage.Pickers.Provider.PickerClosingEventArgs")
    @js.native
    class PickerClosingEventArgs ()
      extends StObject
         with typings.winrt.Windows.Storage.Pickers.Provider.PickerClosingEventArgs {
      
      /* CompleteClass */
      var closingOperation: typings.winrt.Windows.Storage.Pickers.Provider.PickerClosingOperation = js.native
      
      /* CompleteClass */
      var isCanceled: Boolean = js.native
    }
    
    @JSGlobal("Windows.Storage.Pickers.Provider.PickerClosingOperation")
    @js.native
    class PickerClosingOperation ()
      extends StObject
         with typings.winrt.Windows.Storage.Pickers.Provider.PickerClosingOperation {
      
      /* CompleteClass */
      var deadline: Date = js.native
      
      /* CompleteClass */
      override def getDeferral(): typings.winrt.Windows.Storage.Pickers.Provider.PickerClosingDeferral = js.native
    }
    
    @JSGlobal("Windows.Storage.Pickers.Provider.SetFileNameResult")
    @js.native
    object SetFileNameResult extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.Pickers.Provider.SetFileNameResult & Double] = js.native
      
      /* 1 */ val notAllowed: typings.winrt.Windows.Storage.Pickers.Provider.SetFileNameResult.notAllowed & Double = js.native
      
      /* 0 */ val succeeded: typings.winrt.Windows.Storage.Pickers.Provider.SetFileNameResult.succeeded & Double = js.native
      
      /* 2 */ val unavailable: typings.winrt.Windows.Storage.Pickers.Provider.SetFileNameResult.unavailable & Double = js.native
    }
    
    @JSGlobal("Windows.Storage.Pickers.Provider.TargetFileRequest")
    @js.native
    class TargetFileRequest ()
      extends StObject
         with typings.winrt.Windows.Storage.Pickers.Provider.TargetFileRequest {
      
      /* CompleteClass */
      override def getDeferral(): typings.winrt.Windows.Storage.Pickers.Provider.TargetFileRequestDeferral = js.native
      
      /* CompleteClass */
      var targetFile: IStorageFile = js.native
    }
    
    @JSGlobal("Windows.Storage.Pickers.Provider.TargetFileRequestDeferral")
    @js.native
    class TargetFileRequestDeferral ()
      extends StObject
         with typings.winrt.Windows.Storage.Pickers.Provider.TargetFileRequestDeferral {
      
      /* CompleteClass */
      override def complete(): Unit = js.native
    }
    
    @JSGlobal("Windows.Storage.Pickers.Provider.TargetFileRequestedEventArgs")
    @js.native
    class TargetFileRequestedEventArgs ()
      extends StObject
         with typings.winrt.Windows.Storage.Pickers.Provider.TargetFileRequestedEventArgs {
      
      /* CompleteClass */
      var request: typings.winrt.Windows.Storage.Pickers.Provider.TargetFileRequest = js.native
    }
  }
}
