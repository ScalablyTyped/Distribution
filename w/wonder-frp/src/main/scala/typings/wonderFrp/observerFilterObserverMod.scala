package typings.wonderFrp

import typings.wonderFrp.coreObserverMod.Observer
import typings.wonderFrp.coreStreamMod.Stream
import typings.wonderFrp.observerIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observerFilterObserverMod {
  
  @JSImport("wonder-frp/dist/es2015/observer/FilterObserver", "FilterObserver")
  @js.native
  open class FilterObserver protected () extends Observer {
    def this(prevObserver: IObserver, predicate: js.Function1[/* value */ Any, Boolean], source: Stream) = this()
    
    /* protected */ var i: Double = js.native
    
    /* protected */ def predicate(value: Any): Boolean = js.native
    /* protected */ def predicate(value: Any, index: Double): Boolean = js.native
    /* protected */ def predicate(value: Any, index: Double, source: Stream): Boolean = js.native
    /* protected */ def predicate(value: Any, index: Unit, source: Stream): Boolean = js.native
    
    /* protected */ var prevObserver: IObserver = js.native
    
    /* protected */ var source: Stream = js.native
  }
  /* static members */
  object FilterObserver {
    
    @JSImport("wonder-frp/dist/es2015/observer/FilterObserver", "FilterObserver")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(
      prevObserver: IObserver,
      predicate: js.Function3[
          /* value */ Any, 
          /* index */ js.UndefOr[Double], 
          /* source */ js.UndefOr[Stream], 
          Boolean
        ],
      source: Stream
    ): FilterObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(prevObserver.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[FilterObserver]
  }
}
