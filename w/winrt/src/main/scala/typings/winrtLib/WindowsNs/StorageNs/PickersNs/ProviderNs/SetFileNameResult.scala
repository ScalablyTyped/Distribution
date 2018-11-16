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
  
  val notAllowed: notAllowed with java.lang.String = js.native
  val succeeded: succeeded with java.lang.String = js.native
  val unavailable: unavailable with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.StorageNs.PickersNs.ProviderNs.SetFileNameResult with java.lang.String
  ] = js.native
}

