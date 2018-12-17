package typings
package workerDashThreadsDashPoolLib.workerDashThreadsDashPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pool extends js.Object {
  /**
       * Number of active workers in the pool.
       */
  var size: scala.Double = js.native
  /**
       * @param filename argument passed directly to `new Worker(filename, options)`
       * @param options argument passed directly to `new Worker(filename, options)`
       * @param callback will be called once the worker is created
       */
  def acquire(
    filename: java.lang.String,
    callback: js.Function2[
      /* error */ nodeLib.Error | scala.Null, 
      /* worker */ nodeLib.workerUnderscoreThreadsMod.Worker, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def acquire(
    filename: java.lang.String,
    options: nodeLib.workerUnderscoreThreadsMod.WorkerOptions,
    callback: js.Function2[
      /* error */ nodeLib.Error | scala.Null, 
      /* worker */ nodeLib.workerUnderscoreThreadsMod.Worker, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Calls `worker.terminate()` on all workers in the pool.
       * @param callback will be called once all workers have terminated
       */
  def destroy(): scala.Unit = js.native
  /**
       * Calls `worker.terminate()` on all workers in the pool.
       * @param callback will be called once all workers have terminated
       */
  def destroy(callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

