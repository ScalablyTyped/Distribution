package typings.wonderDashFrp

import typings.wonderDashFrp.distCommonjsStreamBaseStreamMod.BaseStream
import typings.wonderDashFrp.distCommonjsStreamDeferStreamMod.DeferStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/DeferStream", JSImport.Namespace)
@js.native
object distCommonjsStreamDeferStreamMod extends js.Object {
  @js.native
  class DeferStream protected () extends BaseStream {
    def this(buildStreamFunc: js.Function) = this()
    var _buildStreamFunc: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object DeferStream extends js.Object {
    def create(buildStreamFunc: js.Function): DeferStream = js.native
  }
  
}

