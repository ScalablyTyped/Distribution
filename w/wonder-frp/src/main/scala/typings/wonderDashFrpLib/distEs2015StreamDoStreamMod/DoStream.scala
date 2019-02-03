package typings
package wonderDashFrpLib.distEs2015StreamDoStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/stream/DoStream", "DoStream")
@js.native
class DoStream protected ()
  extends wonderDashFrpLib.distEs2015StreamBaseStreamMod.BaseStream {
  def this(source: wonderDashFrpLib.distEs2015CoreStreamMod.Stream, onNext: js.Function, onError: js.Function, onCompleted: js.Function) = this()
  var _observer: js.Any = js.native
  var _source: js.Any = js.native
}

/* static members */
@JSImport("wonder-frp/dist/es2015/stream/DoStream", "DoStream")
@js.native
object DoStream extends js.Object {
  def create(source: wonderDashFrpLib.distEs2015CoreStreamMod.Stream): wonderDashFrpLib.distEs2015StreamDoStreamMod.DoStream = js.native
  def create(source: wonderDashFrpLib.distEs2015CoreStreamMod.Stream, onNext: js.Function): wonderDashFrpLib.distEs2015StreamDoStreamMod.DoStream = js.native
  def create(source: wonderDashFrpLib.distEs2015CoreStreamMod.Stream, onNext: js.Function, onError: js.Function): wonderDashFrpLib.distEs2015StreamDoStreamMod.DoStream = js.native
  def create(
    source: wonderDashFrpLib.distEs2015CoreStreamMod.Stream,
    onNext: js.Function,
    onError: js.Function,
    onCompleted: js.Function
  ): wonderDashFrpLib.distEs2015StreamDoStreamMod.DoStream = js.native
}

