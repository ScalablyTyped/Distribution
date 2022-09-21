package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `stackTrace` request. */
trait StackTraceArguments extends StObject {
  
  /** Specifies details on how to format the stack frames.
  			The attribute is only honored by a debug adapter if the corresponding capability `supportsValueFormattingOptions` is true.
  		*/
  var format: js.UndefOr[StackFrameFormat] = js.undefined
  
  /** The maximum number of frames to return. If levels is not specified or 0, all frames are returned. */
  var levels: js.UndefOr[Double] = js.undefined
  
  /** The index of the first frame to return; if omitted frames start at 0. */
  var startFrame: js.UndefOr[Double] = js.undefined
  
  /** Retrieve the stacktrace for this thread. */
  var threadId: Double
}
object StackTraceArguments {
  
  inline def apply(threadId: Double): StackTraceArguments = {
    val __obj = js.Dynamic.literal(threadId = threadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackTraceArguments]
  }
  
  extension [Self <: StackTraceArguments](x: Self) {
    
    inline def setFormat(value: StackFrameFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setLevels(value: Double): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    inline def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
    
    inline def setStartFrame(value: Double): Self = StObject.set(x, "startFrame", value.asInstanceOf[js.Any])
    
    inline def setStartFrameUndefined: Self = StObject.set(x, "startFrame", js.undefined)
    
    inline def setThreadId(value: Double): Self = StObject.set(x, "threadId", value.asInstanceOf[js.Any])
  }
}
