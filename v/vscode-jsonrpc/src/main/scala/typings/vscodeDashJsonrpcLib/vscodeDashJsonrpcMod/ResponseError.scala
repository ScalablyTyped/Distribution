package typings
package vscodeDashJsonrpcLib.vscodeDashJsonrpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc", "ResponseError")
@js.native
class ResponseError[D] protected ()
  extends vscodeDashJsonrpcLib.libMessagesMod.ResponseError[D] {
  def this(code: scala.Double, message: java.lang.String) = this()
  def this(code: scala.Double, message: java.lang.String, data: D) = this()
}

