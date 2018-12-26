package typings
package vscodeDashLanguageclientLib.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait State extends js.Object

@JSImport("vscode-languageclient/lib/client", "State")
@js.native
object State extends js.Object {
  @js.native
  sealed trait Running
    extends vscodeDashLanguageclientLib.libClientMod.State
  
  @js.native
  sealed trait Starting
    extends vscodeDashLanguageclientLib.libClientMod.State
  
  @js.native
  sealed trait Stopped
    extends vscodeDashLanguageclientLib.libClientMod.State
  
  /* 2 */ val Running: Running with scala.Double = js.native
  /* 3 */ val Starting: Starting with scala.Double = js.native
  /* 1 */ val Stopped: Stopped with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vscodeDashLanguageclientLib.libClientMod.State with scala.Double] = js.native
}

