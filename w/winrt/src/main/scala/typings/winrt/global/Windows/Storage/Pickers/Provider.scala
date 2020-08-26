package typings.winrt.global.Windows.Storage.Pickers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Pickers.Provider")
@js.native
object Provider extends js.Object {
  @js.native
  class FileOpenPickerUI ()
    extends typings.winrt.Windows.Storage.Pickers.Provider.FileOpenPickerUI
  
  @js.native
  class FileRemovedEventArgs ()
    extends typings.winrt.Windows.Storage.Pickers.Provider.FileRemovedEventArgs
  
  @js.native
  class FileSavePickerUI ()
    extends typings.winrt.Windows.Storage.Pickers.Provider.FileSavePickerUI
  
  @js.native
  class PickerClosingDeferral ()
    extends typings.winrt.Windows.Storage.Pickers.Provider.PickerClosingDeferral
  
  @js.native
  class PickerClosingEventArgs ()
    extends typings.winrt.Windows.Storage.Pickers.Provider.PickerClosingEventArgs
  
  @js.native
  class PickerClosingOperation ()
    extends typings.winrt.Windows.Storage.Pickers.Provider.PickerClosingOperation
  
  @js.native
  class TargetFileRequest ()
    extends typings.winrt.Windows.Storage.Pickers.Provider.TargetFileRequest
  
  @js.native
  class TargetFileRequestDeferral ()
    extends typings.winrt.Windows.Storage.Pickers.Provider.TargetFileRequestDeferral
  
  @js.native
  class TargetFileRequestedEventArgs ()
    extends typings.winrt.Windows.Storage.Pickers.Provider.TargetFileRequestedEventArgs
  
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

