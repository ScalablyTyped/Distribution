package typings.winrtUwp.Windows.Media.Effects

import typings.winrtUwp.Windows.Media.VideoFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides context for performing a custom video effect operation within the ProcessFrame method. */
trait ProcessVideoFrameContext extends StObject {
  
  /** Gets the input frame for a video effect operation. */
  var inputFrame: VideoFrame
  
  /** Gets the output frame for a video effect operation. */
  var outputFrame: VideoFrame
}
object ProcessVideoFrameContext {
  
  @scala.inline
  def apply(inputFrame: VideoFrame, outputFrame: VideoFrame): ProcessVideoFrameContext = {
    val __obj = js.Dynamic.literal(inputFrame = inputFrame.asInstanceOf[js.Any], outputFrame = outputFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessVideoFrameContext]
  }
  
  @scala.inline
  implicit class ProcessVideoFrameContextMutableBuilder[Self <: ProcessVideoFrameContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputFrame(value: VideoFrame): Self = StObject.set(x, "inputFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputFrame(value: VideoFrame): Self = StObject.set(x, "outputFrame", value.asInstanceOf[js.Any])
  }
}
