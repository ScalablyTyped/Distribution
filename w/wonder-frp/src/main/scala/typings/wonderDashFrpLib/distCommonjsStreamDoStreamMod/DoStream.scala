package typings
package wonderDashFrpLib.distCommonjsStreamDoStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/DoStream", "DoStream")
@js.native
class DoStream protected ()
  extends wonderDashFrpLib.distCommonjsStreamBaseStreamMod.BaseStream {
  def this(source: wonderDashFrpLib.distCommonjsCoreStreamMod.Stream, onNext: js.Function, onError: js.Function, onCompleted: js.Function) = this()
  var _observer: js.Any = js.native
  var _source: js.Any = js.native
}

@JSImport("wonder-frp/dist/commonjs/stream/DoStream", "DoStream")
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

