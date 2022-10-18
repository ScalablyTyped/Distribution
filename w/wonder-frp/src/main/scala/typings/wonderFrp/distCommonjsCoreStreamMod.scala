package typings.wonderFrp

import typings.wonderFrp.distCommonjsCoreEntityMod.Entity
import typings.wonderFrp.distCommonjsCoreObserverMod.Observer
import typings.wonderFrp.distCommonjsCoreSchedulerMod.Scheduler
import typings.wonderFrp.distCommonjsDisposableIdisposableMod.IDisposable
import typings.wonderFrp.distCommonjsObserverIobserverMod.IObserver
import typings.wonderFrp.distCommonjsSubjectSubjectMod.Subject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsCoreStreamMod {
  
  /* note: abstract class */ @JSImport("wonder-frp/dist/commonjs/core/Stream", "Stream")
  @js.native
  open class Stream protected () extends Entity {
    def this(subscribeFunc: Any) = this()
    
    /* private */ def _isSubject(subject: Any): Any = js.native
    
    /* private */ def _setSubject(subject: Any): Any = js.native
    
    def buildStream(observer: IObserver): IDisposable = js.native
    
    def concat(otherStream: Any*): Any = js.native
    def concat(streamArr: js.Array[Stream]): Any = js.native
    
    def concatAll(): Any = js.native
    
    def concatMap(selector: js.Function): Any = js.native
    
    def `do`(): Any = js.native
    def `do`(onNext: js.Function): Any = js.native
    def `do`(onNext: js.Function, onError: js.Function): Any = js.native
    def `do`(onNext: js.Function, onError: js.Function, onCompleted: js.Function): Any = js.native
    def `do`(onNext: js.Function, onError: Unit, onCompleted: js.Function): Any = js.native
    def `do`(onNext: Unit, onError: js.Function): Any = js.native
    def `do`(onNext: Unit, onError: js.Function, onCompleted: js.Function): Any = js.native
    def `do`(onNext: Unit, onError: Unit, onCompleted: js.Function): Any = js.native
    
    def filter(predicate: js.Function1[/* value */ Any, Boolean]): Any = js.native
    def filter(predicate: js.Function1[/* value */ Any, Boolean], thisArg: this.type): Any = js.native
    
    def filterWithState(predicate: js.Function1[/* value */ Any, Boolean]): Any = js.native
    def filterWithState(predicate: js.Function1[/* value */ Any, Boolean], thisArg: this.type): Any = js.native
    
    def flatMap(selector: js.Function): Any = js.native
    
    /* protected */ def handleSubject(subject: Any): Boolean = js.native
    
    def ignoreElements(): Any = js.native
    
    def lastOrDefault(): Any = js.native
    def lastOrDefault(defaultValue: Any): Any = js.native
    
    def map(selector: js.Function): Any = js.native
    
    def merge(maxConcurrent: Double): Any = js.native
    def merge(otherStreams: Any*): Any = js.native
    def merge(streamArr: js.Array[Stream]): Any = js.native
    
    def mergeAll(): Any = js.native
    
    def repeat(): Any = js.native
    def repeat(count: Double): Any = js.native
    
    var scheduler: Scheduler = js.native
    
    def skipUntil(otherStream: Stream): Any = js.native
    
    def subscribe(arg1: js.Function): IDisposable = js.native
    def subscribe(arg1: js.Function, onError: js.Function): IDisposable = js.native
    def subscribe(arg1: js.Function, onError: js.Function, onCompleted: js.Function): IDisposable = js.native
    def subscribe(arg1: js.Function, onError: Unit, onCompleted: js.Function): IDisposable = js.native
    def subscribe(arg1: Observer): IDisposable = js.native
    def subscribe(arg1: Observer, onError: js.Function): IDisposable = js.native
    def subscribe(arg1: Observer, onError: js.Function, onCompleted: js.Function): IDisposable = js.native
    def subscribe(arg1: Observer, onError: Unit, onCompleted: js.Function): IDisposable = js.native
    def subscribe(arg1: Subject): IDisposable = js.native
    def subscribe(arg1: Subject, onError: js.Function): IDisposable = js.native
    def subscribe(arg1: Subject, onError: js.Function, onCompleted: js.Function): IDisposable = js.native
    def subscribe(arg1: Subject, onError: Unit, onCompleted: js.Function): IDisposable = js.native
    
    def subscribeFunc(observer: IObserver): js.Function | Unit = js.native
    
    def take(): Any = js.native
    def take(count: Double): Any = js.native
    
    def takeLast(): Any = js.native
    def takeLast(count: Double): Any = js.native
    
    def takeUntil(otherStream: Stream): Any = js.native
    
    def takeWhile(predicate: js.Function3[/* value */ Any, /* index */ Double, /* source */ this.type, Boolean]): Any = js.native
    def takeWhile(
      predicate: js.Function3[/* value */ Any, /* index */ Double, /* source */ this.type, Boolean],
      thisArg: this.type
    ): Any = js.native
  }
}
