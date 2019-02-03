package typings
package wonderDashFrpLib.distEs2015StreamFilterWithStateStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/stream/FilterWithStateStream", "FilterWithStateStream")
@js.native
class FilterWithStateStream ()
  extends wonderDashFrpLib.distEs2015StreamFilterStreamMod.FilterStream

/* static members */
@JSImport("wonder-frp/dist/es2015/stream/FilterWithStateStream", "FilterWithStateStream")
@js.native
object FilterWithStateStream extends js.Object {
  def create(
    source: wonderDashFrpLib.distEs2015CoreStreamMod.Stream,
    predicate: js.Function3[
      /* value */ js.Any, 
      /* index */ js.UndefOr[scala.Double], 
      /* source */ js.UndefOr[wonderDashFrpLib.distEs2015CoreStreamMod.Stream], 
      scala.Boolean
    ],
    thisArg: js.Any
  ): wonderDashFrpLib.distEs2015StreamFilterWithStateStreamMod.FilterWithStateStream = js.native
}

