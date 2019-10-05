package typings.wonderDashFrp

import typings.wonderDashFrp.distEs2015CoreStreamMod.Stream
import typings.wonderDashFrp.distEs2015StreamFilterStreamMod.FilterStream
import typings.wonderDashFrp.distEs2015StreamFilterWithStateStreamMod.FilterWithStateStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/stream/FilterWithStateStream", JSImport.Namespace)
@js.native
object distEs2015StreamFilterWithStateStreamMod extends js.Object {
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

