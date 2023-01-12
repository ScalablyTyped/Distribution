package typings.workerpool

import org.scalablytyped.runtime.StringDictionary
import typings.node.childProcessMod.ForkOptions
import typings.std.Error
import typings.std.Parameters
import typings.std.ReturnType
import typings.workerpool.anon.On
import typings.workerpool.workerpoolStrings.auto
import typings.workerpool.workerpoolStrings.browser
import typings.workerpool.workerpoolStrings.max
import typings.workerpool.workerpoolStrings.node
import typings.workerpool.workerpoolStrings.process
import typings.workerpool.workerpoolStrings.thread
import typings.workerpool.workerpoolStrings.web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workerpool", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("workerpool", "Promise")
  @js.native
  open class Promise[T, E] () extends StObject {
    
    def always[TT](handler: js.Function0[Promise[TT, js.Error]]): Promise[TT, js.Error] = js.native
    
    def cancel(): this.type = js.native
    
    def `catch`[TT](err: js.Function1[/* error */ E, TT]): Promise[T | TT, js.Error] = js.native
    
    val pending: Boolean = js.native
    
    val rejected: Boolean = js.native
    
    val resolved: Boolean = js.native
    
    def `then`[TT, TE](result: js.Function1[/* r */ T, TT]): Promise[TT | TE, Any] = js.native
    def `then`[TT, TE](result: js.Function1[/* r */ T, TT], err: js.Function1[/* r */ E, TE]): Promise[TT | TE, Any] = js.native
    
    def timeout(delay: Double): this.type = js.native
  }
  /* static members */
  object Promise {
    
    @JSImport("workerpool", "Promise")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("workerpool", "Promise.CancellationError")
    @js.native
    open class CancellationError ()
      extends StObject
         with Error {
      
      /* standard es5 */
      /* CompleteClass */
      var message: String = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var name: String = js.native
      @JSName("name")
      var name_CancellationError: typings.workerpool.workerpoolStrings.CancellationError = js.native
    }
    
    @JSImport("workerpool", "Promise.TimeoutError")
    @js.native
    open class TimeoutError ()
      extends StObject
         with Error {
      
      /* standard es5 */
      /* CompleteClass */
      var message: String = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var name: String = js.native
      @JSName("name")
      var name_TimeoutError: typings.workerpool.workerpoolStrings.TimeoutError = js.native
    }
    
    inline def all(promises: js.Array[Promise[Any, Any]]): Promise[js.Array[Any], Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(promises.asInstanceOf[js.Any]).asInstanceOf[Promise[js.Array[Any], Any]]
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
  
  inline def pool(): WorkerPool = ^.asInstanceOf[js.Dynamic].applyDynamic("pool")().asInstanceOf[WorkerPool]
  inline def pool(options: WorkerPoolOptions): WorkerPool = ^.asInstanceOf[js.Dynamic].applyDynamic("pool")(options.asInstanceOf[js.Any]).asInstanceOf[WorkerPool]
  inline def pool(pathToScript: String): WorkerPool = ^.asInstanceOf[js.Dynamic].applyDynamic("pool")(pathToScript.asInstanceOf[js.Any]).asInstanceOf[WorkerPool]
  inline def pool(pathToScript: String, options: WorkerPoolOptions): WorkerPool = (^.asInstanceOf[js.Dynamic].applyDynamic("pool")(pathToScript.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WorkerPool]
  inline def pool(pathToScript: Unit, options: WorkerPoolOptions): WorkerPool = (^.asInstanceOf[js.Dynamic].applyDynamic("pool")(pathToScript.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WorkerPool]
  
  inline def worker(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("worker")().asInstanceOf[Any]
  inline def worker(methods: StringDictionary[js.Function1[/* repeated */ Any, Any]]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("worker")(methods.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def workerEmit(payload: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("workerEmit")(payload.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ M in keyof T ]: (args : std.Parameters<T[M]>): workerpool.workerpool.Promise<std.ReturnType<T[M]>, std.Error>}
    }}}
    */
  @js.native
  trait Proxy[T /* <: StringDictionary[js.Function1[/* repeated */ Any, Any]] */] extends StObject
  
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
    def exec[T /* <: js.Function1[/* repeated */ Any, Any] */](method: T): Promise[ReturnType[T], js.Error] = js.native
    def exec[T /* <: js.Function1[/* repeated */ Any, Any] */](method: T, params: Null, options: On): Promise[ReturnType[T], js.Error] = js.native
    def exec[T /* <: js.Function1[/* repeated */ Any, Any] */](method: T, params: Parameters[T]): Promise[ReturnType[T], js.Error] = js.native
    def exec[T /* <: js.Function1[/* repeated */ Any, Any] */](method: T, params: Parameters[T], options: On): Promise[ReturnType[T], js.Error] = js.native
    def exec[T /* <: js.Function1[/* repeated */ Any, Any] */](method: String): Promise[ReturnType[T], js.Error] = js.native
    def exec[T /* <: js.Function1[/* repeated */ Any, Any] */](method: String, params: Null, options: On): Promise[ReturnType[T], js.Error] = js.native
    def exec[T /* <: js.Function1[/* repeated */ Any, Any] */](method: String, params: Parameters[T]): Promise[ReturnType[T], js.Error] = js.native
    def exec[T /* <: js.Function1[/* repeated */ Any, Any] */](method: String, params: Parameters[T], options: On): Promise[ReturnType[T], js.Error] = js.native
    
    /**
      * Create a proxy for the worker pool.
      * The proxy contains a proxy for all methods available on the worker.
      * All methods return promises resolving the methods result.
      */
    // tslint:disable-next-line: no-unnecessary-generics
    def proxy[T /* <: StringDictionary[js.Function1[/* repeated */ Any, Any]] */](): Promise[Proxy[T], js.Error] = js.native
    
    /** Retrieve statistics on workers, and active and pending tasks. */
    def stats(): WorkerPoolStats = js.native
    
    /**
      * If parameter force is false (default), workers will finish the tasks they are working on before terminating themselves.
      * When force is true, all workers are terminated immediately without finishing running tasks.
      * If timeout is provided, worker will be forced to terminal when the timeout expires and the worker has not finished.
      */
    def terminate(): Promise[js.Array[Any], js.Error] = js.native
    def terminate(force: Boolean): Promise[js.Array[Any], js.Error] = js.native
    def terminate(force: Boolean, timeout: Double): Promise[js.Array[Any], js.Error] = js.native
    def terminate(force: Unit, timeout: Double): Promise[js.Array[Any], js.Error] = js.native
  }
  
  trait WorkerPoolOptions extends StObject {
    
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
      * - In case of `'auto'` (default), workerpool will automatically pick a suitable type of worker:
      *   when in a browser environment, `'web'` will be used. When in a node.js environment, `worker_threads` will be used
      *   if available (Node.js >= 11.7.0), else `child_process` will be used.
      * - In case of `'web'`, a Web Worker will be used. Only available in a browser environment.
      * - In case of `'process'`, `child_process` will be used. Only available in a node.js environment.
      * - In case of `'thread'`, `worker_threads` will be used. If `worker_threads` are not available, an error is thrown.
      *   Only available in a node.js environment.
      */
    var workerType: js.UndefOr[auto | web | process | thread] = js.undefined
  }
  object WorkerPoolOptions {
    
    inline def apply(): WorkerPoolOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkerPoolOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WorkerPoolOptions] (val x: Self) extends AnyVal {
      
      inline def setForkArgs(value: js.Array[String]): Self = StObject.set(x, "forkArgs", value.asInstanceOf[js.Any])
      
      inline def setForkArgsUndefined: Self = StObject.set(x, "forkArgs", js.undefined)
      
      inline def setForkArgsVarargs(value: String*): Self = StObject.set(x, "forkArgs", js.Array(value*))
      
      inline def setForkOpts(value: ForkOptions): Self = StObject.set(x, "forkOpts", value.asInstanceOf[js.Any])
      
      inline def setForkOptsUndefined: Self = StObject.set(x, "forkOpts", js.undefined)
      
      inline def setMaxWorkers(value: Double): Self = StObject.set(x, "maxWorkers", value.asInstanceOf[js.Any])
      
      inline def setMaxWorkersUndefined: Self = StObject.set(x, "maxWorkers", js.undefined)
      
      inline def setMinWorkers(value: Double | max): Self = StObject.set(x, "minWorkers", value.asInstanceOf[js.Any])
      
      inline def setMinWorkersUndefined: Self = StObject.set(x, "minWorkers", js.undefined)
      
      inline def setWorkerType(value: auto | web | process | thread): Self = StObject.set(x, "workerType", value.asInstanceOf[js.Any])
      
      inline def setWorkerTypeUndefined: Self = StObject.set(x, "workerType", js.undefined)
    }
  }
  
  trait WorkerPoolStats extends StObject {
    
    var activeTasks: Double
    
    var busyWorkers: Double
    
    var idleWorkers: Double
    
    var pendingTasks: Double
    
    var totalWorkers: Double
  }
  object WorkerPoolStats {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: WorkerPoolStats] (val x: Self) extends AnyVal {
      
      inline def setActiveTasks(value: Double): Self = StObject.set(x, "activeTasks", value.asInstanceOf[js.Any])
      
      inline def setBusyWorkers(value: Double): Self = StObject.set(x, "busyWorkers", value.asInstanceOf[js.Any])
      
      inline def setIdleWorkers(value: Double): Self = StObject.set(x, "idleWorkers", value.asInstanceOf[js.Any])
      
      inline def setPendingTasks(value: Double): Self = StObject.set(x, "pendingTasks", value.asInstanceOf[js.Any])
      
      inline def setTotalWorkers(value: Double): Self = StObject.set(x, "totalWorkers", value.asInstanceOf[js.Any])
    }
  }
}
