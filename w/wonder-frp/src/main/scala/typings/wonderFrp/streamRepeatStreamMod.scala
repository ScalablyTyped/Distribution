package typings.wonderFrp

import typings.wonderFrp.coreStreamMod.Stream
import typings.wonderFrp.streamBaseStreamMod.BaseStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/stream/RepeatStream", JSImport.Namespace)
@js.native
object streamRepeatStreamMod extends js.Object {
  @js.native
  class RepeatStream protected () extends BaseStream {
    def this(source: Stream, count: Double) = this()
    var _count: js.Any = js.native
    var _source: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object RepeatStream extends js.Object {
    def create(source: Stream, count: Double): RepeatStream = js.native
  }
  
}

