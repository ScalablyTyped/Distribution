package typings
package wonderDashFrpLib.distEs2015StreamDeferStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/stream/DeferStream", "DeferStream")
@js.native
class DeferStream protected ()
  extends wonderDashFrpLib.distEs2015StreamBaseStreamMod.BaseStream {
  def this(buildStreamFunc: js.Function) = this()
  var _buildStreamFunc: js.Any = js.native
}

@JSImport("wonder-frp/dist/es2015/stream/DeferStream", "DeferStream")
@js.native
object DeferStream extends js.Object {
  def create(buildStreamFunc: js.Function): wonderDashFrpLib.distEs2015StreamDeferStreamMod.DeferStream = js.native
}

