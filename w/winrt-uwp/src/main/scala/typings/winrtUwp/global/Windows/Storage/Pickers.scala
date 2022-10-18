package typings.winrtUwp.global.Windows.Storage

import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typings.winrtUwp.Windows.Foundation.Collections.IMap
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.Pickers.PickerLocationId
import typings.winrtUwp.Windows.Storage.Pickers.PickerViewMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides classes for creating and managing user interface (UI) elements that let the user browse files, choose files to open, and to choose the name, extension, and location when storing files. */
object Pickers {
  
  /** Represents a random-access collection of file name extensions. */
  /* note: abstract class */ @JSGlobal("Windows.Storage.Pickers.FileExtensionVector")
  @js.native
  open class FileExtensionVector ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.Pickers.FileExtensionVector
  
  /** Represents a UI element that lets the user choose and open files. */
  @JSGlobal("Windows.Storage.Pickers.FileOpenPicker")
  @js.native
  /* unmapped type */
  /** Creates a new instance of a FileOpenPicker . */
  open class FileOpenPicker ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.Pickers.FileOpenPicker
  object FileOpenPicker {
    
    @JSGlobal("Windows.Storage.Pickers.FileOpenPicker")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Windows.Storage.Pickers.FileOpenPicker.resumePickSingleFileAsync")
    @js.native
    def resumePickSingleFileAsync: Any = js.native
    inline def resumePickSingleFileAsync_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resumePickSingleFileAsync")(x.asInstanceOf[js.Any])
  }
  
  /** Represents a collection of display names mapped to the associated file types (extensions). Each element in this collection maps a display name to a corresponding collection of file name extensions. The key is a single string, the value is a list/vector of strings representing one or more extension choices. */
  /* note: abstract class */ @JSGlobal("Windows.Storage.Pickers.FilePickerFileTypesOrderedMap")
  @js.native
  open class FilePickerFileTypesOrderedMap ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.Pickers.FilePickerFileTypesOrderedMap {
    
    /** Removes all display names and associated file name extensions from the collection. */
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /**
      * Retrieves an iterator that iterates through the display names and associated file types in the collection.
      * @return The iterator.
      */
    /* CompleteClass */
    override def first(): IIterator[IKeyValuePair[Any, Any]] = js.native
    
    /**
      * Returns an immutable view of the collection of display names and associated file types.
      * @return The view of the collection.
      */
    /* CompleteClass */
    override def getView(): IMapView[String, IVector[String]] = js.native
    
    /**
      * Determines whether the mapped collection of display names and associated file types contains the specified key.
      * @param key The key.
      * @return True if the key is found; otherwise, false.
      */
    /* CompleteClass */
    override def hasKey(key: String): Boolean = js.native
    
    /**
      * Inserts or replaces an item in the mapped collection of display names and associated file types.
      * @param key The key associated with the item to insert.
      * @param value The item to insert.
      * @return true if an item with the specified key is an existing item and was replaced; otherwise false.
      */
    /* CompleteClass */
    override def insert(key: String, value: IVector[String]): Boolean = js.native
    
    /**
      * Returns the item at the specified key in the mapped collection of display names and associated file types.
      * @param key The key to use to locate the item.
      * @return The item associated with the specified key.
      */
    /* CompleteClass */
    override def lookup(key: String): IVector[String] = js.native
    
    /**
      * Removes an item from the mapped collection of display names and associated file types.
      * @param key The key associated with the item to remove.
      */
    /* CompleteClass */
    override def remove(key: String): Unit = js.native
    
    /** Gets the number of items in the mapped collection of display names and associated file types. */
    /* CompleteClass */
    var size: Double = js.native
  }
  
  /** Represents a collection of storage files that the user has selected by using a file picker. */
  /* note: abstract class */ @JSGlobal("Windows.Storage.Pickers.FilePickerSelectedFilesArray")
  @js.native
  open class FilePickerSelectedFilesArray ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.Pickers.FilePickerSelectedFilesArray
  
  /** Represents a file picker that lets the user choose the file name, extension, and storage location for a file. */
  @JSGlobal("Windows.Storage.Pickers.FileSavePicker")
  @js.native
  /** Creates a new instance of a FileSavePicker . */
  open class FileSavePicker ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.Pickers.FileSavePicker {
    
    /** Gets or sets the label text of the commit button in the file picker UI. */
    /* CompleteClass */
    var commitButtonText: String = js.native
    
    /** Gets a set of values to be populated by the app before a PickSaveFileAndContinue operation that deactivates the app in order to provide context when the app is activated. (Windows Phone Store apps) */
    /* CompleteClass */
    var continuationData: ValueSet = js.native
    
    /** Gets or sets the default file name extension that the fileSavePicker gives to files to be saved. */
    /* CompleteClass */
    var defaultFileExtension: String = js.native
    
    /** Gets or sets an ID that specifies the enterprise that owns the file. */
    /* CompleteClass */
    var enterpriseId: String = js.native
    
    /** Gets the collection of valid file types that the user can choose to assign to a file. */
    /* CompleteClass */
    var fileTypeChoices: IMap[String, IVector[String]] = js.native
    
    /** Shows the file picker so that the user can save a file, deactivating and the app and reactivating it when the operation is complete. (Windows Phone Store apps) */
    /* CompleteClass */
    override def pickSaveFileAndContinue(): Unit = js.native
    
    /**
      * Shows the file picker so that the user can save a file and set the file name, extension, and location of the file to be saved. (Windows Store apps)
      * @return When the call to this method completes successfully, it returns a storageFile object that was created to represent the saved file. The file name, extension, and location of this storageFile match those specified by the user, but the file has no content.
      */
    /* CompleteClass */
    override def pickSaveFileAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Storage.StorageFile] = js.native
    
    /** Gets or sets the settings identifier associated with the current FileSavePicker instance. */
    /* CompleteClass */
    var settingsIdentifier: String = js.native
    
    /** Gets or sets the file name that the file save picker suggests to the user. */
    /* CompleteClass */
    var suggestedFileName: String = js.native
    
    /** Gets or sets the storageFile that the file picker suggests to the user for saving a file. */
    /* CompleteClass */
    var suggestedSaveFile: typings.winrtUwp.Windows.Storage.StorageFile = js.native
    
    /** Gets or sets the location that the file save picker suggests to the user as the location to save a file. */
    /* CompleteClass */
    var suggestedStartLocation: PickerLocationId = js.native
  }
  
  /** Represents a UI element that lets the user choose folders. */
  @JSGlobal("Windows.Storage.Pickers.FolderPicker")
  @js.native
  /** Creates a new instance of a FolderPicker . */
  open class FolderPicker ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.Pickers.FolderPicker {
    
    /** Gets or sets the label text of the folder picker's commit button. */
    /* CompleteClass */
    var commitButtonText: String = js.native
    
    /** Gets a set of values to be populated by the app before a PickFolderAndContinue operation that deactivates the app in order to provide context when the app is activated. (Windows Phone Store apps) */
    /* CompleteClass */
    var continuationData: ValueSet = js.native
    
    /** Gets the collection of file types that the folder picker displays. */
    /* CompleteClass */
    var fileTypeFilter: IVector[String] = js.native
    
    /** Shows the file picker so that the user can pick a folder, deactivating and the app and reactivating it when the operation is complete. (Windows Phone Store apps) */
    /* CompleteClass */
    override def pickFolderAndContinue(): Unit = js.native
    
    /**
      * Shows the folderPicker object so that the user can pick a folder. (Windows Store apps)
      * @return When the call to this method completes successfully, it returns a storageFolder object that represents the folder that the user picked.
      */
    /* CompleteClass */
    override def pickSingleFolderAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Storage.StorageFolder] = js.native
    
    /** Gets or sets the settings identifier associated with the with the current FolderPicker instance. */
    /* CompleteClass */
    var settingsIdentifier: String = js.native
    
    /** Gets or sets the initial location where the folder picker looks for folders to present to the user. */
    /* CompleteClass */
    var suggestedStartLocation: PickerLocationId = js.native
    
    /** Gets or sets the view mode that the folder picker uses to display items. */
    /* CompleteClass */
    var viewMode: PickerViewMode = js.native
  }
  
  /** Identifies the storage location that the file picker presents to the user. */
  @JSGlobal("Windows.Storage.Pickers.PickerLocationId")
  @js.native
  object PickerLocationId extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.Pickers.PickerLocationId & Double] = js.native
    
    /* 1 */ val computerFolder: typings.winrtUwp.Windows.Storage.Pickers.PickerLocationId.computerFolder & Double = js.native
    
    /* 2 */ val desktop: typings.winrtUwp.Windows.Storage.Pickers.PickerLocationId.desktop & Double = js.native
    
    /* 0 */ val documentsLibrary: typings.winrtUwp.Windows.Storage.Pickers.PickerLocationId.documentsLibrary & Double = js.native
    
    /* 3 */ val downloads: typings.winrtUwp.Windows.Storage.Pickers.PickerLocationId.downloads & Double = js.native
    
    /* 4 */ val homeGroup: typings.winrtUwp.Windows.Storage.Pickers.PickerLocationId.homeGroup & Double = js.native
    
    /* 5 */ val musicLibrary: typings.winrtUwp.Windows.Storage.Pickers.PickerLocationId.musicLibrary & Double = js.native
    
    /* 8 */ val objects3D: typings.winrtUwp.Windows.Storage.Pickers.PickerLocationId.objects3D & Double = js.native
    
    /* 6 */ val picturesLibrary: typings.winrtUwp.Windows.Storage.Pickers.PickerLocationId.picturesLibrary & Double = js.native
    
    /* 9 */ val unspecified: typings.winrtUwp.Windows.Storage.Pickers.PickerLocationId.unspecified & Double = js.native
    
    /* 7 */ val videosLibrary: typings.winrtUwp.Windows.Storage.Pickers.PickerLocationId.videosLibrary & Double = js.native
  }
  
  /** Indicates the view mode that the file picker is using to present items. */
  @JSGlobal("Windows.Storage.Pickers.PickerViewMode")
  @js.native
  object PickerViewMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.Pickers.PickerViewMode & Double] = js.native
    
    /* 0 */ val list: typings.winrtUwp.Windows.Storage.Pickers.PickerViewMode.list & Double = js.native
    
    /* 1 */ val thumbnail: typings.winrtUwp.Windows.Storage.Pickers.PickerViewMode.thumbnail & Double = js.native
  }
  
  /** Provides support for apps that offer files through the file picker by participating in the File Open Picker contract, and for apps that act as a save location for files through file picker by participating in the File Save Picker contract or the Cached File Updater contract. */
  object Provider {
    
    /** Indicates the result of a call to the fileOpenPickerUI.addFile method. */
    @JSGlobal("Windows.Storage.Pickers.Provider.AddFileResult")
    @js.native
    object AddFileResult extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.Pickers.Provider.AddFileResult & Double] = js.native
      
      /* 0 */ val added: typings.winrtUwp.Windows.Storage.Pickers.Provider.AddFileResult.added & Double = js.native
      
      /* 1 */ val alreadyAdded: typings.winrtUwp.Windows.Storage.Pickers.Provider.AddFileResult.alreadyAdded & Double = js.native
      
      /* 2 */ val notAllowed: typings.winrtUwp.Windows.Storage.Pickers.Provider.AddFileResult.notAllowed & Double = js.native
      
      /* 3 */ val unavailable: typings.winrtUwp.Windows.Storage.Pickers.Provider.AddFileResult.unavailable & Double = js.native
    }
    
    /** Used to interact with the file picker if your app provides files with the File Open Picker contract. */
    /* note: abstract class */ @JSGlobal("Windows.Storage.Pickers.Provider.FileOpenPickerUI")
    @js.native
    open class FileOpenPickerUI ()
      extends StObject
         with typings.winrtUwp.Windows.Storage.Pickers.Provider.FileOpenPickerUI
    
    /** Provides information about a fileremoved event. */
    /* note: abstract class */ @JSGlobal("Windows.Storage.Pickers.Provider.FileRemovedEventArgs")
    @js.native
    open class FileRemovedEventArgs ()
      extends StObject
         with typings.winrtUwp.Windows.Storage.Pickers.Provider.FileRemovedEventArgs {
      
      /** Gets the identifier of the file that the user removed from the list of chosen files in the file picker. This identifier was set by the providing app when it added the files to the list of chosen files. */
      /* CompleteClass */
      var id: String = js.native
    }
    
    /** Used to interact with the file picker when your app provides a save location with the File Save Picker contract. */
    /* note: abstract class */ @JSGlobal("Windows.Storage.Pickers.Provider.FileSavePickerUI")
    @js.native
    open class FileSavePickerUI ()
      extends StObject
         with typings.winrtUwp.Windows.Storage.Pickers.Provider.FileSavePickerUI
    
    /** Indicates whether the file picker currently limits selection to single files, or if multiple files can be selected. */
    @JSGlobal("Windows.Storage.Pickers.Provider.FileSelectionMode")
    @js.native
    object FileSelectionMode extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.Pickers.Provider.FileSelectionMode & Double] = js.native
      
      /* 1 */ val multiple: typings.winrtUwp.Windows.Storage.Pickers.Provider.FileSelectionMode.multiple & Double = js.native
      
      /* 0 */ val single: typings.winrtUwp.Windows.Storage.Pickers.Provider.FileSelectionMode.single & Double = js.native
    }
    
    /** Use by an app that provides files to indicate asynchronously that the app is finished responding to a closing event. */
    /* note: abstract class */ @JSGlobal("Windows.Storage.Pickers.Provider.PickerClosingDeferral")
    @js.native
    open class PickerClosingDeferral ()
      extends StObject
         with typings.winrtUwp.Windows.Storage.Pickers.Provider.PickerClosingDeferral {
      
      /** Signals that the app providing files has finished responding to a closing event. */
      /* CompleteClass */
      override def complete(): Unit = js.native
    }
    
    /** Provides information about a closing event. */
    /* note: abstract class */ @JSGlobal("Windows.Storage.Pickers.Provider.PickerClosingEventArgs")
    @js.native
    open class PickerClosingEventArgs ()
      extends StObject
         with typings.winrtUwp.Windows.Storage.Pickers.Provider.PickerClosingEventArgs {
      
      /** Gets a pickerClosingOperation object that is used to respond to a closing event. */
      /* CompleteClass */
      var closingOperation: typings.winrtUwp.Windows.Storage.Pickers.Provider.PickerClosingOperation = js.native
      
      /** Gets a value that indicates whether the file picker is closing because the user cancelled it. */
      /* CompleteClass */
      var isCanceled: Boolean = js.native
    }
    
    /** Lets an app that provides files get the deadline for responding to a closing event and get a deferral so the app can respond to the event asynchronously. */
    /* note: abstract class */ @JSGlobal("Windows.Storage.Pickers.Provider.PickerClosingOperation")
    @js.native
    open class PickerClosingOperation ()
      extends StObject
         with typings.winrtUwp.Windows.Storage.Pickers.Provider.PickerClosingOperation {
      
      /** Gets a dateTime object that indicates when the system will shut down the app that is providing files through the file picker without further notice. */
      /* CompleteClass */
      var deadline: js.Date = js.native
      
      /**
        * Gets a pickerClosingDeferral that the app providing files through the file picker can use to respond asynchronously to a closing event.
        * @return The pickerClosingDeferral that the app providing files through the file picker can use to respond asynchronously to a closing event.
        */
      /* CompleteClass */
      override def getDeferral(): typings.winrtUwp.Windows.Storage.Pickers.Provider.PickerClosingDeferral = js.native
    }
    
    /** Indicates the result of a call to the fileSavePickerUI.trySetFileName method. */
    @JSGlobal("Windows.Storage.Pickers.Provider.SetFileNameResult")
    @js.native
    object SetFileNameResult extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.Pickers.Provider.SetFileNameResult & Double] = js.native
      
      /* 1 */ val notAllowed: typings.winrtUwp.Windows.Storage.Pickers.Provider.SetFileNameResult.notAllowed & Double = js.native
      
      /* 0 */ val succeeded: typings.winrtUwp.Windows.Storage.Pickers.Provider.SetFileNameResult.succeeded & Double = js.native
      
      /* 2 */ val unavailable: typings.winrtUwp.Windows.Storage.Pickers.Provider.SetFileNameResult.unavailable & Double = js.native
    }
    
    /** Lets an app that provides a save location specify the storageFile that represents the file to save and get a deferral so the app can respond asynchronously to a targetFileRequested event. */
    /* note: abstract class */ @JSGlobal("Windows.Storage.Pickers.Provider.TargetFileRequest")
    @js.native
    open class TargetFileRequest ()
      extends StObject
         with typings.winrtUwp.Windows.Storage.Pickers.Provider.TargetFileRequest {
      
      /**
        * Gets a targetFileRequestDeferral that the app providing the save location can use to respond asynchronously to a targetfilerequested event.
        * @return The targetFileRequestDeferral that the providing app can use asynchronously to indicate that it is finished responding to a targetfilerequested event.
        */
      /* CompleteClass */
      override def getDeferral(): typings.winrtUwp.Windows.Storage.Pickers.Provider.TargetFileRequestDeferral = js.native
      
      /** Gets or sets the IStorageFile object that is provided to represent the file to save by the app that is providing the save location. */
      /* CompleteClass */
      var targetFile: IStorageFile = js.native
    }
    
    /** Used by an app that provides a save location to indicate asynchronously that the app is finished responding to a targetfilerequested event. */
    /* note: abstract class */ @JSGlobal("Windows.Storage.Pickers.Provider.TargetFileRequestDeferral")
    @js.native
    open class TargetFileRequestDeferral ()
      extends StObject
         with typings.winrtUwp.Windows.Storage.Pickers.Provider.TargetFileRequestDeferral {
      
      /** Signals that the app providing the save location finished responding to a targetfilerequested event. */
      /* CompleteClass */
      override def complete(): Unit = js.native
    }
    
    /** Provides information about a targetfilerequested event. */
    /* note: abstract class */ @JSGlobal("Windows.Storage.Pickers.Provider.TargetFileRequestedEventArgs")
    @js.native
    open class TargetFileRequestedEventArgs ()
      extends StObject
         with typings.winrtUwp.Windows.Storage.Pickers.Provider.TargetFileRequestedEventArgs {
      
      /** Gets a targetFileRequest object that is used to respond to a targetfilerequested event. */
      /* CompleteClass */
      var request: typings.winrtUwp.Windows.Storage.Pickers.Provider.TargetFileRequest = js.native
    }
  }
}
