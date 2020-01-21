package typings.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "MapStream")
@js.native
class MapStream protected ()
  extends typings.wonderFrp.mapStreamMod.MapStream {
  def this(source: typings.wonderFrp.streamMod.Stream, selector: js.Function) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "MapStream")
@js.native
object MapStream extends js.Object {
  def create(source: typings.wonderFrp.streamMod.Stream, selector: js.Function): typings.wonderFrp.mapStreamMod.MapStream = js.native
}

