package typings.wonderFrp

import typings.wonderFrp.baseStreamMod.BaseStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deferStreamMod {
  
  @JSImport("wonder-frp/dist/commonjs/stream/DeferStream", "DeferStream")
  @js.native
  class DeferStream protected () extends BaseStream {
    def this(buildStreamFunc: js.Function) = this()
    
    /* private */ var _buildStreamFunc: js.Any = js.native
  }
  /* static members */
  object DeferStream {
    
    @JSImport("wonder-frp/dist/commonjs/stream/DeferStream", "DeferStream")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(buildStreamFunc: js.Function): DeferStream = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(buildStreamFunc.asInstanceOf[js.Any]).asInstanceOf[DeferStream]
  }
}
