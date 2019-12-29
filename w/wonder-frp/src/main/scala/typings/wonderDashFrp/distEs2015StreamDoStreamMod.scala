package typings.wonderDashFrp

import typings.wonderDashFrp.distEs2015CoreStreamMod.Stream
import typings.wonderDashFrp.distEs2015StreamBaseStreamMod.BaseStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/stream/DoStream", JSImport.Namespace)
@js.native
object distEs2015StreamDoStreamMod extends js.Object {
  @js.native
  class DoStream protected () extends BaseStream {
    def this(source: Stream, onNext: js.Function, onError: js.Function, onCompleted: js.Function) = this()
    var _observer: js.Any = js.native
    var _source: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object DoStream extends js.Object {
    def create(source: Stream): DoStream = js.native
    def create(source: Stream, onNext: js.Function): DoStream = js.native
    def create(source: Stream, onNext: js.Function, onError: js.Function): DoStream = js.native
    def create(source: Stream, onNext: js.Function, onError: js.Function, onCompleted: js.Function): DoStream = js.native
  }
  
}

