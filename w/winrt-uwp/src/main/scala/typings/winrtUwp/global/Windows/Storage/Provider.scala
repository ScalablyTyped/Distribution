package typings.winrtUwp.global.Windows.Storage

import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.Provider.CachedFileOptions
import typings.winrtUwp.Windows.Storage.Provider.FileUpdateStatus
import typings.winrtUwp.Windows.Storage.Provider.ReadActivationMode
import typings.winrtUwp.Windows.Storage.Provider.WriteActivationMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Allows apps to provide real-time updates to files through the Cached File Updater contract. */
@JSGlobal("Windows.Storage.Provider")
@js.native
object Provider extends js.Object {
  /** Manages files so that they can be updated in real-time by an app that participates in the Cached File Updater contract. */
  @js.native
  abstract class CachedFileUpdater ()
    extends typings.winrtUwp.Windows.Storage.Provider.CachedFileUpdater
  
  /** Used to interact with the file picker if your app provides file updates through the Cached File Updater contract. */
  @js.native
  abstract class CachedFileUpdaterUI ()
    extends typings.winrtUwp.Windows.Storage.Provider.CachedFileUpdaterUI
  
  /** Provides information about a requested file update so that the app can complete the request. */
  @js.native
  abstract class FileUpdateRequest ()
    extends typings.winrtUwp.Windows.Storage.Provider.FileUpdateRequest {
    /** Gets the unique identifier used to associate the local version of a file with the corresponding remote version. */
    /* CompleteClass */
    override var contentId: String = js.native
    /** Gets a StorageFile object that represents the locally cached copy of the file to update. */
    /* CompleteClass */
    override var file: typings.winrtUwp.Windows.Storage.StorageFile = js.native
    /** Gets or sets the status of the update. This property is set in response to a FileUpdateRequested event. */
    /* CompleteClass */
    override var status: FileUpdateStatus = js.native
    /** Gets or sets a message to the user indicating that user input is needed to complete the FileUpdateRequest . */
    /* CompleteClass */
    override var userInputNeededMessage: String = js.native
    /**
      * Gets an object used to complete an update asynchronously.
      * @return The object that the app uses to indicate, asynchronously, that it has finished responding to a FileUpdateRequested event and that the Request is complete.
      */
    /* CompleteClass */
    override def getDeferral(): typings.winrtUwp.Windows.Storage.Provider.FileUpdateRequestDeferral = js.native
    /**
      * Provide a new version of the local file to represent the remote file.
      * @param value The new version of the local file that will represent remote file.
      */
    /* CompleteClass */
    override def updateLocalFile(value: IStorageFile): Unit = js.native
  }
  
  /** Use to complete an update asynchronously. */
  @js.native
  abstract class FileUpdateRequestDeferral ()
    extends typings.winrtUwp.Windows.Storage.Provider.FileUpdateRequestDeferral {
    /** Signals that the response to a FileUpdateRequested event is finished. */
    /* CompleteClass */
    override def complete(): Unit = js.native
  }
  
  /** Provides information about a FileUpdateRequested event. */
  @js.native
  abstract class FileUpdateRequestedEventArgs ()
    extends typings.winrtUwp.Windows.Storage.Provider.FileUpdateRequestedEventArgs {
    /** Gets the details of the requested file update. */
    /* CompleteClass */
    override var request: typings.winrtUwp.Windows.Storage.Provider.FileUpdateRequest = js.native
  }
  
  /** Describes when Windows will request an update to a file. */
  @js.native
  object CachedFileOptions extends js.Object {
    /* 3 */ val denyAccessWhenOffline: typings.winrtUwp.Windows.Storage.Provider.CachedFileOptions.denyAccessWhenOffline with Double = js.native
    /* 0 */ val none: typings.winrtUwp.Windows.Storage.Provider.CachedFileOptions.none with Double = js.native
    /* 1 */ val requireUpdateOnAccess: typings.winrtUwp.Windows.Storage.Provider.CachedFileOptions.requireUpdateOnAccess with Double = js.native
    /* 2 */ val useCachedFileWhenOffline: typings.winrtUwp.Windows.Storage.Provider.CachedFileOptions.useCachedFileWhenOffline with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.Provider.CachedFileOptions with Double] = js.native
  }
  
  /** Indicates whether updates should be applied to the locally cached copy or the remote version of the file. */
  @js.native
  object CachedFileTarget extends js.Object {
    /* 0 */ val local: typings.winrtUwp.Windows.Storage.Provider.CachedFileTarget.local with Double = js.native
    /* 1 */ val remote: typings.winrtUwp.Windows.Storage.Provider.CachedFileTarget.remote with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.Provider.CachedFileTarget with Double] = js.native
  }
  
  /* static members */
  @js.native
  object CachedFileUpdater extends js.Object {
    /**
      * Configures update policies for a local file.
      * @param file The local file.
      * @param contentId A unique identifier for the local file.
      * @param readMode A value that specifies whether Windows will request updates before the local file is read by other apps.
      * @param writeMode A value that specifies whether other apps can write to the local file and, if so, whether Windows will request updates after the local file is written.
      * @param options A value that specifies additional circumstances and behaviors for when Windows requests updates.
      */
    def setUpdateInformation(
      file: IStorageFile,
      contentId: String,
      readMode: ReadActivationMode,
      writeMode: WriteActivationMode,
      options: CachedFileOptions
    ): Unit = js.native
  }
  
  /** Describes the status of a file update request. */
  @js.native
  object FileUpdateStatus extends js.Object {
    /* 1 */ val complete: typings.winrtUwp.Windows.Storage.Provider.FileUpdateStatus.complete with Double = js.native
    /* 5 */ val completeAndRenamed: typings.winrtUwp.Windows.Storage.Provider.FileUpdateStatus.completeAndRenamed with Double = js.native
    /* 3 */ val currentlyUnavailable: typings.winrtUwp.Windows.Storage.Provider.FileUpdateStatus.currentlyUnavailable with Double = js.native
    /* 4 */ val failed: typings.winrtUwp.Windows.Storage.Provider.FileUpdateStatus.failed with Double = js.native
    /* 0 */ val incomplete: typings.winrtUwp.Windows.Storage.Provider.FileUpdateStatus.incomplete with Double = js.native
    /* 2 */ val userInputNeeded: typings.winrtUwp.Windows.Storage.Provider.FileUpdateStatus.userInputNeeded with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.Provider.FileUpdateStatus with Double] = js.native
  }
  
  /** Indicates when Windows will request a file update if another app reads the locally cached version of the file. */
  @js.native
  object ReadActivationMode extends js.Object {
    /* 1 */ val beforeAccess: typings.winrtUwp.Windows.Storage.Provider.ReadActivationMode.beforeAccess with Double = js.native
    /* 0 */ val notNeeded: typings.winrtUwp.Windows.Storage.Provider.ReadActivationMode.notNeeded with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.Provider.ReadActivationMode with Double] = js.native
  }
  
  /** Indicates the status of the file picker UI. */
  @js.native
  object UIStatus extends js.Object {
    /* 3 */ val complete: typings.winrtUwp.Windows.Storage.Provider.UIStatus.complete with Double = js.native
    /* 1 */ val hidden: typings.winrtUwp.Windows.Storage.Provider.UIStatus.hidden with Double = js.native
    /* 0 */ val unavailable: typings.winrtUwp.Windows.Storage.Provider.UIStatus.unavailable with Double = js.native
    /* 2 */ val visible: typings.winrtUwp.Windows.Storage.Provider.UIStatus.visible with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.Provider.UIStatus with Double] = js.native
  }
  
  /** Indicates whether other apps can write to the locally cached version of the file and when Windows will request an update if another app writes to that local file. */
  @js.native
  object WriteActivationMode extends js.Object {
    /* 2 */ val afterWrite: typings.winrtUwp.Windows.Storage.Provider.WriteActivationMode.afterWrite with Double = js.native
    /* 1 */ val notNeeded: typings.winrtUwp.Windows.Storage.Provider.WriteActivationMode.notNeeded with Double = js.native
    /* 0 */ val readOnly: typings.winrtUwp.Windows.Storage.Provider.WriteActivationMode.readOnly with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.Provider.WriteActivationMode with Double] = js.native
  }
  
}

