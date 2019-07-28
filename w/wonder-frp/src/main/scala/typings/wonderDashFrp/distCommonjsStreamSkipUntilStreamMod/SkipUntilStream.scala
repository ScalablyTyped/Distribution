package typings.wonderDashFrp.distCommonjsStreamSkipUntilStreamMod

import typings.wonderDashFrp.distCommonjsCoreStreamMod.Stream
import typings.wonderDashFrp.distCommonjsStreamBaseStreamMod.BaseStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/SkipUntilStream", "SkipUntilStream")
@js.native
class SkipUntilStream protected () extends BaseStream {
  def this(source: Stream, otherStream: Stream) = this()
  var _otherStream: js.Any = js.native
  var _source: js.Any = js.native
  var isOpen: Boolean = js.native
}

/* static members */
@JSImport("wonder-frp/dist/commonjs/stream/SkipUntilStream", "SkipUntilStream")
@js.native
object SkipUntilStream extends js.Object {
  def create(source: Stream, otherSteam: Stream): SkipUntilStream = js.native
}

