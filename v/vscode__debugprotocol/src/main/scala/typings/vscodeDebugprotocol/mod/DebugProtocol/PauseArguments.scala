package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `pause` request. */
trait PauseArguments extends StObject {
  
  /** Pause execution for this thread. */
  var threadId: Double
}
object PauseArguments {
  
  inline def apply(threadId: Double): PauseArguments = {
    val __obj = js.Dynamic.literal(threadId = threadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PauseArguments]
  }
  
  extension [Self <: PauseArguments](x: Self) {
    
    inline def setThreadId(value: Double): Self = StObject.set(x, "threadId", value.asInstanceOf[js.Any])
  }
}
