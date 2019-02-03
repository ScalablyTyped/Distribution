package typings
package wonderDashFrpLib.distCommonjsStreamRepeatStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/RepeatStream", "RepeatStream")
@js.native
class RepeatStream protected ()
  extends wonderDashFrpLib.distCommonjsStreamBaseStreamMod.BaseStream {
  def this(source: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream, count: scala.Double) = this()
  var _count: js.Any = js.native
  var _source: js.Any = js.native
}

/* static members */
@JSImport("wonder-frp/dist/commonjs/stream/RepeatStream", "RepeatStream")
@js.native
object RepeatStream extends js.Object {
  def create(source: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream, count: scala.Double): wonderDashFrpLib.distCommonjsStreamRepeatStreamMod.RepeatStream = js.native
}

