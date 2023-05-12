package typings.vscode.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "CustomExecution")
@js.native
open class CustomExecution protected () extends StObject {
  /**
  		 * Constructs a CustomExecution task object. The callback will be executed when the task is run, at which point the
  		 * extension should return the Pseudoterminal it will "run in". The task should wait to do further execution until
  		 * {@link Pseudoterminal.open} is called. Task cancellation should be handled using
  		 * {@link Pseudoterminal.close}. When the task is complete fire
  		 * {@link Pseudoterminal.onDidClose}.
  		 * @param callback The callback that will be called when the task is started by a user. Any ${} style variables that
  		 * were in the task definition will be resolved and passed into the callback as `resolvedDefinition`.
  		 */
  def this(callback: js.Function1[/* resolvedDefinition */ TaskDefinition, Thenable[Pseudoterminal]]) = this()
}
