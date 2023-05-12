package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "CancellationTokenSource")
@js.native
open class CancellationTokenSource () extends StObject {
  
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
