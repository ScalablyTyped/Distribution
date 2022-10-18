package typings.wonderFrp

import typings.wonderFrp.distCommonjsCoreObserverMod.Observer
import typings.wonderFrp.distCommonjsObserverIobserverMod.IObserver
import typings.wonderFrp.distCommonjsStreamSkipUntilStreamMod.SkipUntilStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsObserverSkipUntilSourceObserverMod {
  
  @JSImport("wonder-frp/dist/commonjs/observer/SkipUntilSourceObserver", "SkipUntilSourceObserver")
  @js.native
  open class SkipUntilSourceObserver protected () extends Observer {
    def this(prevObserver: IObserver, skipUntilStream: SkipUntilStream) = this()
    
    /* private */ var _prevObserver: Any = js.native
    
    /* private */ var _skipUntilStream: Any = js.native
  }
  /* static members */
  object SkipUntilSourceObserver {
    
    @JSImport("wonder-frp/dist/commonjs/observer/SkipUntilSourceObserver", "SkipUntilSourceObserver")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(prevObserver: IObserver, skipUntilStream: SkipUntilStream): SkipUntilSourceObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(prevObserver.asInstanceOf[js.Any], skipUntilStream.asInstanceOf[js.Any])).asInstanceOf[SkipUntilSourceObserver]
  }
}
