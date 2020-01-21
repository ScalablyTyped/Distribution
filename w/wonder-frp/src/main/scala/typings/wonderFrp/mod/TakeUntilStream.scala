package typings.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "TakeUntilStream")
@js.native
class TakeUntilStream protected ()
  extends typings.wonderFrp.takeUntilStreamMod.TakeUntilStream {
  def this(source: typings.wonderFrp.streamMod.Stream, otherStream: typings.wonderFrp.streamMod.Stream) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "TakeUntilStream")
@js.native
object TakeUntilStream extends js.Object {
  def create(source: typings.wonderFrp.streamMod.Stream, otherSteam: typings.wonderFrp.streamMod.Stream): typings.wonderFrp.takeUntilStreamMod.TakeUntilStream = js.native
}

