package typings.wonderFrp

import typings.wonderFrp.coreStreamMod.Stream
import typings.wonderFrp.streamBaseStreamMod.BaseStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/stream/MergeStream", JSImport.Namespace)
@js.native
object streamMergeStreamMod extends js.Object {
  @js.native
  class MergeStream protected () extends BaseStream {
    def this(source: Stream, maxConcurrent: Double) = this()
    var _maxConcurrent: js.Any = js.native
    var _source: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object MergeStream extends js.Object {
    def create(source: Stream, maxConcurrent: Double): MergeStream = js.native
  }
  
}

