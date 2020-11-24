package typings.vscodeLanguageclient.clientMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ErrorAction extends js.Object
@JSImport("vscode-languageclient/lib/client", "ErrorAction")
@js.native
object ErrorAction extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ErrorAction with Double] = js.native
  
  /**
    * Continue running the server.
    */
  @js.native
  sealed trait Continue extends ErrorAction
  /* 1 */ @js.native
  object Continue extends TopLevel[Continue with Double]
  
  /**
    * Shutdown the server.
    */
  @js.native
  sealed trait Shutdown extends ErrorAction
  /* 2 */ @js.native
  object Shutdown extends TopLevel[Shutdown with Double]
}
