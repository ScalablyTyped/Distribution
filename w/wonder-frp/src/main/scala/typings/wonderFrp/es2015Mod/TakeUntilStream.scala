package typings.wonderFrp.es2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "TakeUntilStream")
@js.native
class TakeUntilStream protected ()
  extends typings.wonderFrp.streamTakeUntilStreamMod.TakeUntilStream {
  def this(
    source: typings.wonderFrp.coreStreamMod.Stream,
    otherStream: typings.wonderFrp.coreStreamMod.Stream
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "TakeUntilStream")
@js.native
object TakeUntilStream extends js.Object {
  def create(source: typings.wonderFrp.coreStreamMod.Stream, otherSteam: typings.wonderFrp.coreStreamMod.Stream): typings.wonderFrp.streamTakeUntilStreamMod.TakeUntilStream = js.native
}

