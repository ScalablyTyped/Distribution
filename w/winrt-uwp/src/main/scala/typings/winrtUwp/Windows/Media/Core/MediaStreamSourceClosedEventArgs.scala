package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the MediaStreamSource.Closed event. */
trait MediaStreamSourceClosedEventArgs extends StObject {
  
  /** Gets the object that represents the notification that the MediaStreamSource has been closed. */
  var request: MediaStreamSourceClosedRequest
}
object MediaStreamSourceClosedEventArgs {
  
  inline def apply(request: MediaStreamSourceClosedRequest): MediaStreamSourceClosedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamSourceClosedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaStreamSourceClosedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setRequest(value: MediaStreamSourceClosedRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
