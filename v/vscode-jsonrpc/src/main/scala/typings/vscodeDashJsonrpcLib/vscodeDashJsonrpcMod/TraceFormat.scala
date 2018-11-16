package typings
package vscodeDashJsonrpcLib.vscodeDashJsonrpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TraceFormat extends js.Object

@JSImport("vscode-jsonrpc", "TraceFormat")
@js.native
object TraceFormat extends js.Object {
  @js.native
  sealed trait JSON
    extends vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.TraceFormat
  
  @js.native
  sealed trait Text
    extends vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.TraceFormat
  
  /* "json" */ val JSON: JSON with java.lang.String = js.native
  /* "text" */ val Text: Text with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.TraceFormat with java.lang.String] = js.native
}

