package typings
package vscodeDashJsonrpcLib.vscodeDashJsonrpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Trace extends js.Object

@JSImport("vscode-jsonrpc", "Trace")
@js.native
object Trace extends js.Object {
  @js.native
  sealed trait Messages
    extends vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.Trace
  
  @js.native
  sealed trait Off
    extends vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.Trace
  
  @js.native
  sealed trait Verbose
    extends vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.Trace
  
  /* 1 */ val Messages: Messages with scala.Double = js.native
  /* 0 */ val Off: Off with scala.Double = js.native
  /* 2 */ val Verbose: Verbose with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.Trace with scala.Double] = js.native
}

