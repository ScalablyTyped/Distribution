package typings.winrtUwp.Windows.Storage.Pickers

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.closing
import typings.winrtUwp.winrtUwpStrings.filenamechanged
import typings.winrtUwp.winrtUwpStrings.fileremoved
import typings.winrtUwp.winrtUwpStrings.targetfilerequested
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides support for apps that offer files through the file picker by participating in the File Open Picker contract, and for apps that act as a save location for files through file picker by participating in the File Save Picker contract or the Cached File Updater contract. */
object Provider {
  
  @js.native
  sealed trait AddFileResult extends StObject
  /** Indicates the result of a call to the fileOpenPickerUI.addFile method. */
  @JSGlobal("Windows.Storage.Pickers.Provider.AddFileResult")
  @js.native
  object AddFileResult extends StObject {
    
    /** The file was successfully added to the file picker UI. */
    @js.native
    sealed trait added
      extends StObject
         with AddFileResult
    
    /** The file was already in the file picker UI. */
    @js.native
    sealed trait alreadyAdded
      extends StObject
         with AddFileResult
    
    /** The file wasn't added because it is not one of the allowed file types. */
    @js.native
    sealed trait notAllowed
      extends StObject
         with AddFileResult
    
    /** The file wasn't added because the file picker UI is unavailable. The file picker UI is only available while the user is interacting with your app. */
    @js.native
    sealed trait unavailable
      extends StObject
         with AddFileResult
  }
  
  @js.native
  sealed trait FileSelectionMode extends StObject
  /** Indicates whether the file picker currently limits selection to single files, or if multiple files can be selected. */
  @JSGlobal("Windows.Storage.Pickers.Provider.FileSelectionMode")
  @js.native
  object FileSelectionMode extends StObject {
    
    /** Multiple files can be selected. */
    @js.native
    sealed trait multiple
      extends StObject
         with FileSelectionMode
    
    /** Only a single file can be selected. */
    @js.native
    sealed trait single
      extends StObject
         with FileSelectionMode
  }
  
  @js.native
  sealed trait SetFileNameResult extends StObject
  /** Indicates the result of a call to the fileSavePickerUI.trySetFileName method. */
  @JSGlobal("Windows.Storage.Pickers.Provider.SetFileNameResult")
  @js.native
  object SetFileNameResult extends StObject {
    
    /** The file name and extension were not updated because the extension wasn't one of the allowedFileTypes . */
    @js.native
    sealed trait notAllowed
      extends StObject
         with SetFileNameResult
    
    /** The file name and extension were updated successfully. */
    @js.native
    sealed trait succeeded
      extends StObject
         with SetFileNameResult
    
    /** The file name and extension were not updated because the file picker UI wasn't available. The file picker UI is only available while the user is interacting with your app. */
    @js.native
    sealed trait unavailable
      extends StObject
         with SetFileNameResult
  }
  
  /** Used to interact with the file picker if your app provides files with the File Open Picker contract. */
  @js.native
  trait FileOpenPickerUI extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_closing(`type`: closing, listener: TypedEventHandler[FileOpenPickerUI, PickerClosingEventArgs]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_fileremoved(`type`: fileremoved, listener: TypedEventHandler[FileOpenPickerUI, FileRemovedEventArgs]): Unit = js.native
    
    /**
      * Adds the specified file to the list of files that the user has chosen.
      * @param id A unique identifier of the file to add.
      * @param file The file to add to the list of files that the user has chosen.
      * @return The enumeration value that indicates the result of this addFile method.
      */
    def addFile(id: String, file: IStorageFile): AddFileResult = js.native
    
    /** Gets a list of file types (extensions) that the user can choose. */
    var allowedFileTypes: IVectorView[String] = js.native
    
    /**
      * Indicates whether the specified file can be added to the list of files the user has chosen.
      * @param file The file to test.
      * @return True if the file can be added to the file picker UI; otherwise false.
      */
    def canAddFile(file: IStorageFile): Boolean = js.native
    
    /**
      * Determines whether the specified file is in the list of files that the user has chosen.
      * @param id The identifier of the file.
      * @return True if the file is in the basket; otherwise false.
      */
    def containsFile(id: String): Boolean = js.native
    
    /** Fires when the user closes the file picker. */
    def onclosing(ev: PickerClosingEventArgs & WinRTEvent[FileOpenPickerUI]): Unit = js.native
    /** Fires when the user closes the file picker. */
    @JSName("onclosing")
    var onclosing_Original: TypedEventHandler[FileOpenPickerUI, PickerClosingEventArgs] = js.native
    
    /** Fires when the user removes a file from the list of files that the user has chosen if that file was added by the app that is providing files. */
    def onfileremoved(ev: FileRemovedEventArgs & WinRTEvent[FileOpenPickerUI]): Unit = js.native
    /** Fires when the user removes a file from the list of files that the user has chosen if that file was added by the app that is providing files. */
    @JSName("onfileremoved")
    var onfileremoved_Original: TypedEventHandler[FileOpenPickerUI, FileRemovedEventArgs] = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_closing(`type`: closing, listener: TypedEventHandler[FileOpenPickerUI, PickerClosingEventArgs]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_fileremoved(`type`: fileremoved, listener: TypedEventHandler[FileOpenPickerUI, FileRemovedEventArgs]): Unit = js.native
    
    /**
      * Removes the specified file from the list of files the user has chosen.
      * @param id The identifier of the file to remove.
      */
    def removeFile(id: String): Unit = js.native
    
    /** Gets an enumeration value that indicates whether the file picker currently limits selection to single files, or if multiple files can be selected. */
    var selectionMode: FileSelectionMode = js.native
    
    /** Gets an identifier for the current context of the file picker. */
    var settingsIdentifier: String = js.native
    
    /** Gets or sets a title to display in the file picker UI that identifies the location that the file picker is displaying to the user. */
    var title: String = js.native
  }
  
  /** Provides information about a fileremoved event. */
  trait FileRemovedEventArgs extends StObject {
    
    /** Gets the identifier of the file that the user removed from the list of chosen files in the file picker. This identifier was set by the providing app when it added the files to the list of chosen files. */
    var id: String
  }
  object FileRemovedEventArgs {
    
    @scala.inline
    def apply(id: String): FileRemovedEventArgs = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileRemovedEventArgs]
    }
    
    @scala.inline
    implicit class FileRemovedEventArgsMutableBuilder[Self <: FileRemovedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  /** Used to interact with the file picker when your app provides a save location with the File Save Picker contract. */
  @js.native
  trait FileSavePickerUI extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_filenamechanged(`type`: filenamechanged, listener: TypedEventHandler[FileSavePickerUI, js.Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_targetfilerequested(
      `type`: targetfilerequested,
      listener: TypedEventHandler[FileSavePickerUI, TargetFileRequestedEventArgs]
    ): Unit = js.native
    
    /** Gets a list of file types (extensions) that can be saved to the app that is providing the save location. */
    var allowedFileTypes: IVectorView[String] = js.native
    
    /** Gets the full file name of the file to save, including the file type extension. The file name and extension are specified by the user. */
    var fileName: String = js.native
    
    /** Fired when the user changes the file name in the file name text box or changes the extension in the file type drop-down menu. */
    def onfilenamechanged(ev: js.Any & WinRTEvent[FileSavePickerUI]): Unit = js.native
    /** Fired when the user changes the file name in the file name text box or changes the extension in the file type drop-down menu. */
    @JSName("onfilenamechanged")
    var onfilenamechanged_Original: TypedEventHandler[FileSavePickerUI, js.Any] = js.native
    
    /** Fires when the user commits a file to be saved in the file picker. */
    def ontargetfilerequested(ev: TargetFileRequestedEventArgs & WinRTEvent[FileSavePickerUI]): Unit = js.native
    /** Fires when the user commits a file to be saved in the file picker. */
    @JSName("ontargetfilerequested")
    var ontargetfilerequested_Original: TypedEventHandler[FileSavePickerUI, TargetFileRequestedEventArgs] = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_filenamechanged(`type`: filenamechanged, listener: TypedEventHandler[FileSavePickerUI, js.Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_targetfilerequested(
      `type`: targetfilerequested,
      listener: TypedEventHandler[FileSavePickerUI, TargetFileRequestedEventArgs]
    ): Unit = js.native
    
    /** Gets an identifier for the current context of the file picker. */
    var settingsIdentifier: String = js.native
    
    /** Gets or sets a title to display in the file picker UI that identifies the location that the file picker is displaying to the user. */
    var title: String = js.native
    
    /**
      * Tries to set the file name and extension in the file picker UI.
      * @param value The file name and extension that are used to update the file name text box and file type drop-down menu in the file picker UI.
      * @return The enumeration value that indicates whether the file name and extension were updated in the file picker UI.
      */
    def trySetFileName(value: String): SetFileNameResult = js.native
  }
  
  /** Use by an app that provides files to indicate asynchronously that the app is finished responding to a closing event. */
  trait PickerClosingDeferral extends StObject {
    
    /** Signals that the app providing files has finished responding to a closing event. */
    def complete(): Unit
  }
  object PickerClosingDeferral {
    
    @scala.inline
    def apply(complete: () => Unit): PickerClosingDeferral = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
      __obj.asInstanceOf[PickerClosingDeferral]
    }
    
    @scala.inline
    implicit class PickerClosingDeferralMutableBuilder[Self <: PickerClosingDeferral] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    }
  }
  
  /** Provides information about a closing event. */
  trait PickerClosingEventArgs extends StObject {
    
    /** Gets a pickerClosingOperation object that is used to respond to a closing event. */
    var closingOperation: PickerClosingOperation
    
    /** Gets a value that indicates whether the file picker is closing because the user cancelled it. */
    var isCanceled: Boolean
  }
  object PickerClosingEventArgs {
    
    @scala.inline
    def apply(closingOperation: PickerClosingOperation, isCanceled: Boolean): PickerClosingEventArgs = {
      val __obj = js.Dynamic.literal(closingOperation = closingOperation.asInstanceOf[js.Any], isCanceled = isCanceled.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickerClosingEventArgs]
    }
    
    @scala.inline
    implicit class PickerClosingEventArgsMutableBuilder[Self <: PickerClosingEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClosingOperation(value: PickerClosingOperation): Self = StObject.set(x, "closingOperation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCanceled(value: Boolean): Self = StObject.set(x, "isCanceled", value.asInstanceOf[js.Any])
    }
  }
  
  /** Lets an app that provides files get the deadline for responding to a closing event and get a deferral so the app can respond to the event asynchronously. */
  trait PickerClosingOperation extends StObject {
    
    /** Gets a dateTime object that indicates when the system will shut down the app that is providing files through the file picker without further notice. */
    var deadline: Date
    
    /**
      * Gets a pickerClosingDeferral that the app providing files through the file picker can use to respond asynchronously to a closing event.
      * @return The pickerClosingDeferral that the app providing files through the file picker can use to respond asynchronously to a closing event.
      */
    def getDeferral(): PickerClosingDeferral
  }
  object PickerClosingOperation {
    
    @scala.inline
    def apply(deadline: Date, getDeferral: () => PickerClosingDeferral): PickerClosingOperation = {
      val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral))
      __obj.asInstanceOf[PickerClosingOperation]
    }
    
    @scala.inline
    implicit class PickerClosingOperationMutableBuilder[Self <: PickerClosingOperation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeadline(value: Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetDeferral(value: () => PickerClosingDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    }
  }
  
  /** Lets an app that provides a save location specify the storageFile that represents the file to save and get a deferral so the app can respond asynchronously to a targetFileRequested event. */
  trait TargetFileRequest extends StObject {
    
    /**
      * Gets a targetFileRequestDeferral that the app providing the save location can use to respond asynchronously to a targetfilerequested event.
      * @return The targetFileRequestDeferral that the providing app can use asynchronously to indicate that it is finished responding to a targetfilerequested event.
      */
    def getDeferral(): TargetFileRequestDeferral
    
    /** Gets or sets the IStorageFile object that is provided to represent the file to save by the app that is providing the save location. */
    var targetFile: IStorageFile
  }
  object TargetFileRequest {
    
    @scala.inline
    def apply(getDeferral: () => TargetFileRequestDeferral, targetFile: IStorageFile): TargetFileRequest = {
      val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), targetFile = targetFile.asInstanceOf[js.Any])
      __obj.asInstanceOf[TargetFileRequest]
    }
    
    @scala.inline
    implicit class TargetFileRequestMutableBuilder[Self <: TargetFileRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetDeferral(value: () => TargetFileRequestDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTargetFile(value: IStorageFile): Self = StObject.set(x, "targetFile", value.asInstanceOf[js.Any])
    }
  }
  
  /** Used by an app that provides a save location to indicate asynchronously that the app is finished responding to a targetfilerequested event. */
  trait TargetFileRequestDeferral extends StObject {
    
    /** Signals that the app providing the save location finished responding to a targetfilerequested event. */
    def complete(): Unit
  }
  object TargetFileRequestDeferral {
    
    @scala.inline
    def apply(complete: () => Unit): TargetFileRequestDeferral = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
      __obj.asInstanceOf[TargetFileRequestDeferral]
    }
    
    @scala.inline
    implicit class TargetFileRequestDeferralMutableBuilder[Self <: TargetFileRequestDeferral] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    }
  }
  
  /** Provides information about a targetfilerequested event. */
  trait TargetFileRequestedEventArgs extends StObject {
    
    /** Gets a targetFileRequest object that is used to respond to a targetfilerequested event. */
    var request: TargetFileRequest
  }
  object TargetFileRequestedEventArgs {
    
    @scala.inline
    def apply(request: TargetFileRequest): TargetFileRequestedEventArgs = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[TargetFileRequestedEventArgs]
    }
    
    @scala.inline
    implicit class TargetFileRequestedEventArgsMutableBuilder[Self <: TargetFileRequestedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequest(value: TargetFileRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
}
