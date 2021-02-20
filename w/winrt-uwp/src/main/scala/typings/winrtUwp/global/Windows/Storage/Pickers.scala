package typings.winrtUwp.global.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides classes for creating and managing user interface (UI) elements that let the user browse files, choose files to open, and to choose the name, extension, and location when storing files. */
object Pickers {
  
  /** Represents a random-access collection of file name extensions. */
  @JSGlobal("Windows.Storage.Pickers.FileExtensionVector")
  @js.native
  abstract class FileExtensionVector ()
    extends typings.winrtUwp.Windows.Storage.Pickers.FileExtensionVector
  
  /** Represents a UI element that lets the user choose and open files. */
  @JSGlobal("Windows.Storage.Pickers.FileOpenPicker")
  @js.native
  /* unmapped type */
  /** Creates a new instance of a FileOpenPicker . */
  class FileOpenPicker ()
    extends typings.winrtUwp.Windows.Storage.Pickers.FileOpenPicker
  object FileOpenPicker {
    
    @JSGlobal("Windows.Storage.Pickers.FileOpenPicker")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Windows.Storage.Pickers.FileOpenPicker.resumePickSingleFileAsync")
    @js.native
    def resumePickSingleFileAsync: js.Any = js.native
    @scala.inline
    def resumePickSingleFileAsync_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resumePickSingleFileAsync")(x.asInstanceOf[js.Any])
  }
  
  /** Represents a collection of display names mapped to the associated file types (extensions). Each element in this collection maps a display name to a corresponding collection of file name extensions. The key is a single string, the value is a list/vector of strings representing one or more extension choices. */
  @JSGlobal("Windows.Storage.Pickers.FilePickerFileTypesOrderedMap")
  @js.native
  abstract class FilePickerFileTypesOrderedMap ()
    extends typings.winrtUwp.Windows.Storage.Pickers.FilePickerFileTypesOrderedMap
  
  /** Represents a collection of storage files that the user has selected by using a file picker. */
  @JSGlobal("Windows.Storage.Pickers.FilePickerSelectedFilesArray")
  @js.native
  abstract class FilePickerSelectedFilesArray ()
    extends typings.winrtUwp.Windows.Storage.Pickers.FilePickerSelectedFilesArray
  
  /** Represents a file picker that lets the user choose the file name, extension, and storage location for a file. */
  @JSGlobal("Windows.Storage.Pickers.FileSavePicker")
  @js.native
  /** Creates a new instance of a FileSavePicker . */
  class FileSavePicker ()
    extends typings.winrtUwp.Windows.Storage.Pickers.FileSavePicker
  
  /** Represents a UI element that lets the user choose folders. */
  @JSGlobal("Windows.Storage.Pickers.FolderPicker")
  @js.native
  /** Creates a new instance of a FolderPicker . */
  class FolderPicker ()
    extends typings.winrtUwp.Windows.Storage.Pickers.FolderPicker
  
  /** Identifies the storage location that the file picker presents to the user. */
  @JSGlobal("Windows.Storage.Pickers.PickerLocationId")
  @js.native
  object PickerLocationId extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.Pickers.PickerLocationId with Double] = js.native
    
    /* 1 */ val computerFolder: typings.winrtUwp.Windows.Storage.Pickers.PickerLocationId.computerFolder with Double = js.native
    
    /* 2 */ val desktop: typings.winrtUwp.Windows.Storage.Pickers.PickerLocationId.desktop with Double = js.native
    
    /* 0 */ val documentsLibrary: typings.winrtUwp.Windows.Storage.Pickers.PickerLocationId.documentsLibrary with Double = js.native
    
    /* 3 */ val downloads: typings.winrtUwp.Windows.Storage.Pickers.PickerLocationId.downloads with Double = js.native
    
    /* 4 */ val homeGroup: typings.winrtUwp.Windows.Storage.Pickers.PickerLocationId.homeGroup with Double = js.native
    
    /* 5 */ val musicLibrary: typings.winrtUwp.Windows.Storage.Pickers.PickerLocationId.musicLibrary with Double = js.native
    
    /* 8 */ val objects3D: typings.winrtUwp.Windows.Storage.Pickers.PickerLocationId.objects3D with Double = js.native
    
    /* 6 */ val picturesLibrary: typings.winrtUwp.Windows.Storage.Pickers.PickerLocationId.picturesLibrary with Double = js.native
    
    /* 9 */ val unspecified: typings.winrtUwp.Windows.Storage.Pickers.PickerLocationId.unspecified with Double = js.native
    
    /* 7 */ val videosLibrary: typings.winrtUwp.Windows.Storage.Pickers.PickerLocationId.videosLibrary with Double = js.native
  }
  
  /** Indicates the view mode that the file picker is using to present items. */
  @JSGlobal("Windows.Storage.Pickers.PickerViewMode")
  @js.native
  object PickerViewMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.Pickers.PickerViewMode with Double] = js.native
    
    /* 0 */ val list: typings.winrtUwp.Windows.Storage.Pickers.PickerViewMode.list with Double = js.native
    
    /* 1 */ val thumbnail: typings.winrtUwp.Windows.Storage.Pickers.PickerViewMode.thumbnail with Double = js.native
  }
  
  /** Provides support for apps that offer files through the file picker by participating in the File Open Picker contract, and for apps that act as a save location for files through file picker by participating in the File Save Picker contract or the Cached File Updater contract. */
  object Provider {
    
    /** Indicates the result of a call to the fileOpenPickerUI.addFile method. */
    @JSGlobal("Windows.Storage.Pickers.Provider.AddFileResult")
    @js.native
    object AddFileResult extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.Pickers.Provider.AddFileResult with Double] = js.native
      
      /* 0 */ val added: typings.winrtUwp.Windows.Storage.Pickers.Provider.AddFileResult.added with Double = js.native
      
      /* 1 */ val alreadyAdded: typings.winrtUwp.Windows.Storage.Pickers.Provider.AddFileResult.alreadyAdded with Double = js.native
      
      /* 2 */ val notAllowed: typings.winrtUwp.Windows.Storage.Pickers.Provider.AddFileResult.notAllowed with Double = js.native
      
      /* 3 */ val unavailable: typings.winrtUwp.Windows.Storage.Pickers.Provider.AddFileResult.unavailable with Double = js.native
    }
    
    /** Used to interact with the file picker if your app provides files with the File Open Picker contract. */
    @JSGlobal("Windows.Storage.Pickers.Provider.FileOpenPickerUI")
    @js.native
    abstract class FileOpenPickerUI ()
      extends typings.winrtUwp.Windows.Storage.Pickers.Provider.FileOpenPickerUI
    
    /** Provides information about a fileremoved event. */
    @JSGlobal("Windows.Storage.Pickers.Provider.FileRemovedEventArgs")
    @js.native
    abstract class FileRemovedEventArgs ()
      extends typings.winrtUwp.Windows.Storage.Pickers.Provider.FileRemovedEventArgs
    
    /** Used to interact with the file picker when your app provides a save location with the File Save Picker contract. */
    @JSGlobal("Windows.Storage.Pickers.Provider.FileSavePickerUI")
    @js.native
    abstract class FileSavePickerUI ()
      extends typings.winrtUwp.Windows.Storage.Pickers.Provider.FileSavePickerUI
    
    /** Indicates whether the file picker currently limits selection to single files, or if multiple files can be selected. */
    @JSGlobal("Windows.Storage.Pickers.Provider.FileSelectionMode")
    @js.native
    object FileSelectionMode extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.Pickers.Provider.FileSelectionMode with Double] = js.native
      
      /* 1 */ val multiple: typings.winrtUwp.Windows.Storage.Pickers.Provider.FileSelectionMode.multiple with Double = js.native
      
      /* 0 */ val single: typings.winrtUwp.Windows.Storage.Pickers.Provider.FileSelectionMode.single with Double = js.native
    }
    
    /** Use by an app that provides files to indicate asynchronously that the app is finished responding to a closing event. */
    @JSGlobal("Windows.Storage.Pickers.Provider.PickerClosingDeferral")
    @js.native
    abstract class PickerClosingDeferral ()
      extends typings.winrtUwp.Windows.Storage.Pickers.Provider.PickerClosingDeferral
    
    /** Provides information about a closing event. */
    @JSGlobal("Windows.Storage.Pickers.Provider.PickerClosingEventArgs")
    @js.native
    abstract class PickerClosingEventArgs ()
      extends typings.winrtUwp.Windows.Storage.Pickers.Provider.PickerClosingEventArgs
    
    /** Lets an app that provides files get the deadline for responding to a closing event and get a deferral so the app can respond to the event asynchronously. */
    @JSGlobal("Windows.Storage.Pickers.Provider.PickerClosingOperation")
    @js.native
    abstract class PickerClosingOperation ()
      extends typings.winrtUwp.Windows.Storage.Pickers.Provider.PickerClosingOperation
    
    /** Indicates the result of a call to the fileSavePickerUI.trySetFileName method. */
    @JSGlobal("Windows.Storage.Pickers.Provider.SetFileNameResult")
    @js.native
    object SetFileNameResult extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.Pickers.Provider.SetFileNameResult with Double] = js.native
      
      /* 1 */ val notAllowed: typings.winrtUwp.Windows.Storage.Pickers.Provider.SetFileNameResult.notAllowed with Double = js.native
      
      /* 0 */ val succeeded: typings.winrtUwp.Windows.Storage.Pickers.Provider.SetFileNameResult.succeeded with Double = js.native
      
      /* 2 */ val unavailable: typings.winrtUwp.Windows.Storage.Pickers.Provider.SetFileNameResult.unavailable with Double = js.native
    }
    
    /** Lets an app that provides a save location specify the storageFile that represents the file to save and get a deferral so the app can respond asynchronously to a targetFileRequested event. */
    @JSGlobal("Windows.Storage.Pickers.Provider.TargetFileRequest")
    @js.native
    abstract class TargetFileRequest ()
      extends typings.winrtUwp.Windows.Storage.Pickers.Provider.TargetFileRequest
    
    /** Used by an app that provides a save location to indicate asynchronously that the app is finished responding to a targetfilerequested event. */
    @JSGlobal("Windows.Storage.Pickers.Provider.TargetFileRequestDeferral")
    @js.native
    abstract class TargetFileRequestDeferral ()
      extends typings.winrtUwp.Windows.Storage.Pickers.Provider.TargetFileRequestDeferral
    
    /** Provides information about a targetfilerequested event. */
    @JSGlobal("Windows.Storage.Pickers.Provider.TargetFileRequestedEventArgs")
    @js.native
    abstract class TargetFileRequestedEventArgs ()
      extends typings.winrtUwp.Windows.Storage.Pickers.Provider.TargetFileRequestedEventArgs
  }
}
