package typings.workerpool

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.node.childProcessMod.ForkOptions
import typings.std.Error
import typings.std.Parameters
import typings.std.ReturnType
import typings.workerpool.workerpoolStrings.auto
import typings.workerpool.workerpoolStrings.browser
import typings.workerpool.workerpoolStrings.max
import typings.workerpool.workerpoolStrings.node
import typings.workerpool.workerpoolStrings.process
import typings.workerpool.workerpoolStrings.thread
import typings.workerpool.workerpoolStrings.web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workerpool", "Promise")
  @js.native
  class Promise[T, E] () extends StObject {
    
    def always[TT](handler: js.Function0[Promise[TT, Error]]): Promise[TT, Error] = js.native
    
    def cancel(): this.type = js.native
    
    def `catch`[TT](err: js.Function1[/* error */ E, TT]): Promise[T | TT, Error] = js.native
    
    val pending: Boolean = js.native
    
    val rejected: Boolean = js.native
    
    val resolved: Boolean = js.native
    
    def `then`[TT, TE](result: js.Function1[/* r */ T, TT]): Promise[TT | TE, _] = js.native
    def `then`[TT, TE](result: js.Function1[/* r */ T, TT], err: js.Function1[/* r */ E, TE]): Promise[TT | TE, _] = js.native
    
    def timeout(delay: Double): this.type = js.native
  }
  /* static members */
  object Promise {
    
    @JSImport("workerpool", "Promise.CancellationError")
    @js.native
    class CancellationError () extends Error {
      
      @JSName("name")
      var name_CancellationError: typings.workerpool.workerpoolStrings.CancellationError = js.native
    }
    
    @JSImport("workerpool", "Promise.TimeoutError")
    @js.native
    class TimeoutError () extends Error {
      
      @JSName("name")
      var name_TimeoutError: typings.workerpool.workerpoolStrings.TimeoutError = js.native
    }
    
    @JSImport("workerpool", "Promise.all")
    @js.native
    def all(promises: js.Array[Promise[_, _]]): Promise[js.Array[_], _] = js.native
  }
  
  @JSImport("workerpool", "cpus")
  @js.native
  val cpus: Double = js.native
  
  @JSImport("workerpool", "isMainThread")
  @js.native
  val isMainThread: Boolean = js.native
  
  @JSImport("workerpool", "platform")
  @js.native
  val platform: node | browser = js.native
  
  @JSImport("workerpool", "pool")
  @js.native
  def pool(): WorkerPool = js.native
  @JSImport("workerpool", "pool")
  @js.native
  def pool(options: WorkerPoolOptions): WorkerPool = js.native
  @JSImport("workerpool", "pool")
  @js.native
  def pool(pathToScript: js.UndefOr[scala.Nothing], options: WorkerPoolOptions): WorkerPool = js.native
  @JSImport("workerpool", "pool")
  @js.native
  def pool(pathToScript: String): WorkerPool = js.native
  @JSImport("workerpool", "pool")
  @js.native
  def pool(pathToScript: String, options: WorkerPoolOptions): WorkerPool = js.native
  
  @JSImport("workerpool", "worker")
  @js.native
  def worker(): js.Any = js.native
  @JSImport("workerpool", "worker")
  @js.native
  def worker(methods: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): js.Any = js.native
  
  type Proxy[T /* <: StringDictionary[js.Function1[/* repeated */ js.Any, _]] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ M in keyof T ]: (args : std.Parameters<T[M]>): workerpool.workerpool.Promise<std.ReturnType<T[M]>, std.Error>}
    */ typings.workerpool.workerpoolStrings.Proxy with TopLevel[js.Any]
  
  @js.native
  trait WorkerPool extends StObject {
    
    /**
      * Execute a function on a worker with given arguments.
      * @param method When method is a string, a method with this name must exist at the worker
      * and must be registered to make it accessible via the pool.
      * The function will be executed on the worker with given parameters.
      * When method is a function, the provided function fn will be stringified, send to the worker,
      * and executed there with the provided parameters. The provided function must be static,
      * it must not depend on variables in a surrounding scope.
      */
    def exec[T /* <: js.Function1[/* repeated */ js.Any, _] */](method: T): Promise[ReturnType[T], Error] = js.native
    def exec[T /* <: js.Function1[/* repeated */ js.Any, _] */](method: T, params: Parameters[T]): Promise[ReturnType[T], Error] = js.native
    def exec[T /* <: js.Function1[/* repeated */ js.Any, _] */](method: String): Promise[ReturnType[T], Error] = js.native
    def exec[T /* <: js.Function1[/* repeated */ js.Any, _] */](method: String, params: Parameters[T]): Promise[ReturnType[T], Error] = js.native
    
    /**
      * Create a proxy for the worker pool.
      * The proxy contains a proxy for all methods available on the worker.
      * All methods return promises resolving the methods result.
      */
    // tslint:disable-next-line: no-unnecessary-generics
    def proxy[T /* <: StringDictionary[js.Function1[/* repeated */ js.Any, _]] */](): Promise[Proxy[T], Error] = js.native
    
    /** Retrieve statistics on workers, and active and pending tasks. */
    def stats(): WorkerPoolStats = js.native
    
    /**
      * If parameter force is false (default), workers will finish the tasks they are working on before terminating themselves.
      * When force is true, all workers are terminated immediately without finishing running tasks.
      * If timeout is provided, worker will be forced to terminal when the timeout expires and the worker has not finished.
      */
    def terminate(): Promise[js.Array[_], Error] = js.native
    def terminate(force: js.UndefOr[scala.Nothing], timeout: Double): Promise[js.Array[_], Error] = js.native
    def terminate(force: Boolean): Promise[js.Array[_], Error] = js.native
    def terminate(force: Boolean, timeout: Double): Promise[js.Array[_], Error] = js.native
  }
  
  @js.native
  trait WorkerPoolOptions extends StObject {
    
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
    implicit class WorkerPoolOptionsMutableBuilder[Self <: WorkerPoolOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForkArgs(value: js.Array[String]): Self = StObject.set(x, "forkArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForkArgsUndefined: Self = StObject.set(x, "forkArgs", js.undefined)
      
      @scala.inline
      def setForkArgsVarargs(value: String*): Self = StObject.set(x, "forkArgs", js.Array(value :_*))
      
      @scala.inline
      def setForkOpts(value: ForkOptions): Self = StObject.set(x, "forkOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForkOptsUndefined: Self = StObject.set(x, "forkOpts", js.undefined)
      
      @scala.inline
      def setMaxWorkers(value: Double): Self = StObject.set(x, "maxWorkers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWorkersUndefined: Self = StObject.set(x, "maxWorkers", js.undefined)
      
      @scala.inline
      def setMinWorkers(value: Double | max): Self = StObject.set(x, "minWorkers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWorkersUndefined: Self = StObject.set(x, "minWorkers", js.undefined)
      
      @scala.inline
      def setWorkerType(value: auto | web | process | thread): Self = StObject.set(x, "workerType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkerTypeUndefined: Self = StObject.set(x, "workerType", js.undefined)
    }
  }
  
  @js.native
  trait WorkerPoolStats extends StObject {
    
    var activeTasks: Double = js.native
    
    var busyWorkers: Double = js.native
    
    var idleWorkers: Double = js.native
    
    var pendingTasks: Double = js.native
    
    var totalWorkers: Double = js.native
  }
  object WorkerPoolStats {
    
    @scala.inline
    def apply(
      activeTasks: Double,
      busyWorkers: Double,
      idleWorkers: Double,
      pendingTasks: Double,
      totalWorkers: Double
    ): WorkerPoolStats = {
      val __obj = js.Dynamic.literal(activeTasks = activeTasks.asInstanceOf[js.Any], busyWorkers = busyWorkers.asInstanceOf[js.Any], idleWorkers = idleWorkers.asInstanceOf[js.Any], pendingTasks = pendingTasks.asInstanceOf[js.Any], totalWorkers = totalWorkers.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkerPoolStats]
    }
    
    @scala.inline
    implicit class WorkerPoolStatsMutableBuilder[Self <: WorkerPoolStats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveTasks(value: Double): Self = StObject.set(x, "activeTasks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBusyWorkers(value: Double): Self = StObject.set(x, "busyWorkers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdleWorkers(value: Double): Self = StObject.set(x, "idleWorkers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPendingTasks(value: Double): Self = StObject.set(x, "pendingTasks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalWorkers(value: Double): Self = StObject.set(x, "totalWorkers", value.asInstanceOf[js.Any])
    }
  }
}
