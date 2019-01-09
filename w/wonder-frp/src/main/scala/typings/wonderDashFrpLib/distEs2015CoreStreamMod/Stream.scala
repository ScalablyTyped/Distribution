package typings
package wonderDashFrpLib.distEs2015CoreStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/core/Stream", "Stream")
@js.native
abstract class Stream protected ()
  extends wonderDashFrpLib.distEs2015CoreEntityMod.Entity {
  def this(subscribeFunc: js.Any) = this()
  var scheduler: wonderDashFrpLib.distEs2015CoreSchedulerMod.Scheduler = js.native
  /* private */ def _isSubject(subject: js.Any): js.Any = js.native
  /* private */ def _setSubject(subject: js.Any): js.Any = js.native
  def buildStream(observer: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver): wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable = js.native
  def concat(otherStream: js.Any*): js.Any = js.native
  def concat(streamArr: js.Array[Stream]): js.Any = js.native
  def concatAll(): js.Any = js.native
  def concatMap(selector: js.Function): js.Any = js.native
  def `do`(): js.Any = js.native
  def `do`(onNext: js.Function): js.Any = js.native
  def `do`(onNext: js.Function, onError: js.Function): js.Any = js.native
  def `do`(onNext: js.Function, onError: js.Function, onCompleted: js.Function): js.Any = js.native
  def filter(predicate: js.Function1[/* value */ js.Any, scala.Boolean]): js.Any = js.native
  def filter(predicate: js.Function1[/* value */ js.Any, scala.Boolean], thisArg: this.type): js.Any = js.native
  def filterWithState(predicate: js.Function1[/* value */ js.Any, scala.Boolean]): js.Any = js.native
  def filterWithState(predicate: js.Function1[/* value */ js.Any, scala.Boolean], thisArg: this.type): js.Any = js.native
  def flatMap(selector: js.Function): js.Any = js.native
  /* protected */ def handleSubject(subject: js.Any): scala.Boolean = js.native
  def ignoreElements(): js.Any = js.native
  def lastOrDefault(): js.Any = js.native
  def lastOrDefault(defaultValue: js.Any): js.Any = js.native
  def map(selector: js.Function): js.Any = js.native
  def merge(maxConcurrent: scala.Double): js.Any = js.native
  def merge(otherStreams: js.Any*): js.Any = js.native
  def merge(streamArr: js.Array[Stream]): js.Any = js.native
  def mergeAll(): js.Any = js.native
  def repeat(): js.Any = js.native
  def repeat(count: scala.Double): js.Any = js.native
  def skipUntil(otherStream: Stream): js.Any = js.native
  def subscribe(arg1: js.Function): wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable = js.native
  def subscribe(arg1: js.Function, onError: js.Function): wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable = js.native
  def subscribe(arg1: js.Function, onError: js.Function, onCompleted: js.Function): wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable = js.native
  def subscribe(arg1: wonderDashFrpLib.distEs2015CoreObserverMod.Observer): wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable = js.native
  def subscribe(arg1: wonderDashFrpLib.distEs2015CoreObserverMod.Observer, onError: js.Function): wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable = js.native
  def subscribe(
    arg1: wonderDashFrpLib.distEs2015CoreObserverMod.Observer,
    onError: js.Function,
    onCompleted: js.Function
  ): wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable = js.native
  def subscribe(arg1: wonderDashFrpLib.distEs2015SubjectSubjectMod.Subject): wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable = js.native
  def subscribe(arg1: wonderDashFrpLib.distEs2015SubjectSubjectMod.Subject, onError: js.Function): wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable = js.native
  def subscribe(
    arg1: wonderDashFrpLib.distEs2015SubjectSubjectMod.Subject,
    onError: js.Function,
    onCompleted: js.Function
  ): wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable = js.native
  def subscribeFunc(observer: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver): js.Function | scala.Unit = js.native
  def take(): js.Any = js.native
  def take(count: scala.Double): js.Any = js.native
  def takeLast(): js.Any = js.native
  def takeLast(count: scala.Double): js.Any = js.native
  def takeUntil(otherStream: Stream): js.Any = js.native
  def takeWhile(
    predicate: js.Function3[/* value */ js.Any, /* index */ scala.Double, /* source */ this.type, scala.Boolean]
  ): js.Any = js.native
  def takeWhile(
    predicate: js.Function3[/* value */ js.Any, /* index */ scala.Double, /* source */ this.type, scala.Boolean],
    thisArg: this.type
  ): js.Any = js.native
}

