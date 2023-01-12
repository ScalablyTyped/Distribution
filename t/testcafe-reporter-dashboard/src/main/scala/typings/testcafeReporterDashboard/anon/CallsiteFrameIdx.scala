package typings.testcafeReporterDashboard.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallsiteFrameIdx extends StObject {
  
  var callsiteFrameIdx: Double
  
  var filename: String
  
  var isV8Frames: Boolean
  
  var lineNum: Double
  
  var stackFrames: js.Array[Any]
}
object CallsiteFrameIdx {
  
  inline def apply(
    callsiteFrameIdx: Double,
    filename: String,
    isV8Frames: Boolean,
    lineNum: Double,
    stackFrames: js.Array[Any]
  ): CallsiteFrameIdx = {
    val __obj = js.Dynamic.literal(callsiteFrameIdx = callsiteFrameIdx.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], isV8Frames = isV8Frames.asInstanceOf[js.Any], lineNum = lineNum.asInstanceOf[js.Any], stackFrames = stackFrames.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallsiteFrameIdx]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CallsiteFrameIdx] (val x: Self) extends AnyVal {
    
    inline def setCallsiteFrameIdx(value: Double): Self = StObject.set(x, "callsiteFrameIdx", value.asInstanceOf[js.Any])
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setIsV8Frames(value: Boolean): Self = StObject.set(x, "isV8Frames", value.asInstanceOf[js.Any])
    
    inline def setLineNum(value: Double): Self = StObject.set(x, "lineNum", value.asInstanceOf[js.Any])
    
    inline def setStackFrames(value: js.Array[Any]): Self = StObject.set(x, "stackFrames", value.asInstanceOf[js.Any])
    
    inline def setStackFramesVarargs(value: Any*): Self = StObject.set(x, "stackFrames", js.Array(value*))
  }
}
