package typings
package wonderDashFrpLib.distCommonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "MergeStream")
@js.native
class MergeStream protected ()
  extends wonderDashFrpLib.distCommonjsStreamMergeStreamMod.MergeStream {
  def this(source: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream, maxConcurrent: scala.Double) = this()
}

@JSImport("wonder-frp/dist/commonjs", "MergeStream")
@js.native
object MergeStream extends js.Object {
  def create(source: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream, maxConcurrent: scala.Double): wonderDashFrpLib.distCommonjsStreamMergeStreamMod.MergeStream = js.native
}

