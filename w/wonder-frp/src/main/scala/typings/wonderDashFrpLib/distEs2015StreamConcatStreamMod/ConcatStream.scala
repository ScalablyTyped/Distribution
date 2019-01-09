package typings
package wonderDashFrpLib.distEs2015StreamConcatStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/stream/ConcatStream", "ConcatStream")
@js.native
class ConcatStream protected ()
  extends wonderDashFrpLib.distEs2015StreamBaseStreamMod.BaseStream {
  def this(sources: js.Array[wonderDashFrpLib.distEs2015CoreStreamMod.Stream]) = this()
  var _sources: js.Any = js.native
}

@JSImport("wonder-frp/dist/es2015/stream/ConcatStream", "ConcatStream")
@js.native
object ConcatStream extends js.Object {
  def create(sources: js.Array[wonderDashFrpLib.distEs2015CoreStreamMod.Stream]): wonderDashFrpLib.distEs2015StreamConcatStreamMod.ConcatStream = js.native
}

