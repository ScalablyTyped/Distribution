package typings
package wonderDashFrpLib.distEs2015ObserverFilterObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/observer/FilterObserver", "FilterObserver")
@js.native
class FilterObserver protected ()
  extends wonderDashFrpLib.distEs2015CoreObserverMod.Observer {
  def this(prevObserver: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver, predicate: js.Function1[/* value */ js.Any, scala.Boolean], source: wonderDashFrpLib.distEs2015CoreStreamMod.Stream) = this()
  var i: scala.Double = js.native
  var prevObserver: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver = js.native
  var source: wonderDashFrpLib.distEs2015CoreStreamMod.Stream = js.native
  /* protected */ def predicate(value: js.Any): scala.Boolean = js.native
  /* protected */ def predicate(value: js.Any, index: scala.Double): scala.Boolean = js.native
  /* protected */ def predicate(value: js.Any, index: scala.Double, source: wonderDashFrpLib.distEs2015CoreStreamMod.Stream): scala.Boolean = js.native
}

@JSImport("wonder-frp/dist/es2015/observer/FilterObserver", "FilterObserver")
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

