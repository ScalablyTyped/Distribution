package typings.wonderFrp

import typings.wonderFrp.distEs2015CoreStreamMod.Stream
import typings.wonderFrp.distEs2015StreamBaseStreamMod.BaseStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015StreamTakeUntilStreamMod {
  
  @JSImport("wonder-frp/dist/es2015/stream/TakeUntilStream", "TakeUntilStream")
  @js.native
  open class TakeUntilStream protected () extends BaseStream {
    def this(source: Stream, otherStream: Stream) = this()
    
    /* private */ var _otherStream: Any = js.native
    
    /* private */ var _source: Any = js.native
  }
  /* static members */
  object TakeUntilStream {
    
    @JSImport("wonder-frp/dist/es2015/stream/TakeUntilStream", "TakeUntilStream")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(source: Stream, otherSteam: Stream): TakeUntilStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], otherSteam.asInstanceOf[js.Any])).asInstanceOf[TakeUntilStream]
  }
}
