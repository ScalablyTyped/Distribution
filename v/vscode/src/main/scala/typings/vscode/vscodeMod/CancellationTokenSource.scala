package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "CancellationTokenSource")
@js.native
class CancellationTokenSource () extends js.Object {
  /**
  		 * The cancellation token of this source.
  		 */
  var token: CancellationToken = js.native
  /**
  		 * Signal cancellation on the token.
  		 */
  def cancel(): Unit = js.native
  /**
  		 * Dispose object and free resources.
  		 */
  def dispose(): Unit = js.native
}

