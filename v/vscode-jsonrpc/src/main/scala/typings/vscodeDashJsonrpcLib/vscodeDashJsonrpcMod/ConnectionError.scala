package typings
package vscodeDashJsonrpcLib.vscodeDashJsonrpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc", "ConnectionError")
@js.native
class ConnectionError protected ()
  extends nodeLib.Error {
  def this(code: ConnectionErrors, message: java.lang.String) = this()
  val code: ConnectionErrors = js.native
}

