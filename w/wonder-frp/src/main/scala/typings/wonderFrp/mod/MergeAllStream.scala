package typings.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "MergeAllStream")
@js.native
class MergeAllStream protected ()
  extends typings.wonderFrp.mergeAllStreamMod.MergeAllStream {
  def this(source: typings.wonderFrp.streamMod.Stream) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "MergeAllStream")
@js.native
object MergeAllStream extends js.Object {
  def create(source: typings.wonderFrp.streamMod.Stream): typings.wonderFrp.mergeAllStreamMod.MergeAllStream = js.native
}

