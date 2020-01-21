package typings.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "FromEventPatternStream")
@js.native
class FromEventPatternStream protected ()
  extends typings.wonderFrp.fromEventPatternStreamMod.FromEventPatternStream {
  def this(addHandler: js.Function, removeHandler: js.Function) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "FromEventPatternStream")
@js.native
object FromEventPatternStream extends js.Object {
  def create(addHandler: js.Function, removeHandler: js.Function): typings.wonderFrp.fromEventPatternStreamMod.FromEventPatternStream = js.native
}

