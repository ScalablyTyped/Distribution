package typings.vscodeDashLanguageclient.libClientMod

import org.scalablytyped.runtime.TopLevel
import typings.vscodeDashLanguageclient.libClientMod.ErrorAction.Continue
import typings.vscodeDashLanguageclient.libClientMod.ErrorAction.Shutdown
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ErrorAction with Double] = js.native
  /* 1 */ @js.native
  object Continue extends TopLevel[Continue with Double]
  
  /* 2 */ @js.native
  object Shutdown extends TopLevel[Shutdown with Double]
  
}

