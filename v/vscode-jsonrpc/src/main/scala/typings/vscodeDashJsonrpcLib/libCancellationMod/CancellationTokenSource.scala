package typings
package vscodeDashJsonrpcLib.libCancellationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc/lib/cancellation", "CancellationTokenSource")
@js.native
class CancellationTokenSource () extends js.Object {
  var _token: js.Any = js.native
  val token: CancellationToken = js.native
  def cancel(): scala.Unit = js.native
  def dispose(): scala.Unit = js.native
}

