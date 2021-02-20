package typings.winrtUwp.Windows.Media.Protection.PlayReady

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies arguments for a PlayReady-ND ClosedCaptionDataReceived event. */
@js.native
trait INDClosedCaptionDataReceivedEventArgs extends StObject {
  
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
  implicit class INDClosedCaptionDataReceivedEventArgsMutableBuilder[Self <: INDClosedCaptionDataReceivedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClosedCaptionData(value: Double): Self = StObject.set(x, "closedCaptionData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosedCaptionDataFormat(value: NDClosedCaptionFormat): Self = StObject.set(x, "closedCaptionDataFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresentationTimestamp(value: Double): Self = StObject.set(x, "presentationTimestamp", value.asInstanceOf[js.Any])
  }
}
