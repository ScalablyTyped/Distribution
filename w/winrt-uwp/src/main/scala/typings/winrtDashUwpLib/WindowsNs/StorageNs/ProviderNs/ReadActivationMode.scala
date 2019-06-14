package typings
package winrtDashUwpLib.WindowsNs.StorageNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReadActivationMode extends js.Object

/** Indicates when Windows will request a file update if another app reads the locally cached version of the file. */
@JSGlobal("Windows.Storage.Provider.ReadActivationMode")
@js.native
object ReadActivationMode extends js.Object {
  /** Windows will trigger a file update request before allowing another app to access the local file. */
  @js.native
  sealed trait beforeAccess
    extends winrtDashUwpLib.WindowsNs.StorageNs.ProviderNs.ReadActivationMode
  
  /** Windows will not trigger a file update request when another app accesses the local file. */
  @js.native
  sealed trait notNeeded
    extends winrtDashUwpLib.WindowsNs.StorageNs.ProviderNs.ReadActivationMode
  
  /* 1 */ val beforeAccess: beforeAccess with scala.Double = js.native
  /* 0 */ val notNeeded: notNeeded with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.StorageNs.ProviderNs.ReadActivationMode with scala.Double
  ] = js.native
}

