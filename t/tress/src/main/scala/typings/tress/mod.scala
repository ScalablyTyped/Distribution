package typings.tress

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.tress.tressStrings.missing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  @JSImport("tress", JSImport.Namespace)
  @js.native
  def apply(worker: js.Function2[/* job */ TressJobData, /* done */ TressWorkerDoneCallback, Unit]): TressStatic = js.native
  @JSImport("tress", JSImport.Namespace)
  @js.native
  def apply(
    worker: js.Function2[/* job */ TressJobData, /* done */ TressWorkerDoneCallback, Unit],
    concurrency: Double
  ): TressStatic = js.native
  
  @js.native
  trait TressJob extends StObject {
    
    def callback(args: js.Any*): Unit = js.native
    @JSName("callback")
    var callback_Original: TressJobCallback = js.native
    
    var data: TressJobData = js.native
  }
  
  type TressJobCallback = js.ThisFunction1[/* this */ TressJobData, /* repeated */ js.Any, Unit]
  
  type TressJobData = StringDictionary[js.Object]
  
  @js.native
  trait TressJobQueues extends StObject {
    
    var failed: js.Array[TressJobData] = js.native
    
    var finished: js.Array[TressJobData] = js.native
    
    var waiting: js.Array[TressJobData] = js.native
  }
  object TressJobQueues {
    
    @scala.inline
    def apply(failed: js.Array[TressJobData], finished: js.Array[TressJobData], waiting: js.Array[TressJobData]): TressJobQueues = {
      val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
      __obj.asInstanceOf[TressJobQueues]
    }
    
    @scala.inline
    implicit class TressJobQueuesMutableBuilder[Self <: TressJobQueues] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFailed(value: js.Array[TressJobData]): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailedVarargs(value: TressJobData*): Self = StObject.set(x, "failed", js.Array(value :_*))
      
      @scala.inline
      def setFinished(value: js.Array[TressJobData]): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinishedVarargs(value: TressJobData*): Self = StObject.set(x, "finished", js.Array(value :_*))
      
      @scala.inline
      def setWaiting(value: js.Array[TressJobData]): Self = StObject.set(x, "waiting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitingVarargs(value: TressJobData*): Self = StObject.set(x, "waiting", js.Array(value :_*))
    }
  }
  
  @js.native
  trait TressStatic extends StObject {
    
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
    
    /**
      *  A boolean for determining whether the queue is in a paused state.
      * (readonly - use pause() and resume() instead)
      */
    val paused: Boolean = js.native
    
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
      * false untill any items have been pushed and processed by the queue.
      * Then becomes true and never changes in queue lifecycle (readonly)
      */
    val started: Boolean = js.native
    
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
      * Array of queued jobs (readonly)
      */
    val waiting: js.Array[TressJob] = js.native
    
    /**
      * Returns the array of items currently being processed
      */
    def workersList(): js.Array[TressJob] = js.native
  }
  
  type TressWorkerDoneCallback = js.Function2[/* err */ js.UndefOr[Boolean | Error | Null], /* repeated */ js.Any, Unit]
}
