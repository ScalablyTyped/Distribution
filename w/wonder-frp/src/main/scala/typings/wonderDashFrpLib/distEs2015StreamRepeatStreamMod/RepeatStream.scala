package typings
package wonderDashFrpLib.distEs2015StreamRepeatStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/stream/RepeatStream", "RepeatStream")
@js.native
class RepeatStream protected ()
  extends wonderDashFrpLib.distEs2015StreamBaseStreamMod.BaseStream {
  def this(source: wonderDashFrpLib.distEs2015CoreStreamMod.Stream, count: scala.Double) = this()
  var _count: js.Any = js.native
  var _source: js.Any = js.native
}

@JSImport("wonder-frp/dist/es2015/stream/RepeatStream", "RepeatStream")
@js.native
object RepeatStream extends js.Object {
  def create(source: wonderDashFrpLib.distEs2015CoreStreamMod.Stream, count: scala.Double): wonderDashFrpLib.distEs2015StreamRepeatStreamMod.RepeatStream = js.native
}

