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
  
  val multiple: multiple with java.lang.String = js.native
  val single: single with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.StorageNs.PickersNs.ProviderNs.FileSelectionMode with java.lang.String
  ] = js.native
}

