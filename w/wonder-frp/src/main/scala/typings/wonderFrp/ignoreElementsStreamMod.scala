package typings.wonderFrp

import typings.wonderFrp.baseStreamMod.BaseStream
import typings.wonderFrp.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/IgnoreElementsStream", JSImport.Namespace)
@js.native
object ignoreElementsStreamMod extends js.Object {
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

