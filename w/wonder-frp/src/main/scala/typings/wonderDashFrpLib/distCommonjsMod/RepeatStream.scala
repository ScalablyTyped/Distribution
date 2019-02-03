package typings
package wonderDashFrpLib.distCommonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "RepeatStream")
@js.native
class RepeatStream protected ()
  extends wonderDashFrpLib.distCommonjsStreamRepeatStreamMod.RepeatStream {
  def this(source: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream, count: scala.Double) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "RepeatStream")
@js.native
object RepeatStream extends js.Object {
  def create(source: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream, count: scala.Double): wonderDashFrpLib.distCommonjsStreamRepeatStreamMod.RepeatStream = js.native
}

