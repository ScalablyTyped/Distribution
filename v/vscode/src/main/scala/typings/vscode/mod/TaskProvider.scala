package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskProvider[T /* <: Task */] extends StObject {
  
  /**
    * Provides tasks.
    * @param token A cancellation token.
    * @return an array of tasks
    */
  def provideTasks(token: CancellationToken): ProviderResult[js.Array[T]]
  
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
  def resolveTask(task: T, token: CancellationToken): ProviderResult[T]
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
  implicit class TaskProviderMutableBuilder[Self <: TaskProvider[?], T /* <: Task */] (val x: Self & TaskProvider[T]) extends AnyVal {
    
    @scala.inline
    def setProvideTasks(value: CancellationToken => ProviderResult[js.Array[T]]): Self = StObject.set(x, "provideTasks", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResolveTask(value: (T, CancellationToken) => ProviderResult[T]): Self = StObject.set(x, "resolveTask", js.Any.fromFunction2(value))
  }
}
