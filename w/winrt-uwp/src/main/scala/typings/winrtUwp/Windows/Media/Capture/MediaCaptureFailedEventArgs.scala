package typings.winrtUwp.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the MediaCapture.Failed event. */
trait MediaCaptureFailedEventArgs extends StObject {
  
  /** The error code of the error that caused the event. */
  var code: Double
  
  /** A message string for the error. */
  var message: String
}
object MediaCaptureFailedEventArgs {
  
  inline def apply(code: Double, message: String): MediaCaptureFailedEventArgs = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCaptureFailedEventArgs]
  }
  
  extension [Self <: MediaCaptureFailedEventArgs](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
