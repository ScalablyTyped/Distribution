package typings.tress

import org.scalablytyped.runtime.StringDictionary
import typings.tress.tressStrings.missing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  inline def apply(worker: js.Function2[/* job */ TressJobData, /* done */ TressWorkerDoneCallback, Unit]): TressStatic = ^.asInstanceOf[js.Dynamic].apply(worker.asInstanceOf[js.Any]).asInstanceOf[TressStatic]
  inline def apply(
    worker: js.Function2[/* job */ TressJobData, /* done */ TressWorkerDoneCallback, Unit],
    concurrency: Double
  ): TressStatic = (^.asInstanceOf[js.Dynamic].apply(worker.asInstanceOf[js.Any], concurrency.asInstanceOf[js.Any])).asInstanceOf[TressStatic]
  
  @JSImport("tress", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait TressJob extends StObject {
    
    def callback(args: Any*): Unit
    @JSName("callback")
    var callback_Original: TressJobCallback
    
    var data: TressJobData
  }
  object TressJob {
    
    inline def apply(callback: TressJobCallback, data: TressJobData): TressJob = {
      val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[TressJob]
    }
    
    extension [Self <: TressJob](x: Self) {
      
      inline def setCallback(value: TressJobCallback): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setData(value: TressJobData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TressJobCallback extends StObject {
    
    def apply(args: Any*): Unit = js.native
  }
  
  type TressJobData = StringDictionary[js.Object]
  
  trait TressJobQueues extends StObject {
    
    var failed: js.Array[TressJobData]
    
    var finished: js.Array[TressJobData]
    
    var waiting: js.Array[TressJobData]
  }
  object TressJobQueues {
    
    inline def apply(failed: js.Array[TressJobData], finished: js.Array[TressJobData], waiting: js.Array[TressJobData]): TressJobQueues = {
      val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
      __obj.asInstanceOf[TressJobQueues]
    }
    
    extension [Self <: TressJobQueues](x: Self) {
      
      inline def setFailed(value: js.Array[TressJobData]): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
      
      inline def setFailedVarargs(value: TressJobData*): Self = StObject.set(x, "failed", js.Array(value*))
      
      inline def setFinished(value: js.Array[TressJobData]): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
      
      inline def setFinishedVarargs(value: TressJobData*): Self = StObject.set(x, "finished", js.Array(value*))
      
      inline def setWaiting(value: js.Array[TressJobData]): Self = StObject.set(x, "waiting", value.asInstanceOf[js.Any])
      
      inline def setWaitingVarargs(value: TressJobData*): Self = StObject.set(x, "waiting", js.Array(value*))
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
    def error(err: js.Error, job: TressJobData, args: Any*): Unit = js.native
    
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
    def retry(args: Any*): Unit = js.native
    
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
    def success(args: Any*): Unit = js.native
    
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
  
  @js.native
  trait TressWorkerDoneCallback extends StObject {
    
    def apply(err: js.Error, args: Any*): Unit = js.native
    def apply(err: Boolean, args: Any*): Unit = js.native
    def apply(err: Null, args: Any*): Unit = js.native
    def apply(err: Unit, args: Any*): Unit = js.native
  }
}
