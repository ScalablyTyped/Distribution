package typings.wonderDashFrp.distEs2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "DoStream")
@js.native
class DoStream protected ()
  extends typings.wonderDashFrp.distEs2015StreamDoStreamMod.DoStream {
  def this(
    source: typings.wonderDashFrp.distEs2015CoreStreamMod.Stream,
    onNext: js.Function,
    onError: js.Function,
    onCompleted: js.Function
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "DoStream")
@js.native
object DoStream extends js.Object {
  def create(source: typings.wonderDashFrp.distEs2015CoreStreamMod.Stream): typings.wonderDashFrp.distEs2015StreamDoStreamMod.DoStream = js.native
  def create(source: typings.wonderDashFrp.distEs2015CoreStreamMod.Stream, onNext: js.Function): typings.wonderDashFrp.distEs2015StreamDoStreamMod.DoStream = js.native
  def create(
    source: typings.wonderDashFrp.distEs2015CoreStreamMod.Stream,
    onNext: js.Function,
    onError: js.Function
  ): typings.wonderDashFrp.distEs2015StreamDoStreamMod.DoStream = js.native
  def create(
    source: typings.wonderDashFrp.distEs2015CoreStreamMod.Stream,
    onNext: js.Function,
    onError: js.Function,
    onCompleted: js.Function
  ): typings.wonderDashFrp.distEs2015StreamDoStreamMod.DoStream = js.native
}

