package typings
package tarnLib.libPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tarn/lib/Pool", "Pool")
@js.native
class Pool[T] protected () extends js.Object {
  def this(opt: PoolOptions[T]) = this()
  var acquireTimeoutMillis: scala.Double = js.native
  var createRetryIntervalMillis: scala.Double = js.native
  var createTimeoutMillis: scala.Double = js.native
  @JSName("creator")
  var creator_Original: CallbackOrPromise[T] = js.native
  var destroyTimeoutMillis: scala.Double = js.native
  var destroyed: scala.Boolean = js.native
  var free: js.Array[tarnLib.libResourceMod.Resource[T]] = js.native
  var idleTimeoutMillis: scala.Double = js.native
  var interval: nodeLib.NodeJSNs.Timer | scala.Null = js.native
  var max: scala.Double = js.native
  var min: scala.Double = js.native
  var pendingAcquires: js.Array[tarnLib.libPendingOperationMod.PendingOperation[T]] = js.native
  var pendingCreates: js.Array[tarnLib.libPendingOperationMod.PendingOperation[T]] = js.native
  var propagateCreateError: scala.Boolean = js.native
  var reapIntervalMillis: scala.Double = js.native
  var used: js.Array[tarnLib.libResourceMod.Resource[T]] = js.native
  def _canAcquire(): scala.Boolean = js.native
  def _create(): tarnLib.libPendingOperationMod.PendingOperation[T] = js.native
  def _destroy(resource: T): js.Promise[_] = js.native
  def _doAcquire(): scala.Unit = js.native
  def _doCreate(): scala.Unit = js.native
  def _hasFreeResources(): scala.Boolean = js.native
  def _logError(err: stdLib.Error): scala.Unit = js.native
  def _shouldCreateMoreResources(): scala.Boolean = js.native
  def _startReaping(): scala.Unit = js.native
  def _stopReaping(): scala.Unit = js.native
  def _tryAcquireOrCreate(): scala.Unit = js.native
  def _validateResource(resource: T): scala.Boolean = js.native
  def acquire(): tarnLib.libPendingOperationMod.PendingOperation[T] = js.native
  def check(): scala.Unit = js.native
  /* protected */ def creator(cb: Callback[T]): js.Any | js.Function0[js.Promise[T]] = js.native
  def destroy(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_tarn/lib/PromiseInspection.PromiseInspection<{}> */ _
  ] = js.native
  /* protected */ def destroyer(resource: T): js.Any = js.native
  def isEmpty(): scala.Boolean = js.native
  @JSName("log")
  /* protected */ def log_warn(msg: java.lang.String, level: tarnLib.tarnLibStrings.warn): js.Any = js.native
  def numFree(): scala.Double = js.native
  def numPendingAcquires(): scala.Double = js.native
  def numPendingCreates(): scala.Double = js.native
  def numUsed(): scala.Double = js.native
  def release(resource: T): scala.Boolean = js.native
  /* protected */ def validate(resource: T): scala.Boolean = js.native
}

