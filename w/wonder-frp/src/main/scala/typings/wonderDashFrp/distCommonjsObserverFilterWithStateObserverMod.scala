package typings.wonderDashFrp

import typings.wonderDashFrp.distCommonjsCoreStreamMod.Stream
import typings.wonderDashFrp.distCommonjsObserverFilterObserverMod.FilterObserver
import typings.wonderDashFrp.distCommonjsObserverIObserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/observer/FilterWithStateObserver", JSImport.Namespace)
@js.native
object distCommonjsObserverFilterWithStateObserverMod extends js.Object {
  @js.native
  class FilterWithStateObserver () extends FilterObserver {
    var _isTrigger: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object FilterWithStateObserver extends js.Object {
    def create(
      prevObserver: IObserver,
      predicate: js.Function3[
          /* value */ js.Any, 
          /* index */ js.UndefOr[Double], 
          /* source */ js.UndefOr[Stream], 
          Boolean
        ],
      source: Stream
    ): FilterWithStateObserver = js.native
  }
  
}

