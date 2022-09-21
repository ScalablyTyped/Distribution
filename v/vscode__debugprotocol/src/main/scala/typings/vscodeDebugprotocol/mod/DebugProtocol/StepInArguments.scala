package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `stepIn` request. */
trait StepInArguments extends StObject {
  
  /** Stepping granularity. If no granularity is specified, a granularity of `statement` is assumed. */
  var granularity: js.UndefOr[SteppingGranularity] = js.undefined
  
  /** If this flag is true, all other suspended threads are not resumed. */
  var singleThread: js.UndefOr[Boolean] = js.undefined
  
  /** Id of the target to step into. */
  var targetId: js.UndefOr[Double] = js.undefined
  
  /** Specifies the thread for which to resume execution for one step-into (of the given granularity). */
  var threadId: Double
}
object StepInArguments {
  
  inline def apply(threadId: Double): StepInArguments = {
    val __obj = js.Dynamic.literal(threadId = threadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepInArguments]
  }
  
  extension [Self <: StepInArguments](x: Self) {
    
    inline def setGranularity(value: SteppingGranularity): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
    
    inline def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
    
    inline def setSingleThread(value: Boolean): Self = StObject.set(x, "singleThread", value.asInstanceOf[js.Any])
    
    inline def setSingleThreadUndefined: Self = StObject.set(x, "singleThread", js.undefined)
    
    inline def setTargetId(value: Double): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    inline def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
    
    inline def setThreadId(value: Double): Self = StObject.set(x, "threadId", value.asInstanceOf[js.Any])
  }
}
