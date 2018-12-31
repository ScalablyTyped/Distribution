package typings
package vscodeDashLanguageclientLib.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorAction extends js.Object

@JSImport("vscode-languageclient/lib/client", "ErrorAction")
@js.native
object ErrorAction extends js.Object {
  /**
    * Continue running the server.
    */
  @js.native
  sealed trait Continue
    extends vscodeDashLanguageclientLib.libClientMod.ErrorAction
  
  /**
    * Shutdown the server.
    */
  @js.native
  sealed trait Shutdown
    extends vscodeDashLanguageclientLib.libClientMod.ErrorAction
  
  /* 1 */ val Continue: Continue with scala.Double = js.native
  /* 2 */ val Shutdown: Shutdown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vscodeDashLanguageclientLib.libClientMod.ErrorAction with scala.Double] = js.native
}

