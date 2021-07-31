package typings.wonderFrp

import typings.wonderFrp.coreObserverMod.Observer
import typings.wonderFrp.disposableIdisposableMod.IDisposable
import typings.wonderFrp.observerIobserverMod.IObserver
import typings.wonderFrp.streamSkipUntilStreamMod.SkipUntilStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observerSkipUntilOtherObserverMod {
  
  @JSImport("wonder-frp/dist/es2015/observer/SkipUntilOtherObserver", "SkipUntilOtherObserver")
  @js.native
  class SkipUntilOtherObserver protected () extends Observer {
    def this(prevObserver: IObserver, skipUntilStream: SkipUntilStream) = this()
    
    var _prevObserver: js.Any = js.native
    
    var _skipUntilStream: js.Any = js.native
    
    var otherDisposable: IDisposable = js.native
  }
  /* static members */
  object SkipUntilOtherObserver {
    
    @JSImport("wonder-frp/dist/es2015/observer/SkipUntilOtherObserver", "SkipUntilOtherObserver")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(prevObserver: IObserver, skipUntilStream: SkipUntilStream): SkipUntilOtherObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(prevObserver.asInstanceOf[js.Any], skipUntilStream.asInstanceOf[js.Any])).asInstanceOf[SkipUntilOtherObserver]
  }
}
