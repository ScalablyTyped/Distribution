package typings.wonderFrp

import typings.wonderFrp.baseStreamMod.BaseStream
import typings.wonderFrp.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapStreamMod {
  
  @JSImport("wonder-frp/dist/commonjs/stream/MapStream", "MapStream")
  @js.native
  open class MapStream protected () extends BaseStream {
    def this(source: Stream, selector: js.Function) = this()
    
    /* private */ var _selector: Any = js.native
    
    /* private */ var _source: Any = js.native
  }
  /* static members */
  object MapStream {
    
    @JSImport("wonder-frp/dist/commonjs/stream/MapStream", "MapStream")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(source: Stream, selector: js.Function): MapStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[MapStream]
  }
}
