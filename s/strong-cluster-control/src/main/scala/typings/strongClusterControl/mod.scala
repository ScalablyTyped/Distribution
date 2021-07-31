package typings.strongClusterControl

import org.scalablytyped.runtime.Shortcut
import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.std.Error
import typings.strongClusterControl.mod.StrongClusterControl.Control
import typings.strongClusterControl.strongClusterControlStrings.CLUSTER_CONTROL_shutdown
import typings.strongClusterControl.strongClusterControlStrings.error
import typings.strongClusterControl.strongClusterControlStrings.resize
import typings.strongClusterControl.strongClusterControlStrings.restart
import typings.strongClusterControl.strongClusterControlStrings.setSize
import typings.strongClusterControl.strongClusterControlStrings.start
import typings.strongClusterControl.strongClusterControlStrings.startRestart
import typings.strongClusterControl.strongClusterControlStrings.startWorker
import typings.strongClusterControl.strongClusterControlStrings.stop
import typings.strongClusterControl.strongClusterControlStrings.stopWorker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("strong-cluster-control", JSImport.Namespace)
  @js.native
  val ^ : Control = js.native
  
  object StrongClusterControl {
    
    trait CMD extends StObject {
      
      var SHUTDOWN: CLUSTER_CONTROL_shutdown
    }
    object CMD {
      
      @scala.inline
      def apply(): CMD = {
        val __obj = js.Dynamic.literal(SHUTDOWN = "CLUSTER_CONTROL_shutdown")
        __obj.asInstanceOf[CMD]
      }
      
      @scala.inline
      implicit class CMDMutableBuilder[Self <: CMD] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSHUTDOWN(value: CLUSTER_CONTROL_shutdown): Self = StObject.set(x, "SHUTDOWN", value.asInstanceOf[js.Any])
      }
    }
    
    trait ClusterMaster extends StObject {
      
      var pid: Double
      
      var setSize: js.UndefOr[Double] = js.undefined
      
      var startTime: Double
    }
    object ClusterMaster {
      
      @scala.inline
      def apply(pid: Double, startTime: Double): ClusterMaster = {
        val __obj = js.Dynamic.literal(pid = pid.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
        __obj.asInstanceOf[ClusterMaster]
      }
      
      @scala.inline
      implicit class ClusterMasterMutableBuilder[Self <: ClusterMaster] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSetSize(value: Double): Self = StObject.set(x, "setSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSetSizeUndefined: Self = StObject.set(x, "setSize", js.undefined)
        
        @scala.inline
        def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      }
    }
    
    trait ClusterStatus extends StObject {
      
      var master: ClusterMaster
      
      var workers: js.Array[ClusterWorker]
    }
    object ClusterStatus {
      
      @scala.inline
      def apply(master: ClusterMaster, workers: js.Array[ClusterWorker]): ClusterStatus = {
        val __obj = js.Dynamic.literal(master = master.asInstanceOf[js.Any], workers = workers.asInstanceOf[js.Any])
        __obj.asInstanceOf[ClusterStatus]
      }
      
      @scala.inline
      implicit class ClusterStatusMutableBuilder[Self <: ClusterStatus] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMaster(value: ClusterMaster): Self = StObject.set(x, "master", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWorkers(value: js.Array[ClusterWorker]): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWorkersVarargs(value: ClusterWorker*): Self = StObject.set(x, "workers", js.Array(value :_*))
      }
    }
    
    trait ClusterWorker
      extends StObject
         with ClusterMaster {
      
      var id: Double
    }
    object ClusterWorker {
      
      @scala.inline
      def apply(id: Double, pid: Double, startTime: Double): ClusterWorker = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
        __obj.asInstanceOf[ClusterWorker]
      }
      
      @scala.inline
      implicit class ClusterWorkerMutableBuilder[Self <: ClusterWorker] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Control
      extends StObject
         with EventEmitter {
      
      val CPUS: Double = js.native
      
      val cmd: CMD = js.native
      
      @JSName("on")
      def on_error(event: error, handler: js.Function1[/* error */ Error | js.Array[Error], js.Any]): this.type = js.native
      @JSName("on")
      def on_resize(event: resize, handler: js.Function1[/* size */ Double, js.Any]): this.type = js.native
      @JSName("on")
      def on_restart(event: restart, handler: js.Function0[js.Any]): this.type = js.native
      @JSName("on")
      def on_setSize(event: setSize, handler: js.Function1[/* size */ Double, js.Any]): this.type = js.native
      @JSName("on")
      def on_start(event: start, handler: js.Function0[js.Any]): this.type = js.native
      @JSName("on")
      def on_startRestart(event: startRestart, handler: js.Function1[/* workers */ js.Array[pid], js.Any]): this.type = js.native
      @JSName("on")
      def on_startWorker(event: startWorker, handler: js.Function1[/* worker */ ClusterWorker, js.Any]): this.type = js.native
      @JSName("on")
      def on_stop(event: stop, handler: js.Function0[js.Any]): this.type = js.native
      @JSName("on")
      def on_stopWorker(
        event: stopWorker,
        handler: js.Function3[/* worker */ ClusterWorker, /* code */ Double, /* signal */ String, js.Any]
      ): this.type = js.native
      
      val options: StartOptions = js.native
      
      /**
        * @description Restart workers one by one, until all current workers have been restarted.
        */
      def restart(): this.type = js.native
      
      /**
        * @description Set the size of the cluster.
        * @param N - The size of the cluster is the number of workers that should be maintained online.
        */
      def setSize(): this.type = js.native
      def setSize(N: Double): this.type = js.native
      
      /**
        * @description Disconnect worker id and take increasingly agressive action until it exits.
        * @param id - Cluster worker ID,
        */
      def shutdown(id: Double): this.type = js.native
      
      /**
        * @description Start the controller
        * @param [options] - An options object, no default, and options object is not required.
        * @param [options.size] - Number of workers that should be running, the default is to not control the number of workers
        * @param [options.env=null] - Environment properties object passed to cluster.fork() if the controller has to start a worker to resize the cluster, default is null.
        * @param [options.shutdownTimeout=5000] - Number of milliseconds to wait after shutdown before terminating a worker, the default is 5 seconds
        * @param [options.terminateTimeout=5000] - Number of milliseconds to wait after terminate before killing a worker, the default is 5 seconds
        * @param [options.throttoleDelay] - Number of milliseconds to delay restarting workers after they are exiting abnormally. Abnormal is defined as as not suicide.
        */
      def start(): this.type = js.native
      def start(callback: js.Function0[js.Any]): this.type = js.native
      def start(options: Unit, callback: js.Function0[js.Any]): this.type = js.native
      def start(options: StartOptions): this.type = js.native
      def start(options: StartOptions, callback: js.Function0[js.Any]): this.type = js.native
      
      /**
        * @description Returns the current cluster status
        */
      def status(): ClusterStatus = js.native
      
      /**
        * @description Stop the controller, after stopping workers (if the size is being controlled, see setSize()).
        */
      def stop(): this.type = js.native
      def stop(callback: js.Function0[js.Any]): this.type = js.native
      
      /**
        * @description Disconnect worker id and take increasingly agressive action until it exits.
        * @param id - Cluster worker ID,
        */
      def terminate(id: Double): this.type = js.native
    }
    
    trait StartOptions extends StObject {
      
      var env: js.UndefOr[js.Object] = js.undefined
      
      var shutdownTimeout: js.UndefOr[Double] = js.undefined
      
      var size: js.UndefOr[Double] = js.undefined
      
      var terminateTimeout: js.UndefOr[Double] = js.undefined
      
      var throttleDelay: js.UndefOr[Double] = js.undefined
    }
    object StartOptions {
      
      @scala.inline
      def apply(): StartOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StartOptions]
      }
      
      @scala.inline
      implicit class StartOptionsMutableBuilder[Self <: StartOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEnv(value: js.Object): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
        
        @scala.inline
        def setShutdownTimeout(value: Double): Self = StObject.set(x, "shutdownTimeout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShutdownTimeoutUndefined: Self = StObject.set(x, "shutdownTimeout", js.undefined)
        
        @scala.inline
        def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
        
        @scala.inline
        def setTerminateTimeout(value: Double): Self = StObject.set(x, "terminateTimeout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTerminateTimeoutUndefined: Self = StObject.set(x, "terminateTimeout", js.undefined)
        
        @scala.inline
        def setThrottleDelay(value: Double): Self = StObject.set(x, "throttleDelay", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setThrottleDelayUndefined: Self = StObject.set(x, "throttleDelay", js.undefined)
      }
    }
    
    type pid = Double
  }
  
  type _To = Control
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Control = ^
}
