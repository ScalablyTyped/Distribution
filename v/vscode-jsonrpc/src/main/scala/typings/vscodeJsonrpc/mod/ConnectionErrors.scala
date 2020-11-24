package typings.vscodeJsonrpc.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConnectionErrors extends js.Object
@JSImport("vscode-jsonrpc", "ConnectionErrors")
@js.native
object ConnectionErrors extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConnectionErrors with Double] = js.native
  
  /**
    * The connection is already in listening mode.
    */
  @js.native
  sealed trait AlreadyListening extends ConnectionErrors
  /* 3 */ @js.native
  object AlreadyListening extends TopLevel[AlreadyListening with Double]
  
  /**
    * The connection is closed.
    */
  @js.native
  sealed trait Closed extends ConnectionErrors
  /* 1 */ @js.native
  object Closed extends TopLevel[Closed with Double]
  
  /**
    * The connection got disposed.
    */
  @js.native
  sealed trait Disposed extends ConnectionErrors
  /* 2 */ @js.native
  object Disposed extends TopLevel[Disposed with Double]
}
