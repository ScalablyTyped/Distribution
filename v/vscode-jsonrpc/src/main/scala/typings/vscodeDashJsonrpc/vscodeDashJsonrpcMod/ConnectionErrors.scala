package typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConnectionErrors extends js.Object

@JSImport("vscode-jsonrpc", "ConnectionErrors")
@js.native
object ConnectionErrors extends js.Object {
  /**
    * The connection is already in listening mode.
    */
  @js.native
  sealed trait AlreadyListening extends ConnectionErrors
  
  /**
    * The connection is closed.
    */
  @js.native
  sealed trait Closed extends ConnectionErrors
  
  /**
    * The connection got disposed.
    */
  @js.native
  sealed trait Disposed extends ConnectionErrors
  
  /* 3 */ val AlreadyListening: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.ConnectionErrors.AlreadyListening with Double = js.native
  /* 1 */ val Closed: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.ConnectionErrors.Closed with Double = js.native
  /* 2 */ val Disposed: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.ConnectionErrors.Disposed with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConnectionErrors with Double] = js.native
}

