package typings.wonderFrp

import typings.wonderFrp.coreStreamMod.Stream
import typings.wonderFrp.disposableIdisposableMod.IDisposable
import typings.wonderFrp.observerIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamAnonymousStreamMod {
  
  @JSImport("wonder-frp/dist/es2015/stream/AnonymousStream", "AnonymousStream")
  @js.native
  open class AnonymousStream protected () extends Stream {
    def this(subscribeFunc: js.Function) = this()
    
    def subscribe(observer: IObserver): IDisposable = js.native
    def subscribe(onNext: js.Function1[/* value */ Any, Unit]): IDisposable = js.native
    def subscribe(onNext: js.Function1[/* value */ Any, Unit], onError: js.Function1[/* e */ Any, Unit]): IDisposable = js.native
    def subscribe(
      onNext: js.Function1[/* value */ Any, Unit],
      onError: js.Function1[/* e */ Any, Unit],
      onComplete: js.Function0[Unit]
    ): IDisposable = js.native
  }
  /* static members */
  object AnonymousStream {
    
    @JSImport("wonder-frp/dist/es2015/stream/AnonymousStream", "AnonymousStream")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(subscribeFunc: js.Function): AnonymousStream = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(subscribeFunc.asInstanceOf[js.Any]).asInstanceOf[AnonymousStream]
  }
}
