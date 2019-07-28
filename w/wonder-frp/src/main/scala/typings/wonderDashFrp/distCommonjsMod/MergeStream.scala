package typings.wonderDashFrp.distCommonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "MergeStream")
@js.native
class MergeStream protected ()
  extends typings.wonderDashFrp.distCommonjsStreamMergeStreamMod.MergeStream {
  def this(source: typings.wonderDashFrp.distCommonjsCoreStreamMod.Stream, maxConcurrent: Double) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "MergeStream")
@js.native
object MergeStream extends js.Object {
  def create(source: typings.wonderDashFrp.distCommonjsCoreStreamMod.Stream, maxConcurrent: Double): typings.wonderDashFrp.distCommonjsStreamMergeStreamMod.MergeStream = js.native
}

