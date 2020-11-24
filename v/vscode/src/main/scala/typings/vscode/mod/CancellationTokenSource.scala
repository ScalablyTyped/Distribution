package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "CancellationTokenSource")
@js.native
class CancellationTokenSource () extends js.Object {
  
  /**
    * Signal cancellation on the token.
    */
  def cancel(): Unit = js.native
  
  /**
    * Dispose object and free resources.
    */
  def dispose(): Unit = js.native
  
  /**
    * The cancellation token of this source.
    */
  var token: CancellationToken = js.native
}
