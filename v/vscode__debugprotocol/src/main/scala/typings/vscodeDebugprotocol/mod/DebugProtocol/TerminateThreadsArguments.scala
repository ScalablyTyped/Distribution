package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `terminateThreads` request. */
trait TerminateThreadsArguments extends StObject {
  
  /** Ids of threads to be terminated. */
  var threadIds: js.UndefOr[js.Array[Double]] = js.undefined
}
object TerminateThreadsArguments {
  
  inline def apply(): TerminateThreadsArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminateThreadsArguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TerminateThreadsArguments] (val x: Self) extends AnyVal {
    
    inline def setThreadIds(value: js.Array[Double]): Self = StObject.set(x, "threadIds", value.asInstanceOf[js.Any])
    
    inline def setThreadIdsUndefined: Self = StObject.set(x, "threadIds", js.undefined)
    
    inline def setThreadIdsVarargs(value: Double*): Self = StObject.set(x, "threadIds", js.Array(value*))
  }
}
