package typings
package vscodeDashJsonrpcLib.vscodeDashJsonrpcMod

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
  sealed trait AlreadyListening
    extends vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.ConnectionErrors
  
  /**
       * The connection is closed.
       */
  @js.native
  sealed trait Closed
    extends vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.ConnectionErrors
  
  /**
       * The connection got disposed.
       */
  @js.native
  sealed trait Disposed
    extends vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.ConnectionErrors
  
  /* 3 */ val AlreadyListening: AlreadyListening with scala.Double = js.native
  /* 1 */ val Closed: Closed with scala.Double = js.native
  /* 2 */ val Disposed: Disposed with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.ConnectionErrors with scala.Double] = js.native
}

