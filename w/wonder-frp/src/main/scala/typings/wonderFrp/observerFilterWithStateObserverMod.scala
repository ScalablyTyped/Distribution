package typings.wonderFrp

import typings.wonderFrp.coreStreamMod.Stream
import typings.wonderFrp.observerFilterObserverMod.FilterObserver
import typings.wonderFrp.observerIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observerFilterWithStateObserverMod {
  
  @JSImport("wonder-frp/dist/es2015/observer/FilterWithStateObserver", "FilterWithStateObserver")
  @js.native
  class FilterWithStateObserver protected () extends FilterObserver {
    def this(prevObserver: IObserver, predicate: js.Function1[/* value */ js.Any, Boolean], source: Stream) = this()
    
    var _isTrigger: js.Any = js.native
  }
  /* static members */
  object FilterWithStateObserver {
    
    @JSImport("wonder-frp/dist/es2015/observer/FilterWithStateObserver", "FilterWithStateObserver")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(
      prevObserver: IObserver,
      predicate: js.Function3[
          /* value */ js.Any, 
          /* index */ js.UndefOr[Double], 
          /* source */ js.UndefOr[Stream], 
          Boolean
        ],
      source: Stream
    ): FilterWithStateObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(prevObserver.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[FilterWithStateObserver]
  }
}
