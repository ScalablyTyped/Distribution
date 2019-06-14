package typings
package winrtLib.WindowsNs.StorageNs.PickersNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileSelectionMode extends js.Object

@JSGlobal("Windows.Storage.Pickers.Provider.FileSelectionMode")
@js.native
object FileSelectionMode extends js.Object {
  @js.native
  sealed trait multiple
    extends winrtLib.WindowsNs.StorageNs.PickersNs.ProviderNs.FileSelectionMode
  
  @js.native
  sealed trait single
    extends winrtLib.WindowsNs.StorageNs.PickersNs.ProviderNs.FileSelectionMode
  
  /* 1 */ val multiple: multiple with scala.Double = js.native
  /* 0 */ val single: single with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.StorageNs.PickersNs.ProviderNs.FileSelectionMode with scala.Double
  ] = js.native
}

