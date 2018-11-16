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
  
  val beforeAccess: beforeAccess with java.lang.String = js.native
  val notNeeded: notNeeded with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.StorageNs.ProviderNs.ReadActivationMode with java.lang.String] = js.native
}

