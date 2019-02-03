package typings
package wonderDashFrpLib.distEs2015ObserverFilterWithStateObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/observer/FilterWithStateObserver", "FilterWithStateObserver")
@js.native
class FilterWithStateObserver ()
  extends wonderDashFrpLib.distEs2015ObserverFilterObserverMod.FilterObserver {
  var _isTrigger: js.Any = js.native
}

/* static members */
@JSImport("wonder-frp/dist/es2015/observer/FilterWithStateObserver", "FilterWithStateObserver")
@js.native
object FilterWithStateObserver extends js.Object {
  def create(
    prevObserver: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver,
    predicate: js.Function3[
      /* value */ js.Any, 
      /* index */ js.UndefOr[scala.Double], 
      /* source */ js.UndefOr[wonderDashFrpLib.distEs2015CoreStreamMod.Stream], 
      scala.Boolean
    ],
    source: wonderDashFrpLib.distEs2015CoreStreamMod.Stream
  ): wonderDashFrpLib.distEs2015ObserverFilterWithStateObserverMod.FilterWithStateObserver = js.native
}

