package typings
package wonderDashFrpLib.distCommonjsStreamConcatStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/ConcatStream", "ConcatStream")
@js.native
class ConcatStream protected ()
  extends wonderDashFrpLib.distCommonjsStreamBaseStreamMod.BaseStream {
  def this(sources: js.Array[wonderDashFrpLib.distCommonjsCoreStreamMod.Stream]) = this()
  var _sources: js.Any = js.native
}

@JSImport("wonder-frp/dist/commonjs/stream/ConcatStream", "ConcatStream")
@js.native
object ConcatStream extends js.Object {
  def create(sources: js.Array[wonderDashFrpLib.distCommonjsCoreStreamMod.Stream]): wonderDashFrpLib.distCommonjsStreamConcatStreamMod.ConcatStream = js.native
}

