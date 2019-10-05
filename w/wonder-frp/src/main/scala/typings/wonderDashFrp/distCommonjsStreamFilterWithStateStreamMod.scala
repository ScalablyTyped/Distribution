package typings.wonderDashFrp

import typings.wonderDashFrp.distCommonjsCoreStreamMod.Stream
import typings.wonderDashFrp.distCommonjsStreamFilterStreamMod.FilterStream
import typings.wonderDashFrp.distCommonjsStreamFilterWithStateStreamMod.FilterWithStateStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/FilterWithStateStream", JSImport.Namespace)
@js.native
object distCommonjsStreamFilterWithStateStreamMod extends js.Object {
  @js.native
  class FilterWithStateStream () extends FilterStream
  
  /* static members */
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
  
}

