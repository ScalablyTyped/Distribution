package typings.wonderDashFrp.distEs2015StreamFromEventPatternStreamMod

import typings.wonderDashFrp.distEs2015StreamBaseStreamMod.BaseStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/stream/FromEventPatternStream", "FromEventPatternStream")
@js.native
class FromEventPatternStream protected () extends BaseStream {
  def this(addHandler: js.Function, removeHandler: js.Function) = this()
  var _addHandler: js.Any = js.native
  var _removeHandler: js.Any = js.native
}

/* static members */
@JSImport("wonder-frp/dist/es2015/stream/FromEventPatternStream", "FromEventPatternStream")
@js.native
object FromEventPatternStream extends js.Object {
  def create(addHandler: js.Function, removeHandler: js.Function): FromEventPatternStream = js.native
}

