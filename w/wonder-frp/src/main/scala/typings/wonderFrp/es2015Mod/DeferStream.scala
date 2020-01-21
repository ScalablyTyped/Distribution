package typings.wonderFrp.es2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "DeferStream")
@js.native
class DeferStream protected ()
  extends typings.wonderFrp.streamDeferStreamMod.DeferStream {
  def this(buildStreamFunc: js.Function) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "DeferStream")
@js.native
object DeferStream extends js.Object {
  def create(buildStreamFunc: js.Function): typings.wonderFrp.streamDeferStreamMod.DeferStream = js.native
}

