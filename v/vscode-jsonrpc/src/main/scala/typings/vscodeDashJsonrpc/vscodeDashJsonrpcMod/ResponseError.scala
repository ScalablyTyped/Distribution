package typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc", "ResponseError")
@js.native
class ResponseError[D] protected ()
  extends typings.vscodeDashJsonrpc.libMessagesMod.ResponseError[D] {
  def this(code: Double, message: String) = this()
  def this(code: Double, message: String, data: D) = this()
}

