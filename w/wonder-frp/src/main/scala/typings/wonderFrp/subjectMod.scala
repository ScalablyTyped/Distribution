package typings.wonderFrp

import typings.wonderFrp.idisposableMod.IDisposable
import typings.wonderFrp.iobserverMod.IObserver
import typings.wonderFrp.observerMod.Observer
import typings.wonderFrp.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subjectMod {
  
  @JSImport("wonder-frp/dist/commonjs/subject/Subject", "Subject")
  @js.native
  class Subject ()
    extends StObject
       with IObserver {
    
    var _observer: js.Any = js.native
    
    var _source: js.Any = js.native
    
    /* CompleteClass */
    override def completed(): js.Any = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def error(error: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def next(value: js.Any): js.Any = js.native
    
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
    
    @scala.inline
    def create(): Subject = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Subject]
  }
}
