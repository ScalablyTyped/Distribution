package typings.wonderFrp.es2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "MergeStream")
@js.native
class MergeStream protected ()
  extends typings.wonderFrp.streamMergeStreamMod.MergeStream {
  def this(source: typings.wonderFrp.coreStreamMod.Stream, maxConcurrent: Double) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "MergeStream")
@js.native
object MergeStream extends js.Object {
  def create(source: typings.wonderFrp.coreStreamMod.Stream, maxConcurrent: Double): typings.wonderFrp.streamMergeStreamMod.MergeStream = js.native
}

