package typings.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "DoStream")
@js.native
class DoStream protected ()
  extends typings.wonderFrp.doStreamMod.DoStream {
  def this(
    source: typings.wonderFrp.streamMod.Stream,
    onNext: js.Function,
    onError: js.Function,
    onCompleted: js.Function
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "DoStream")
@js.native
object DoStream extends js.Object {
  def create(source: typings.wonderFrp.streamMod.Stream): typings.wonderFrp.doStreamMod.DoStream = js.native
  def create(source: typings.wonderFrp.streamMod.Stream, onNext: js.Function): typings.wonderFrp.doStreamMod.DoStream = js.native
  def create(source: typings.wonderFrp.streamMod.Stream, onNext: js.Function, onError: js.Function): typings.wonderFrp.doStreamMod.DoStream = js.native
  def create(
    source: typings.wonderFrp.streamMod.Stream,
    onNext: js.Function,
    onError: js.Function,
    onCompleted: js.Function
  ): typings.wonderFrp.doStreamMod.DoStream = js.native
}

