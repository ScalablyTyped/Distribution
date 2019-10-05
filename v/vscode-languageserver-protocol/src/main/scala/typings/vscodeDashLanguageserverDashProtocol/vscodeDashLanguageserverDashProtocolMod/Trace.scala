package typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod

import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.TraceValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "Trace")
@js.native
object Trace extends js.Object {
  /* 1 */ val Messages: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.Trace.Messages with Double = js.native
  /* 0 */ val Off: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.Trace.Off with Double = js.native
  /* 2 */ val Verbose: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.Trace.Verbose with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.Trace with Double] = js.native
  def fromString(value: String): typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.Trace = js.native
  def toString(value: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.Trace): TraceValues = js.native
}

