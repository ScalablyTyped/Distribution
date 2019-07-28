package typings.wonderDashFrp.distCommonjsStreamRepeatStreamMod

import typings.wonderDashFrp.distCommonjsCoreStreamMod.Stream
import typings.wonderDashFrp.distCommonjsStreamBaseStreamMod.BaseStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/RepeatStream", "RepeatStream")
@js.native
class RepeatStream protected () extends BaseStream {
  def this(source: Stream, count: Double) = this()
  var _count: js.Any = js.native
  var _source: js.Any = js.native
}

/* static members */
@JSImport("wonder-frp/dist/commonjs/stream/RepeatStream", "RepeatStream")
@js.native
object RepeatStream extends js.Object {
  def create(source: Stream, count: Double): RepeatStream = js.native
}

