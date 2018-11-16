package typings
package vscodeDashJsonrpcLib.libMessagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc/lib/messages", "ResponseError")
@js.native
class ResponseError[D] protected ()
  extends nodeLib.Error {
  def this(code: scala.Double, message: java.lang.String) = this()
  def this(code: scala.Double, message: java.lang.String, data: D) = this()
  val code: scala.Double = js.native
  val data: js.UndefOr[D] = js.native
  def toJson(): ResponseErrorLiteral[D] = js.native
}

