package typings
package winrtLib.WindowsNs.StorageNs.PickersNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AddFileResult extends js.Object

@JSGlobal("Windows.Storage.Pickers.Provider.AddFileResult")
@js.native
object AddFileResult extends js.Object {
  @js.native
  sealed trait added
    extends winrtLib.WindowsNs.StorageNs.PickersNs.ProviderNs.AddFileResult
  
  @js.native
  sealed trait alreadyAdded
    extends winrtLib.WindowsNs.StorageNs.PickersNs.ProviderNs.AddFileResult
  
  @js.native
  sealed trait notAllowed
    extends winrtLib.WindowsNs.StorageNs.PickersNs.ProviderNs.AddFileResult
  
  @js.native
  sealed trait unavailable
    extends winrtLib.WindowsNs.StorageNs.PickersNs.ProviderNs.AddFileResult
  
  /* 0 */ val added: added with scala.Double = js.native
  /* 1 */ val alreadyAdded: alreadyAdded with scala.Double = js.native
  /* 2 */ val notAllowed: notAllowed with scala.Double = js.native
  /* 3 */ val unavailable: unavailable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.StorageNs.PickersNs.ProviderNs.AddFileResult with scala.Double
  ] = js.native
}

