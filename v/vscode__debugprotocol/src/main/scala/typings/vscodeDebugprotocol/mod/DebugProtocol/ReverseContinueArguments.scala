package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `reverseContinue` request. */
trait ReverseContinueArguments extends StObject {
  
  /** If this flag is true, backward execution is resumed only for the thread with given `threadId`. */
  var singleThread: js.UndefOr[Boolean] = js.undefined
  
  /** Specifies the active thread. If the debug adapter supports single thread execution (see `supportsSingleThreadExecutionRequests`) and the `singleThread` argument is true, only the thread with this ID is resumed. */
  var threadId: Double
}
object ReverseContinueArguments {
  
  inline def apply(threadId: Double): ReverseContinueArguments = {
    val __obj = js.Dynamic.literal(threadId = threadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReverseContinueArguments]
  }
  
  extension [Self <: ReverseContinueArguments](x: Self) {
    
    inline def setSingleThread(value: Boolean): Self = StObject.set(x, "singleThread", value.asInstanceOf[js.Any])
    
    inline def setSingleThreadUndefined: Self = StObject.set(x, "singleThread", js.undefined)
    
    inline def setThreadId(value: Double): Self = StObject.set(x, "threadId", value.asInstanceOf[js.Any])
  }
}
