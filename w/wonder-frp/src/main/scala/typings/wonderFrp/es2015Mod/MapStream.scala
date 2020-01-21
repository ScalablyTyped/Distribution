package typings.wonderFrp.es2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "MapStream")
@js.native
class MapStream protected ()
  extends typings.wonderFrp.streamMapStreamMod.MapStream {
  def this(source: typings.wonderFrp.coreStreamMod.Stream, selector: js.Function) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "MapStream")
@js.native
object MapStream extends js.Object {
  def create(source: typings.wonderFrp.coreStreamMod.Stream, selector: js.Function): typings.wonderFrp.streamMapStreamMod.MapStream = js.native
}

