package typings.vscode.mod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "CustomExecution")
@js.native
class CustomExecution protected () extends js.Object {
  /**
    * Constructs a CustomExecution task object. The callback will be executed the task is run, at which point the
    * extension should return the Pseudoterminal it will "run in". The task should wait to do further execution until
    * [Pseudoterminal.open](#Pseudoterminal.open) is called. Task cancellation should be handled using
    * [Pseudoterminal.close](#Pseudoterminal.close). When the task is complete fire
    * [Pseudoterminal.onDidClose](#Pseudoterminal.onDidClose).
    * @param process The [Pseudoterminal](#Pseudoterminal) to be used by the task to display output.
    * @param callback The callback that will be called when the task is started by a user. Any ${} style variables that
    * were in the task definition will be resolved and passed into the callback.
    */
  def this(callback: js.Function1[/* resolvedDefinition */ TaskDefinition, Thenable[Pseudoterminal]]) = this()
}
