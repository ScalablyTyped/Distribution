package typings.winrt.global.Windows.Storage

import typings.winrt.Windows.Storage.IStorageFile
import typings.winrt.Windows.Storage.Provider.CachedFileOptions
import typings.winrt.Windows.Storage.Provider.CachedFileTarget
import typings.winrt.Windows.Storage.Provider.FileUpdateStatus
import typings.winrt.Windows.Storage.Provider.ReadActivationMode
import typings.winrt.Windows.Storage.Provider.UIStatus
import typings.winrt.Windows.Storage.Provider.WriteActivationMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Provider {
  
  @JSGlobal("Windows.Storage.Provider.CachedFileOptions")
  @js.native
  object CachedFileOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.Provider.CachedFileOptions & Double] = js.native
    
    /* 3 */ val denyAccessWhenOffline: typings.winrt.Windows.Storage.Provider.CachedFileOptions.denyAccessWhenOffline & Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.Storage.Provider.CachedFileOptions.none & Double = js.native
    
    /* 1 */ val requireUpdateOnAccess: typings.winrt.Windows.Storage.Provider.CachedFileOptions.requireUpdateOnAccess & Double = js.native
    
    /* 2 */ val useCachedFileWhenOffline: typings.winrt.Windows.Storage.Provider.CachedFileOptions.useCachedFileWhenOffline & Double = js.native
  }
  
  @JSGlobal("Windows.Storage.Provider.CachedFileTarget")
  @js.native
  object CachedFileTarget extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.Provider.CachedFileTarget & Double] = js.native
    
    /* 0 */ val local: typings.winrt.Windows.Storage.Provider.CachedFileTarget.local & Double = js.native
    
    /* 1 */ val remote: typings.winrt.Windows.Storage.Provider.CachedFileTarget.remote & Double = js.native
  }
  
  @JSGlobal("Windows.Storage.Provider.CachedFileUpdater")
  @js.native
  class CachedFileUpdater ()
    extends StObject
       with typings.winrt.Windows.Storage.Provider.CachedFileUpdater
  /* static members */
  object CachedFileUpdater {
    
    @JSGlobal("Windows.Storage.Provider.CachedFileUpdater")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def setUpdateInformation(
      file: IStorageFile,
      contentId: String,
      readMode: ReadActivationMode,
      writeMode: WriteActivationMode,
      options: CachedFileOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUpdateInformation")(file.asInstanceOf[js.Any], contentId.asInstanceOf[js.Any], readMode.asInstanceOf[js.Any], writeMode.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSGlobal("Windows.Storage.Provider.CachedFileUpdaterUI")
  @js.native
  class CachedFileUpdaterUI ()
    extends StObject
       with typings.winrt.Windows.Storage.Provider.CachedFileUpdaterUI {
    
    /* CompleteClass */
    var onfileupdaterequested: js.Any = js.native
    
    /* CompleteClass */
    var onuirequested: js.Any = js.native
    
    /* CompleteClass */
    var title: String = js.native
    
    /* CompleteClass */
    var uIStatus: UIStatus = js.native
    
    /* CompleteClass */
    var updateTarget: CachedFileTarget = js.native
  }
  
  @JSGlobal("Windows.Storage.Provider.FileUpdateRequest")
  @js.native
  class FileUpdateRequest ()
    extends StObject
       with typings.winrt.Windows.Storage.Provider.FileUpdateRequest {
    
    /* CompleteClass */
    var contentId: String = js.native
    
    /* CompleteClass */
    var file: typings.winrt.Windows.Storage.StorageFile = js.native
    
    /* CompleteClass */
    override def getDeferral(): typings.winrt.Windows.Storage.Provider.FileUpdateRequestDeferral = js.native
    
    /* CompleteClass */
    var status: FileUpdateStatus = js.native
    
    /* CompleteClass */
    override def updateLocalFile(value: IStorageFile): Unit = js.native
  }
  
  @JSGlobal("Windows.Storage.Provider.FileUpdateRequestDeferral")
  @js.native
  class FileUpdateRequestDeferral ()
    extends StObject
       with typings.winrt.Windows.Storage.Provider.FileUpdateRequestDeferral {
    
    /* CompleteClass */
    override def complete(): Unit = js.native
  }
  
  @JSGlobal("Windows.Storage.Provider.FileUpdateRequestedEventArgs")
  @js.native
  class FileUpdateRequestedEventArgs ()
    extends StObject
       with typings.winrt.Windows.Storage.Provider.FileUpdateRequestedEventArgs {
    
    /* CompleteClass */
    var request: typings.winrt.Windows.Storage.Provider.FileUpdateRequest = js.native
  }
  
  @JSGlobal("Windows.Storage.Provider.FileUpdateStatus")
  @js.native
  object FileUpdateStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.Provider.FileUpdateStatus & Double] = js.native
    
    /* 1 */ val complete: typings.winrt.Windows.Storage.Provider.FileUpdateStatus.complete & Double = js.native
    
    /* 5 */ val completeAndRenamed: typings.winrt.Windows.Storage.Provider.FileUpdateStatus.completeAndRenamed & Double = js.native
    
    /* 3 */ val currentlyUnavailable: typings.winrt.Windows.Storage.Provider.FileUpdateStatus.currentlyUnavailable & Double = js.native
    
    /* 4 */ val failed: typings.winrt.Windows.Storage.Provider.FileUpdateStatus.failed & Double = js.native
    
    /* 0 */ val incomplete: typings.winrt.Windows.Storage.Provider.FileUpdateStatus.incomplete & Double = js.native
    
    /* 2 */ val userInputNeeded: typings.winrt.Windows.Storage.Provider.FileUpdateStatus.userInputNeeded & Double = js.native
  }
  
  @JSGlobal("Windows.Storage.Provider.ReadActivationMode")
  @js.native
  object ReadActivationMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.Provider.ReadActivationMode & Double] = js.native
    
    /* 1 */ val beforeAccess: typings.winrt.Windows.Storage.Provider.ReadActivationMode.beforeAccess & Double = js.native
    
    /* 0 */ val notNeeded: typings.winrt.Windows.Storage.Provider.ReadActivationMode.notNeeded & Double = js.native
  }
  
  @JSGlobal("Windows.Storage.Provider.UIStatus")
  @js.native
  object UIStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.Provider.UIStatus & Double] = js.native
    
    /* 3 */ val complete: typings.winrt.Windows.Storage.Provider.UIStatus.complete & Double = js.native
    
    /* 1 */ val hidden: typings.winrt.Windows.Storage.Provider.UIStatus.hidden & Double = js.native
    
    /* 0 */ val unavailable: typings.winrt.Windows.Storage.Provider.UIStatus.unavailable & Double = js.native
    
    /* 2 */ val visible: typings.winrt.Windows.Storage.Provider.UIStatus.visible & Double = js.native
  }
  
  @JSGlobal("Windows.Storage.Provider.WriteActivationMode")
  @js.native
  object WriteActivationMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.Provider.WriteActivationMode & Double] = js.native
    
    /* 2 */ val afterWrite: typings.winrt.Windows.Storage.Provider.WriteActivationMode.afterWrite & Double = js.native
    
    /* 1 */ val notNeeded: typings.winrt.Windows.Storage.Provider.WriteActivationMode.notNeeded & Double = js.native
    
    /* 0 */ val readOnly: typings.winrt.Windows.Storage.Provider.WriteActivationMode.readOnly & Double = js.native
  }
}
