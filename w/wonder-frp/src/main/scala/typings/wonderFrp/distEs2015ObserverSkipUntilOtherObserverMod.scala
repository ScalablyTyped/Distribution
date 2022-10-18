package typings.wonderFrp

import typings.wonderFrp.distEs2015CoreObserverMod.Observer
import typings.wonderFrp.distEs2015DisposableIdisposableMod.IDisposable
import typings.wonderFrp.distEs2015ObserverIobserverMod.IObserver
import typings.wonderFrp.distEs2015StreamSkipUntilStreamMod.SkipUntilStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015ObserverSkipUntilOtherObserverMod {
  
  @JSImport("wonder-frp/dist/es2015/observer/SkipUntilOtherObserver", "SkipUntilOtherObserver")
  @js.native
  open class SkipUntilOtherObserver protected () extends Observer {
    def this(prevObserver: IObserver, skipUntilStream: SkipUntilStream) = this()
    
    /* private */ var _prevObserver: Any = js.native
    
    /* private */ var _skipUntilStream: Any = js.native
    
    var otherDisposable: IDisposable = js.native
  }
  /* static members */
  object SkipUntilOtherObserver {
    
    @JSImport("wonder-frp/dist/es2015/observer/SkipUntilOtherObserver", "SkipUntilOtherObserver")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(prevObserver: IObserver, skipUntilStream: SkipUntilStream): SkipUntilOtherObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(prevObserver.asInstanceOf[js.Any], skipUntilStream.asInstanceOf[js.Any])).asInstanceOf[SkipUntilOtherObserver]
  }
}
