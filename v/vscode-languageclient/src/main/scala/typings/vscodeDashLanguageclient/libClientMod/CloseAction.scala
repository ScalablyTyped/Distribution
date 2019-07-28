package typings.vscodeDashLanguageclient.libClientMod

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
  sealed trait DoNotRestart extends CloseAction
  
  /**
    * Restart the server.
    */
  @js.native
  sealed trait Restart extends CloseAction
  
  /* 1 */ val DoNotRestart: typings.vscodeDashLanguageclient.libClientMod.CloseAction.DoNotRestart with Double = js.native
  /* 2 */ val Restart: typings.vscodeDashLanguageclient.libClientMod.CloseAction.Restart with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CloseAction with Double] = js.native
}

