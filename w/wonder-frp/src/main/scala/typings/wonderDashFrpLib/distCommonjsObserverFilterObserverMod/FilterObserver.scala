package typings
package wonderDashFrpLib.distCommonjsObserverFilterObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/observer/FilterObserver", "FilterObserver")
@js.native
class FilterObserver protected ()
  extends wonderDashFrpLib.distCommonjsCoreObserverMod.Observer {
  def this(prevObserver: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver, predicate: js.Function1[/* value */ js.Any, scala.Boolean], source: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream) = this()
  var i: scala.Double = js.native
  var prevObserver: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver = js.native
  var source: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream = js.native
  /* protected */ def predicate(value: js.Any): scala.Boolean = js.native
  /* protected */ def predicate(value: js.Any, index: scala.Double): scala.Boolean = js.native
  /* protected */ def predicate(value: js.Any, index: scala.Double, source: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream): scala.Boolean = js.native
}

/* static members */
@JSImport("wonder-frp/dist/commonjs/observer/FilterObserver", "FilterObserver")
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

