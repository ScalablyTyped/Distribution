package typings
package wonderDashFrpLib.distCommonjsStreamDeferStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/DeferStream", "DeferStream")
@js.native
class DeferStream protected ()
  extends wonderDashFrpLib.distCommonjsStreamBaseStreamMod.BaseStream {
  def this(buildStreamFunc: js.Function) = this()
  var _buildStreamFunc: js.Any = js.native
}

/* static members */
@JSImport("wonder-frp/dist/commonjs/stream/DeferStream", "DeferStream")
@js.native
object DeferStream extends js.Object {
  def create(buildStreamFunc: js.Function): wonderDashFrpLib.distCommonjsStreamDeferStreamMod.DeferStream = js.native
}

