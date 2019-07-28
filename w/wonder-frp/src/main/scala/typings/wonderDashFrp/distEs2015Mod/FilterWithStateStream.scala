package typings.wonderDashFrp.distEs2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "FilterWithStateStream")
@js.native
class FilterWithStateStream ()
  extends typings.wonderDashFrp.distEs2015StreamFilterWithStateStreamMod.FilterWithStateStream

/* static members */
@JSImport("wonder-frp/dist/es2015", "FilterWithStateStream")
@js.native
object FilterWithStateStream extends js.Object {
  def create(
    source: typings.wonderDashFrp.distEs2015CoreStreamMod.Stream,
    predicate: js.Function3[
      /* value */ js.Any, 
      /* index */ js.UndefOr[Double], 
      /* source */ js.UndefOr[typings.wonderDashFrp.distEs2015CoreStreamMod.Stream], 
      Boolean
    ],
    thisArg: js.Any
  ): typings.wonderDashFrp.distEs2015StreamFilterWithStateStreamMod.FilterWithStateStream = js.native
}

