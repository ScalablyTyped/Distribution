package typings.wonderFrp

import typings.wonderFrp.coreStreamMod.Stream
import typings.wonderFrp.streamBaseStreamMod.BaseStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamIgnoreElementsStreamMod {
  
  @JSImport("wonder-frp/dist/es2015/stream/IgnoreElementsStream", "IgnoreElementsStream")
  @js.native
  open class IgnoreElementsStream protected () extends BaseStream {
    def this(source: Stream) = this()
    
    /* private */ var _source: Any = js.native
  }
  /* static members */
  object IgnoreElementsStream {
    
    @JSImport("wonder-frp/dist/es2015/stream/IgnoreElementsStream", "IgnoreElementsStream")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(source: Stream): IgnoreElementsStream = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any]).asInstanceOf[IgnoreElementsStream]
  }
}
