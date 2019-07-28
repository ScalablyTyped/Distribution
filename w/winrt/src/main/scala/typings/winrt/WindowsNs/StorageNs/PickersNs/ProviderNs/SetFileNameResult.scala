package typings.winrt.WindowsNs.StorageNs.PickersNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SetFileNameResult extends js.Object

@JSGlobal("Windows.Storage.Pickers.Provider.SetFileNameResult")
@js.native
object SetFileNameResult extends js.Object {
  @js.native
  sealed trait notAllowed extends SetFileNameResult
  
  @js.native
  sealed trait succeeded extends SetFileNameResult
  
  @js.native
  sealed trait unavailable extends SetFileNameResult
  
  /* 1 */ val notAllowed: typings.winrt.WindowsNs.StorageNs.PickersNs.ProviderNs.SetFileNameResult.notAllowed with Double = js.native
  /* 0 */ val succeeded: typings.winrt.WindowsNs.StorageNs.PickersNs.ProviderNs.SetFileNameResult.succeeded with Double = js.native
  /* 2 */ val unavailable: typings.winrt.WindowsNs.StorageNs.PickersNs.ProviderNs.SetFileNameResult.unavailable with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SetFileNameResult with Double] = js.native
}

