package typings.wonderFrp

import typings.wonderFrp.coreStreamMod.Stream
import typings.wonderFrp.streamBaseStreamMod.BaseStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamRepeatStreamMod {
  
  @JSImport("wonder-frp/dist/es2015/stream/RepeatStream", "RepeatStream")
  @js.native
  class RepeatStream protected () extends BaseStream {
    def this(source: Stream, count: Double) = this()
    
    /* private */ var _count: js.Any = js.native
    
    /* private */ var _source: js.Any = js.native
  }
  /* static members */
  object RepeatStream {
    
    @JSImport("wonder-frp/dist/es2015/stream/RepeatStream", "RepeatStream")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(source: Stream, count: Double): RepeatStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[RepeatStream]
  }
}
