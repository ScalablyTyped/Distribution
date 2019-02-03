package typings
package wonderDashFrpLib.distCommonjsStreamTakeUntilStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/TakeUntilStream", "TakeUntilStream")
@js.native
class TakeUntilStream protected ()
  extends wonderDashFrpLib.distCommonjsStreamBaseStreamMod.BaseStream {
  def this(source: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream, otherStream: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream) = this()
  var _otherStream: js.Any = js.native
  var _source: js.Any = js.native
}

/* static members */
@JSImport("wonder-frp/dist/commonjs/stream/TakeUntilStream", "TakeUntilStream")
@js.native
object TakeUntilStream extends js.Object {
  def create(
    source: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream,
    otherSteam: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream
  ): wonderDashFrpLib.distCommonjsStreamTakeUntilStreamMod.TakeUntilStream = js.native
}

