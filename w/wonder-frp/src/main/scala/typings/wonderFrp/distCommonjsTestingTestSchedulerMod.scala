package typings.wonderFrp

import typings.wonderFrp.distCommonjsCoreObserverMod.Observer
import typings.wonderFrp.distCommonjsCoreSchedulerMod.Scheduler
import typings.wonderFrp.distCommonjsObserverIobserverMod.IObserver
import typings.wonderFrp.distCommonjsTestingMockObserverMod.MockObserver
import typings.wonderFrp.distCommonjsTestingMockPromiseMod.MockPromise
import typings.wonderFrp.distCommonjsTestingRecordMod.Record
import typings.wonderFrp.distCommonjsTestingTestStreamMod.TestStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsTestingTestSchedulerMod {
  
  @JSImport("wonder-frp/dist/commonjs/testing/TestScheduler", "TestScheduler")
  @js.native
  open class TestScheduler protected () extends Scheduler {
    def this(isReset: Boolean) = this()
    
    /* private */ var _clock: Any = js.native
    
    /* private */ var _disposedTime: Any = js.native
    
    /* private */ def _exec(time: Any, map: Any): Any = js.native
    
    /* private */ def _getMinAndMaxTime(): Any = js.native
    
    /* private */ var _isDisposed: Any = js.native
    
    /* private */ var _isReset: Any = js.native
    
    /* private */ var _observer: Any = js.native
    
    /* private */ def _runAt(time: Any, callback: Any): Any = js.native
    
    /* private */ def _runStream(time: Any): Any = js.native
    
    /* private */ def _setClock(): Any = js.native
    
    /* private */ var _streamMap: Any = js.native
    
    /* private */ var _subscribedTime: Any = js.native
    
    /* private */ def _tick(time: Any): Any = js.native
    
    /* private */ var _timerMap: Any = js.native
    
    var clock: Double = js.native
    
    def createObserver(): MockObserver = js.native
    
    def createRejectPromise(time: Double, error: Any): MockPromise = js.native
    
    def createResolvedPromise(time: Double, value: Any): MockPromise = js.native
    
    def createStream(args: Any): TestStream = js.native
    
    def publicAbsolute(time: Any, handler: Any): Unit = js.native
    
    def publishRecursive(observer: MockObserver, initial: Any, recursiveFunc: js.Function): Unit = js.native
    
    def remove(observer: Observer): Unit = js.native
    
    def setStreamMap(observer: IObserver, messages: js.Array[Record]): Unit = js.native
    
    def start(): Unit = js.native
    
    def startWithDispose(create: Any): MockObserver = js.native
    def startWithDispose(create: Any, disposedTime: Double): MockObserver = js.native
    
    def startWithSubscribe(create: Any): MockObserver = js.native
    def startWithSubscribe(create: Any, subscribedTime: Double): MockObserver = js.native
    
    def startWithTime(create: js.Function, subscribedTime: Double, disposedTime: Double): MockObserver = js.native
  }
  /* static members */
  object TestScheduler {
    
    @JSImport("wonder-frp/dist/commonjs/testing/TestScheduler", "TestScheduler")
    @js.native
    val ^ : js.Any = js.native
    
    inline def completed(tick: Any): Record = ^.asInstanceOf[js.Dynamic].applyDynamic("completed")(tick.asInstanceOf[js.Any]).asInstanceOf[Record]
    
    inline def create(): TestScheduler = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TestScheduler]
    inline def create(isReset: Boolean): TestScheduler = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(isReset.asInstanceOf[js.Any]).asInstanceOf[TestScheduler]
    
    inline def error(tick: Any, error: Any): Record = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(tick.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Record]
    
    inline def next(tick: Any, value: Any): Record = (^.asInstanceOf[js.Dynamic].applyDynamic("next")(tick.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Record]
  }
}
