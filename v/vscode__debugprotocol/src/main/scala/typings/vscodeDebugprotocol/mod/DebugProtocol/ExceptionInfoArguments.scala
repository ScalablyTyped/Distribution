package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `exceptionInfo` request. */
trait ExceptionInfoArguments extends StObject {
  
  /** Thread for which exception information should be retrieved. */
  var threadId: Double
}
object ExceptionInfoArguments {
  
  inline def apply(threadId: Double): ExceptionInfoArguments = {
    val __obj = js.Dynamic.literal(threadId = threadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptionInfoArguments]
  }
  
  extension [Self <: ExceptionInfoArguments](x: Self) {
    
    inline def setThreadId(value: Double): Self = StObject.set(x, "threadId", value.asInstanceOf[js.Any])
  }
}
