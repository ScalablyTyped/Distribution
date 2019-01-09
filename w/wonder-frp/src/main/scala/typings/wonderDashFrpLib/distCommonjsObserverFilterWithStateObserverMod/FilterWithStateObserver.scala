package typings
package wonderDashFrpLib.distCommonjsObserverFilterWithStateObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/observer/FilterWithStateObserver", "FilterWithStateObserver")
@js.native
class FilterWithStateObserver ()
  extends wonderDashFrpLib.distCommonjsObserverFilterObserverMod.FilterObserver {
  var _isTrigger: js.Any = js.native
}

@JSImport("wonder-frp/dist/commonjs/observer/FilterWithStateObserver", "FilterWithStateObserver")
@js.native
object FilterWithStateObserver extends js.Object {
  def create(
    prevObserver: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver,
    predicate: js.Function3[
      /* value */ js.Any, 
      /* index */ js.UndefOr[scala.Double], 
      /* source */ js.UndefOr[wonderDashFrpLib.distCommonjsCoreStreamMod.Stream], 
      scala.Boolean
    ],
    source: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream
  ): wonderDashFrpLib.distCommonjsObserverFilterWithStateObserverMod.FilterWithStateObserver = js.native
}

