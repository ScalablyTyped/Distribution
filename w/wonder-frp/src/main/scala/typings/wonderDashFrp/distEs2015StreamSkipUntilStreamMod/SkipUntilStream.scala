package typings.wonderDashFrp.distEs2015StreamSkipUntilStreamMod

import typings.wonderDashFrp.distEs2015CoreStreamMod.Stream
import typings.wonderDashFrp.distEs2015StreamBaseStreamMod.BaseStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/stream/SkipUntilStream", "SkipUntilStream")
@js.native
class SkipUntilStream protected () extends BaseStream {
  def this(source: Stream, otherStream: Stream) = this()
  var _otherStream: js.Any = js.native
  var _source: js.Any = js.native
  var isOpen: Boolean = js.native
}

/* static members */
@JSImport("wonder-frp/dist/es2015/stream/SkipUntilStream", "SkipUntilStream")
@js.native
object SkipUntilStream extends js.Object {
  def create(source: Stream, otherSteam: Stream): SkipUntilStream = js.native
}

