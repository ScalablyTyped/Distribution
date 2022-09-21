package typings.wonderFrp

import typings.wonderFrp.coreStreamMod.Stream
import typings.wonderFrp.streamBaseStreamMod.BaseStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamMapStreamMod {
  
  @JSImport("wonder-frp/dist/es2015/stream/MapStream", "MapStream")
  @js.native
  open class MapStream protected () extends BaseStream {
    def this(source: Stream, selector: js.Function) = this()
    
    /* private */ var _selector: Any = js.native
    
    /* private */ var _source: Any = js.native
  }
  /* static members */
  object MapStream {
    
    @JSImport("wonder-frp/dist/es2015/stream/MapStream", "MapStream")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(source: Stream, selector: js.Function): MapStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[MapStream]
  }
}
