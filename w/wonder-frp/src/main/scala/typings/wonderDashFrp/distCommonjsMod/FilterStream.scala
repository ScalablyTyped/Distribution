package typings.wonderDashFrp.distCommonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "FilterStream")
@js.native
class FilterStream protected ()
  extends typings.wonderDashFrp.distCommonjsStreamFilterStreamMod.FilterStream {
  def this(
    source: typings.wonderDashFrp.distCommonjsCoreStreamMod.Stream,
    predicate: js.Function3[
        /* value */ js.Any, 
        /* index */ js.UndefOr[Double], 
        /* source */ js.UndefOr[typings.wonderDashFrp.distCommonjsCoreStreamMod.Stream], 
        Boolean
      ],
    thisArg: js.Any
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "FilterStream")
@js.native
object FilterStream extends js.Object {
  def create(
    source: typings.wonderDashFrp.distCommonjsCoreStreamMod.Stream,
    predicate: js.Function3[
      /* value */ js.Any, 
      /* index */ js.UndefOr[Double], 
      /* source */ js.UndefOr[typings.wonderDashFrp.distCommonjsCoreStreamMod.Stream], 
      Boolean
    ],
    thisArg: js.Any
  ): typings.wonderDashFrp.distCommonjsStreamFilterStreamMod.FilterStream = js.native
}

