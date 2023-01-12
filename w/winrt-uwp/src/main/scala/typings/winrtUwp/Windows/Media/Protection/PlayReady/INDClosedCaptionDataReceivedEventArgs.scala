package typings.winrtUwp.Windows.Media.Protection.PlayReady

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies arguments for a PlayReady-ND ClosedCaptionDataReceived event. */
trait INDClosedCaptionDataReceivedEventArgs extends StObject {
  
  /** Gets the closed caption data. */
  var closedCaptionData: Double
  
  /** Gets the format of the closed caption data. */
  var closedCaptionDataFormat: NDClosedCaptionFormat
  
  /** Gets the timestamp of the closed caption data. */
  var presentationTimestamp: Double
}
object INDClosedCaptionDataReceivedEventArgs {
  
  inline def apply(
    closedCaptionData: Double,
    closedCaptionDataFormat: NDClosedCaptionFormat,
    presentationTimestamp: Double
  ): INDClosedCaptionDataReceivedEventArgs = {
    val __obj = js.Dynamic.literal(closedCaptionData = closedCaptionData.asInstanceOf[js.Any], closedCaptionDataFormat = closedCaptionDataFormat.asInstanceOf[js.Any], presentationTimestamp = presentationTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[INDClosedCaptionDataReceivedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: INDClosedCaptionDataReceivedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setClosedCaptionData(value: Double): Self = StObject.set(x, "closedCaptionData", value.asInstanceOf[js.Any])
    
    inline def setClosedCaptionDataFormat(value: NDClosedCaptionFormat): Self = StObject.set(x, "closedCaptionDataFormat", value.asInstanceOf[js.Any])
    
    inline def setPresentationTimestamp(value: Double): Self = StObject.set(x, "presentationTimestamp", value.asInstanceOf[js.Any])
  }
}
