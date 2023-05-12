package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `scopes` request. */
trait ScopesArguments extends StObject {
  
  /** Retrieve the scopes for the stack frame identified by `frameId`. The `frameId` must have been obtained in the current suspended state. See 'Lifetime of Object References' in the Overview section for details. */
  var frameId: Double
}
object ScopesArguments {
  
  inline def apply(frameId: Double): ScopesArguments = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopesArguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScopesArguments] (val x: Self) extends AnyVal {
    
    inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
  }
}
