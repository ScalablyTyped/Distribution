package typings.wonderFrp

import typings.wonderFrp.idisposableMod.IDisposable
import typings.wonderFrp.iobserverMod.IObserver
import typings.wonderFrp.observerMod.Observer
import typings.wonderFrp.skipUntilStreamMod.SkipUntilStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skipUntilOtherObserverMod {
  
  @JSImport("wonder-frp/dist/commonjs/observer/SkipUntilOtherObserver", "SkipUntilOtherObserver")
  @js.native
  class SkipUntilOtherObserver protected () extends Observer {
    def this(prevObserver: IObserver, skipUntilStream: SkipUntilStream) = this()
    
    /* private */ var _prevObserver: js.Any = js.native
    
    /* private */ var _skipUntilStream: js.Any = js.native
    
    var otherDisposable: IDisposable = js.native
  }
  /* static members */
  object SkipUntilOtherObserver {
    
    @JSImport("wonder-frp/dist/commonjs/observer/SkipUntilOtherObserver", "SkipUntilOtherObserver")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(prevObserver: IObserver, skipUntilStream: SkipUntilStream): SkipUntilOtherObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(prevObserver.asInstanceOf[js.Any], skipUntilStream.asInstanceOf[js.Any])).asInstanceOf[SkipUntilOtherObserver]
  }
}
