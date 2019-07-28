package typings.wonderDashFrp.distCommonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "DoStream")
@js.native
class DoStream protected ()
  extends typings.wonderDashFrp.distCommonjsStreamDoStreamMod.DoStream {
  def this(
    source: typings.wonderDashFrp.distCommonjsCoreStreamMod.Stream,
    onNext: js.Function,
    onError: js.Function,
    onCompleted: js.Function
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "DoStream")
@js.native
object DoStream extends js.Object {
  def create(source: typings.wonderDashFrp.distCommonjsCoreStreamMod.Stream): typings.wonderDashFrp.distCommonjsStreamDoStreamMod.DoStream = js.native
  def create(source: typings.wonderDashFrp.distCommonjsCoreStreamMod.Stream, onNext: js.Function): typings.wonderDashFrp.distCommonjsStreamDoStreamMod.DoStream = js.native
  def create(
    source: typings.wonderDashFrp.distCommonjsCoreStreamMod.Stream,
    onNext: js.Function,
    onError: js.Function
  ): typings.wonderDashFrp.distCommonjsStreamDoStreamMod.DoStream = js.native
  def create(
    source: typings.wonderDashFrp.distCommonjsCoreStreamMod.Stream,
    onNext: js.Function,
    onError: js.Function,
    onCompleted: js.Function
  ): typings.wonderDashFrp.distCommonjsStreamDoStreamMod.DoStream = js.native
}

