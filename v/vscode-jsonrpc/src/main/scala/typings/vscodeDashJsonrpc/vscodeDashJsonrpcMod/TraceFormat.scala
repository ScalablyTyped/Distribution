package typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TraceFormat extends js.Object

@JSImport("vscode-jsonrpc", "TraceFormat")
@js.native
object TraceFormat extends js.Object {
  @js.native
  sealed trait JSON extends TraceFormat
  
  @js.native
  sealed trait Text extends TraceFormat
  
  /* "json" */ val JSON: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.TraceFormat.JSON with String = js.native
  /* "text" */ val Text: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.TraceFormat.Text with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TraceFormat with String] = js.native
  def fromString(value: String): TraceFormat = js.native
}

