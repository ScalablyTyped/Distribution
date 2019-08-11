package typings.tarn.libPoolMod

import typings.node.NodeJSNs.Timer
import typings.std.Error
import typings.tarn.libPendingOperationMod.PendingOperation
import typings.tarn.libPromiseInspectionMod.PromiseInspection
import typings.tarn.libResourceMod.Resource
import typings.tarn.tarnStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tarn/lib/Pool", "Pool")
@js.native
class Pool[T] protected () extends js.Object {
  def this(opt: PoolOptions[T]) = this()
  var acquireTimeoutMillis: Double = js.native
  var createRetryIntervalMillis: Double = js.native
  var createTimeoutMillis: Double = js.native
  @JSName("creator")
  var creator_Original: CallbackOrPromise[T] = js.native
  var destroyTimeoutMillis: Double = js.native
  var destroyed: Boolean = js.native
  var free: js.Array[Resource[T]] = js.native
  var idleTimeoutMillis: Double = js.native
  var interval: Timer | Null = js.native
  var max: Double = js.native
  var min: Double = js.native
  var pendingAcquires: js.Array[PendingOperation[T]] = js.native
  var pendingCreates: js.Array[PendingOperation[T]] = js.native
  var propagateCreateError: Boolean = js.native
  var reapIntervalMillis: Double = js.native
  var used: js.Array[Resource[T]] = js.native
  def _canAcquire(): Boolean = js.native
  def _create(): PendingOperation[T] = js.native
  def _destroy(resource: T): js.Promise[_] = js.native
  def _doAcquire(): Unit = js.native
  def _doCreate(): Unit = js.native
  def _hasFreeResources(): Boolean = js.native
  def _logError(err: Error): Unit = js.native
  def _shouldCreateMoreResources(): Boolean = js.native
  def _startReaping(): Unit = js.native
  def _stopReaping(): Unit = js.native
  def _tryAcquireOrCreate(): Unit = js.native
  def _validateResource(resource: T): Boolean = js.native
  def acquire(): PendingOperation[T] = js.native
  def check(): Unit = js.native
  /* protected */ def creator(cb: Callback[T]): js.Any | js.Function0[js.Promise[T]] = js.native
  def destroy(): js.Promise[PromiseInspection[js.Object | Unit]] = js.native
  /* protected */ def destroyer(resource: T): js.Any = js.native
  def isEmpty(): Boolean = js.native
  @JSName("log")
  /* protected */ def log_warn(msg: String, level: warn): js.Any = js.native
  def numFree(): Double = js.native
  def numPendingAcquires(): Double = js.native
  def numPendingCreates(): Double = js.native
  def numUsed(): Double = js.native
  def release(resource: T): Boolean = js.native
  /* protected */ def validate(resource: T): Boolean = js.native
}

