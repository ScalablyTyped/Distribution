package typings.vscodeLanguageclient.clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ErrorAction extends StObject
@JSImport("vscode-languageclient/lib/client", "ErrorAction")
@js.native
object ErrorAction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ErrorAction with Double] = js.native
  
  /**
    * Continue running the server.
    */
  @js.native
  sealed trait Continue extends ErrorAction
  /* 1 */ val Continue: typings.vscodeLanguageclient.clientMod.ErrorAction.Continue with Double = js.native
  
  /**
    * Shutdown the server.
    */
  @js.native
  sealed trait Shutdown extends ErrorAction
  /* 2 */ val Shutdown: typings.vscodeLanguageclient.clientMod.ErrorAction.Shutdown with Double = js.native
}
