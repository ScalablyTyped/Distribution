package typings.vscodeLanguageclient.clientMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CloseAction with Double] = js.native
  /* 1 */ @js.native
  object DoNotRestart extends TopLevel[DoNotRestart with Double]
  
  /* 2 */ @js.native
  object Restart extends TopLevel[Restart with Double]
  
}

