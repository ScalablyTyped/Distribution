package typings.workerpool.mod

import typings.node.childProcessMod.ForkOptions
import typings.workerpool.workerpoolStrings.auto
import typings.workerpool.workerpoolStrings.max
import typings.workerpool.workerpoolStrings.process
import typings.workerpool.workerpoolStrings.thread
import typings.workerpool.workerpoolStrings.web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkerPoolOptions extends js.Object {
  /** 2nd argument to pass to childProcess.fork() */
  var forkArgs: js.UndefOr[js.Array[String]] = js.native
  var forkOpts: js.UndefOr[ForkOptions] = js.native
  /**
    * The default number of maxWorkers is the number of CPU's minus one.
    * When the number of CPU's could not be determined (for example in older browsers), maxWorkers is set to 3.
    */
  var maxWorkers: js.UndefOr[Double] = js.native
  /**
    * The minimum number of workers that must be initialized and kept available.
    * Setting this to 'max' will create maxWorkers default workers.
    */
  var minWorkers: js.UndefOr[Double | max] = js.native
  /**
    * - In case of `'auto'` (default), workerpool will automatically pick a suitable type of worker:
    *   when in a browser environment, `'web'` will be used. When in a node.js environment, `worker_threads` will be used
    *   if available (Node.js >= 11.7.0), else `child_process` will be used.
    * - In case of `'web'`, a Web Worker will be used. Only available in a browser environment.
    * - In case of `'process'`, `child_process` will be used. Only available in a node.js environment.
    * - In case of `'thread'`, `worker_threads` will be used. If `worker_threads` are not available, an error is thrown.
    *   Only available in a node.js environment.
    */
  var workerType: js.UndefOr[auto | web | process | thread] = js.native
}

object WorkerPoolOptions {
  @scala.inline
  def apply(): WorkerPoolOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerPoolOptions]
  }
  @scala.inline
  implicit class WorkerPoolOptionsOps[Self <: WorkerPoolOptions] (val x: Self) extends AnyVal {
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
    def setForkArgsVarargs(value: String*): Self = this.set("forkArgs", js.Array(value :_*))
    @scala.inline
    def setForkArgs(value: js.Array[String]): Self = this.set("forkArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForkArgs: Self = this.set("forkArgs", js.undefined)
    @scala.inline
    def setForkOpts(value: ForkOptions): Self = this.set("forkOpts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForkOpts: Self = this.set("forkOpts", js.undefined)
    @scala.inline
    def setMaxWorkers(value: Double): Self = this.set("maxWorkers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWorkers: Self = this.set("maxWorkers", js.undefined)
    @scala.inline
    def setMinWorkers(value: Double | max): Self = this.set("minWorkers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWorkers: Self = this.set("minWorkers", js.undefined)
    @scala.inline
    def setWorkerType(value: auto | web | process | thread): Self = this.set("workerType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerType: Self = this.set("workerType", js.undefined)
  }
  
}

