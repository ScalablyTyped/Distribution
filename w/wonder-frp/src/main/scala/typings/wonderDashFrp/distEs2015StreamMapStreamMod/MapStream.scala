package typings.wonderDashFrp.distEs2015StreamMapStreamMod

import typings.wonderDashFrp.distEs2015CoreStreamMod.Stream
import typings.wonderDashFrp.distEs2015StreamBaseStreamMod.BaseStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/stream/MapStream", "MapStream")
@js.native
class MapStream protected () extends BaseStream {
  def this(source: Stream, selector: js.Function) = this()
  var _selector: js.Any = js.native
  var _source: js.Any = js.native
}

/* static members */
@JSImport("wonder-frp/dist/es2015/stream/MapStream", "MapStream")
@js.native
object MapStream extends js.Object {
  def create(source: Stream, selector: js.Function): MapStream = js.native
}

