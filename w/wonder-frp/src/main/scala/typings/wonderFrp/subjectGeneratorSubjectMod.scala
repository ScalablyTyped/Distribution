package typings.wonderFrp

import typings.wonderFrp.coreEntityMod.Entity
import typings.wonderFrp.coreObserverMod.Observer
import typings.wonderFrp.disposableIdisposableMod.IDisposable
import typings.wonderFrp.observerIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subjectGeneratorSubjectMod {
  
  @JSImport("wonder-frp/dist/es2015/subject/GeneratorSubject", "GeneratorSubject")
  @js.native
  class GeneratorSubject ()
    extends Entity
       with IObserver {
    
    var _isStart: js.Any = js.native
    
    /* CompleteClass */
    override def completed(): js.Any = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def error(error: js.Any): js.Any = js.native
    
    var isStart: Boolean = js.native
    
    /* CompleteClass */
    override def next(value: js.Any): js.Any = js.native
    
    var observer: js.Any = js.native
    
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
    def subscribe(arg1: js.Function, onError: Unit, onCompleted: js.Function): IDisposable = js.native
    def subscribe(arg1: Unit, onError: js.Function): IDisposable = js.native
    def subscribe(arg1: Unit, onError: js.Function, onCompleted: js.Function): IDisposable = js.native
    def subscribe(arg1: Unit, onError: Unit, onCompleted: js.Function): IDisposable = js.native
    def subscribe(arg1: Observer): IDisposable = js.native
    def subscribe(arg1: Observer, onError: js.Function): IDisposable = js.native
    def subscribe(arg1: Observer, onError: js.Function, onCompleted: js.Function): IDisposable = js.native
    def subscribe(arg1: Observer, onError: Unit, onCompleted: js.Function): IDisposable = js.native
    
    def toStream(): js.Any = js.native
  }
  /* static members */
  object GeneratorSubject {
    
    @JSImport("wonder-frp/dist/es2015/subject/GeneratorSubject", "GeneratorSubject")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(): GeneratorSubject = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[GeneratorSubject]
  }
}
