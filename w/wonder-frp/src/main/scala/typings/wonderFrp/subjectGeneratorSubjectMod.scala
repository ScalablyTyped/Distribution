package typings.wonderFrp

import typings.wonderFrp.coreEntityMod.Entity
import typings.wonderFrp.coreObserverMod.Observer
import typings.wonderFrp.disposableIdisposableMod.IDisposable
import typings.wonderFrp.observerIobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/subject/GeneratorSubject", JSImport.Namespace)
@js.native
object subjectGeneratorSubjectMod extends js.Object {
  @js.native
  class GeneratorSubject ()
    extends Entity
       with IObserver {
    var _isStart: js.Any = js.native
    var isStart: Boolean = js.native
    var observer: js.Any = js.native
    /* CompleteClass */
    override def completed(): js.Any = js.native
    /* CompleteClass */
    override def dispose(): Unit = js.native
    /* CompleteClass */
    override def error(error: js.Any): js.Any = js.native
    /* CompleteClass */
    override def next(value: js.Any): js.Any = js.native
    def onAfterCompleted(): Unit = js.native
    def onAfterError(error: js.Any): Unit = js.native
    def onAfterNext(value: js.Any): Unit = js.native
    def onBeforeCompleted(): Unit = js.native
    def onBeforeError(error: js.Any): Unit = js.native
    def onBeforeNext(value: js.Any): Unit = js.native
    def onIsCompleted(value: js.Any): Boolean = js.native
    def remove(observer: Observer): Unit = js.native
    def start(): Unit = js.native
    def stop(): Unit = js.native
    def subscribe(): IDisposable = js.native
    def subscribe(arg1: js.Function): IDisposable = js.native
    def subscribe(arg1: js.Function, onError: js.Function): IDisposable = js.native
    def subscribe(arg1: js.Function, onError: js.Function, onCompleted: js.Function): IDisposable = js.native
    def subscribe(arg1: Observer): IDisposable = js.native
    def subscribe(arg1: Observer, onError: js.Function): IDisposable = js.native
    def subscribe(arg1: Observer, onError: js.Function, onCompleted: js.Function): IDisposable = js.native
    def toStream(): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object GeneratorSubject extends js.Object {
    def create(): GeneratorSubject = js.native
  }
  
}

