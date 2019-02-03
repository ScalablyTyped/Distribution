package typings
package wonderDashFrpLib.distCommonjsStreamFilterStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/FilterStream", "FilterStream")
@js.native
class FilterStream protected ()
  extends wonderDashFrpLib.distCommonjsStreamBaseStreamMod.BaseStream {
  def this(source: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream, predicate: js.Function3[
      /* value */ js.Any, 
      /* index */ js.UndefOr[scala.Double], 
      /* source */ js.UndefOr[wonderDashFrpLib.distCommonjsCoreStreamMod.Stream], 
      scala.Boolean
    ], thisArg: js.Any) = this()
  var _source: js.Any = js.native
  /* private */ def _innerPredicate(predicate: js.Any, self: js.Any): js.Any = js.native
  /* protected */ def createObserver(observer: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver): wonderDashFrpLib.distCommonjsCoreObserverMod.Observer = js.native
  /* protected */ def createStreamForInternalFilter(source: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream, innerPredicate: js.Any, thisArg: js.Any): wonderDashFrpLib.distCommonjsCoreStreamMod.Stream = js.native
  def internalFilter(
    predicate: js.Function3[
      /* value */ js.Any, 
      /* index */ js.UndefOr[scala.Double], 
      /* source */ js.UndefOr[wonderDashFrpLib.distCommonjsCoreStreamMod.Stream], 
      scala.Boolean
    ],
    thisArg: js.Any
  ): wonderDashFrpLib.distCommonjsCoreStreamMod.Stream = js.native
  def predicate(value: js.Any): scala.Boolean = js.native
  def predicate(value: js.Any, index: scala.Double): scala.Boolean = js.native
  def predicate(value: js.Any, index: scala.Double, source: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream): scala.Boolean = js.native
}

/* static members */
@JSImport("wonder-frp/dist/commonjs/stream/FilterStream", "FilterStream")
@js.native
object FilterStream extends js.Object {
  def create(
    source: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream,
    predicate: js.Function3[
      /* value */ js.Any, 
      /* index */ js.UndefOr[scala.Double], 
      /* source */ js.UndefOr[wonderDashFrpLib.distCommonjsCoreStreamMod.Stream], 
      scala.Boolean
    ],
    thisArg: js.Any
  ): wonderDashFrpLib.distCommonjsStreamFilterStreamMod.FilterStream = js.native
}

