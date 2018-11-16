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
  
  val added: added with java.lang.String = js.native
  val alreadyAdded: alreadyAdded with java.lang.String = js.native
  val notAllowed: notAllowed with java.lang.String = js.native
  val unavailable: unavailable with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.StorageNs.PickersNs.ProviderNs.AddFileResult with java.lang.String
  ] = js.native
}

