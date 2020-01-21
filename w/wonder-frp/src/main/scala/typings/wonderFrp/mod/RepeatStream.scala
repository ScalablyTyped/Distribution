package typings.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "RepeatStream")
@js.native
class RepeatStream protected ()
  extends typings.wonderFrp.repeatStreamMod.RepeatStream {
  def this(source: typings.wonderFrp.streamMod.Stream, count: Double) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "RepeatStream")
@js.native
object RepeatStream extends js.Object {
  def create(source: typings.wonderFrp.streamMod.Stream, count: Double): typings.wonderFrp.repeatStreamMod.RepeatStream = js.native
}

