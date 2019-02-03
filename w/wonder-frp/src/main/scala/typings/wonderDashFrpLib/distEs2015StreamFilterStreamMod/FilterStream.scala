package typings
package wonderDashFrpLib.distEs2015StreamFilterStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/stream/FilterStream", "FilterStream")
@js.native
class FilterStream protected ()
  extends wonderDashFrpLib.distEs2015StreamBaseStreamMod.BaseStream {
  def this(source: wonderDashFrpLib.distEs2015CoreStreamMod.Stream, predicate: js.Function3[
      /* value */ js.Any, 
      /* index */ js.UndefOr[scala.Double], 
      /* source */ js.UndefOr[wonderDashFrpLib.distEs2015CoreStreamMod.Stream], 
      scala.Boolean
    ], thisArg: js.Any) = this()
  var _source: js.Any = js.native
  /* private */ def _innerPredicate(predicate: js.Any, self: js.Any): js.Any = js.native
  /* protected */ def createObserver(observer: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver): wonderDashFrpLib.distEs2015CoreObserverMod.Observer = js.native
  /* protected */ def createStreamForInternalFilter(source: wonderDashFrpLib.distEs2015CoreStreamMod.Stream, innerPredicate: js.Any, thisArg: js.Any): wonderDashFrpLib.distEs2015CoreStreamMod.Stream = js.native
  def internalFilter(
    predicate: js.Function3[
      /* value */ js.Any, 
      /* index */ js.UndefOr[scala.Double], 
      /* source */ js.UndefOr[wonderDashFrpLib.distEs2015CoreStreamMod.Stream], 
      scala.Boolean
    ],
    thisArg: js.Any
  ): wonderDashFrpLib.distEs2015CoreStreamMod.Stream = js.native
  def predicate(value: js.Any): scala.Boolean = js.native
  def predicate(value: js.Any, index: scala.Double): scala.Boolean = js.native
  def predicate(value: js.Any, index: scala.Double, source: wonderDashFrpLib.distEs2015CoreStreamMod.Stream): scala.Boolean = js.native
}

/* static members */
@JSImport("wonder-frp/dist/es2015/stream/FilterStream", "FilterStream")
@js.native
object FilterStream extends js.Object {
  def create(
    source: wonderDashFrpLib.distEs2015CoreStreamMod.Stream,
    predicate: js.Function3[
      /* value */ js.Any, 
      /* index */ js.UndefOr[scala.Double], 
      /* source */ js.UndefOr[wonderDashFrpLib.distEs2015CoreStreamMod.Stream], 
      scala.Boolean
    ],
    thisArg: js.Any
  ): wonderDashFrpLib.distEs2015StreamFilterStreamMod.FilterStream = js.native
}

