package typings
package wonderDashFrpLib.distCommonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "TakeUntilStream")
@js.native
class TakeUntilStream protected ()
  extends wonderDashFrpLib.distCommonjsStreamTakeUntilStreamMod.TakeUntilStream {
  def this(source: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream, otherStream: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "TakeUntilStream")
@js.native
object TakeUntilStream extends js.Object {
  def create(
    source: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream,
    otherSteam: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream
  ): wonderDashFrpLib.distCommonjsStreamTakeUntilStreamMod.TakeUntilStream = js.native
}

