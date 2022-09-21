package typings.vegaLite

import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signalMod {
  
  @JSImport("vega-lite/build/src/compile/signal", "SignalRefWrapper")
  @js.native
  open class SignalRefWrapper protected ()
    extends StObject
       with SignalRef {
    def this(exprGenerator: js.Function0[String]) = this()
    
    /* CompleteClass */
    var signal: String = js.native
  }
  /* static members */
  object SignalRefWrapper {
    
    @JSImport("vega-lite/build/src/compile/signal", "SignalRefWrapper")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromName(rename: Rename, signalName: String): SignalRefWrapper = (^.asInstanceOf[js.Dynamic].applyDynamic("fromName")(rename.asInstanceOf[js.Any], signalName.asInstanceOf[js.Any])).asInstanceOf[SignalRefWrapper]
  }
  
  type Rename = js.Function1[/* oldSignalName */ String, String]
}
