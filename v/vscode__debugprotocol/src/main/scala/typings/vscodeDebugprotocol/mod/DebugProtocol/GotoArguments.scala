package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `goto` request. */
trait GotoArguments extends StObject {
  
  /** The location where the debuggee will continue to run. */
  var targetId: Double
  
  /** Set the goto target for this thread. */
  var threadId: Double
}
object GotoArguments {
  
  inline def apply(targetId: Double, threadId: Double): GotoArguments = {
    val __obj = js.Dynamic.literal(targetId = targetId.asInstanceOf[js.Any], threadId = threadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GotoArguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GotoArguments] (val x: Self) extends AnyVal {
    
    inline def setTargetId(value: Double): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    inline def setThreadId(value: Double): Self = StObject.set(x, "threadId", value.asInstanceOf[js.Any])
  }
}
