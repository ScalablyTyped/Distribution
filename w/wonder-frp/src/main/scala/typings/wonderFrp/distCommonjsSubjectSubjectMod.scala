package typings.wonderFrp

import typings.wonderFrp.distCommonjsCoreObserverMod.Observer
import typings.wonderFrp.distCommonjsCoreStreamMod.Stream
import typings.wonderFrp.distCommonjsDisposableIdisposableMod.IDisposable
import typings.wonderFrp.distCommonjsObserverIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsSubjectSubjectMod {
  
  @JSImport("wonder-frp/dist/commonjs/subject/Subject", "Subject")
  @js.native
  open class Subject ()
    extends StObject
       with IObserver {
    
    /* private */ var _observer: Any = js.native
    
    /* private */ var _source: Any = js.native
    
    /* CompleteClass */
    override def completed(): Any = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def error(error: Any): Any = js.native
    
    /* CompleteClass */
    override def next(value: Any): Any = js.native
    
    def remove(observer: Observer): Unit = js.native
    
    var source: Stream = js.native
    
    def start(): Unit = js.native
    
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
  }
  /* static members */
  object Subject {
    
    @JSImport("wonder-frp/dist/commonjs/subject/Subject", "Subject")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): Subject = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Subject]
  }
}
