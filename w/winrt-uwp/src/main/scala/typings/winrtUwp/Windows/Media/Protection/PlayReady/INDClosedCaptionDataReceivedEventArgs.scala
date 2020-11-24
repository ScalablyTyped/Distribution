package typings.winrtUwp.Windows.Media.Protection.PlayReady

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies arguments for a PlayReady-ND ClosedCaptionDataReceived event. */
@js.native
trait INDClosedCaptionDataReceivedEventArgs extends js.Object {
  
  /** Gets the closed caption data. */
  var closedCaptionData: Double = js.native
  
  /** Gets the format of the closed caption data. */
  var closedCaptionDataFormat: NDClosedCaptionFormat = js.native
  
  /** Gets the timestamp of the closed caption data. */
  var presentationTimestamp: Double = js.native
}
object INDClosedCaptionDataReceivedEventArgs {
  
  @scala.inline
  def apply(
    closedCaptionData: Double,
    closedCaptionDataFormat: NDClosedCaptionFormat,
    presentationTimestamp: Double
  ): INDClosedCaptionDataReceivedEventArgs = {
    val __obj = js.Dynamic.literal(closedCaptionData = closedCaptionData.asInstanceOf[js.Any], closedCaptionDataFormat = closedCaptionDataFormat.asInstanceOf[js.Any], presentationTimestamp = presentationTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[INDClosedCaptionDataReceivedEventArgs]
  }
  
  @scala.inline
  implicit class INDClosedCaptionDataReceivedEventArgsOps[Self <: INDClosedCaptionDataReceivedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setClosedCaptionData(value: Double): Self = this.set("closedCaptionData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosedCaptionDataFormat(value: NDClosedCaptionFormat): Self = this.set("closedCaptionDataFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresentationTimestamp(value: Double): Self = this.set("presentationTimestamp", value.asInstanceOf[js.Any])
  }
}
