package typings
package wonderDashFrpLib.distCommonjsStreamFilterWithStateStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/FilterWithStateStream", "FilterWithStateStream")
@js.native
class FilterWithStateStream ()
  extends wonderDashFrpLib.distCommonjsStreamFilterStreamMod.FilterStream

/* static members */
@JSImport("wonder-frp/dist/commonjs/stream/FilterWithStateStream", "FilterWithStateStream")
@js.native
object FilterWithStateStream extends js.Object {
  def create(
    source: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream,
    predicate: js.Function3[
      /* value */ js.Any, 
      /* index */ js.UndefOr[scala.Double], 
      /* source */ js.UndefOr[wonderDashFrpLib.distCommonjsCoreStreamMod.Stream], 
      scala.Boolean
    ],
    thisArg: js.Any
  ): wonderDashFrpLib.distCommonjsStreamFilterWithStateStreamMod.FilterWithStateStream = js.native
}

