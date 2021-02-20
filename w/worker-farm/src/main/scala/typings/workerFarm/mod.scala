package typings.workerFarm

import org.scalablytyped.runtime.StringDictionary
import typings.node.childProcessMod.ForkOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("worker-farm", JSImport.Namespace)
  @js.native
  def apply(name: String): Workers = js.native
  @JSImport("worker-farm", JSImport.Namespace)
  @js.native
  def apply(name: String, exportedMethods: js.Array[String]): Workers = js.native
  @JSImport("worker-farm", JSImport.Namespace)
  @js.native
  def apply(options: FarmOptions, name: String): Workers = js.native
  @JSImport("worker-farm", JSImport.Namespace)
  @js.native
  def apply(options: FarmOptions, name: String, exportedMethods: js.Array[String]): Workers = js.native
  
  @JSImport("worker-farm", "end")
  @js.native
  def end(workers: Workers): Unit = js.native
  @JSImport("worker-farm", "end")
  @js.native
  def end(workers: Workers, callback: js.Function): Unit = js.native
  
  @js.native
  trait FarmOptions extends StObject {
    
    var autoStart: js.UndefOr[Boolean] = js.native
    
    var maxCallTime: js.UndefOr[Double] = js.native
    
    var maxCallsPerWorker: js.UndefOr[Double] = js.native
    
    var maxConcurrentCalls: js.UndefOr[Double] = js.native
    
    var maxConcurrentCallsPerWorker: js.UndefOr[Double] = js.native
    
    var maxConcurrentWorkers: js.UndefOr[Double] = js.native
    
    var maxRetries: js.UndefOr[Double] = js.native
    
    var workerOptions: js.UndefOr[ForkOptions] = js.native
  }
  object FarmOptions {
    
    @scala.inline
    def apply(): FarmOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FarmOptions]
    }
    
    @scala.inline
    implicit class FarmOptionsMutableBuilder[Self <: FarmOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
      
      @scala.inline
      def setMaxCallTime(value: Double): Self = StObject.set(x, "maxCallTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxCallTimeUndefined: Self = StObject.set(x, "maxCallTime", js.undefined)
      
      @scala.inline
      def setMaxCallsPerWorker(value: Double): Self = StObject.set(x, "maxCallsPerWorker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxCallsPerWorkerUndefined: Self = StObject.set(x, "maxCallsPerWorker", js.undefined)
      
      @scala.inline
      def setMaxConcurrentCalls(value: Double): Self = StObject.set(x, "maxConcurrentCalls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxConcurrentCallsPerWorker(value: Double): Self = StObject.set(x, "maxConcurrentCallsPerWorker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxConcurrentCallsPerWorkerUndefined: Self = StObject.set(x, "maxConcurrentCallsPerWorker", js.undefined)
      
      @scala.inline
      def setMaxConcurrentCallsUndefined: Self = StObject.set(x, "maxConcurrentCalls", js.undefined)
      
      @scala.inline
      def setMaxConcurrentWorkers(value: Double): Self = StObject.set(x, "maxConcurrentWorkers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxConcurrentWorkersUndefined: Self = StObject.set(x, "maxConcurrentWorkers", js.undefined)
      
      @scala.inline
      def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      @scala.inline
      def setWorkerOptions(value: ForkOptions): Self = StObject.set(x, "workerOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkerOptionsUndefined: Self = StObject.set(x, "workerOptions", js.undefined)
    }
  }
  
  type WorkerCallback = WorkerCallback0 | WorkerCallback1 | WorkerCallback2 | WorkerCallback3 | WorkerCallback4
  
  type WorkerCallback0 = js.Function0[Unit]
  
  type WorkerCallback1 = js.Function1[/* arg1 */ js.Any, Unit]
  
  type WorkerCallback2 = js.Function2[/* arg1 */ js.Any, /* arg2 */ js.Any, Unit]
  
  type WorkerCallback3 = js.Function3[/* arg1 */ js.Any, /* arg2 */ js.Any, /* arg3 */ js.Any, Unit]
  
  type WorkerCallback4 = js.Function4[/* arg1 */ js.Any, /* arg2 */ js.Any, /* arg3 */ js.Any, /* arg4 */ js.Any, Unit]
  
  @js.native
  trait Workers extends /* x */ StringDictionary[Workers] {
    
    def apply(arg1: js.Any, arg2: js.Any, arg3: js.Any, arg4: js.Any, callback: WorkerCallback): Unit = js.native
    def apply(arg1: js.Any, arg2: js.Any, arg3: js.Any, callback: WorkerCallback): Unit = js.native
    def apply(arg1: js.Any, arg2: js.Any, callback: WorkerCallback): Unit = js.native
    def apply(arg1: js.Any, callback: WorkerCallback): Unit = js.native
    def apply(callback: WorkerCallback): Unit = js.native
  }
}
