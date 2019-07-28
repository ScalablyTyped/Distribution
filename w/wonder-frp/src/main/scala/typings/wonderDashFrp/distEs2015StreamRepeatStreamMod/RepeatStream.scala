package typings.wonderDashFrp.distEs2015StreamRepeatStreamMod

import typings.wonderDashFrp.distEs2015CoreStreamMod.Stream
import typings.wonderDashFrp.distEs2015StreamBaseStreamMod.BaseStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/stream/RepeatStream", "RepeatStream")
@js.native
class RepeatStream protected () extends BaseStream {
  def this(source: Stream, count: Double) = this()
  var _count: js.Any = js.native
  var _source: js.Any = js.native
}

/* static members */
@JSImport("wonder-frp/dist/es2015/stream/RepeatStream", "RepeatStream")
@js.native
object RepeatStream extends js.Object {
  def create(source: Stream, count: Double): RepeatStream = js.native
}

