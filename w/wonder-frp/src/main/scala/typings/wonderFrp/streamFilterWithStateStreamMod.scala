package typings.wonderFrp

import typings.wonderFrp.coreStreamMod.Stream
import typings.wonderFrp.streamFilterStreamMod.FilterStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamFilterWithStateStreamMod {
  
  @JSImport("wonder-frp/dist/es2015/stream/FilterWithStateStream", "FilterWithStateStream")
  @js.native
  class FilterWithStateStream protected () extends FilterStream {
    def this(
      source: Stream,
      predicate: js.Function3[
            /* value */ js.Any, 
            /* index */ js.UndefOr[Double], 
            /* source */ js.UndefOr[Stream], 
            Boolean
          ],
      thisArg: js.Any
    ) = this()
  }
  /* static members */
  object FilterWithStateStream {
    
    @JSImport("wonder-frp/dist/es2015/stream/FilterWithStateStream", "FilterWithStateStream")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(
      source: Stream,
      predicate: js.Function3[
          /* value */ js.Any, 
          /* index */ js.UndefOr[Double], 
          /* source */ js.UndefOr[Stream], 
          Boolean
        ],
      thisArg: js.Any
    ): FilterWithStateStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[FilterWithStateStream]
  }
}
