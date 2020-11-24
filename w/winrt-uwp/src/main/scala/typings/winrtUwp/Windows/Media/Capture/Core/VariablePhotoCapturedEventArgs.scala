package typings.winrtUwp.Windows.Media.Capture.Core

import typings.winrtUwp.Windows.Media.Capture.CapturedFrame
import typings.winrtUwp.Windows.Media.Capture.CapturedFrameControlValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the PhotoCaptured event. */
@js.native
trait VariablePhotoCapturedEventArgs extends js.Object {
  
  /** Gets the time offset of the capture of the associated frame in a variable photo sequence. */
  var captureTimeOffset: Double = js.native
  
  /** Gets a CapturedFrameControlValues object that indicates the capture settings used for the associated frame in a variable photo sequence. */
  var capturedFrameControlValues: CapturedFrameControlValues = js.native
  
  /** Gets a CapturedFrame object representing a captured frame of a variable photo sequence. */
  var frame: CapturedFrame = js.native
  
  /** Gets an index value that indicates which element of the DesiredFrameControllers vector was used to specify the requested control values for the associated frame of a variable photo sequence. */
  var usedFrameControllerIndex: Double = js.native
}
object VariablePhotoCapturedEventArgs {
  
  @scala.inline
  def apply(
    captureTimeOffset: Double,
    capturedFrameControlValues: CapturedFrameControlValues,
    frame: CapturedFrame,
    usedFrameControllerIndex: Double
  ): VariablePhotoCapturedEventArgs = {
    val __obj = js.Dynamic.literal(captureTimeOffset = captureTimeOffset.asInstanceOf[js.Any], capturedFrameControlValues = capturedFrameControlValues.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], usedFrameControllerIndex = usedFrameControllerIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariablePhotoCapturedEventArgs]
  }
  
  @scala.inline
  implicit class VariablePhotoCapturedEventArgsOps[Self <: VariablePhotoCapturedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCaptureTimeOffset(value: Double): Self = this.set("captureTimeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapturedFrameControlValues(value: CapturedFrameControlValues): Self = this.set("capturedFrameControlValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrame(value: CapturedFrame): Self = this.set("frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedFrameControllerIndex(value: Double): Self = this.set("usedFrameControllerIndex", value.asInstanceOf[js.Any])
  }
}
