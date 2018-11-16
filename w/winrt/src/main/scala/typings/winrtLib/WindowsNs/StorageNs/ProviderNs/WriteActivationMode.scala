package typings
package winrtLib.WindowsNs.StorageNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WriteActivationMode extends js.Object

@JSGlobal("Windows.Storage.Provider.WriteActivationMode")
@js.native
object WriteActivationMode extends js.Object {
  @js.native
  sealed trait afterWrite
    extends winrtLib.WindowsNs.StorageNs.ProviderNs.WriteActivationMode
  
  @js.native
  sealed trait notNeeded
    extends winrtLib.WindowsNs.StorageNs.ProviderNs.WriteActivationMode
  
  @js.native
  sealed trait readOnly
    extends winrtLib.WindowsNs.StorageNs.ProviderNs.WriteActivationMode
  
  val afterWrite: afterWrite with java.lang.String = js.native
  val notNeeded: notNeeded with java.lang.String = js.native
  val readOnly: readOnly with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.StorageNs.ProviderNs.WriteActivationMode with java.lang.String
  ] = js.native
}

