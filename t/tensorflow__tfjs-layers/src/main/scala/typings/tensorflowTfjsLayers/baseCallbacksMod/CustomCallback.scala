package typings.tensorflowTfjsLayers.baseCallbacksMod

import typings.tensorflowTfjsLayers.logsMod.Logs
import typings.tensorflowTfjsLayers.logsMod.UnresolvedLogs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "CustomCallback")
@js.native
class CustomCallback protected () extends BaseCallback {
  def this(args: CustomCallbackArgs) = this()
  def this(args: CustomCallbackArgs, yieldEvery: YieldEveryOptions) = this()
  
  /* protected */ def batchBegin(batch: Double): Unit | js.Promise[Unit] = js.native
  /* protected */ def batchBegin(batch: Double, logs: Logs): Unit | js.Promise[Unit] = js.native
  
  /* protected */ def batchEnd(batch: Double): Unit | js.Promise[Unit] = js.native
  /* protected */ def batchEnd(batch: Double, logs: Logs): Unit | js.Promise[Unit] = js.native
  
  var currentEpoch: js.Any = js.native
  
  /* protected */ def epochBegin(epoch: Double): Unit | js.Promise[Unit] = js.native
  /* protected */ def epochBegin(epoch: Double, logs: Logs): Unit | js.Promise[Unit] = js.native
  
  /* protected */ def epochEnd(epoch: Double): Unit | js.Promise[Unit] = js.native
  /* protected */ def epochEnd(epoch: Double, logs: Logs): Unit | js.Promise[Unit] = js.native
  
  def maybeWait(epoch: Double, batch: Double, logs: UnresolvedLogs): js.Promise[Unit] = js.native
  
  /* protected */ def trainBegin(): Unit | js.Promise[Unit] = js.native
  /* protected */ def trainBegin(logs: Logs): Unit | js.Promise[Unit] = js.native
  
  /* protected */ def trainEnd(): Unit | js.Promise[Unit] = js.native
  /* protected */ def trainEnd(logs: Logs): Unit | js.Promise[Unit] = js.native
  
  /* protected */ def `yield`(epoch: Double, batch: Double, logs: Logs): Unit | js.Promise[Unit] = js.native
  
  var yieldEvery: js.Any = js.native
}
