package typings.wonderDashFrp

import typings.wonderDashFrp.distCommonjsCoreStreamMod.Stream
import typings.wonderDashFrp.distCommonjsStreamBaseStreamMod.BaseStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/MergeAllStream", JSImport.Namespace)
@js.native
object distCommonjsStreamMergeAllStreamMod extends js.Object {
  @js.native
  class MergeAllStream protected () extends BaseStream {
    def this(source: Stream) = this()
    var _source: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object MergeAllStream extends js.Object {
    def create(source: Stream): MergeAllStream = js.native
  }
  
}

