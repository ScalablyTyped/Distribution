package typings.workerDashThreadsDashPool.workerDashThreadsDashPoolMod

import typings.node.workerUnderscoreThreadsMod.Worker
import typings.node.workerUnderscoreThreadsMod.WorkerOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pool extends js.Object {
  /**
    * Number of active workers in the pool.
    */
  var size: Double = js.native
  /**
    * @param filename argument passed directly to `new Worker(filename, options)`
    * @param options argument passed directly to `new Worker(filename, options)`
    * @param callback will be called once the worker is created
    */
  def acquire(filename: String, callback: js.Function2[/* error */ Error | Null, /* worker */ Worker, Unit]): Unit = js.native
  def acquire(
    filename: String,
    options: WorkerOptions,
    callback: js.Function2[/* error */ Error | Null, /* worker */ Worker, Unit]
  ): Unit = js.native
  /**
    * Calls `worker.terminate()` on all workers in the pool.
    * @param callback will be called once all workers have terminated
    */
  def destroy(): Unit = js.native
  def destroy(callback: js.Function0[Unit]): Unit = js.native
}

