package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the MediaSource::MediaSourceOpenOperationCompleted event. */
trait MediaSourceOpenOperationCompletedEventArgs extends StObject {
  
  /** Represents the error that occurred while asynchronously opening the MediaSource . */
  var error: MediaSourceError
}
object MediaSourceOpenOperationCompletedEventArgs {
  
  inline def apply(error: MediaSourceError): MediaSourceOpenOperationCompletedEventArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaSourceOpenOperationCompletedEventArgs]
  }
  
  extension [Self <: MediaSourceOpenOperationCompletedEventArgs](x: Self) {
    
    inline def setError(value: MediaSourceError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
