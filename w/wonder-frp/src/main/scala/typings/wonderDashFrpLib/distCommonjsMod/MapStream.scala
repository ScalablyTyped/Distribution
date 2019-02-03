package typings
package wonderDashFrpLib.distCommonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "MapStream")
@js.native
class MapStream protected ()
  extends wonderDashFrpLib.distCommonjsStreamMapStreamMod.MapStream {
  def this(source: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream, selector: js.Function) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "MapStream")
@js.native
object MapStream extends js.Object {
  def create(source: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream, selector: js.Function): wonderDashFrpLib.distCommonjsStreamMapStreamMod.MapStream = js.native
}

