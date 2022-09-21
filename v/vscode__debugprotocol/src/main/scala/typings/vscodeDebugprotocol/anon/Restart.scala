package typings.vscodeDebugprotocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Restart extends StObject {
  
  /** A debug adapter may set `restart` to true (or to an arbitrary object) to request that the front end restarts the session.
  				The value is not interpreted by the client and passed unmodified as an attribute `__restart` to the `launch` and `attach` requests.
  			*/
  var restart: js.UndefOr[Any] = js.undefined
}
object Restart {
  
  inline def apply(): Restart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Restart]
  }
  
  extension [Self <: Restart](x: Self) {
    
    inline def setRestart(value: Any): Self = StObject.set(x, "restart", value.asInstanceOf[js.Any])
    
    inline def setRestartUndefined: Self = StObject.set(x, "restart", js.undefined)
  }
}
