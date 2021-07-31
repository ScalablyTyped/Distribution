package typings.wonderFrp

import typings.wonderFrp.iobserverMod.IObserver
import typings.wonderFrp.observerMod.Observer
import typings.wonderFrp.skipUntilStreamMod.SkipUntilStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skipUntilSourceObserverMod {
  
  @JSImport("wonder-frp/dist/commonjs/observer/SkipUntilSourceObserver", "SkipUntilSourceObserver")
  @js.native
  class SkipUntilSourceObserver protected () extends Observer {
    def this(prevObserver: IObserver, skipUntilStream: SkipUntilStream) = this()
    
    var _prevObserver: js.Any = js.native
    
    var _skipUntilStream: js.Any = js.native
  }
  /* static members */
  object SkipUntilSourceObserver {
    
    @JSImport("wonder-frp/dist/commonjs/observer/SkipUntilSourceObserver", "SkipUntilSourceObserver")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(prevObserver: IObserver, skipUntilStream: SkipUntilStream): SkipUntilSourceObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(prevObserver.asInstanceOf[js.Any], skipUntilStream.asInstanceOf[js.Any])).asInstanceOf[SkipUntilSourceObserver]
  }
}
