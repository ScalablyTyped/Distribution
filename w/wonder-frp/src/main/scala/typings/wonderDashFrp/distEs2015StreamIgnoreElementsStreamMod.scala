package typings.wonderDashFrp

import typings.wonderDashFrp.distEs2015CoreStreamMod.Stream
import typings.wonderDashFrp.distEs2015StreamBaseStreamMod.BaseStream
import typings.wonderDashFrp.distEs2015StreamIgnoreElementsStreamMod.IgnoreElementsStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/stream/IgnoreElementsStream", JSImport.Namespace)
@js.native
object distEs2015StreamIgnoreElementsStreamMod extends js.Object {
  @js.native
  class IgnoreElementsStream protected () extends BaseStream {
    def this(source: Stream) = this()
    var _source: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object IgnoreElementsStream extends js.Object {
    def create(source: Stream): IgnoreElementsStream = js.native
  }
  
}

