package typings.tress.tressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tress", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Creates queue object that will store jobs and process them with worker function
    * in parallel (up to the concurrency limit)
    * @param worker An asynchronous function for processing a queued job,
    * which must call its done argument when finished.
    * Callback done may take various argumens,
    * but first argument must be error (if job failed),
    * null/undefined (if job successfully finished)
    * or boolean (if job returned to queue head (if true)
    * or to queue tail (if false))
    * @param concurrency An integer for determining how many worker functions
    * should be run in parallel. If omitted, the concurrency defaults to 1.
    * If negative - no parallel and delay between worker functions (concurrency -1,000 sets 1 second delay)
    */
  def apply(worker: js.Function2[/* job */ TressJobData, /* done */ TressWorkerDoneCallback, Unit]): TressStatic = js.native
  def apply(
    worker: js.Function2[/* job */ TressJobData, /* done */ TressWorkerDoneCallback, Unit],
    concurrency: Double
  ): TressStatic = js.native
}

