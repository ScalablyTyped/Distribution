package typings.wonderDashFrp.distCommonjsStreamIgnoreElementsStreamMod

import typings.wonderDashFrp.distCommonjsCoreStreamMod.Stream
import typings.wonderDashFrp.distCommonjsStreamBaseStreamMod.BaseStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/IgnoreElementsStream", "IgnoreElementsStream")
@js.native
class IgnoreElementsStream protected () extends BaseStream {
  def this(source: Stream) = this()
  var _source: js.Any = js.native
}

/* static members */
@JSImport("wonder-frp/dist/commonjs/stream/IgnoreElementsStream", "IgnoreElementsStream")
@js.native
object IgnoreElementsStream extends js.Object {
  def create(source: Stream): IgnoreElementsStream = js.native
}

