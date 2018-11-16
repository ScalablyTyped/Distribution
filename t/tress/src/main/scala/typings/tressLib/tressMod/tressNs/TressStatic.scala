package typings
package tressLib.tressMod.tressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TressStatic extends js.Object {
  // Properties
  /**
  		 * Array of jobs currently being processed (readonly)
  		 */
  val active: js.Array[TressJob] = js.native
  /**
  		 * A minimum threshold buffer in order to say that the queue is unsaturated
  		 */
  var buffer: scala.Double = js.native
  /**
  		 * This property for alter the concurrency/delay on-the-fly
  		 */
  var concurrency: scala.Double = js.native
  /**
  		 * Array of failed jobs
  		 * (the done callback was called from worker with error in first argument) (readonly)
  		 */
  val failed: js.Array[TressJob] = js.native
  /**
  		 * Array of correctly finished jobs
  		 * (the done callback was called from worker with null or undefined (or any other false equivalent) in first argument) (readonly)
  		 */
  val finished: js.Array[TressJob] = js.native
  /**
  		 *  A boolean for determining whether the queue is in a paused state.
  		 * (readonly - use pause() and resume() instead)
  		 */
  val paused: scala.Boolean = js.native
  /**
  		 * false untill any items have been pushed and processed by the queue.
  		 * Then becomes true and never changes in queue lifecycle (readonly)
  		 */
  val started: scala.Boolean = js.native
  /**
  		 * Array of queued jobs (readonly)
  		 */
  val waiting: js.Array[TressJob] = js.native
  // Callbacks
  /**
  		 * A callback that is called when the last item from the queue has returned from the worker
  		 */
  def drain(): scala.Unit = js.native
  /**
  		 * A callback that is called when the last item from the queue is given to a worker
  		 */
  def empty(): scala.Unit = js.native
  /**
  		 * A callback that is called when job failed (worker call done with error as first argument).
  		 * Note, that this callback is called after job has been moved from active to failed/finished and after job callback (from push/unshift) was called
  		 */
  def error(`this`: TressJobData, err: stdLib.Error, job: TressJobData, args: js.Any*): scala.Unit = js.native
  // Methods
  /**
  		 * Returns false if there are items waiting or being processed,
  		 * or true if not
  		 */
  def idle(): scala.Boolean = js.native
  /**
  		 * Removes the drain callback and empties remaining jobs from the queue
  		 * forcing it to go idle
  		 */
  def kill(): scala.Unit = js.native
  /**
  		 * Returns the number of items waiting to be processed
  		 */
  def length(): scala.Double = js.native
  /**
  		 * Loads new arrays from data object to waiting, failed, and finished arrays and sets active to empty array.
  		 * Rises an error if started is true
  		 */
  def load(data: TressJobQueues): scala.Unit = js.native
  /**
  		 * Pauses the processing of jobs until resume() is called
  		 */
  def pause(): scala.Unit = js.native
  /**
  		 * Adds a new job to the queue.
  		 * Instead of a single job, a jobs array can be submitted.
  		 * Note, that if you pass callback as second argument,
  		 * tress calls this callback once the worker has finished processing the job
  		 */
  def push(job: js.Array[TressJobData]): scala.Unit = js.native
  /**
  		 * Adds a new job to the queue.
  		 * Instead of a single job, a jobs array can be submitted.
  		 * Note, that if you pass callback as second argument,
  		 * tress calls this callback once the worker has finished processing the job
  		 */
  def push(job: js.Array[TressJobData], done: TressJobCallback): scala.Unit = js.native
  /**
  		 * Adds a new job to the queue.
  		 * Instead of a single job, a jobs array can be submitted.
  		 * Note, that if you pass callback as second argument,
  		 * tress calls this callback once the worker has finished processing the job
  		 */
  def push(job: TressJobData): scala.Unit = js.native
  /**
  		 * Adds a new job to the queue.
  		 * Instead of a single job, a jobs array can be submitted.
  		 * Note, that if you pass callback as second argument,
  		 * tress calls this callback once the worker has finished processing the job
  		 */
  def push(job: TressJobData, done: TressJobCallback): scala.Unit = js.native
  /**
  		 * Resumes the processing of queued jobs when the queue is paused
  		 */
  def resume(): scala.Unit = js.native
  /**
  		 * A  callback that is called when job returned to queue (worker call done with boolean as first argument)
  		 */
  def retry(`this`: TressJobData, args: js.Any*): scala.Unit = js.native
  /**
  		 * Returns the number of items currently being processed
  		 */
  def running(): scala.Double = js.native
  /**
  		 * A callback that is called when the number of running workers hits the concurrency limit, and further jobs will be queued
  		 */
  def saturated(): scala.Unit = js.native
  /**
  		 * Runs a callback with object, that contains arrays of waiting, failed, and finished jobs.
  		 * If there are any active jobs at the moment, they will be concatenated to waiting array
  		 */
  def save(callback: js.Function1[/* data */ TressJobQueues, scala.Unit]): scala.Unit = js.native
  /**
  		 * Returns the status of job ("waiting", "running", "finished", "pending" or "missing")
  		 */
  def status(job: TressJob): tressLib.tressLibStrings.active | tressLib.tressLibStrings.failed | tressLib.tressLibStrings.finished | tressLib.tressLibStrings.missing | tressLib.tressLibStrings.waiting = js.native
  /**
  		 * A callback that is called when job correctly finished (worker call done with null or undefined as first argument).
  		 * Note, that this callback is called after job has been moved from active to failed/finished and after job callback (from push/unshift) was called
  		 */
  def success(`this`: TressJobData, args: js.Any*): scala.Unit = js.native
  /**
  		 * A callback that is called when the number of running workers is less than the concurrency & buffer limits, and further jobs will not be queued
  		 */
  def unsaturated(): scala.Unit = js.native
  /**
  		 * Adds a new job to the front of the queue.
  		 * Instead of a single job, a jobs array can be submitted.
  		 * Note, that if you pass callback as second argument,
  		 * tress calls this callback once the worker has finished processing the job
  		 */
  def unshift(job: js.Array[TressJobData]): scala.Unit = js.native
  /**
  		 * Adds a new job to the front of the queue.
  		 * Instead of a single job, a jobs array can be submitted.
  		 * Note, that if you pass callback as second argument,
  		 * tress calls this callback once the worker has finished processing the job
  		 */
  def unshift(job: js.Array[TressJobData], done: TressJobCallback): scala.Unit = js.native
  /**
  		 * Adds a new job to the front of the queue.
  		 * Instead of a single job, a jobs array can be submitted.
  		 * Note, that if you pass callback as second argument,
  		 * tress calls this callback once the worker has finished processing the job
  		 */
  def unshift(job: TressJobData): scala.Unit = js.native
  /**
  		 * Adds a new job to the front of the queue.
  		 * Instead of a single job, a jobs array can be submitted.
  		 * Note, that if you pass callback as second argument,
  		 * tress calls this callback once the worker has finished processing the job
  		 */
  def unshift(job: TressJobData, done: TressJobCallback): scala.Unit = js.native
  /**
  		 * Returns the array of items currently being processed
  		 */
  def workersList(): js.Array[TressJob] = js.native
}

