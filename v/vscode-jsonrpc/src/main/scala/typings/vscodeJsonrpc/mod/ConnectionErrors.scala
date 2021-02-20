package typings.vscodeJsonrpc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConnectionErrors extends StObject
@JSImport("vscode-jsonrpc", "ConnectionErrors")
@js.native
object ConnectionErrors extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConnectionErrors with Double] = js.native
  
  /**
    * The connection is already in listening mode.
    */
  @js.native
  sealed trait AlreadyListening extends ConnectionErrors
  /* 3 */ val AlreadyListening: typings.vscodeJsonrpc.mod.ConnectionErrors.AlreadyListening with Double = js.native
  
  /**
    * The connection is closed.
    */
  @js.native
  sealed trait Closed extends ConnectionErrors
  /* 1 */ val Closed: typings.vscodeJsonrpc.mod.ConnectionErrors.Closed with Double = js.native
  
  /**
    * The connection got disposed.
    */
  @js.native
  sealed trait Disposed extends ConnectionErrors
  /* 2 */ val Disposed: typings.vscodeJsonrpc.mod.ConnectionErrors.Disposed with Double = js.native
}
