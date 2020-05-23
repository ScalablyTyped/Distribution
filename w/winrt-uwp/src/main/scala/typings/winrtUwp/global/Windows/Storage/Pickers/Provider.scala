package typings.winrtUwp.global.Windows.Storage.Pickers

import typings.std.Date
import typings.winrtUwp.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides support for apps that offer files through the file picker by participating in the File Open Picker contract, and for apps that act as a save location for files through file picker by participating in the File Save Picker contract or the Cached File Updater contract. */
@JSGlobal("Windows.Storage.Pickers.Provider")
@js.native
object Provider extends js.Object {
  /** Used to interact with the file picker if your app provides files with the File Open Picker contract. */
  @js.native
  abstract class FileOpenPickerUI ()
    extends typings.winrtUwp.Windows.Storage.Pickers.Provider.FileOpenPickerUI
  
  /** Provides information about a fileremoved event. */
  @js.native
  abstract class FileRemovedEventArgs ()
    extends typings.winrtUwp.Windows.Storage.Pickers.Provider.FileRemovedEventArgs {
    /** Gets the identifier of the file that the user removed from the list of chosen files in the file picker. This identifier was set by the providing app when it added the files to the list of chosen files. */
    /* CompleteClass */
    override var id: String = js.native
  }
  
  /** Used to interact with the file picker when your app provides a save location with the File Save Picker contract. */
  @js.native
  abstract class FileSavePickerUI ()
    extends typings.winrtUwp.Windows.Storage.Pickers.Provider.FileSavePickerUI
  
  /** Use by an app that provides files to indicate asynchronously that the app is finished responding to a closing event. */
  @js.native
  abstract class PickerClosingDeferral ()
    extends typings.winrtUwp.Windows.Storage.Pickers.Provider.PickerClosingDeferral {
    /** Signals that the app providing files has finished responding to a closing event. */
    /* CompleteClass */
    override def complete(): Unit = js.native
  }
  
  /** Provides information about a closing event. */
  @js.native
  abstract class PickerClosingEventArgs ()
    extends typings.winrtUwp.Windows.Storage.Pickers.Provider.PickerClosingEventArgs {
    /** Gets a pickerClosingOperation object that is used to respond to a closing event. */
    /* CompleteClass */
    override var closingOperation: typings.winrtUwp.Windows.Storage.Pickers.Provider.PickerClosingOperation = js.native
    /** Gets a value that indicates whether the file picker is closing because the user cancelled it. */
    /* CompleteClass */
    override var isCanceled: Boolean = js.native
  }
  
  /** Lets an app that provides files get the deadline for responding to a closing event and get a deferral so the app can respond to the event asynchronously. */
  @js.native
  abstract class PickerClosingOperation ()
    extends typings.winrtUwp.Windows.Storage.Pickers.Provider.PickerClosingOperation {
    /** Gets a dateTime object that indicates when the system will shut down the app that is providing files through the file picker without further notice. */
    /* CompleteClass */
    override var deadline: Date = js.native
    /**
      * Gets a pickerClosingDeferral that the app providing files through the file picker can use to respond asynchronously to a closing event.
      * @return The pickerClosingDeferral that the app providing files through the file picker can use to respond asynchronously to a closing event.
      */
    /* CompleteClass */
    override def getDeferral(): typings.winrtUwp.Windows.Storage.Pickers.Provider.PickerClosingDeferral = js.native
  }
  
  /** Lets an app that provides a save location specify the storageFile that represents the file to save and get a deferral so the app can respond asynchronously to a targetFileRequested event. */
  @js.native
  abstract class TargetFileRequest ()
    extends typings.winrtUwp.Windows.Storage.Pickers.Provider.TargetFileRequest {
    /** Gets or sets the IStorageFile object that is provided to represent the file to save by the app that is providing the save location. */
    /* CompleteClass */
    override var targetFile: IStorageFile = js.native
    /**
      * Gets a targetFileRequestDeferral that the app providing the save location can use to respond asynchronously to a targetfilerequested event.
      * @return The targetFileRequestDeferral that the providing app can use asynchronously to indicate that it is finished responding to a targetfilerequested event.
      */
    /* CompleteClass */
    override def getDeferral(): typings.winrtUwp.Windows.Storage.Pickers.Provider.TargetFileRequestDeferral = js.native
  }
  
  /** Used by an app that provides a save location to indicate asynchronously that the app is finished responding to a targetfilerequested event. */
  @js.native
  abstract class TargetFileRequestDeferral ()
    extends typings.winrtUwp.Windows.Storage.Pickers.Provider.TargetFileRequestDeferral {
    /** Signals that the app providing the save location finished responding to a targetfilerequested event. */
    /* CompleteClass */
    override def complete(): Unit = js.native
  }
  
  /** Provides information about a targetfilerequested event. */
  @js.native
  abstract class TargetFileRequestedEventArgs ()
    extends typings.winrtUwp.Windows.Storage.Pickers.Provider.TargetFileRequestedEventArgs {
    /** Gets a targetFileRequest object that is used to respond to a targetfilerequested event. */
    /* CompleteClass */
    override var request: typings.winrtUwp.Windows.Storage.Pickers.Provider.TargetFileRequest = js.native
  }
  
  /** Indicates the result of a call to the fileOpenPickerUI.addFile method. */
  @js.native
  object AddFileResult extends js.Object {
    /* 0 */ val added: typings.winrtUwp.Windows.Storage.Pickers.Provider.AddFileResult.added with Double = js.native
    /* 1 */ val alreadyAdded: typings.winrtUwp.Windows.Storage.Pickers.Provider.AddFileResult.alreadyAdded with Double = js.native
    /* 2 */ val notAllowed: typings.winrtUwp.Windows.Storage.Pickers.Provider.AddFileResult.notAllowed with Double = js.native
    /* 3 */ val unavailable: typings.winrtUwp.Windows.Storage.Pickers.Provider.AddFileResult.unavailable with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.Pickers.Provider.AddFileResult with Double] = js.native
  }
  
  /** Indicates whether the file picker currently limits selection to single files, or if multiple files can be selected. */
  @js.native
  object FileSelectionMode extends js.Object {
    /* 1 */ val multiple: typings.winrtUwp.Windows.Storage.Pickers.Provider.FileSelectionMode.multiple with Double = js.native
    /* 0 */ val single: typings.winrtUwp.Windows.Storage.Pickers.Provider.FileSelectionMode.single with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.Pickers.Provider.FileSelectionMode with Double] = js.native
  }
  
  /** Indicates the result of a call to the fileSavePickerUI.trySetFileName method. */
  @js.native
  object SetFileNameResult extends js.Object {
    /* 1 */ val notAllowed: typings.winrtUwp.Windows.Storage.Pickers.Provider.SetFileNameResult.notAllowed with Double = js.native
    /* 0 */ val succeeded: typings.winrtUwp.Windows.Storage.Pickers.Provider.SetFileNameResult.succeeded with Double = js.native
    /* 2 */ val unavailable: typings.winrtUwp.Windows.Storage.Pickers.Provider.SetFileNameResult.unavailable with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.Pickers.Provider.SetFileNameResult with Double] = js.native
  }
  
}

