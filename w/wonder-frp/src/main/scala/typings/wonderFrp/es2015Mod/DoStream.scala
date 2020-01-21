package typings.wonderFrp.es2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "DoStream")
@js.native
class DoStream protected ()
  extends typings.wonderFrp.streamDoStreamMod.DoStream {
  def this(
    source: typings.wonderFrp.coreStreamMod.Stream,
    onNext: js.Function,
    onError: js.Function,
    onCompleted: js.Function
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "DoStream")
@js.native
object DoStream extends js.Object {
  def create(source: typings.wonderFrp.coreStreamMod.Stream): typings.wonderFrp.streamDoStreamMod.DoStream = js.native
  def create(source: typings.wonderFrp.coreStreamMod.Stream, onNext: js.Function): typings.wonderFrp.streamDoStreamMod.DoStream = js.native
  def create(source: typings.wonderFrp.coreStreamMod.Stream, onNext: js.Function, onError: js.Function): typings.wonderFrp.streamDoStreamMod.DoStream = js.native
  def create(
    source: typings.wonderFrp.coreStreamMod.Stream,
    onNext: js.Function,
    onError: js.Function,
    onCompleted: js.Function
  ): typings.wonderFrp.streamDoStreamMod.DoStream = js.native
}

