package typings.wonderFrp

import typings.wonderFrp.baseStreamMod.BaseStream
import typings.wonderFrp.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeStreamMod {
  
  @JSImport("wonder-frp/dist/commonjs/stream/MergeStream", "MergeStream")
  @js.native
  class MergeStream protected () extends BaseStream {
    def this(source: Stream, maxConcurrent: Double) = this()
    
    var _maxConcurrent: js.Any = js.native
    
    var _source: js.Any = js.native
  }
  /* static members */
  object MergeStream {
    
    @JSImport("wonder-frp/dist/commonjs/stream/MergeStream", "MergeStream")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(source: Stream, maxConcurrent: Double): MergeStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], maxConcurrent.asInstanceOf[js.Any])).asInstanceOf[MergeStream]
  }
}
