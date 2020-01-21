package typings.tress.mod

import typings.std.Error
import typings.tress.tressStrings.missing
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
  var buffer: Double = js.native
  /**
  		 * This property for alter the concurrency/delay on-the-fly
  		 */
  var concurrency: Double = js.native
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
  val paused: Boolean = js.native
  /**
  		 * false untill any items have been pushed and processed by the queue.
  		 * Then becomes true and never changes in queue lifecycle (readonly)
  		 */
  val started: Boolean = js.native
  /**
  		 * Array of queued jobs (readonly)
  		 */
  val waiting: js.Array[TressJob] = js.native
  // Callbacks
  /**
  		 * A callback that is called when the last item from the queue has returned from the worker
  		 */
  def drain(): Unit = js.native
  /**
  		 * A callback that is called when the last item from the queue is given to a worker
  		 */
  def empty(): Unit = js.native
  /**
  		 * A callback that is called when job failed (worker call done with error as first argument).
  		 * Note, that this callback is called after job has been moved from active to failed/finished and after job callback (from push/unshift) was called
  		 */
  def error(err: Error, job: TressJobData, args: js.Any*): Unit = js.native
  // Methods
  /**
  		 * Returns false if there are items waiting or being processed,
  		 * or true if not
  		 */
  def idle(): Boolean = js.native
  /**
  		 * Removes the drain callback and empties remaining jobs from the queue
  		 * forcing it to go idle
  		 */
  def kill(): Unit = js.native
  /**
  		 * Returns the number of items waiting to be processed
  		 */
  def length(): Double = js.native
  /**
  		 * Loads new arrays from data object to waiting, failed, and finished arrays and sets active to empty array.
  		 * Rises an error if started is true
  		 */
  def load(data: TressJobQueues): Unit = js.native
  /**
  		 * Pauses the processing of jobs until resume() is called
  		 */
  def pause(): Unit = js.native
  def push(job: js.Array[TressJobData]): Unit = js.native
  def push(job: js.Array[TressJobData], done: TressJobCallback): Unit = js.native
  /**
  		 * Adds a new job to the queue.
  		 * Instead of a single job, a jobs array can be submitted.
  		 * Note, that if you pass callback as second argument,
  		 * tress calls this callback once the worker has finished processing the job
  		 */
  def push(job: TressJobData): Unit = js.native
  def push(job: TressJobData, done: TressJobCallback): Unit = js.native
  /**
  		 * Resumes the processing of queued jobs when the queue is paused
  		 */
  def resume(): Unit = js.native
  /**
  		 * A  callback that is called when job returned to queue (worker call done with boolean as first argument)
  		 */
  def retry(args: js.Any*): Unit = js.native
  /**
  		 * Returns the number of items currently being processed
  		 */
  def running(): Double = js.native
  /**
  		 * A callback that is called when the number of running workers hits the concurrency limit, and further jobs will be queued
  		 */
  def saturated(): Unit = js.native
  /**
  		 * Runs a callback with object, that contains arrays of waiting, failed, and finished jobs.
  		 * If there are any active jobs at the moment, they will be concatenated to waiting array
  		 */
  def save(callback: js.Function1[/* data */ TressJobQueues, Unit]): Unit = js.native
  /**
  		 * Returns the status of job ("waiting", "running", "finished", "pending" or "missing")
  		 */
  def status(job: TressJob): typings.tress.tressStrings.active | typings.tress.tressStrings.failed | typings.tress.tressStrings.finished | missing | typings.tress.tressStrings.waiting = js.native
  /**
  		 * A callback that is called when job correctly finished (worker call done with null or undefined as first argument).
  		 * Note, that this callback is called after job has been moved from active to failed/finished and after job callback (from push/unshift) was called
  		 */
  def success(args: js.Any*): Unit = js.native
  /**
  		 * A callback that is called when the number of running workers is less than the concurrency & buffer limits, and further jobs will not be queued
  		 */
  def unsaturated(): Unit = js.native
  def unshift(job: js.Array[TressJobData]): Unit = js.native
  def unshift(job: js.Array[TressJobData], done: TressJobCallback): Unit = js.native
  /**
  		 * Adds a new job to the front of the queue.
  		 * Instead of a single job, a jobs array can be submitted.
  		 * Note, that if you pass callback as second argument,
  		 * tress calls this callback once the worker has finished processing the job
  		 */
  def unshift(job: TressJobData): Unit = js.native
  def unshift(job: TressJobData, done: TressJobCallback): Unit = js.native
  /**
  		 * Returns the array of items currently being processed
  		 */
  def workersList(): js.Array[TressJob] = js.native
}

