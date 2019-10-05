package typings.winrt.Windows.Storage.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileUpdateStatus extends js.Object

@JSGlobal("Windows.Storage.Provider.FileUpdateStatus")
@js.native
object FileUpdateStatus extends js.Object {
  @js.native
  sealed trait complete extends FileUpdateStatus
  
  @js.native
  sealed trait completeAndRenamed extends FileUpdateStatus
  
  @js.native
  sealed trait currentlyUnavailable extends FileUpdateStatus
  
  @js.native
  sealed trait failed extends FileUpdateStatus
  
  @js.native
  sealed trait incomplete extends FileUpdateStatus
  
  @js.native
  sealed trait userInputNeeded extends FileUpdateStatus
  
  /* 1 */ val complete: typings.winrt.Windows.Storage.Provider.FileUpdateStatus.complete with Double = js.native
  /* 5 */ val completeAndRenamed: typings.winrt.Windows.Storage.Provider.FileUpdateStatus.completeAndRenamed with Double = js.native
  /* 3 */ val currentlyUnavailable: typings.winrt.Windows.Storage.Provider.FileUpdateStatus.currentlyUnavailable with Double = js.native
  /* 4 */ val failed: typings.winrt.Windows.Storage.Provider.FileUpdateStatus.failed with Double = js.native
  /* 0 */ val incomplete: typings.winrt.Windows.Storage.Provider.FileUpdateStatus.incomplete with Double = js.native
  /* 2 */ val userInputNeeded: typings.winrt.Windows.Storage.Provider.FileUpdateStatus.userInputNeeded with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileUpdateStatus with Double] = js.native
}

