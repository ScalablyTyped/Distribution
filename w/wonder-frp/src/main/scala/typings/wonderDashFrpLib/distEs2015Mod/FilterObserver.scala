package typings
package wonderDashFrpLib.distEs2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "FilterObserver")
@js.native
class FilterObserver protected ()
  extends wonderDashFrpLib.distEs2015ObserverFilterObserverMod.FilterObserver {
  def this(prevObserver: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver, predicate: js.Function1[/* value */ js.Any, scala.Boolean], source: wonderDashFrpLib.distEs2015CoreStreamMod.Stream) = this()
}

@JSImport("wonder-frp/dist/es2015", "FilterObserver")
@js.native
object FilterObserver extends js.Object {
  def create(
    prevObserver: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver,
    predicate: js.Function3[
      /* value */ js.Any, 
      /* index */ js.UndefOr[scala.Double], 
      /* source */ js.UndefOr[wonderDashFrpLib.distEs2015CoreStreamMod.Stream], 
      scala.Boolean
    ],
    source: wonderDashFrpLib.distEs2015CoreStreamMod.Stream
  ): wonderDashFrpLib.distEs2015ObserverFilterObserverMod.FilterObserver = js.native
}

