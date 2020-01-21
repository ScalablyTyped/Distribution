package typings.wonderFrp

import typings.wonderFrp.entityMod.Entity
import typings.wonderFrp.idisposableMod.IDisposable
import typings.wonderFrp.iobserverMod.IObserver
import typings.wonderFrp.observerMod.Observer
import typings.wonderFrp.schedulerMod.Scheduler
import typings.wonderFrp.subjectMod.Subject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/core/Stream", JSImport.Namespace)
@js.native
object streamMod extends js.Object {
  @js.native
  abstract class Stream protected () extends Entity {
    def this(subscribeFunc: js.Any) = this()
    var scheduler: Scheduler = js.native
    /* private */ def _isSubject(subject: js.Any): js.Any = js.native
    /* private */ def _setSubject(subject: js.Any): js.Any = js.native
    def buildStream(observer: IObserver): IDisposable = js.native
    def concat(otherStream: js.Any*): js.Any = js.native
    def concat(streamArr: js.Array[Stream]): js.Any = js.native
    def concatAll(): js.Any = js.native
    def concatMap(selector: js.Function): js.Any = js.native
    def `do`(): js.Any = js.native
    def `do`(onNext: js.Function): js.Any = js.native
    def `do`(onNext: js.Function, onError: js.Function): js.Any = js.native
    def `do`(onNext: js.Function, onError: js.Function, onCompleted: js.Function): js.Any = js.native
    def filter(predicate: js.Function1[/* value */ js.Any, Boolean]): js.Any = js.native
    def filter(predicate: js.Function1[/* value */ js.Any, Boolean], thisArg: this.type): js.Any = js.native
    def filterWithState(predicate: js.Function1[/* value */ js.Any, Boolean]): js.Any = js.native
    def filterWithState(predicate: js.Function1[/* value */ js.Any, Boolean], thisArg: this.type): js.Any = js.native
    def flatMap(selector: js.Function): js.Any = js.native
    /* protected */ def handleSubject(subject: js.Any): Boolean = js.native
    def ignoreElements(): js.Any = js.native
    def lastOrDefault(): js.Any = js.native
    def lastOrDefault(defaultValue: js.Any): js.Any = js.native
    def map(selector: js.Function): js.Any = js.native
    def merge(maxConcurrent: Double): js.Any = js.native
    def merge(otherStreams: js.Any*): js.Any = js.native
    def merge(streamArr: js.Array[Stream]): js.Any = js.native
    def mergeAll(): js.Any = js.native
    def repeat(): js.Any = js.native
    def repeat(count: Double): js.Any = js.native
    def skipUntil(otherStream: Stream): js.Any = js.native
    def subscribe(arg1: js.Function): IDisposable = js.native
    def subscribe(arg1: js.Function, onError: js.Function): IDisposable = js.native
    def subscribe(arg1: js.Function, onError: js.Function, onCompleted: js.Function): IDisposable = js.native
    def subscribe(arg1: Observer): IDisposable = js.native
    def subscribe(arg1: Observer, onError: js.Function): IDisposable = js.native
    def subscribe(arg1: Observer, onError: js.Function, onCompleted: js.Function): IDisposable = js.native
    def subscribe(arg1: Subject): IDisposable = js.native
    def subscribe(arg1: Subject, onError: js.Function): IDisposable = js.native
    def subscribe(arg1: Subject, onError: js.Function, onCompleted: js.Function): IDisposable = js.native
    def subscribeFunc(observer: IObserver): js.Function | Unit = js.native
    def take(): js.Any = js.native
    def take(count: Double): js.Any = js.native
    def takeLast(): js.Any = js.native
    def takeLast(count: Double): js.Any = js.native
    def takeUntil(otherStream: Stream): js.Any = js.native
    def takeWhile(predicate: js.Function3[/* value */ js.Any, /* index */ Double, /* source */ this.type, Boolean]): js.Any = js.native
    def takeWhile(
      predicate: js.Function3[/* value */ js.Any, /* index */ Double, /* source */ this.type, Boolean],
      thisArg: this.type
    ): js.Any = js.native
  }
  
}

