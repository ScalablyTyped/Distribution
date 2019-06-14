package typings
package winrtLib.WindowsNs.StorageNs.PickersNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SetFileNameResult extends js.Object

@JSGlobal("Windows.Storage.Pickers.Provider.SetFileNameResult")
@js.native
object SetFileNameResult extends js.Object {
  @js.native
  sealed trait notAllowed
    extends winrtLib.WindowsNs.StorageNs.PickersNs.ProviderNs.SetFileNameResult
  
  @js.native
  sealed trait succeeded
    extends winrtLib.WindowsNs.StorageNs.PickersNs.ProviderNs.SetFileNameResult
  
  @js.native
  sealed trait unavailable
    extends winrtLib.WindowsNs.StorageNs.PickersNs.ProviderNs.SetFileNameResult
  
  /* 1 */ val notAllowed: notAllowed with scala.Double = js.native
  /* 0 */ val succeeded: succeeded with scala.Double = js.native
  /* 2 */ val unavailable: unavailable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.StorageNs.PickersNs.ProviderNs.SetFileNameResult with scala.Double
  ] = js.native
}

