package typings.workerpool.workerpoolMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.Parameters
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkerPool extends js.Object {
  /**
    * Clear all workers from the pool.
    * If parameter force is false (default), workers will finish the tasks they are working on before terminating themselves.
    * When force is true, all workers are terminated immediately without finishing running tasks.
    * @deprecated
    */
  def clear(): Promise[js.Array[_], Error] = js.native
  def clear(force: Boolean): Promise[js.Array[_], Error] = js.native
  def exec[T /* <: js.Function1[/* repeated */ js.Any, _] */](method: T): Promise[ReturnType[T], Error] = js.native
  /**
    * Execute a function on a worker with given arguments.
    * @param method When method is a string, a method with this name must exist at the worker
    * and must be registered to make it accessible via the pool.
    * The function will be executed on the worker with given parameters.
    * When method is a function, the provided function fn will be stringified, send to the worker,
    * and executed there with the provided parameters. The provided function must be static,
    * it must not depend on variables in a surrounding scope.
    */
  def exec[T /* <: js.Function1[/* repeated */ js.Any, _] */](method: T, params: Parameters[T]): Promise[ReturnType[T], Error] = js.native
  def exec[T /* <: js.Function1[/* repeated */ js.Any, _] */](method: String): Promise[ReturnType[T], Error] = js.native
  def exec[T /* <: js.Function1[/* repeated */ js.Any, _] */](method: String, params: Parameters[T]): Promise[ReturnType[T], Error] = js.native
  /**
    * Create a proxy for the worker pool.
    * The proxy contains a proxy for all methods available on the worker.
    * All methods return promises resolving the methods result.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def proxy[T /* <: StringDictionary[js.Function1[/* repeated */ js.Any, _]] */](): Promise[Proxy[T], Error] = js.native
  /** Retrieve statistics on workers, and active and pending tasks. */
  def stats(): WorkerPoolStats = js.native
  /**
    * If parameter force is false (default), workers will finish the tasks they are working on before terminating themselves.
    * When force is true, all workers are terminated immediately without finishing running tasks.
    * If timeout is provided, worker will be forced to terminal when the timeout expires and the worker has not finished.
    */
  def terminate(): Promise[js.Array[_], Error] = js.native
  def terminate(force: Boolean): Promise[js.Array[_], Error] = js.native
  def terminate(force: Boolean, timeout: Double): Promise[js.Array[_], Error] = js.native
}

