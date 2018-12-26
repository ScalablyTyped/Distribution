package typings
package vscodeDashLanguageclientLib.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CloseAction extends js.Object

@JSImport("vscode-languageclient/lib/client", "CloseAction")
@js.native
object CloseAction extends js.Object {
  /**
       * Don't restart the server. The connection stays closed.
       */
  @js.native
  sealed trait DoNotRestart
    extends vscodeDashLanguageclientLib.libClientMod.CloseAction
  
  /**
       * Restart the server.
       */
  @js.native
  sealed trait Restart
    extends vscodeDashLanguageclientLib.libClientMod.CloseAction
  
  /* 1 */ val DoNotRestart: DoNotRestart with scala.Double = js.native
  /* 2 */ val Restart: Restart with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vscodeDashLanguageclientLib.libClientMod.CloseAction with scala.Double] = js.native
}

