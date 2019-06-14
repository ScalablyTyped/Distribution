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
  
  /* 2 */ val afterWrite: afterWrite with scala.Double = js.native
  /* 1 */ val notNeeded: notNeeded with scala.Double = js.native
  /* 0 */ val readOnly: readOnly with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.StorageNs.ProviderNs.WriteActivationMode with scala.Double] = js.native
}

