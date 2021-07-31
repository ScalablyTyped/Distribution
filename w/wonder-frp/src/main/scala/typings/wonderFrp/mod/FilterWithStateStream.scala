package typings.wonderFrp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "FilterWithStateStream")
@js.native
class FilterWithStateStream protected ()
  extends typings.wonderFrp.filterWithStateStreamMod.FilterWithStateStream {
  def this(
    source: typings.wonderFrp.streamMod.Stream,
    predicate: js.Function3[
        /* value */ js.Any, 
        /* index */ js.UndefOr[Double], 
        /* source */ js.UndefOr[typings.wonderFrp.streamMod.Stream], 
        Boolean
      ],
    thisArg: js.Any
  ) = this()
}
/* static members */
object FilterWithStateStream {
  
  @JSImport("wonder-frp/dist/commonjs", "FilterWithStateStream")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(
    source: typings.wonderFrp.streamMod.Stream,
    predicate: js.Function3[
      /* value */ js.Any, 
      /* index */ js.UndefOr[Double], 
      /* source */ js.UndefOr[typings.wonderFrp.streamMod.Stream], 
      Boolean
    ],
    thisArg: js.Any
  ): typings.wonderFrp.filterWithStateStreamMod.FilterWithStateStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.filterWithStateStreamMod.FilterWithStateStream]
}
