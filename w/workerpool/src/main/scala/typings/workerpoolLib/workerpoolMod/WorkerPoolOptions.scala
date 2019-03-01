package typings
package workerpoolLib.workerpoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerPoolOptions extends js.Object {
  /** 2nd argument to pass to childProcess.fork() */
  var forkArgs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var forkOpts: js.UndefOr[nodeLib.childUnderscoreProcessMod.ForkOptions] = js.undefined
  /**
    * The default number of maxWorkers is the number of CPU's minus one.
    * When the number of CPU's could not be determined (for example in older browsers), maxWorkers is set to 3.
    */
  var maxWorkers: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum number of workers that must be initialized and kept available.
    * Setting this to 'max' will create maxWorkers default workers.
    */
  var minWorkers: js.UndefOr[scala.Double | workerpoolLib.workerpoolLibStrings.max] = js.undefined
}

object WorkerPoolOptions {
  @scala.inline
  def apply(
    forkArgs: js.Array[java.lang.String] = null,
    forkOpts: nodeLib.childUnderscoreProcessMod.ForkOptions = null,
    maxWorkers: scala.Int | scala.Double = null,
    minWorkers: scala.Double | workerpoolLib.workerpoolLibStrings.max = null
  ): WorkerPoolOptions = {
    val __obj = js.Dynamic.literal()
    if (forkArgs != null) __obj.updateDynamic("forkArgs")(forkArgs)
    if (forkOpts != null) __obj.updateDynamic("forkOpts")(forkOpts)
    if (maxWorkers != null) __obj.updateDynamic("maxWorkers")(maxWorkers.asInstanceOf[js.Any])
    if (minWorkers != null) __obj.updateDynamic("minWorkers")(minWorkers.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerPoolOptions]
  }
}

