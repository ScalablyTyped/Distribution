package typings.winrt.WindowsNs.StorageNs.ProviderNs

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
  
  /* 1 */ val complete: typings.winrt.WindowsNs.StorageNs.ProviderNs.FileUpdateStatus.complete with Double = js.native
  /* 5 */ val completeAndRenamed: typings.winrt.WindowsNs.StorageNs.ProviderNs.FileUpdateStatus.completeAndRenamed with Double = js.native
  /* 3 */ val currentlyUnavailable: typings.winrt.WindowsNs.StorageNs.ProviderNs.FileUpdateStatus.currentlyUnavailable with Double = js.native
  /* 4 */ val failed: typings.winrt.WindowsNs.StorageNs.ProviderNs.FileUpdateStatus.failed with Double = js.native
  /* 0 */ val incomplete: typings.winrt.WindowsNs.StorageNs.ProviderNs.FileUpdateStatus.incomplete with Double = js.native
  /* 2 */ val userInputNeeded: typings.winrt.WindowsNs.StorageNs.ProviderNs.FileUpdateStatus.userInputNeeded with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileUpdateStatus with Double] = js.native
}

