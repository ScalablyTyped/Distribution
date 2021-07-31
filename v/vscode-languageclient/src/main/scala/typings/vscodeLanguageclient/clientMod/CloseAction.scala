package typings.vscodeLanguageclient.clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CloseAction extends StObject
@JSImport("vscode-languageclient/lib/client", "CloseAction")
@js.native
object CloseAction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CloseAction & Double] = js.native
  
  /**
    * Don't restart the server. The connection stays closed.
    */
  @js.native
  sealed trait DoNotRestart
    extends StObject
       with CloseAction
  /* 1 */ val DoNotRestart: typings.vscodeLanguageclient.clientMod.CloseAction.DoNotRestart & Double = js.native
  
  /**
    * Restart the server.
    */
  @js.native
  sealed trait Restart
    extends StObject
       with CloseAction
  /* 2 */ val Restart: typings.vscodeLanguageclient.clientMod.CloseAction.Restart & Double = js.native
}
