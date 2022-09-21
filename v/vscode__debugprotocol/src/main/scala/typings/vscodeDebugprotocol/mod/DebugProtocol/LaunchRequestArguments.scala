package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `launch` request. Additional attributes are implementation specific. */
trait LaunchRequestArguments extends StObject {
  
  /** Arbitrary data from the previous, restarted session.
  			The data is sent as the `restart` attribute of the `terminated` event.
  			The client should leave the data intact.
  		*/
  var __restart: js.UndefOr[Any] = js.undefined
  
  /** If noDebug is true, the launch request should launch the program without enabling debugging. */
  var noDebug: js.UndefOr[Boolean] = js.undefined
}
object LaunchRequestArguments {
  
  inline def apply(): LaunchRequestArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchRequestArguments]
  }
  
  extension [Self <: LaunchRequestArguments](x: Self) {
    
    inline def setNoDebug(value: Boolean): Self = StObject.set(x, "noDebug", value.asInstanceOf[js.Any])
    
    inline def setNoDebugUndefined: Self = StObject.set(x, "noDebug", js.undefined)
    
    inline def set__restart(value: Any): Self = StObject.set(x, "__restart", value.asInstanceOf[js.Any])
    
    inline def set__restartUndefined: Self = StObject.set(x, "__restart", js.undefined)
  }
}
