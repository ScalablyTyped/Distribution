package typings.wonderFrp

import typings.wonderFrp.streamBaseStreamMod.BaseStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamFromEventPatternStreamMod {
  
  @JSImport("wonder-frp/dist/es2015/stream/FromEventPatternStream", "FromEventPatternStream")
  @js.native
  class FromEventPatternStream protected () extends BaseStream {
    def this(addHandler: js.Function, removeHandler: js.Function) = this()
    
    /* private */ var _addHandler: js.Any = js.native
    
    /* private */ var _removeHandler: js.Any = js.native
  }
  /* static members */
  object FromEventPatternStream {
    
    @JSImport("wonder-frp/dist/es2015/stream/FromEventPatternStream", "FromEventPatternStream")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(addHandler: js.Function, removeHandler: js.Function): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(addHandler.asInstanceOf[js.Any], removeHandler.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
  }
}
