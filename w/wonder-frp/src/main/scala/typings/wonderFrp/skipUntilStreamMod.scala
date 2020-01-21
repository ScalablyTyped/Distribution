package typings.wonderFrp

import typings.wonderFrp.baseStreamMod.BaseStream
import typings.wonderFrp.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/SkipUntilStream", JSImport.Namespace)
@js.native
object skipUntilStreamMod extends js.Object {
  @js.native
  class SkipUntilStream protected () extends BaseStream {
    def this(source: Stream, otherStream: Stream) = this()
    var _otherStream: js.Any = js.native
    var _source: js.Any = js.native
    var isOpen: Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SkipUntilStream extends js.Object {
    def create(source: Stream, otherSteam: Stream): SkipUntilStream = js.native
  }
  
}

