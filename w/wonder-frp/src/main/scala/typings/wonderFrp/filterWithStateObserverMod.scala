package typings.wonderFrp

import typings.wonderFrp.filterObserverMod.FilterObserver
import typings.wonderFrp.iobserverMod.IObserver
import typings.wonderFrp.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterWithStateObserverMod {
  
  @JSImport("wonder-frp/dist/commonjs/observer/FilterWithStateObserver", "FilterWithStateObserver")
  @js.native
  class FilterWithStateObserver protected () extends FilterObserver {
    def this(prevObserver: IObserver, predicate: js.Function1[/* value */ js.Any, Boolean], source: Stream) = this()
    
    /* private */ var _isTrigger: js.Any = js.native
  }
  /* static members */
  object FilterWithStateObserver {
    
    @JSImport("wonder-frp/dist/commonjs/observer/FilterWithStateObserver", "FilterWithStateObserver")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(
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
