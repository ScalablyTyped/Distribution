package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskProvider extends js.Object {
  /**
  		 * Provides tasks.
  		 * @param token A cancellation token.
  		 * @return an array of tasks
  		 */
  def provideTasks(): ProviderResult[js.Array[Task]] = js.native
  def provideTasks(token: CancellationToken): ProviderResult[js.Array[Task]] = js.native
  /**
  		 * Resolves a task that has no [`execution`](#Task.execution) set. Tasks are
  		 * often created from information found in the `task.json`-file. Such tasks miss
  		 * the information on how to execute them and a task provider must fill in
  		 * the missing information in the `resolveTask`-method.
  		 *
  		 * @param task The task to resolve.
  		 * @param token A cancellation token.
  		 * @return The resolved task
  		 */
  def resolveTask(task: Task): ProviderResult[Task] = js.native
  def resolveTask(task: Task, token: CancellationToken): ProviderResult[Task] = js.native
}

