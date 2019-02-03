package typings
package wonderDashFrpLib.distCommonjsStreamMapStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/MapStream", "MapStream")
@js.native
class MapStream protected ()
  extends wonderDashFrpLib.distCommonjsStreamBaseStreamMod.BaseStream {
  def this(source: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream, selector: js.Function) = this()
  var _selector: js.Any = js.native
  var _source: js.Any = js.native
}

/* static members */
@JSImport("wonder-frp/dist/commonjs/stream/MapStream", "MapStream")
@js.native
object MapStream extends js.Object {
  def create(source: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream, selector: js.Function): wonderDashFrpLib.distCommonjsStreamMapStreamMod.MapStream = js.native
}

