package typings.workerpool.workerpoolMod

import typings.node.childUnderscoreProcessMod.ForkOptions
import typings.workerpool.workerpoolStrings.auto
import typings.workerpool.workerpoolStrings.max
import typings.workerpool.workerpoolStrings.process
import typings.workerpool.workerpoolStrings.thread
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerPoolOptions extends js.Object {
  /** 2nd argument to pass to childProcess.fork() */
  var forkArgs: js.UndefOr[js.Array[String]] = js.undefined
  var forkOpts: js.UndefOr[ForkOptions] = js.undefined
  /**
    * The default number of maxWorkers is the number of CPU's minus one.
    * When the number of CPU's could not be determined (for example in older browsers), maxWorkers is set to 3.
    */
  var maxWorkers: js.UndefOr[Double] = js.undefined
  /**
    * The minimum number of workers that must be initialized and kept available.
    * Setting this to 'max' will create maxWorkers default workers.
    */
  var minWorkers: js.UndefOr[Double | max] = js.undefined
  /**
    * In case of 'process' (default), child_process will be used.
    * In case of 'thread', worker_threads will be used. If worker_threads are not available, an error is thrown.
    * In case of 'auto', worker_threads will be used if available (Node.js >= 11.7.0), else child_process will be used as fallback.
    */
  var nodeWorker: js.UndefOr[process | thread | auto] = js.undefined
}

object WorkerPoolOptions {
  @scala.inline
  def apply(
    forkArgs: js.Array[String] = null,
    forkOpts: ForkOptions = null,
    maxWorkers: Int | Double = null,
    minWorkers: Double | max = null,
    nodeWorker: process | thread | auto = null
  ): WorkerPoolOptions = {
    val __obj = js.Dynamic.literal()
    if (forkArgs != null) __obj.updateDynamic("forkArgs")(forkArgs)
    if (forkOpts != null) __obj.updateDynamic("forkOpts")(forkOpts)
    if (maxWorkers != null) __obj.updateDynamic("maxWorkers")(maxWorkers.asInstanceOf[js.Any])
    if (minWorkers != null) __obj.updateDynamic("minWorkers")(minWorkers.asInstanceOf[js.Any])
    if (nodeWorker != null) __obj.updateDynamic("nodeWorker")(nodeWorker.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerPoolOptions]
  }
}

