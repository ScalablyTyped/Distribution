package typings.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "DeferStream")
@js.native
class DeferStream protected ()
  extends typings.wonderFrp.deferStreamMod.DeferStream {
  def this(buildStreamFunc: js.Function) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "DeferStream")
@js.native
object DeferStream extends js.Object {
  def create(buildStreamFunc: js.Function): typings.wonderFrp.deferStreamMod.DeferStream = js.native
}

