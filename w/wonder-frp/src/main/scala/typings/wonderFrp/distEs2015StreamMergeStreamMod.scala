package typings.wonderFrp

import typings.wonderFrp.distEs2015CoreStreamMod.Stream
import typings.wonderFrp.distEs2015StreamBaseStreamMod.BaseStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015StreamMergeStreamMod {
  
  @JSImport("wonder-frp/dist/es2015/stream/MergeStream", "MergeStream")
  @js.native
  open class MergeStream protected () extends BaseStream {
    def this(source: Stream, maxConcurrent: Double) = this()
    
    /* private */ var _maxConcurrent: Any = js.native
    
    /* private */ var _source: Any = js.native
  }
  /* static members */
  object MergeStream {
    
    @JSImport("wonder-frp/dist/es2015/stream/MergeStream", "MergeStream")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(source: Stream, maxConcurrent: Double): MergeStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], maxConcurrent.asInstanceOf[js.Any])).asInstanceOf[MergeStream]
  }
}
