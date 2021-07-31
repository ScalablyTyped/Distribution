package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about an error that occurred with a timed metadata track. */
trait TimedMetadataTrackError extends StObject {
  
  /** Gets the error code associated with the timed metadata track error. */
  var errorCode: TimedMetadataTrackErrorCode
  
  /** Gets the extended error code for the TimedMetadataTrackError . */
  var extendedError: WinRTError
}
object TimedMetadataTrackError {
  
  @scala.inline
  def apply(errorCode: TimedMetadataTrackErrorCode, extendedError: WinRTError): TimedMetadataTrackError = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], extendedError = extendedError.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedMetadataTrackError]
  }
  
  @scala.inline
  implicit class TimedMetadataTrackErrorMutableBuilder[Self <: TimedMetadataTrackError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: TimedMetadataTrackErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedError(value: WinRTError): Self = StObject.set(x, "extendedError", value.asInstanceOf[js.Any])
  }
}
