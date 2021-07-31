package typings.wonderFrp

import typings.wonderFrp.baseStreamMod.BaseStream
import typings.wonderFrp.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ignoreElementsStreamMod {
  
  @JSImport("wonder-frp/dist/commonjs/stream/IgnoreElementsStream", "IgnoreElementsStream")
  @js.native
  class IgnoreElementsStream protected () extends BaseStream {
    def this(source: Stream) = this()
    
    var _source: js.Any = js.native
  }
  /* static members */
  object IgnoreElementsStream {
    
    @JSImport("wonder-frp/dist/commonjs/stream/IgnoreElementsStream", "IgnoreElementsStream")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(source: Stream): IgnoreElementsStream = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any]).asInstanceOf[IgnoreElementsStream]
  }
}
