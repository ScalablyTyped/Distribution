package typings
package wonderDashFrpLib.distEs2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "MergeStream")
@js.native
class MergeStream protected ()
  extends wonderDashFrpLib.distEs2015StreamMergeStreamMod.MergeStream {
  def this(source: wonderDashFrpLib.distEs2015CoreStreamMod.Stream, maxConcurrent: scala.Double) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "MergeStream")
@js.native
object MergeStream extends js.Object {
  def create(source: wonderDashFrpLib.distEs2015CoreStreamMod.Stream, maxConcurrent: scala.Double): wonderDashFrpLib.distEs2015StreamMergeStreamMod.MergeStream = js.native
}

