package typings.wonderDashFrp.distCommonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "MapStream")
@js.native
class MapStream protected ()
  extends typings.wonderDashFrp.distCommonjsStreamMapStreamMod.MapStream {
  def this(source: typings.wonderDashFrp.distCommonjsCoreStreamMod.Stream, selector: js.Function) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "MapStream")
@js.native
object MapStream extends js.Object {
  def create(source: typings.wonderDashFrp.distCommonjsCoreStreamMod.Stream, selector: js.Function): typings.wonderDashFrp.distCommonjsStreamMapStreamMod.MapStream = js.native
}

