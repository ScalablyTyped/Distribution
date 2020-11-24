package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskProvider[T /* <: Task */] extends js.Object {
  
  /**
    * Provides tasks.
    * @param token A cancellation token.
    * @return an array of tasks
    */
  def provideTasks(token: CancellationToken): ProviderResult[js.Array[T]] = js.native
  
  /**
    * Resolves a task that has no [`execution`](#Task.execution) set. Tasks are
    * often created from information found in the `tasks.json`-file. Such tasks miss
    * the information on how to execute them and a task provider must fill in
    * the missing information in the `resolveTask`-method. This method will not be
    * called for tasks returned from the above `provideTasks` method since those
    * tasks are always fully resolved. A valid default implementation for the
    * `resolveTask` method is to return `undefined`.
    *
    * @param task The task to resolve.
    * @param token A cancellation token.
    * @return The resolved task
    */
  def resolveTask(task: T, token: CancellationToken): ProviderResult[T] = js.native
}
object TaskProvider {
  
  @scala.inline
  def apply[T /* <: Task */](
    provideTasks: CancellationToken => ProviderResult[js.Array[T]],
    resolveTask: (T, CancellationToken) => ProviderResult[T]
  ): TaskProvider[T] = {
    val __obj = js.Dynamic.literal(provideTasks = js.Any.fromFunction1(provideTasks), resolveTask = js.Any.fromFunction2(resolveTask))
    __obj.asInstanceOf[TaskProvider[T]]
  }
  
  @scala.inline
  implicit class TaskProviderOps[Self <: TaskProvider[_], T /* <: Task */] (val x: Self with TaskProvider[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProvideTasks(value: CancellationToken => ProviderResult[js.Array[T]]): Self = this.set("provideTasks", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResolveTask(value: (T, CancellationToken) => ProviderResult[T]): Self = this.set("resolveTask", js.Any.fromFunction2(value))
  }
}
