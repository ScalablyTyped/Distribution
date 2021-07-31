package typings.wonderFrp

import typings.wonderFrp.coreObserverMod.Observer
import typings.wonderFrp.coreStreamMod.Stream
import typings.wonderFrp.disposableIdisposableMod.IDisposable
import typings.wonderFrp.observerIobserverMod.IObserver
import typings.wonderFrp.subjectSubjectMod.Subject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamBaseStreamMod {
  
  @JSImport("wonder-frp/dist/es2015/stream/BaseStream", "BaseStream")
  @js.native
  abstract class BaseStream protected () extends Stream {
    def this(subscribeFunc: js.Any) = this()
    
    def subscribe(arg1: js.Function, onError: js.Any): IDisposable = js.native
    def subscribe(arg1: js.Function, onError: js.Any, onCompleted: js.Any): IDisposable = js.native
    def subscribe(arg1: js.Function, onError: Unit, onCompleted: js.Any): IDisposable = js.native
    def subscribe(arg1: Observer, onError: js.Any): IDisposable = js.native
    def subscribe(arg1: Observer, onError: js.Any, onCompleted: js.Any): IDisposable = js.native
    def subscribe(arg1: Observer, onError: Unit, onCompleted: js.Any): IDisposable = js.native
    def subscribe(arg1: Subject, onError: js.Any): IDisposable = js.native
    def subscribe(arg1: Subject, onError: js.Any, onCompleted: js.Any): IDisposable = js.native
    def subscribe(arg1: Subject, onError: Unit, onCompleted: js.Any): IDisposable = js.native
    
    def subscribeCore(observer: IObserver): IDisposable = js.native
  }
}
