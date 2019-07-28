package typings.wonderDashFrp.distCommonjsStreamConcatStreamMod

import typings.wonderDashFrp.distCommonjsCoreStreamMod.Stream
import typings.wonderDashFrp.distCommonjsStreamBaseStreamMod.BaseStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/ConcatStream", "ConcatStream")
@js.native
class ConcatStream protected () extends BaseStream {
  def this(sources: js.Array[Stream]) = this()
  var _sources: js.Any = js.native
}

/* static members */
@JSImport("wonder-frp/dist/commonjs/stream/ConcatStream", "ConcatStream")
@js.native
object ConcatStream extends js.Object {
  def create(sources: js.Array[Stream]): ConcatStream = js.native
}

