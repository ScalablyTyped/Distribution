package typings.wonderFrp

import typings.wonderFrp.distCommonjsCoreStreamMod.Stream
import typings.wonderFrp.distCommonjsStreamBaseStreamMod.BaseStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsStreamMergeStreamMod {
  
  @JSImport("wonder-frp/dist/commonjs/stream/MergeStream", "MergeStream")
  @js.native
  open class MergeStream protected () extends BaseStream {
    def this(source: Stream, maxConcurrent: Double) = this()
    
    /* private */ var _maxConcurrent: Any = js.native
    
    /* private */ var _source: Any = js.native
  }
  /* static members */
  object MergeStream {
    
    @JSImport("wonder-frp/dist/commonjs/stream/MergeStream", "MergeStream")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(source: Stream, maxConcurrent: Double): MergeStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], maxConcurrent.asInstanceOf[js.Any])).asInstanceOf[MergeStream]
  }
}
