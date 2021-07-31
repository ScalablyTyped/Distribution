package typings.tarn

import typings.node.NodeJS.Timer
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import typings.tarn.pendingOperationMod.PendingOperation
import typings.tarn.promiseInspectionMod.PromiseInspection
import typings.tarn.resourceMod.Resource
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object poolMod {
  
  @JSImport("tarn/dist/Pool", "Pool")
  @js.native
  class Pool[T] protected () extends StObject {
    def this(opt: PoolOptions[T]) = this()
    
    def _canAcquire(): Boolean = js.native
    
    def _create(): PendingOperation[T] = js.native
    
    def _destroy(resource: T): js.Promise[Unit | T] = js.native
    
    def _doAcquire(): Unit = js.native
    
    def _doCreate(): Unit = js.native
    
    def _executeEventHandlers(
      eventName: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
    ): Unit = js.native
    
    def _hasFreeResources(): Boolean = js.native
    
    def _logDestroyerError(eventId: Double, resource: T, err: Error): Unit = js.native
    
    def _shouldCreateMoreResources(): Boolean = js.native
    
    def _startReaping(): Unit = js.native
    
    def _stopReaping(): Unit = js.native
    
    /**
      * The most important method that is called always when resources
      * are created / destroyed / acquired / released. In other words
      * every time when resources are moved from used to free or vice
      * versa.
      *
      * Either assigns free resources to pendingAcquires or creates new
      * resources if there is room for it in the pool.
      */
    def _tryAcquireOrCreate(): Unit = js.native
    
    def _validateResource(resource: T): js.Promise[Boolean] = js.native
    
    def acquire(): PendingOperation[T] = js.native
    
    var acquireTimeoutMillis: Double = js.native
    
    /**
      * Reaping cycle.
      */
    def check(): Unit = js.native
    
    var createRetryIntervalMillis: Double = js.native
    
    var createTimeoutMillis: Double = js.native
    
    /* protected */ def creator(cb: Callback[T]): js.Any | js.Function0[js.Promise[T]] = js.native
    @JSName("creator")
    var creator_Original: CallbackOrPromise[T] = js.native
    
    def destroy(): js.Promise[PromiseInspection[js.Any | Unit]] = js.native
    
    var destroyTimeoutMillis: Double = js.native
    
    var destroyed: Boolean = js.native
    
    /* protected */ def destroyer(resource: T): js.Any = js.native
    
    var emitter: EventEmitter = js.native
    
    var eventId: Double = js.native
    
    var free: js.Array[Resource[T]] = js.native
    
    var idleTimeoutMillis: Double = js.native
    
    var interval: Timer | Null = js.native
    
    def isEmpty(): Boolean = js.native
    
    @JSName("log")
    /* protected */ def log_warn(msg: String, level: warn): js.Any = js.native
    
    var max: Double = js.native
    
    var min: Double = js.native
    
    def numFree(): Double = js.native
    
    def numPendingAcquires(): Double = js.native
    
    def numPendingCreates(): Double = js.native
    
    def numPendingValidations(): Double = js.native
    
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
    
    var pendingAcquires: js.Array[PendingOperation[T]] = js.native
    
    var pendingCreates: js.Array[PendingOperation[T]] = js.native
    
    var pendingDestroys: js.Array[PendingOperation[T]] = js.native
    
    var pendingValidations: js.Array[PendingOperation[T]] = js.native
    
    var propagateCreateError: Boolean = js.native
    
    var reapIntervalMillis: Double = js.native
    
    def release(resource: T): Boolean = js.native
    
    def removeAllListeners(): Unit = js.native
    def removeAllListeners(event: String): Unit = js.native
    def removeAllListeners(event: js.Symbol): Unit = js.native
    
    def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
    def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
    
    var used: js.Array[Resource[T]] = js.native
    
    /* protected */ def validate(resource: T): Boolean = js.native
  }
  
  type Callback[T] = js.Function2[/* err */ Error | Null, /* resource */ T, js.Any]
  
  type CallbackOrPromise[T] = js.Function1[/* cb */ Callback[T], js.Any | js.Function0[js.Promise[T]]]
  
  trait PoolOptions[T] extends StObject {
    
    var acquireTimeoutMillis: js.UndefOr[Double] = js.undefined
    
    def create(cb: Callback[T]): js.Any | js.Function0[js.Promise[T]]
    
    var createRetryIntervalMillis: js.UndefOr[Double] = js.undefined
    
    var createTimeoutMillis: js.UndefOr[Double] = js.undefined
    
    @JSName("create")
    var create_Original: CallbackOrPromise[T]
    
    def destroy(resource: T): js.Any
    
    var destroyTimeoutMillis: js.UndefOr[Double] = js.undefined
    
    var idleTimeoutMillis: js.UndefOr[Double] = js.undefined
    
    var log: js.UndefOr[js.Function1[/* msg */ String, js.Any]] = js.undefined
    
    var max: Double
    
    var min: Double
    
    var propagateCreateError: js.UndefOr[Boolean] = js.undefined
    
    var reapIntervalMillis: js.UndefOr[Double] = js.undefined
    
    var validate: js.UndefOr[js.Function1[/* resource */ T, Boolean]] = js.undefined
  }
  object PoolOptions {
    
    @scala.inline
    def apply[T](
      create: /* cb */ Callback[T] => js.Any | js.Function0[js.Promise[T]],
      destroy: T => js.Any,
      max: Double,
      min: Double
    ): PoolOptions[T] = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), destroy = js.Any.fromFunction1(destroy), max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[PoolOptions[T]]
    }
    
    @scala.inline
    implicit class PoolOptionsMutableBuilder[Self <: PoolOptions[?], T] (val x: Self & PoolOptions[T]) extends AnyVal {
      
      @scala.inline
      def setAcquireTimeoutMillis(value: Double): Self = StObject.set(x, "acquireTimeoutMillis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcquireTimeoutMillisUndefined: Self = StObject.set(x, "acquireTimeoutMillis", js.undefined)
      
      @scala.inline
      def setCreate(value: /* cb */ Callback[T] => js.Any | js.Function0[js.Promise[T]]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateRetryIntervalMillis(value: Double): Self = StObject.set(x, "createRetryIntervalMillis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateRetryIntervalMillisUndefined: Self = StObject.set(x, "createRetryIntervalMillis", js.undefined)
      
      @scala.inline
      def setCreateTimeoutMillis(value: Double): Self = StObject.set(x, "createTimeoutMillis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateTimeoutMillisUndefined: Self = StObject.set(x, "createTimeoutMillis", js.undefined)
      
      @scala.inline
      def setDestroy(value: T => js.Any): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroyTimeoutMillis(value: Double): Self = StObject.set(x, "destroyTimeoutMillis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyTimeoutMillisUndefined: Self = StObject.set(x, "destroyTimeoutMillis", js.undefined)
      
      @scala.inline
      def setIdleTimeoutMillis(value: Double): Self = StObject.set(x, "idleTimeoutMillis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdleTimeoutMillisUndefined: Self = StObject.set(x, "idleTimeoutMillis", js.undefined)
      
      @scala.inline
      def setLog(value: /* msg */ String => js.Any): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropagateCreateError(value: Boolean): Self = StObject.set(x, "propagateCreateError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropagateCreateErrorUndefined: Self = StObject.set(x, "propagateCreateError", js.undefined)
      
      @scala.inline
      def setReapIntervalMillis(value: Double): Self = StObject.set(x, "reapIntervalMillis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReapIntervalMillisUndefined: Self = StObject.set(x, "reapIntervalMillis", js.undefined)
      
      @scala.inline
      def setValidate(value: /* resource */ T => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
}
