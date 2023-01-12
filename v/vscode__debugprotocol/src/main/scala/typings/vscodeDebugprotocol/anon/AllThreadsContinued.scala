package typings.vscodeDebugprotocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllThreadsContinued extends StObject {
  
  /** If `allThreadsContinued` is true, a debug adapter can announce that all threads have continued. */
  var allThreadsContinued: js.UndefOr[Boolean] = js.undefined
  
  /** The thread which was continued. */
  var threadId: Double
}
object AllThreadsContinued {
  
  inline def apply(threadId: Double): AllThreadsContinued = {
    val __obj = js.Dynamic.literal(threadId = threadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllThreadsContinued]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllThreadsContinued] (val x: Self) extends AnyVal {
    
    inline def setAllThreadsContinued(value: Boolean): Self = StObject.set(x, "allThreadsContinued", value.asInstanceOf[js.Any])
    
    inline def setAllThreadsContinuedUndefined: Self = StObject.set(x, "allThreadsContinued", js.undefined)
    
    inline def setThreadId(value: Double): Self = StObject.set(x, "threadId", value.asInstanceOf[js.Any])
  }
}
