package typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Trace extends js.Object

@JSImport("vscode-jsonrpc", "Trace")
@js.native
object Trace extends js.Object {
  @js.native
  sealed trait Messages extends Trace
  
  @js.native
  sealed trait Off extends Trace
  
  @js.native
  sealed trait Verbose extends Trace
  
  /* 1 */ val Messages: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.Trace.Messages with Double = js.native
  /* 0 */ val Off: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.Trace.Off with Double = js.native
  /* 2 */ val Verbose: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.Trace.Verbose with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Trace with Double] = js.native
}

