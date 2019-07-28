package typings.wonderDashFrp.distCommonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "TakeUntilStream")
@js.native
class TakeUntilStream protected ()
  extends typings.wonderDashFrp.distCommonjsStreamTakeUntilStreamMod.TakeUntilStream {
  def this(
    source: typings.wonderDashFrp.distCommonjsCoreStreamMod.Stream,
    otherStream: typings.wonderDashFrp.distCommonjsCoreStreamMod.Stream
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "TakeUntilStream")
@js.native
object TakeUntilStream extends js.Object {
  def create(
    source: typings.wonderDashFrp.distCommonjsCoreStreamMod.Stream,
    otherSteam: typings.wonderDashFrp.distCommonjsCoreStreamMod.Stream
  ): typings.wonderDashFrp.distCommonjsStreamTakeUntilStreamMod.TakeUntilStream = js.native
}

