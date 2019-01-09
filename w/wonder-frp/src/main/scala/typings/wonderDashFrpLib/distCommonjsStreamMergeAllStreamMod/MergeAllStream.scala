package typings
package wonderDashFrpLib.distCommonjsStreamMergeAllStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/MergeAllStream", "MergeAllStream")
@js.native
class MergeAllStream protected ()
  extends wonderDashFrpLib.distCommonjsStreamBaseStreamMod.BaseStream {
  def this(source: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream) = this()
  var _source: js.Any = js.native
}

@JSImport("wonder-frp/dist/commonjs/stream/MergeAllStream", "MergeAllStream")
@js.native
object MergeAllStream extends js.Object {
  def create(source: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream): wonderDashFrpLib.distCommonjsStreamMergeAllStreamMod.MergeAllStream = js.native
}

