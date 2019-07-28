package typings.wonderDashFrp.distEs2015StreamDeferStreamMod

import typings.wonderDashFrp.distEs2015StreamBaseStreamMod.BaseStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/stream/DeferStream", "DeferStream")
@js.native
class DeferStream protected () extends BaseStream {
  def this(buildStreamFunc: js.Function) = this()
  var _buildStreamFunc: js.Any = js.native
}

/* static members */
@JSImport("wonder-frp/dist/es2015/stream/DeferStream", "DeferStream")
@js.native
object DeferStream extends js.Object {
  def create(buildStreamFunc: js.Function): DeferStream = js.native
}

