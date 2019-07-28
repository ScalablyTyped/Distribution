package typings.vscodeDashLanguageclient.libClientMod

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
  sealed trait Continue extends ErrorAction
  
  /**
    * Shutdown the server.
    */
  @js.native
  sealed trait Shutdown extends ErrorAction
  
  /* 1 */ val Continue: typings.vscodeDashLanguageclient.libClientMod.ErrorAction.Continue with Double = js.native
  /* 2 */ val Shutdown: typings.vscodeDashLanguageclient.libClientMod.ErrorAction.Shutdown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ErrorAction with Double] = js.native
}

