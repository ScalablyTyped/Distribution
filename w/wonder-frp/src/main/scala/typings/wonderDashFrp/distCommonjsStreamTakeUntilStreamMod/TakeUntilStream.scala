package typings.wonderDashFrp.distCommonjsStreamTakeUntilStreamMod

import typings.wonderDashFrp.distCommonjsCoreStreamMod.Stream
import typings.wonderDashFrp.distCommonjsStreamBaseStreamMod.BaseStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/TakeUntilStream", "TakeUntilStream")
@js.native
class TakeUntilStream protected () extends BaseStream {
  def this(source: Stream, otherStream: Stream) = this()
  var _otherStream: js.Any = js.native
  var _source: js.Any = js.native
}

/* static members */
@JSImport("wonder-frp/dist/commonjs/stream/TakeUntilStream", "TakeUntilStream")
@js.native
object TakeUntilStream extends js.Object {
  def create(source: Stream, otherSteam: Stream): TakeUntilStream = js.native
}

