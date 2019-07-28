package typings.winrt.WindowsNs.StorageNs.PickersNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AddFileResult extends js.Object

@JSGlobal("Windows.Storage.Pickers.Provider.AddFileResult")
@js.native
object AddFileResult extends js.Object {
  @js.native
  sealed trait added extends AddFileResult
  
  @js.native
  sealed trait alreadyAdded extends AddFileResult
  
  @js.native
  sealed trait notAllowed extends AddFileResult
  
  @js.native
  sealed trait unavailable extends AddFileResult
  
  /* 0 */ val added: typings.winrt.WindowsNs.StorageNs.PickersNs.ProviderNs.AddFileResult.added with Double = js.native
  /* 1 */ val alreadyAdded: typings.winrt.WindowsNs.StorageNs.PickersNs.ProviderNs.AddFileResult.alreadyAdded with Double = js.native
  /* 2 */ val notAllowed: typings.winrt.WindowsNs.StorageNs.PickersNs.ProviderNs.AddFileResult.notAllowed with Double = js.native
  /* 3 */ val unavailable: typings.winrt.WindowsNs.StorageNs.PickersNs.ProviderNs.AddFileResult.unavailable with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AddFileResult with Double] = js.native
}

