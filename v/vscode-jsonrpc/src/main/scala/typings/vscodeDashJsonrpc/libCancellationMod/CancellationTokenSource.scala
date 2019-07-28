package typings.vscodeDashJsonrpc.libCancellationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc/lib/cancellation", "CancellationTokenSource")
@js.native
class CancellationTokenSource () extends js.Object {
  var _token: js.Any = js.native
  val token: CancellationToken = js.native
  def cancel(): Unit = js.native
  def dispose(): Unit = js.native
}

