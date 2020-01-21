package typings.wonderFrp.es2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "AnonymousStream")
@js.native
class AnonymousStream protected ()
  extends typings.wonderFrp.streamAnonymousStreamMod.AnonymousStream {
  def this(subscribeFunc: js.Function) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "AnonymousStream")
@js.native
object AnonymousStream extends js.Object {
  def create(subscribeFunc: js.Function): typings.wonderFrp.streamAnonymousStreamMod.AnonymousStream = js.native
}

