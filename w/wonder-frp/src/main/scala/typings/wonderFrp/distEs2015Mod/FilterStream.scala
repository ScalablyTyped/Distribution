package typings.wonderFrp.distEs2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "FilterStream")
@js.native
open class FilterStream protected ()
  extends typings.wonderFrp.distEs2015StreamFilterStreamMod.FilterStream {
  def this(
    source: typings.wonderFrp.distEs2015CoreStreamMod.Stream,
    predicate: js.Function3[
        /* value */ Any, 
        /* index */ js.UndefOr[Double], 
        /* source */ js.UndefOr[typings.wonderFrp.distEs2015CoreStreamMod.Stream], 
        Boolean
      ],
    thisArg: Any
  ) = this()
}
/* static members */
object FilterStream {
  
  @JSImport("wonder-frp/dist/es2015", "FilterStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    source: typings.wonderFrp.distEs2015CoreStreamMod.Stream,
    predicate: js.Function3[
      /* value */ Any, 
      /* index */ js.UndefOr[Double], 
      /* source */ js.UndefOr[typings.wonderFrp.distEs2015CoreStreamMod.Stream], 
      Boolean
    ],
    thisArg: Any
  ): typings.wonderFrp.distEs2015StreamFilterStreamMod.FilterStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.distEs2015StreamFilterStreamMod.FilterStream]
}
