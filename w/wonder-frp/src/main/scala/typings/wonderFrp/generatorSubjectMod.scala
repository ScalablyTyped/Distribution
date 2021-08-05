package typings.wonderFrp

import typings.wonderFrp.entityMod.Entity
import typings.wonderFrp.idisposableMod.IDisposable
import typings.wonderFrp.iobserverMod.IObserver
import typings.wonderFrp.observerMod.Observer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generatorSubjectMod {
  
  @JSImport("wonder-frp/dist/commonjs/subject/GeneratorSubject", "GeneratorSubject")
  @js.native
  class GeneratorSubject ()
    extends Entity
       with IObserver {
    
    /* private */ var _isStart: js.Any = js.native
    
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
    
    @JSImport("wonder-frp/dist/commonjs/subject/GeneratorSubject", "GeneratorSubject")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): GeneratorSubject = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[GeneratorSubject]
  }
}
