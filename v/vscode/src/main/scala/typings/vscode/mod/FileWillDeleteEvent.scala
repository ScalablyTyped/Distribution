package typings.vscode.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileWillDeleteEvent extends StObject {
  
  /**
  		 * The files that are going to be deleted.
  		 */
  val files: js.Array[Uri] = js.native
  
  /**
  		 * A cancellation token.
  		 */
  val token: CancellationToken = js.native
  
  /**
  		 * Allows to pause the event and to apply a {@link WorkspaceEdit workspace edit}.
  		 *
  		 * *Note:* This function can only be called during event dispatch and not
  		 * in an asynchronous manner:
  		 *
  		 * ```ts
  		 * workspace.onWillCreateFiles(event => {
  		 * 	// async, will *throw* an error
  		 * 	setTimeout(() => event.waitUntil(promise));
  		 *
  		 * 	// sync, OK
  		 * 	event.waitUntil(promise);
  		 * })
  		 * ```
  		 *
  		 * @param thenable A thenable that delays saving.
  		 */
  /**
  		 * Allows to pause the event until the provided thenable resolves.
  		 *
  		 * *Note:* This function can only be called during event dispatch.
  		 *
  		 * @param thenable A thenable that delays saving.
  		 */
  def waitUntil(thenable: Thenable[Any | WorkspaceEdit]): Unit = js.native
}
