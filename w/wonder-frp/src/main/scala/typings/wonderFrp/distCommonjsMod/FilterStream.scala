package typings.wonderFrp.distCommonjsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "FilterStream")
@js.native
open class FilterStream protected ()
  extends typings.wonderFrp.distCommonjsStreamFilterStreamMod.FilterStream {
  def this(
    source: typings.wonderFrp.distCommonjsCoreStreamMod.Stream,
    predicate: js.Function3[
        /* value */ Any, 
        /* index */ js.UndefOr[Double], 
        /* source */ js.UndefOr[typings.wonderFrp.distCommonjsCoreStreamMod.Stream], 
        Boolean
      ],
    thisArg: Any
  ) = this()
}
/* static members */
object FilterStream {
  
  @JSImport("wonder-frp/dist/commonjs", "FilterStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    source: typings.wonderFrp.distCommonjsCoreStreamMod.Stream,
    predicate: js.Function3[
      /* value */ Any, 
      /* index */ js.UndefOr[Double], 
      /* source */ js.UndefOr[typings.wonderFrp.distCommonjsCoreStreamMod.Stream], 
      Boolean
    ],
    thisArg: Any
  ): typings.wonderFrp.distCommonjsStreamFilterStreamMod.FilterStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.distCommonjsStreamFilterStreamMod.FilterStream]
}
