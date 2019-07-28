package typings.wonderDashFrp.distEs2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "FilterStream")
@js.native
class FilterStream protected ()
  extends typings.wonderDashFrp.distEs2015StreamFilterStreamMod.FilterStream {
  def this(
    source: typings.wonderDashFrp.distEs2015CoreStreamMod.Stream,
    predicate: js.Function3[
        /* value */ js.Any, 
        /* index */ js.UndefOr[Double], 
        /* source */ js.UndefOr[typings.wonderDashFrp.distEs2015CoreStreamMod.Stream], 
        Boolean
      ],
    thisArg: js.Any
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "FilterStream")
@js.native
object FilterStream extends js.Object {
  def create(
    source: typings.wonderDashFrp.distEs2015CoreStreamMod.Stream,
    predicate: js.Function3[
      /* value */ js.Any, 
      /* index */ js.UndefOr[Double], 
      /* source */ js.UndefOr[typings.wonderDashFrp.distEs2015CoreStreamMod.Stream], 
      Boolean
    ],
    thisArg: js.Any
  ): typings.wonderDashFrp.distEs2015StreamFilterStreamMod.FilterStream = js.native
}

