package typings.tarn.libPoolMod

import typings.node.NodeJSNs.Timer
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import typings.tarn.libPendingOperationMod.PendingOperation
import typings.tarn.libPromiseInspectionMod.PromiseInspection
import typings.tarn.libResourceMod.Resource
import typings.tarn.tarnStrings.acquireFail
import typings.tarn.tarnStrings.acquireRequest
import typings.tarn.tarnStrings.acquireSuccess
import typings.tarn.tarnStrings.createFail
import typings.tarn.tarnStrings.createRequest
import typings.tarn.tarnStrings.createSuccess
import typings.tarn.tarnStrings.destroyFail
import typings.tarn.tarnStrings.destroyRequest
import typings.tarn.tarnStrings.destroySuccess
import typings.tarn.tarnStrings.poolDestroyRequest
import typings.tarn.tarnStrings.poolDestroySuccess
import typings.tarn.tarnStrings.release
import typings.tarn.tarnStrings.startReaping
import typings.tarn.tarnStrings.stopReaping
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
  var emitter: EventEmitter = js.native
  var eventId: Double = js.native
  var free: js.Array[Resource[T]] = js.native
  var idleTimeoutMillis: Double = js.native
  var interval: Timer | Null = js.native
  var max: Double = js.native
  var min: Double = js.native
  var pendingAcquires: js.Array[PendingOperation[T]] = js.native
  var pendingCreates: js.Array[PendingOperation[T]] = js.native
  var pendingDestroys: js.Array[PendingOperation[T]] = js.native
  var propagateCreateError: Boolean = js.native
  var reapIntervalMillis: Double = js.native
  var used: js.Array[Resource[T]] = js.native
  def _canAcquire(): Boolean = js.native
  def _create(): PendingOperation[T] = js.native
  def _destroy(resource: T): js.Promise[Unit | T] = js.native
  def _doAcquire(): Unit = js.native
  def _doCreate(): Unit = js.native
  def _executeEventHandlers(
    eventName: String,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): Unit = js.native
  def _hasFreeResources(): Boolean = js.native
  def _logDestroyerError(eventId: Double, resource: T, err: Error): Unit = js.native
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
  @JSName("on")
  def on_acquireFail(eventName: acquireFail, handler: js.Function2[/* eventId */ Double, /* err */ Error, Unit]): Unit = js.native
  @JSName("on")
  def on_acquireRequest(eventName: acquireRequest, handler: js.Function1[/* eventId */ Double, Unit]): Unit = js.native
  @JSName("on")
  def on_acquireSuccess(eventName: acquireSuccess, handler: js.Function2[/* eventId */ Double, /* resource */ T, Unit]): Unit = js.native
  @JSName("on")
  def on_createFail(eventName: createFail, handler: js.Function2[/* eventId */ Double, /* err */ Error, Unit]): Unit = js.native
  @JSName("on")
  def on_createRequest(eventName: createRequest, handler: js.Function1[/* eventId */ Double, Unit]): Unit = js.native
  @JSName("on")
  def on_createSuccess(eventName: createSuccess, handler: js.Function2[/* eventId */ Double, /* resource */ T, Unit]): Unit = js.native
  @JSName("on")
  def on_destroyFail(
    eventName: destroyFail,
    handler: js.Function3[/* eventId */ Double, /* resource */ T, /* err */ Error, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_destroyRequest(eventName: destroyRequest, handler: js.Function2[/* eventId */ Double, /* resource */ T, Unit]): Unit = js.native
  @JSName("on")
  def on_destroySuccess(eventName: destroySuccess, handler: js.Function2[/* eventId */ Double, /* resource */ T, Unit]): Unit = js.native
  @JSName("on")
  def on_poolDestroyRequest(eventName: poolDestroyRequest, handler: js.Function1[/* eventId */ Double, Unit]): Unit = js.native
  @JSName("on")
  def on_poolDestroySuccess(eventName: poolDestroySuccess, handler: js.Function1[/* eventId */ Double, Unit]): Unit = js.native
  @JSName("on")
  def on_release(eventName: release, handler: js.Function1[/* resource */ T, Unit]): Unit = js.native
  @JSName("on")
  def on_startReaping(eventName: startReaping, handler: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_stopReaping(eventName: stopReaping, handler: js.Function0[Unit]): Unit = js.native
  def release(resource: T): Boolean = js.native
  def removeAllListeners(): Unit = js.native
  def removeAllListeners(event: String): Unit = js.native
  def removeAllListeners(event: js.Symbol): Unit = js.native
  def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  /* protected */ def validate(resource: T): Boolean = js.native
}

