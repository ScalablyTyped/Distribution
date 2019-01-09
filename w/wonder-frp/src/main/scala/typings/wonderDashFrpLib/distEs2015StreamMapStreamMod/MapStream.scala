package typings
package wonderDashFrpLib.distEs2015StreamMapStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/stream/MapStream", "MapStream")
@js.native
class MapStream protected ()
  extends wonderDashFrpLib.distEs2015StreamBaseStreamMod.BaseStream {
  def this(source: wonderDashFrpLib.distEs2015CoreStreamMod.Stream, selector: js.Function) = this()
  var _selector: js.Any = js.native
  var _source: js.Any = js.native
}

@JSImport("wonder-frp/dist/es2015/stream/MapStream", "MapStream")
@js.native
object MapStream extends js.Object {
  def create(source: wonderDashFrpLib.distEs2015CoreStreamMod.Stream, selector: js.Function): wonderDashFrpLib.distEs2015StreamMapStreamMod.MapStream = js.native
}

