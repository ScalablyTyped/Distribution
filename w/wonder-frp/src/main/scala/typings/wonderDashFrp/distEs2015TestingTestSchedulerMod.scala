package typings.wonderDashFrp

import typings.wonderDashFrp.distEs2015CoreObserverMod.Observer
import typings.wonderDashFrp.distEs2015CoreSchedulerMod.Scheduler
import typings.wonderDashFrp.distEs2015ObserverIObserverMod.IObserver
import typings.wonderDashFrp.distEs2015TestingMockObserverMod.MockObserver
import typings.wonderDashFrp.distEs2015TestingMockPromiseMod.MockPromise
import typings.wonderDashFrp.distEs2015TestingRecordMod.Record
import typings.wonderDashFrp.distEs2015TestingTestStreamMod.TestStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/testing/TestScheduler", JSImport.Namespace)
@js.native
object distEs2015TestingTestSchedulerMod extends js.Object {
  @js.native
  class TestScheduler protected () extends Scheduler {
    def this(isReset: Boolean) = this()
    var _clock: js.Any = js.native
    var _disposedTime: js.Any = js.native
    var _isDisposed: js.Any = js.native
    var _isReset: js.Any = js.native
    var _observer: js.Any = js.native
    var _streamMap: js.Any = js.native
    var _subscribedTime: js.Any = js.native
    var _timerMap: js.Any = js.native
    var clock: Double = js.native
    /* private */ def _exec(time: js.Any, map: js.Any): js.Any = js.native
    /* private */ def _getMinAndMaxTime(): js.Any = js.native
    /* private */ def _runAt(time: js.Any, callback: js.Any): js.Any = js.native
    /* private */ def _runStream(time: js.Any): js.Any = js.native
    /* private */ def _setClock(): js.Any = js.native
    /* private */ def _tick(time: js.Any): js.Any = js.native
    def createObserver(): MockObserver = js.native
    def createRejectPromise(time: Double, error: js.Any): MockPromise = js.native
    def createResolvedPromise(time: Double, value: js.Any): MockPromise = js.native
    def createStream(args: js.Any): TestStream = js.native
    def publicAbsolute(time: js.Any, handler: js.Any): Unit = js.native
    def publishRecursive(observer: MockObserver, initial: js.Any, recursiveFunc: js.Function): Unit = js.native
    def remove(observer: Observer): Unit = js.native
    def setStreamMap(observer: IObserver, messages: js.Array[Record]): Unit = js.native
    def start(): Unit = js.native
    def startWithDispose(create: js.Any): MockObserver = js.native
    def startWithDispose(create: js.Any, disposedTime: Double): MockObserver = js.native
    def startWithSubscribe(create: js.Any): MockObserver = js.native
    def startWithSubscribe(create: js.Any, subscribedTime: Double): MockObserver = js.native
    def startWithTime(create: js.Function, subscribedTime: Double, disposedTime: Double): MockObserver = js.native
  }
  
  /* static members */
  @js.native
  object TestScheduler extends js.Object {
    def completed(tick: js.Any): Record = js.native
    def create(): TestScheduler = js.native
    def create(isReset: Boolean): TestScheduler = js.native
    def error(tick: js.Any, error: js.Any): Record = js.native
    def next(tick: js.Any, value: js.Any): Record = js.native
  }
  
}

