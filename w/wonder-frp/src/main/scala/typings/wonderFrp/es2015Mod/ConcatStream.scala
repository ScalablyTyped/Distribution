package typings.wonderFrp.es2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "ConcatStream")
@js.native
class ConcatStream protected ()
  extends typings.wonderFrp.streamConcatStreamMod.ConcatStream {
  def this(sources: js.Array[typings.wonderFrp.coreStreamMod.Stream]) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "ConcatStream")
@js.native
object ConcatStream extends js.Object {
  def create(sources: js.Array[typings.wonderFrp.coreStreamMod.Stream]): typings.wonderFrp.streamConcatStreamMod.ConcatStream = js.native
}

