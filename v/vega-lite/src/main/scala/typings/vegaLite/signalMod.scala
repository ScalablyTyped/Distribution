package typings.vegaLite

import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signalMod {
  
  @JSImport("vega-lite/build/src/compile/signal", "SignalRefWrapper")
  @js.native
  class SignalRefWrapper protected () extends SignalRef {
    def this(exprGenerator: js.Function0[String]) = this()
  }
  /* static members */
  object SignalRefWrapper {
    
    @JSImport("vega-lite/build/src/compile/signal", "SignalRefWrapper.fromName")
    @js.native
    def fromName(rename: Rename, signalName: String): SignalRefWrapper = js.native
  }
  
  type Rename = js.Function1[/* oldSignalName */ String, String]
}
