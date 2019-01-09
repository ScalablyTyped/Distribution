package typings
package wonderDashFrpLib.distCommonjsStreamMergeStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/MergeStream", "MergeStream")
@js.native
class MergeStream protected ()
  extends wonderDashFrpLib.distCommonjsStreamBaseStreamMod.BaseStream {
  def this(source: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream, maxConcurrent: scala.Double) = this()
  var _maxConcurrent: js.Any = js.native
  var _source: js.Any = js.native
}

@JSImport("wonder-frp/dist/commonjs/stream/MergeStream", "MergeStream")
@js.native
object MergeStream extends js.Object {
  def create(source: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream, maxConcurrent: scala.Double): wonderDashFrpLib.distCommonjsStreamMergeStreamMod.MergeStream = js.native
}

