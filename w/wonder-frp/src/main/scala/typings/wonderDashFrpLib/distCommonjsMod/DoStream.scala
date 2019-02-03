package typings
package wonderDashFrpLib.distCommonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "DoStream")
@js.native
class DoStream protected ()
  extends wonderDashFrpLib.distCommonjsStreamDoStreamMod.DoStream {
  def this(source: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream, onNext: js.Function, onError: js.Function, onCompleted: js.Function) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "DoStream")
@js.native
object DoStream extends js.Object {
  def create(source: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream): wonderDashFrpLib.distCommonjsStreamDoStreamMod.DoStream = js.native
  def create(source: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream, onNext: js.Function): wonderDashFrpLib.distCommonjsStreamDoStreamMod.DoStream = js.native
  def create(
    source: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream,
    onNext: js.Function,
    onError: js.Function
  ): wonderDashFrpLib.distCommonjsStreamDoStreamMod.DoStream = js.native
  def create(
    source: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream,
    onNext: js.Function,
    onError: js.Function,
    onCompleted: js.Function
  ): wonderDashFrpLib.distCommonjsStreamDoStreamMod.DoStream = js.native
}

