package typings.workerThreadsPool

import typings.node.workerThreadsMod.Worker
import typings.node.workerThreadsMod.WorkerOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("worker-threads-pool", JSImport.Namespace)
  @js.native
  class ^ () extends Pool {
    def this(options: Options) = this()
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Maximum number of workers allowed in the pool. Other workers will be queued
      * and started once there's room in the pool.
      * @default 1
      */
    var max: js.UndefOr[Double] = js.native
    
    /**
      * Maximum number of workers waiting to be started when the pool is full.
      * The callback to `pool.acquire` will be called with an error in case this limit is reached.
      */
    var maxWaiting: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMaxWaiting(value: Double): Self = StObject.set(x, "maxWaiting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWaitingUndefined: Self = StObject.set(x, "maxWaiting", js.undefined)
    }
  }
  
  @js.native
  trait Pool extends StObject {
    
    /**
      * @param filename argument passed directly to `new Worker(filename, options)`
      * @param options argument passed directly to `new Worker(filename, options)`
      * @param callback will be called once the worker is created
      */
    def acquire(filename: String, callback: js.Function2[/* error */ Error | Null, /* worker */ Worker, Unit]): Unit = js.native
    def acquire(
      filename: String,
      options: WorkerOptions,
      callback: js.Function2[/* error */ Error | Null, /* worker */ Worker, Unit]
    ): Unit = js.native
    
    /**
      * Calls `worker.terminate()` on all workers in the pool.
      * @param callback will be called once all workers have terminated
      */
    def destroy(): Unit = js.native
    def destroy(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Number of active workers in the pool.
      */
    var size: Double = js.native
  }
}
