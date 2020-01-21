package typings.wonderFrp.es2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "SkipUntilStream")
@js.native
class SkipUntilStream protected ()
  extends typings.wonderFrp.streamSkipUntilStreamMod.SkipUntilStream {
  def this(
    source: typings.wonderFrp.coreStreamMod.Stream,
    otherStream: typings.wonderFrp.coreStreamMod.Stream
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "SkipUntilStream")
@js.native
object SkipUntilStream extends js.Object {
  def create(source: typings.wonderFrp.coreStreamMod.Stream, otherSteam: typings.wonderFrp.coreStreamMod.Stream): typings.wonderFrp.streamSkipUntilStreamMod.SkipUntilStream = js.native
}

