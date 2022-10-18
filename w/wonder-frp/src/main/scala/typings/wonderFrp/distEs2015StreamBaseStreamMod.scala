package typings.wonderFrp

import typings.wonderFrp.distEs2015CoreObserverMod.Observer
import typings.wonderFrp.distEs2015CoreStreamMod.Stream
import typings.wonderFrp.distEs2015DisposableIdisposableMod.IDisposable
import typings.wonderFrp.distEs2015ObserverIobserverMod.IObserver
import typings.wonderFrp.distEs2015SubjectSubjectMod.Subject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015StreamBaseStreamMod {
  
  /* note: abstract class */ @JSImport("wonder-frp/dist/es2015/stream/BaseStream", "BaseStream")
  @js.native
  open class BaseStream protected () extends Stream {
    def this(subscribeFunc: Any) = this()
    
    def subscribe(arg1: js.Function, onError: Any): IDisposable = js.native
    def subscribe(arg1: js.Function, onError: Any, onCompleted: Any): IDisposable = js.native
    def subscribe(arg1: js.Function, onError: Unit, onCompleted: Any): IDisposable = js.native
    def subscribe(arg1: Observer, onError: Any): IDisposable = js.native
    def subscribe(arg1: Observer, onError: Any, onCompleted: Any): IDisposable = js.native
    def subscribe(arg1: Observer, onError: Unit, onCompleted: Any): IDisposable = js.native
    def subscribe(arg1: Subject, onError: Any): IDisposable = js.native
    def subscribe(arg1: Subject, onError: Any, onCompleted: Any): IDisposable = js.native
    def subscribe(arg1: Subject, onError: Unit, onCompleted: Any): IDisposable = js.native
    
    def subscribeCore(observer: IObserver): IDisposable = js.native
  }
}
