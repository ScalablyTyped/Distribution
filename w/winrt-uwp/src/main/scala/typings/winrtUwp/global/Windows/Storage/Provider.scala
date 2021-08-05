package typings.winrtUwp.global.Windows.Storage

import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.Provider.CachedFileOptions
import typings.winrtUwp.Windows.Storage.Provider.FileUpdateStatus
import typings.winrtUwp.Windows.Storage.Provider.ReadActivationMode
import typings.winrtUwp.Windows.Storage.Provider.WriteActivationMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Allows apps to provide real-time updates to files through the Cached File Updater contract. */
object Provider {
  
  /** Describes when Windows will request an update to a file. */
  @JSGlobal("Windows.Storage.Provider.CachedFileOptions")
  @js.native
  object CachedFileOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.Provider.CachedFileOptions & Double] = js.native
    
    /* 3 */ val denyAccessWhenOffline: typings.winrtUwp.Windows.Storage.Provider.CachedFileOptions.denyAccessWhenOffline & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Storage.Provider.CachedFileOptions.none & Double = js.native
    
    /* 1 */ val requireUpdateOnAccess: typings.winrtUwp.Windows.Storage.Provider.CachedFileOptions.requireUpdateOnAccess & Double = js.native
    
    /* 2 */ val useCachedFileWhenOffline: typings.winrtUwp.Windows.Storage.Provider.CachedFileOptions.useCachedFileWhenOffline & Double = js.native
  }
  
  /** Indicates whether updates should be applied to the locally cached copy or the remote version of the file. */
  @JSGlobal("Windows.Storage.Provider.CachedFileTarget")
  @js.native
  object CachedFileTarget extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.Provider.CachedFileTarget & Double] = js.native
    
    /* 0 */ val local: typings.winrtUwp.Windows.Storage.Provider.CachedFileTarget.local & Double = js.native
    
    /* 1 */ val remote: typings.winrtUwp.Windows.Storage.Provider.CachedFileTarget.remote & Double = js.native
  }
  
  /** Manages files so that they can be updated in real-time by an app that participates in the Cached File Updater contract. */
  @JSGlobal("Windows.Storage.Provider.CachedFileUpdater")
  @js.native
  abstract class CachedFileUpdater ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.Provider.CachedFileUpdater
  object CachedFileUpdater {
    
    @JSGlobal("Windows.Storage.Provider.CachedFileUpdater")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Configures update policies for a local file.
      * @param file The local file.
      * @param contentId A unique identifier for the local file.
      * @param readMode A value that specifies whether Windows will request updates before the local file is read by other apps.
      * @param writeMode A value that specifies whether other apps can write to the local file and, if so, whether Windows will request updates after the local file is written.
      * @param options A value that specifies additional circumstances and behaviors for when Windows requests updates.
      */
    /* static member */
    inline def setUpdateInformation(
      file: IStorageFile,
      contentId: String,
      readMode: ReadActivationMode,
      writeMode: WriteActivationMode,
      options: CachedFileOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUpdateInformation")(file.asInstanceOf[js.Any], contentId.asInstanceOf[js.Any], readMode.asInstanceOf[js.Any], writeMode.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  /** Used to interact with the file picker if your app provides file updates through the Cached File Updater contract. */
  @JSGlobal("Windows.Storage.Provider.CachedFileUpdaterUI")
  @js.native
  abstract class CachedFileUpdaterUI ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.Provider.CachedFileUpdaterUI
  
  /** Provides information about a requested file update so that the app can complete the request. */
  @JSGlobal("Windows.Storage.Provider.FileUpdateRequest")
  @js.native
  abstract class FileUpdateRequest ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.Provider.FileUpdateRequest {
    
    /** Gets the unique identifier used to associate the local version of a file with the corresponding remote version. */
    /* CompleteClass */
    var contentId: String = js.native
    
    /** Gets a StorageFile object that represents the locally cached copy of the file to update. */
    /* CompleteClass */
    var file: typings.winrtUwp.Windows.Storage.StorageFile = js.native
    
    /**
      * Gets an object used to complete an update asynchronously.
      * @return The object that the app uses to indicate, asynchronously, that it has finished responding to a FileUpdateRequested event and that the Request is complete.
      */
    /* CompleteClass */
    override def getDeferral(): typings.winrtUwp.Windows.Storage.Provider.FileUpdateRequestDeferral = js.native
    
    /** Gets or sets the status of the update. This property is set in response to a FileUpdateRequested event. */
    /* CompleteClass */
    var status: FileUpdateStatus = js.native
    
    /**
      * Provide a new version of the local file to represent the remote file.
      * @param value The new version of the local file that will represent remote file.
      */
    /* CompleteClass */
    override def updateLocalFile(value: IStorageFile): Unit = js.native
    
    /** Gets or sets a message to the user indicating that user input is needed to complete the FileUpdateRequest . */
    /* CompleteClass */
    var userInputNeededMessage: String = js.native
  }
  
  /** Use to complete an update asynchronously. */
  @JSGlobal("Windows.Storage.Provider.FileUpdateRequestDeferral")
  @js.native
  abstract class FileUpdateRequestDeferral ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.Provider.FileUpdateRequestDeferral {
    
    /** Signals that the response to a FileUpdateRequested event is finished. */
    /* CompleteClass */
    override def complete(): Unit = js.native
  }
  
  /** Provides information about a FileUpdateRequested event. */
  @JSGlobal("Windows.Storage.Provider.FileUpdateRequestedEventArgs")
  @js.native
  abstract class FileUpdateRequestedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.Provider.FileUpdateRequestedEventArgs {
    
    /** Gets the details of the requested file update. */
    /* CompleteClass */
    var request: typings.winrtUwp.Windows.Storage.Provider.FileUpdateRequest = js.native
  }
  
  /** Describes the status of a file update request. */
  @JSGlobal("Windows.Storage.Provider.FileUpdateStatus")
  @js.native
  object FileUpdateStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.Provider.FileUpdateStatus & Double] = js.native
    
    /* 1 */ val complete: typings.winrtUwp.Windows.Storage.Provider.FileUpdateStatus.complete & Double = js.native
    
    /* 5 */ val completeAndRenamed: typings.winrtUwp.Windows.Storage.Provider.FileUpdateStatus.completeAndRenamed & Double = js.native
    
    /* 3 */ val currentlyUnavailable: typings.winrtUwp.Windows.Storage.Provider.FileUpdateStatus.currentlyUnavailable & Double = js.native
    
    /* 4 */ val failed: typings.winrtUwp.Windows.Storage.Provider.FileUpdateStatus.failed & Double = js.native
    
    /* 0 */ val incomplete: typings.winrtUwp.Windows.Storage.Provider.FileUpdateStatus.incomplete & Double = js.native
    
    /* 2 */ val userInputNeeded: typings.winrtUwp.Windows.Storage.Provider.FileUpdateStatus.userInputNeeded & Double = js.native
  }
  
  /** Indicates when Windows will request a file update if another app reads the locally cached version of the file. */
  @JSGlobal("Windows.Storage.Provider.ReadActivationMode")
  @js.native
  object ReadActivationMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.Provider.ReadActivationMode & Double] = js.native
    
    /* 1 */ val beforeAccess: typings.winrtUwp.Windows.Storage.Provider.ReadActivationMode.beforeAccess & Double = js.native
    
    /* 0 */ val notNeeded: typings.winrtUwp.Windows.Storage.Provider.ReadActivationMode.notNeeded & Double = js.native
  }
  
  /** Indicates the status of the file picker UI. */
  @JSGlobal("Windows.Storage.Provider.UIStatus")
  @js.native
  object UIStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.Provider.UIStatus & Double] = js.native
    
    /* 3 */ val complete: typings.winrtUwp.Windows.Storage.Provider.UIStatus.complete & Double = js.native
    
    /* 1 */ val hidden: typings.winrtUwp.Windows.Storage.Provider.UIStatus.hidden & Double = js.native
    
    /* 0 */ val unavailable: typings.winrtUwp.Windows.Storage.Provider.UIStatus.unavailable & Double = js.native
    
    /* 2 */ val visible: typings.winrtUwp.Windows.Storage.Provider.UIStatus.visible & Double = js.native
  }
  
  /** Indicates whether other apps can write to the locally cached version of the file and when Windows will request an update if another app writes to that local file. */
  @JSGlobal("Windows.Storage.Provider.WriteActivationMode")
  @js.native
  object WriteActivationMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.Provider.WriteActivationMode & Double] = js.native
    
    /* 2 */ val afterWrite: typings.winrtUwp.Windows.Storage.Provider.WriteActivationMode.afterWrite & Double = js.native
    
    /* 1 */ val notNeeded: typings.winrtUwp.Windows.Storage.Provider.WriteActivationMode.notNeeded & Double = js.native
    
    /* 0 */ val readOnly: typings.winrtUwp.Windows.Storage.Provider.WriteActivationMode.readOnly & Double = js.native
  }
}
