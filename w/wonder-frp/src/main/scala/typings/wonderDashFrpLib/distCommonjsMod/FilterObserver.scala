package typings
package wonderDashFrpLib.distCommonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "FilterObserver")
@js.native
class FilterObserver protected ()
  extends wonderDashFrpLib.distCommonjsObserverFilterObserverMod.FilterObserver {
  def this(prevObserver: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver, predicate: js.Function1[/* value */ js.Any, scala.Boolean], source: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream) = this()
}

@JSImport("wonder-frp/dist/commonjs", "FilterObserver")
@js.native
object FilterObserver extends js.Object {
  def create(
    prevObserver: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver,
    predicate: js.Function3[
      /* value */ js.Any, 
      /* index */ js.UndefOr[scala.Double], 
      /* source */ js.UndefOr[wonderDashFrpLib.distCommonjsCoreStreamMod.Stream], 
      scala.Boolean
    ],
    source: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream
  ): wonderDashFrpLib.distCommonjsObserverFilterObserverMod.FilterObserver = js.native
}

