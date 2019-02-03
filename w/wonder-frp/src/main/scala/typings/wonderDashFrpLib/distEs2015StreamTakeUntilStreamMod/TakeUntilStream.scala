package typings
package wonderDashFrpLib.distEs2015StreamTakeUntilStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/stream/TakeUntilStream", "TakeUntilStream")
@js.native
class TakeUntilStream protected ()
  extends wonderDashFrpLib.distEs2015StreamBaseStreamMod.BaseStream {
  def this(source: wonderDashFrpLib.distEs2015CoreStreamMod.Stream, otherStream: wonderDashFrpLib.distEs2015CoreStreamMod.Stream) = this()
  var _otherStream: js.Any = js.native
  var _source: js.Any = js.native
}

/* static members */
@JSImport("wonder-frp/dist/es2015/stream/TakeUntilStream", "TakeUntilStream")
@js.native
object TakeUntilStream extends js.Object {
  def create(
    source: wonderDashFrpLib.distEs2015CoreStreamMod.Stream,
    otherSteam: wonderDashFrpLib.distEs2015CoreStreamMod.Stream
  ): wonderDashFrpLib.distEs2015StreamTakeUntilStreamMod.TakeUntilStream = js.native
}

