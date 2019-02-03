package typings
package wonderDashFrpLib.distCommonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "FilterStream")
@js.native
class FilterStream protected ()
  extends wonderDashFrpLib.distCommonjsStreamFilterStreamMod.FilterStream {
  def this(source: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream, predicate: js.Function3[
      /* value */ js.Any, 
      /* index */ js.UndefOr[scala.Double], 
      /* source */ js.UndefOr[wonderDashFrpLib.distCommonjsCoreStreamMod.Stream], 
      scala.Boolean
    ], thisArg: js.Any) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "FilterStream")
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

