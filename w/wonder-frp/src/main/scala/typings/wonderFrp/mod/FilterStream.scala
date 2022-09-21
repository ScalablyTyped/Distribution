package typings.wonderFrp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "FilterStream")
@js.native
open class FilterStream protected ()
  extends typings.wonderFrp.filterStreamMod.FilterStream {
  def this(
    source: typings.wonderFrp.streamMod.Stream,
    predicate: js.Function3[
        /* value */ Any, 
        /* index */ js.UndefOr[Double], 
        /* source */ js.UndefOr[typings.wonderFrp.streamMod.Stream], 
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
    source: typings.wonderFrp.streamMod.Stream,
    predicate: js.Function3[
      /* value */ Any, 
      /* index */ js.UndefOr[Double], 
      /* source */ js.UndefOr[typings.wonderFrp.streamMod.Stream], 
      Boolean
    ],
    thisArg: Any
  ): typings.wonderFrp.filterStreamMod.FilterStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.filterStreamMod.FilterStream]
}
