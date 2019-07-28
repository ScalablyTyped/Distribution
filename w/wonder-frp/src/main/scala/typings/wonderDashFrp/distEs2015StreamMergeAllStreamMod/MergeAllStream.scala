package typings.wonderDashFrp.distEs2015StreamMergeAllStreamMod

import typings.wonderDashFrp.distEs2015CoreStreamMod.Stream
import typings.wonderDashFrp.distEs2015StreamBaseStreamMod.BaseStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/stream/MergeAllStream", "MergeAllStream")
@js.native
class MergeAllStream protected () extends BaseStream {
  def this(source: Stream) = this()
  var _source: js.Any = js.native
}

/* static members */
@JSImport("wonder-frp/dist/es2015/stream/MergeAllStream", "MergeAllStream")
@js.native
object MergeAllStream extends js.Object {
  def create(source: Stream): MergeAllStream = js.native
}

