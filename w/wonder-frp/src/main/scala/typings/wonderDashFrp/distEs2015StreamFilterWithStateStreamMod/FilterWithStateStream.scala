package typings.wonderDashFrp.distEs2015StreamFilterWithStateStreamMod

import typings.wonderDashFrp.distEs2015CoreStreamMod.Stream
import typings.wonderDashFrp.distEs2015StreamFilterStreamMod.FilterStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/stream/FilterWithStateStream", "FilterWithStateStream")
@js.native
class FilterWithStateStream () extends FilterStream

/* static members */
@JSImport("wonder-frp/dist/es2015/stream/FilterWithStateStream", "FilterWithStateStream")
@js.native
object FilterWithStateStream extends js.Object {
  def create(
    source: Stream,
    predicate: js.Function3[
      /* value */ js.Any, 
      /* index */ js.UndefOr[Double], 
      /* source */ js.UndefOr[Stream], 
      Boolean
    ],
    thisArg: js.Any
  ): FilterWithStateStream = js.native
}

