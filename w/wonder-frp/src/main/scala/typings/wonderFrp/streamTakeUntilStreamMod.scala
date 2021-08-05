package typings.wonderFrp

import typings.wonderFrp.coreStreamMod.Stream
import typings.wonderFrp.streamBaseStreamMod.BaseStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamTakeUntilStreamMod {
  
  @JSImport("wonder-frp/dist/es2015/stream/TakeUntilStream", "TakeUntilStream")
  @js.native
  class TakeUntilStream protected () extends BaseStream {
    def this(source: Stream, otherStream: Stream) = this()
    
    /* private */ var _otherStream: js.Any = js.native
    
    /* private */ var _source: js.Any = js.native
  }
  /* static members */
  object TakeUntilStream {
    
    @JSImport("wonder-frp/dist/es2015/stream/TakeUntilStream", "TakeUntilStream")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(source: Stream, otherSteam: Stream): TakeUntilStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], otherSteam.asInstanceOf[js.Any])).asInstanceOf[TakeUntilStream]
  }
}
