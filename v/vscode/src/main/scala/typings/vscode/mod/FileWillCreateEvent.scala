package typings.vscode.mod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileWillCreateEvent extends js.Object {
  /**
    * The files that are going to be created.
    */
  val files: js.Array[Uri] = js.native
  /**
    * Allows to pause the event and to apply a [workspace edit](#WorkspaceEdit).
    *
    * *Note:* This function can only be called during event dispatch and not
    * in an asynchronous manner:
    *
    * ```ts
    * workspace.onWillCreateFiles(event => {
    *     // async, will *throw* an error
    *     setTimeout(() => event.waitUntil(promise));
    *
    *     // sync, OK
    *     event.waitUntil(promise);
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
  def waitUntil(thenable: Thenable[_ | WorkspaceEdit]): Unit = js.native
}

