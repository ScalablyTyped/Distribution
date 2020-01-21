package typings.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "FilterStream")
@js.native
class FilterStream protected ()
  extends typings.wonderFrp.filterStreamMod.FilterStream {
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
@JSImport("wonder-frp/dist/commonjs", "FilterStream")
@js.native
object FilterStream extends js.Object {
  def create(
    source: typings.wonderFrp.streamMod.Stream,
    predicate: js.Function3[
      /* value */ js.Any, 
      /* index */ js.UndefOr[Double], 
      /* source */ js.UndefOr[typings.wonderFrp.streamMod.Stream], 
      Boolean
    ],
    thisArg: js.Any
  ): typings.wonderFrp.filterStreamMod.FilterStream = js.native
}

