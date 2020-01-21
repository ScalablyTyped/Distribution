package typings.vscodeLanguageclient.mod

import typings.vscodeJsonrpc.mod.TraceValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "Trace")
@js.native
object Trace extends js.Object {
  /* 1 */ val Messages: typings.vscodeJsonrpc.mod.Trace.Messages with Double = js.native
  /* 0 */ val Off: typings.vscodeJsonrpc.mod.Trace.Off with Double = js.native
  /* 2 */ val Verbose: typings.vscodeJsonrpc.mod.Trace.Verbose with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.vscodeJsonrpc.mod.Trace with Double] = js.native
  def fromString(value: String): typings.vscodeJsonrpc.mod.Trace = js.native
  def toString(value: typings.vscodeJsonrpc.mod.Trace): TraceValues = js.native
}

