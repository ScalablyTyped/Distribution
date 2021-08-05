package typings.wonderFrp

import typings.wonderFrp.coreObserverMod.Observer
import typings.wonderFrp.observerIobserverMod.IObserver
import typings.wonderFrp.streamSkipUntilStreamMod.SkipUntilStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observerSkipUntilSourceObserverMod {
  
  @JSImport("wonder-frp/dist/es2015/observer/SkipUntilSourceObserver", "SkipUntilSourceObserver")
  @js.native
  class SkipUntilSourceObserver protected () extends Observer {
    def this(prevObserver: IObserver, skipUntilStream: SkipUntilStream) = this()
    
    /* private */ var _prevObserver: js.Any = js.native
    
    /* private */ var _skipUntilStream: js.Any = js.native
  }
  /* static members */
  object SkipUntilSourceObserver {
    
    @JSImport("wonder-frp/dist/es2015/observer/SkipUntilSourceObserver", "SkipUntilSourceObserver")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(prevObserver: IObserver, skipUntilStream: SkipUntilStream): SkipUntilSourceObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(prevObserver.asInstanceOf[js.Any], skipUntilStream.asInstanceOf[js.Any])).asInstanceOf[SkipUntilSourceObserver]
  }
}
