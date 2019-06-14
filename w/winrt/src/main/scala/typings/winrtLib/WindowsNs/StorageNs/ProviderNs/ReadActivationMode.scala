package typings
package winrtLib.WindowsNs.StorageNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReadActivationMode extends js.Object

@JSGlobal("Windows.Storage.Provider.ReadActivationMode")
@js.native
object ReadActivationMode extends js.Object {
  @js.native
  sealed trait beforeAccess
    extends winrtLib.WindowsNs.StorageNs.ProviderNs.ReadActivationMode
  
  @js.native
  sealed trait notNeeded
    extends winrtLib.WindowsNs.StorageNs.ProviderNs.ReadActivationMode
  
  /* 1 */ val beforeAccess: beforeAccess with scala.Double = js.native
  /* 0 */ val notNeeded: notNeeded with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.StorageNs.ProviderNs.ReadActivationMode with scala.Double] = js.native
}

