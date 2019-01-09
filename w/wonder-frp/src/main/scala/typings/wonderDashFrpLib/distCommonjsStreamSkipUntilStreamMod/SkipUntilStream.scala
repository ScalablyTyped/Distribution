package typings
package wonderDashFrpLib.distCommonjsStreamSkipUntilStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/SkipUntilStream", "SkipUntilStream")
@js.native
class SkipUntilStream protected ()
  extends wonderDashFrpLib.distCommonjsStreamBaseStreamMod.BaseStream {
  def this(source: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream, otherStream: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream) = this()
  var _otherStream: js.Any = js.native
  var _source: js.Any = js.native
  var isOpen: scala.Boolean = js.native
}

@JSImport("wonder-frp/dist/commonjs/stream/SkipUntilStream", "SkipUntilStream")
@js.native
object SkipUntilStream extends js.Object {
  def create(
    source: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream,
    otherSteam: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream
  ): wonderDashFrpLib.distCommonjsStreamSkipUntilStreamMod.SkipUntilStream = js.native
}

