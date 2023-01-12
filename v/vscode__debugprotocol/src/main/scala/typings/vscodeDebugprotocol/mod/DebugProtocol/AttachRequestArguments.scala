package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `attach` request. Additional attributes are implementation specific. */
trait AttachRequestArguments extends StObject {
  
  /** Arbitrary data from the previous, restarted session.
  			The data is sent as the `restart` attribute of the `terminated` event.
  			The client should leave the data intact.
  		*/
  var __restart: js.UndefOr[Any] = js.undefined
}
object AttachRequestArguments {
  
  inline def apply(): AttachRequestArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachRequestArguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttachRequestArguments] (val x: Self) extends AnyVal {
    
    inline def set__restart(value: Any): Self = StObject.set(x, "__restart", value.asInstanceOf[js.Any])
    
    inline def set__restartUndefined: Self = StObject.set(x, "__restart", js.undefined)
  }
}
