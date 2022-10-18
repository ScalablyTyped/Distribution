package typings.wonderFrp

import typings.wonderFrp.distEs2015CoreEntityMod.Entity
import typings.wonderFrp.distEs2015CoreObserverMod.Observer
import typings.wonderFrp.distEs2015DisposableIdisposableMod.IDisposable
import typings.wonderFrp.distEs2015ObserverIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015SubjectGeneratorSubjectMod {
  
  @JSImport("wonder-frp/dist/es2015/subject/GeneratorSubject", "GeneratorSubject")
  @js.native
  open class GeneratorSubject ()
    extends Entity
       with IObserver {
    
    /* private */ var _isStart: Any = js.native
    
    /* CompleteClass */
    override def completed(): Any = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def error(error: Any): Any = js.native
    
    var isStart: Boolean = js.native
    
    /* CompleteClass */
    override def next(value: Any): Any = js.native
    
    var observer: Any = js.native
    
    def onAfterCompleted(): Unit = js.native
    
    def onAfterError(error: Any): Unit = js.native
    
    def onAfterNext(value: Any): Unit = js.native
    
    def onBeforeCompleted(): Unit = js.native
    
    def onBeforeError(error: Any): Unit = js.native
    
    def onBeforeNext(value: Any): Unit = js.native
    
    def onIsCompleted(value: Any): Boolean = js.native
    
    def remove(observer: Observer): Unit = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
    
    def subscribe(): IDisposable = js.native
    def subscribe(arg1: js.Function): IDisposable = js.native
    def subscribe(arg1: js.Function, onError: js.Function): IDisposable = js.native
    def subscribe(arg1: js.Function, onError: js.Function, onCompleted: js.Function): IDisposable = js.native
    def subscribe(arg1: js.Function, onError: Unit, onCompleted: js.Function): IDisposable = js.native
    def subscribe(arg1: Unit, onError: js.Function): IDisposable = js.native
    def subscribe(arg1: Unit, onError: js.Function, onCompleted: js.Function): IDisposable = js.native
    def subscribe(arg1: Unit, onError: Unit, onCompleted: js.Function): IDisposable = js.native
    def subscribe(arg1: Observer): IDisposable = js.native
    def subscribe(arg1: Observer, onError: js.Function): IDisposable = js.native
    def subscribe(arg1: Observer, onError: js.Function, onCompleted: js.Function): IDisposable = js.native
    def subscribe(arg1: Observer, onError: Unit, onCompleted: js.Function): IDisposable = js.native
    
    def toStream(): Any = js.native
  }
  /* static members */
  object GeneratorSubject {
    
    @JSImport("wonder-frp/dist/es2015/subject/GeneratorSubject", "GeneratorSubject")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): GeneratorSubject = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[GeneratorSubject]
  }
}
