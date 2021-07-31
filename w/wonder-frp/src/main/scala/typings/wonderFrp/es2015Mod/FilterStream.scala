package typings.wonderFrp.es2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "FilterStream")
@js.native
class FilterStream protected ()
  extends typings.wonderFrp.streamFilterStreamMod.FilterStream {
  def this(
    source: typings.wonderFrp.coreStreamMod.Stream,
    predicate: js.Function3[
        /* value */ js.Any, 
        /* index */ js.UndefOr[Double], 
        /* source */ js.UndefOr[typings.wonderFrp.coreStreamMod.Stream], 
        Boolean
      ],
    thisArg: js.Any
  ) = this()
}
/* static members */
object FilterStream {
  
  @JSImport("wonder-frp/dist/es2015", "FilterStream")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(
    source: typings.wonderFrp.coreStreamMod.Stream,
    predicate: js.Function3[
      /* value */ js.Any, 
      /* index */ js.UndefOr[Double], 
      /* source */ js.UndefOr[typings.wonderFrp.coreStreamMod.Stream], 
      Boolean
    ],
    thisArg: js.Any
  ): typings.wonderFrp.streamFilterStreamMod.FilterStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.streamFilterStreamMod.FilterStream]
}
