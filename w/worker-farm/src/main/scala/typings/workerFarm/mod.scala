package typings.workerFarm

import org.scalablytyped.runtime.StringDictionary
import typings.node.childProcessMod.ForkOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(name: String): Workers = ^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any]).asInstanceOf[Workers]
  inline def apply(name: String, exportedMethods: js.Array[String]): Workers = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], exportedMethods.asInstanceOf[js.Any])).asInstanceOf[Workers]
  inline def apply(options: FarmOptions, name: String): Workers = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Workers]
  inline def apply(options: FarmOptions, name: String, exportedMethods: js.Array[String]): Workers = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], name.asInstanceOf[js.Any], exportedMethods.asInstanceOf[js.Any])).asInstanceOf[Workers]
  
  @JSImport("worker-farm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def end(workers: Workers): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("end")(workers.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def end(workers: Workers, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("end")(workers.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait FarmOptions extends StObject {
    
    var autoStart: js.UndefOr[Boolean] = js.undefined
    
    var maxCallTime: js.UndefOr[Double] = js.undefined
    
    var maxCallsPerWorker: js.UndefOr[Double] = js.undefined
    
    var maxConcurrentCalls: js.UndefOr[Double] = js.undefined
    
    var maxConcurrentCallsPerWorker: js.UndefOr[Double] = js.undefined
    
    var maxConcurrentWorkers: js.UndefOr[Double] = js.undefined
    
    var maxRetries: js.UndefOr[Double] = js.undefined
    
    var workerOptions: js.UndefOr[ForkOptions] = js.undefined
  }
  object FarmOptions {
    
    inline def apply(): FarmOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FarmOptions]
    }
    
    extension [Self <: FarmOptions](x: Self) {
      
      inline def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
      
      inline def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
      
      inline def setMaxCallTime(value: Double): Self = StObject.set(x, "maxCallTime", value.asInstanceOf[js.Any])
      
      inline def setMaxCallTimeUndefined: Self = StObject.set(x, "maxCallTime", js.undefined)
      
      inline def setMaxCallsPerWorker(value: Double): Self = StObject.set(x, "maxCallsPerWorker", value.asInstanceOf[js.Any])
      
      inline def setMaxCallsPerWorkerUndefined: Self = StObject.set(x, "maxCallsPerWorker", js.undefined)
      
      inline def setMaxConcurrentCalls(value: Double): Self = StObject.set(x, "maxConcurrentCalls", value.asInstanceOf[js.Any])
      
      inline def setMaxConcurrentCallsPerWorker(value: Double): Self = StObject.set(x, "maxConcurrentCallsPerWorker", value.asInstanceOf[js.Any])
      
      inline def setMaxConcurrentCallsPerWorkerUndefined: Self = StObject.set(x, "maxConcurrentCallsPerWorker", js.undefined)
      
      inline def setMaxConcurrentCallsUndefined: Self = StObject.set(x, "maxConcurrentCalls", js.undefined)
      
      inline def setMaxConcurrentWorkers(value: Double): Self = StObject.set(x, "maxConcurrentWorkers", value.asInstanceOf[js.Any])
      
      inline def setMaxConcurrentWorkersUndefined: Self = StObject.set(x, "maxConcurrentWorkers", js.undefined)
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      inline def setWorkerOptions(value: ForkOptions): Self = StObject.set(x, "workerOptions", value.asInstanceOf[js.Any])
      
      inline def setWorkerOptionsUndefined: Self = StObject.set(x, "workerOptions", js.undefined)
    }
  }
  
  type WorkerCallback = WorkerCallback0 | WorkerCallback1 | WorkerCallback2 | WorkerCallback3 | WorkerCallback4
  
  type WorkerCallback0 = js.Function0[Unit]
  
  type WorkerCallback1 = js.Function1[/* arg1 */ Any, Unit]
  
  type WorkerCallback2 = js.Function2[/* arg1 */ Any, /* arg2 */ Any, Unit]
  
  type WorkerCallback3 = js.Function3[/* arg1 */ Any, /* arg2 */ Any, /* arg3 */ Any, Unit]
  
  type WorkerCallback4 = js.Function4[/* arg1 */ Any, /* arg2 */ Any, /* arg3 */ Any, /* arg4 */ Any, Unit]
  
  @js.native
  trait Workers
    extends StObject
       with /* x */ StringDictionary[Workers] {
    
    def apply(arg1: Any, arg2: Any, arg3: Any, arg4: Any, callback: WorkerCallback): Unit = js.native
    def apply(arg1: Any, arg2: Any, arg3: Any, callback: WorkerCallback): Unit = js.native
    def apply(arg1: Any, arg2: Any, callback: WorkerCallback): Unit = js.native
    def apply(arg1: Any, callback: WorkerCallback): Unit = js.native
    def apply(callback: WorkerCallback): Unit = js.native
  }
}
