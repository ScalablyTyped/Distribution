package typings
package wonderDashFrpLib.distEs2015TestingTestSchedulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/testing/TestScheduler", "TestScheduler")
@js.native
class TestScheduler protected ()
  extends wonderDashFrpLib.distEs2015CoreSchedulerMod.Scheduler {
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
  def createObserver(): wonderDashFrpLib.distEs2015TestingMockObserverMod.MockObserver = js.native
  def createRejectPromise(time: scala.Double, error: js.Any): wonderDashFrpLib.distEs2015TestingMockPromiseMod.MockPromise = js.native
  def createResolvedPromise(time: scala.Double, value: js.Any): wonderDashFrpLib.distEs2015TestingMockPromiseMod.MockPromise = js.native
  def createStream(args: js.Any): wonderDashFrpLib.distEs2015TestingTestStreamMod.TestStream = js.native
  def publicAbsolute(time: js.Any, handler: js.Any): scala.Unit = js.native
  def publishRecursive(
    observer: wonderDashFrpLib.distEs2015TestingMockObserverMod.MockObserver,
    initial: js.Any,
    recursiveFunc: js.Function
  ): scala.Unit = js.native
  def remove(observer: wonderDashFrpLib.distEs2015CoreObserverMod.Observer): scala.Unit = js.native
  def setStreamMap(
    observer: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver,
    messages: js.Array[wonderDashFrpLib.distEs2015TestingRecordMod.Record]
  ): scala.Unit = js.native
  def start(): scala.Unit = js.native
  def startWithDispose(create: js.Any): wonderDashFrpLib.distEs2015TestingMockObserverMod.MockObserver = js.native
  def startWithDispose(create: js.Any, disposedTime: scala.Double): wonderDashFrpLib.distEs2015TestingMockObserverMod.MockObserver = js.native
  def startWithSubscribe(create: js.Any): wonderDashFrpLib.distEs2015TestingMockObserverMod.MockObserver = js.native
  def startWithSubscribe(create: js.Any, subscribedTime: scala.Double): wonderDashFrpLib.distEs2015TestingMockObserverMod.MockObserver = js.native
  def startWithTime(create: js.Function, subscribedTime: scala.Double, disposedTime: scala.Double): wonderDashFrpLib.distEs2015TestingMockObserverMod.MockObserver = js.native
}

@JSImport("wonder-frp/dist/es2015/testing/TestScheduler", "TestScheduler")
@js.native
object TestScheduler extends js.Object {
  def completed(tick: js.Any): wonderDashFrpLib.distEs2015TestingRecordMod.Record = js.native
  def create(): wonderDashFrpLib.distEs2015TestingTestSchedulerMod.TestScheduler = js.native
  def create(isReset: scala.Boolean): wonderDashFrpLib.distEs2015TestingTestSchedulerMod.TestScheduler = js.native
  def error(tick: js.Any, error: js.Any): wonderDashFrpLib.distEs2015TestingRecordMod.Record = js.native
  def next(tick: js.Any, value: js.Any): wonderDashFrpLib.distEs2015TestingRecordMod.Record = js.native
}

