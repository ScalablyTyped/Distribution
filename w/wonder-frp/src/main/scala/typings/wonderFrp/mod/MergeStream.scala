package typings.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "MergeStream")
@js.native
class MergeStream protected ()
  extends typings.wonderFrp.mergeStreamMod.MergeStream {
  def this(source: typings.wonderFrp.streamMod.Stream, maxConcurrent: Double) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "MergeStream")
@js.native
object MergeStream extends js.Object {
  def create(source: typings.wonderFrp.streamMod.Stream, maxConcurrent: Double): typings.wonderFrp.mergeStreamMod.MergeStream = js.native
}

