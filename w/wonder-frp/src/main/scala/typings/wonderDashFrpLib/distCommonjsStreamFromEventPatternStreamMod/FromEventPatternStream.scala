package typings
package wonderDashFrpLib.distCommonjsStreamFromEventPatternStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/FromEventPatternStream", "FromEventPatternStream")
@js.native
class FromEventPatternStream protected ()
  extends wonderDashFrpLib.distCommonjsStreamBaseStreamMod.BaseStream {
  def this(addHandler: js.Function, removeHandler: js.Function) = this()
  var _addHandler: js.Any = js.native
  var _removeHandler: js.Any = js.native
}

@JSImport("wonder-frp/dist/commonjs/stream/FromEventPatternStream", "FromEventPatternStream")
@js.native
object FromEventPatternStream extends js.Object {
  def create(addHandler: js.Function, removeHandler: js.Function): wonderDashFrpLib.distCommonjsStreamFromEventPatternStreamMod.FromEventPatternStream = js.native
}

