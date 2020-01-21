package typings.wonderFrp.es2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "RepeatStream")
@js.native
class RepeatStream protected ()
  extends typings.wonderFrp.streamRepeatStreamMod.RepeatStream {
  def this(source: typings.wonderFrp.coreStreamMod.Stream, count: Double) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "RepeatStream")
@js.native
object RepeatStream extends js.Object {
  def create(source: typings.wonderFrp.coreStreamMod.Stream, count: Double): typings.wonderFrp.streamRepeatStreamMod.RepeatStream = js.native
}

