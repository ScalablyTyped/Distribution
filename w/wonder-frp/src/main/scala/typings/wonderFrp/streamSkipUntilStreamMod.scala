package typings.wonderFrp

import typings.wonderFrp.coreStreamMod.Stream
import typings.wonderFrp.streamBaseStreamMod.BaseStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamSkipUntilStreamMod {
  
  @JSImport("wonder-frp/dist/es2015/stream/SkipUntilStream", "SkipUntilStream")
  @js.native
  class SkipUntilStream protected () extends BaseStream {
    def this(source: Stream, otherStream: Stream) = this()
    
    var _otherStream: js.Any = js.native
    
    var _source: js.Any = js.native
    
    var isOpen: Boolean = js.native
  }
  /* static members */
  object SkipUntilStream {
    
    @JSImport("wonder-frp/dist/es2015/stream/SkipUntilStream", "SkipUntilStream")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(source: Stream, otherSteam: Stream): SkipUntilStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], otherSteam.asInstanceOf[js.Any])).asInstanceOf[SkipUntilStream]
  }
}
