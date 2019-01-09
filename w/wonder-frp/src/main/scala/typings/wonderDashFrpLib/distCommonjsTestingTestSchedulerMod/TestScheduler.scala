package typings
package wonderDashFrpLib.distCommonjsTestingTestSchedulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/testing/TestScheduler", "TestScheduler")
@js.native
class TestScheduler protected ()
  extends wonderDashFrpLib.distCommonjsCoreSchedulerMod.Scheduler {
  def this(isReset: scala.Boolean) = this()
  var _clock: js.Any = js.native
  var _disposedTime: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _isReset: js.Any = js.native
  var _observer: js.Any = js.native
  var _streamMap: js.Any = js.native
  var _subscribedTime: js.Any = js.native
  var _timerMap: js.Any = js.native
  var clock: scala.Double = js.native
  /* private */ def _exec(time: js.Any, map: js.Any): js.Any = js.native
  /* private */ def _getMinAndMaxTime(): js.Any = js.native
  /* private */ def _runAt(time: js.Any, callback: js.Any): js.Any = js.native
  /* private */ def _runStream(time: js.Any): js.Any = js.native
  /* private */ def _setClock(): js.Any = js.native
  /* private */ def _tick(time: js.Any): js.Any = js.native
  def createObserver(): wonderDashFrpLib.distCommonjsTestingMockObserverMod.MockObserver = js.native
  def createRejectPromise(time: scala.Double, error: js.Any): wonderDashFrpLib.distCommonjsTestingMockPromiseMod.MockPromise = js.native
  def createResolvedPromise(time: scala.Double, value: js.Any): wonderDashFrpLib.distCommonjsTestingMockPromiseMod.MockPromise = js.native
  def createStream(args: js.Any): wonderDashFrpLib.distCommonjsTestingTestStreamMod.TestStream = js.native
  def publicAbsolute(time: js.Any, handler: js.Any): scala.Unit = js.native
  def publishRecursive(
    observer: wonderDashFrpLib.distCommonjsTestingMockObserverMod.MockObserver,
    initial: js.Any,
    recursiveFunc: js.Function
  ): scala.Unit = js.native
  def remove(observer: wonderDashFrpLib.distCommonjsCoreObserverMod.Observer): scala.Unit = js.native
  def setStreamMap(
    observer: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver,
    messages: js.Array[wonderDashFrpLib.distCommonjsTestingRecordMod.Record]
  ): scala.Unit = js.native
  def start(): scala.Unit = js.native
  def startWithDispose(create: js.Any): wonderDashFrpLib.distCommonjsTestingMockObserverMod.MockObserver = js.native
  def startWithDispose(create: js.Any, disposedTime: scala.Double): wonderDashFrpLib.distCommonjsTestingMockObserverMod.MockObserver = js.native
  def startWithSubscribe(create: js.Any): wonderDashFrpLib.distCommonjsTestingMockObserverMod.MockObserver = js.native
  def startWithSubscribe(create: js.Any, subscribedTime: scala.Double): wonderDashFrpLib.distCommonjsTestingMockObserverMod.MockObserver = js.native
  def startWithTime(create: js.Function, subscribedTime: scala.Double, disposedTime: scala.Double): wonderDashFrpLib.distCommonjsTestingMockObserverMod.MockObserver = js.native
}

@JSImport("wonder-frp/dist/commonjs/testing/TestScheduler", "TestScheduler")
@js.native
object TestScheduler extends js.Object {
  def completed(tick: js.Any): wonderDashFrpLib.distCommonjsTestingRecordMod.Record = js.native
  def create(): wonderDashFrpLib.distCommonjsTestingTestSchedulerMod.TestScheduler = js.native
  def create(isReset: scala.Boolean): wonderDashFrpLib.distCommonjsTestingTestSchedulerMod.TestScheduler = js.native
  def error(tick: js.Any, error: js.Any): wonderDashFrpLib.distCommonjsTestingRecordMod.Record = js.native
  def next(tick: js.Any, value: js.Any): wonderDashFrpLib.distCommonjsTestingRecordMod.Record = js.native
}

