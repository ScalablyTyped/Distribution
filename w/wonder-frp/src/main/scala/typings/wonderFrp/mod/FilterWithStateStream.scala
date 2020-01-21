package typings.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "FilterWithStateStream")
@js.native
class FilterWithStateStream ()
  extends typings.wonderFrp.filterWithStateStreamMod.FilterWithStateStream

/* static members */
@JSImport("wonder-frp/dist/commonjs", "FilterWithStateStream")
@js.native
object FilterWithStateStream extends js.Object {
  def create(
    source: typings.wonderFrp.streamMod.Stream,
    predicate: js.Function3[
      /* value */ js.Any, 
      /* index */ js.UndefOr[Double], 
      /* source */ js.UndefOr[typings.wonderFrp.streamMod.Stream], 
      Boolean
    ],
    thisArg: js.Any
  ): typings.wonderFrp.filterWithStateStreamMod.FilterWithStateStream = js.native
}

