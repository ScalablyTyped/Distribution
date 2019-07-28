package typings.wonderDashFrp.distCommonjsMod

import typings.wonderDashFrp.distCommonjsObserverIObserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "FilterObserver")
@js.native
class FilterObserver protected ()
  extends typings.wonderDashFrp.distCommonjsObserverFilterObserverMod.FilterObserver {
  def this(
    prevObserver: IObserver,
    predicate: js.Function1[/* value */ js.Any, Boolean],
    source: typings.wonderDashFrp.distCommonjsCoreStreamMod.Stream
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "FilterObserver")
@js.native
object FilterObserver extends js.Object {
  def create(
    prevObserver: IObserver,
    predicate: js.Function3[
      /* value */ js.Any, 
      /* index */ js.UndefOr[Double], 
      /* source */ js.UndefOr[typings.wonderDashFrp.distCommonjsCoreStreamMod.Stream], 
      Boolean
    ],
    source: typings.wonderDashFrp.distCommonjsCoreStreamMod.Stream
  ): typings.wonderDashFrp.distCommonjsObserverFilterObserverMod.FilterObserver = js.native
}

