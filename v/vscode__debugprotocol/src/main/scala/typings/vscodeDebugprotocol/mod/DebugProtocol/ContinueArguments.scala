package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `continue` request. */
trait ContinueArguments extends StObject {
  
  /** If this flag is true, execution is resumed only for the thread with given `threadId`. */
  var singleThread: js.UndefOr[Boolean] = js.undefined
  
  /** Specifies the active thread. If the debug adapter supports single thread execution (see `supportsSingleThreadExecutionRequests`) and the argument `singleThread` is true, only the thread with this ID is resumed. */
  var threadId: Double
}
object ContinueArguments {
  
  inline def apply(threadId: Double): ContinueArguments = {
    val __obj = js.Dynamic.literal(threadId = threadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinueArguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContinueArguments] (val x: Self) extends AnyVal {
    
    inline def setSingleThread(value: Boolean): Self = StObject.set(x, "singleThread", value.asInstanceOf[js.Any])
    
    inline def setSingleThreadUndefined: Self = StObject.set(x, "singleThread", js.undefined)
    
    inline def setThreadId(value: Double): Self = StObject.set(x, "threadId", value.asInstanceOf[js.Any])
  }
}
