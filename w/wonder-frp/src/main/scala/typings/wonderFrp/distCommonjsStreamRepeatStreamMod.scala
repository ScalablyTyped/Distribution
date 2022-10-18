package typings.wonderFrp

import typings.wonderFrp.distCommonjsCoreStreamMod.Stream
import typings.wonderFrp.distCommonjsStreamBaseStreamMod.BaseStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsStreamRepeatStreamMod {
  
  @JSImport("wonder-frp/dist/commonjs/stream/RepeatStream", "RepeatStream")
  @js.native
  open class RepeatStream protected () extends BaseStream {
    def this(source: Stream, count: Double) = this()
    
    /* private */ var _count: Any = js.native
    
    /* private */ var _source: Any = js.native
  }
  /* static members */
  object RepeatStream {
    
    @JSImport("wonder-frp/dist/commonjs/stream/RepeatStream", "RepeatStream")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(source: Stream, count: Double): RepeatStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[RepeatStream]
  }
}
