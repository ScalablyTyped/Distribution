package typings.strongClusterControl.mod.StrongClusterControl

import typings.node.NodeJS.EventEmitter
import typings.std.Error
import typings.strongClusterControl.strongClusterControlStrings.error
import typings.strongClusterControl.strongClusterControlStrings.resize
import typings.strongClusterControl.strongClusterControlStrings.restart
import typings.strongClusterControl.strongClusterControlStrings.setSize
import typings.strongClusterControl.strongClusterControlStrings.start
import typings.strongClusterControl.strongClusterControlStrings.startRestart
import typings.strongClusterControl.strongClusterControlStrings.startWorker
import typings.strongClusterControl.strongClusterControlStrings.stop
import typings.strongClusterControl.strongClusterControlStrings.stopWorker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Control extends EventEmitter {
  val CPUS: Double = js.native
  val cmd: CMD = js.native
  val options: StartOptions = js.native
  @JSName("on")
  def on_error(event: error, handler: js.Function1[/* error */ Error | js.Array[Error], _]): this.type = js.native
  @JSName("on")
  def on_resize(event: resize, handler: js.Function1[/* size */ Double, _]): this.type = js.native
  @JSName("on")
  def on_restart(event: restart, handler: js.Function0[_]): this.type = js.native
  @JSName("on")
  def on_setSize(event: setSize, handler: js.Function1[/* size */ Double, _]): this.type = js.native
  @JSName("on")
  def on_start(event: start, handler: js.Function0[_]): this.type = js.native
  @JSName("on")
  def on_startRestart(event: startRestart, handler: js.Function1[/* workers */ js.Array[pid], _]): this.type = js.native
  @JSName("on")
  def on_startWorker(event: startWorker, handler: js.Function1[/* worker */ ClusterWorker, _]): this.type = js.native
  @JSName("on")
  def on_stop(event: stop, handler: js.Function0[_]): this.type = js.native
  @JSName("on")
  def on_stopWorker(
    event: stopWorker,
    handler: js.Function3[/* worker */ ClusterWorker, /* code */ Double, /* signal */ String, _]
  ): this.type = js.native
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
  def start(callback: js.Function0[_]): this.type = js.native
  def start(options: StartOptions): this.type = js.native
  def start(options: StartOptions, callback: js.Function0[_]): this.type = js.native
  /**
    * @description Returns the current cluster status
    */
  def status(): ClusterStatus = js.native
  /**
    * @description Stop the controller, after stopping workers (if the size is being controlled, see setSize()).
    */
  def stop(): this.type = js.native
  def stop(callback: js.Function0[_]): this.type = js.native
  /**
    * @description Disconnect worker id and take increasingly agressive action until it exits.
    * @param id - Cluster worker ID,
    */
  def terminate(id: Double): this.type = js.native
}

