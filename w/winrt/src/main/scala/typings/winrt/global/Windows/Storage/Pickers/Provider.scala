package typings.winrt.global.Windows.Storage.Pickers

import typings.std.Date
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Storage.IStorageFile
import typings.winrt.Windows.Storage.Pickers.Provider.AddFileResult
import typings.winrt.Windows.Storage.Pickers.Provider.FileSelectionMode
import typings.winrt.Windows.Storage.Pickers.Provider.SetFileNameResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Pickers.Provider")
@js.native
object Provider extends js.Object {
  @js.native
  class FileOpenPickerUI ()
    extends typings.winrt.Windows.Storage.Pickers.Provider.FileOpenPickerUI {
    /* CompleteClass */
    override var allowedFileTypes: IVectorView[String] = js.native
    /* CompleteClass */
    override var onclosing: js.Any = js.native
    /* CompleteClass */
    override var onfileremoved: js.Any = js.native
    /* CompleteClass */
    override var selectionMode: FileSelectionMode = js.native
    /* CompleteClass */
    override var settingsIdentifier: String = js.native
    /* CompleteClass */
    override var title: String = js.native
    /* CompleteClass */
    override def addFile(id: String, file: IStorageFile): AddFileResult = js.native
    /* CompleteClass */
    override def canAddFile(file: IStorageFile): Boolean = js.native
    /* CompleteClass */
    override def containsFile(id: String): Boolean = js.native
    /* CompleteClass */
    override def removeFile(id: String): Unit = js.native
  }
  
  @js.native
  class FileRemovedEventArgs ()
    extends typings.winrt.Windows.Storage.Pickers.Provider.FileRemovedEventArgs {
    /* CompleteClass */
    override var id: String = js.native
  }
  
  @js.native
  class FileSavePickerUI ()
    extends typings.winrt.Windows.Storage.Pickers.Provider.FileSavePickerUI {
    /* CompleteClass */
    override var allowedFileTypes: IVectorView[String] = js.native
    /* CompleteClass */
    override var fileName: String = js.native
    /* CompleteClass */
    override var onfilenamechanged: js.Any = js.native
    /* CompleteClass */
    override var ontargetfilerequested: js.Any = js.native
    /* CompleteClass */
    override var settingsIdentifier: String = js.native
    /* CompleteClass */
    override var title: String = js.native
    /* CompleteClass */
    override def trySetFileName(value: String): SetFileNameResult = js.native
  }
  
  @js.native
  class PickerClosingDeferral ()
    extends typings.winrt.Windows.Storage.Pickers.Provider.PickerClosingDeferral {
    /* CompleteClass */
    override def complete(): Unit = js.native
  }
  
  @js.native
  class PickerClosingEventArgs ()
    extends typings.winrt.Windows.Storage.Pickers.Provider.PickerClosingEventArgs {
    /* CompleteClass */
    override var closingOperation: typings.winrt.Windows.Storage.Pickers.Provider.PickerClosingOperation = js.native
    /* CompleteClass */
    override var isCanceled: Boolean = js.native
  }
  
  @js.native
  class PickerClosingOperation ()
    extends typings.winrt.Windows.Storage.Pickers.Provider.PickerClosingOperation {
    /* CompleteClass */
    override var deadline: Date = js.native
    /* CompleteClass */
    override def getDeferral(): typings.winrt.Windows.Storage.Pickers.Provider.PickerClosingDeferral = js.native
  }
  
  @js.native
  class TargetFileRequest ()
    extends typings.winrt.Windows.Storage.Pickers.Provider.TargetFileRequest {
    /* CompleteClass */
    override var targetFile: IStorageFile = js.native
    /* CompleteClass */
    override def getDeferral(): typings.winrt.Windows.Storage.Pickers.Provider.TargetFileRequestDeferral = js.native
  }
  
  @js.native
  class TargetFileRequestDeferral ()
    extends typings.winrt.Windows.Storage.Pickers.Provider.TargetFileRequestDeferral {
    /* CompleteClass */
    override def complete(): Unit = js.native
  }
  
  @js.native
  class TargetFileRequestedEventArgs ()
    extends typings.winrt.Windows.Storage.Pickers.Provider.TargetFileRequestedEventArgs {
    /* CompleteClass */
    override var request: typings.winrt.Windows.Storage.Pickers.Provider.TargetFileRequest = js.native
  }
  
  @js.native
  object AddFileResult extends js.Object {
    /* 0 */ val added: typings.winrt.Windows.Storage.Pickers.Provider.AddFileResult.added with Double = js.native
    /* 1 */ val alreadyAdded: typings.winrt.Windows.Storage.Pickers.Provider.AddFileResult.alreadyAdded with Double = js.native
    /* 2 */ val notAllowed: typings.winrt.Windows.Storage.Pickers.Provider.AddFileResult.notAllowed with Double = js.native
    /* 3 */ val unavailable: typings.winrt.Windows.Storage.Pickers.Provider.AddFileResult.unavailable with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.Pickers.Provider.AddFileResult with Double] = js.native
  }
  
  @js.native
  object FileSelectionMode extends js.Object {
    /* 1 */ val multiple: typings.winrt.Windows.Storage.Pickers.Provider.FileSelectionMode.multiple with Double = js.native
    /* 0 */ val single: typings.winrt.Windows.Storage.Pickers.Provider.FileSelectionMode.single with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.Pickers.Provider.FileSelectionMode with Double] = js.native
  }
  
  @js.native
  object SetFileNameResult extends js.Object {
    /* 1 */ val notAllowed: typings.winrt.Windows.Storage.Pickers.Provider.SetFileNameResult.notAllowed with Double = js.native
    /* 0 */ val succeeded: typings.winrt.Windows.Storage.Pickers.Provider.SetFileNameResult.succeeded with Double = js.native
    /* 2 */ val unavailable: typings.winrt.Windows.Storage.Pickers.Provider.SetFileNameResult.unavailable with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.Pickers.Provider.SetFileNameResult with Double] = js.native
  }
  
}

