package typings
package wonderDashFrpLib.distEs2015StreamMergeStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/stream/MergeStream", "MergeStream")
@js.native
class MergeStream protected ()
  extends wonderDashFrpLib.distEs2015StreamBaseStreamMod.BaseStream {
  def this(source: wonderDashFrpLib.distEs2015CoreStreamMod.Stream, maxConcurrent: scala.Double) = this()
  var _maxConcurrent: js.Any = js.native
  var _source: js.Any = js.native
}

@JSImport("wonder-frp/dist/es2015/stream/MergeStream", "MergeStream")
@js.native
object MergeStream extends js.Object {
  def create(source: wonderDashFrpLib.distEs2015CoreStreamMod.Stream, maxConcurrent: scala.Double): wonderDashFrpLib.distEs2015StreamMergeStreamMod.MergeStream = js.native
}

