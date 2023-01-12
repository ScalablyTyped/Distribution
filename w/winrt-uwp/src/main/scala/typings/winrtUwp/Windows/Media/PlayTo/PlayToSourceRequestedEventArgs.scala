package typings.winrtUwp.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the SourceRequested event. */
trait PlayToSourceRequestedEventArgs extends StObject {
  
  /** Gets the media object to connect to a Play To target. */
  var sourceRequest: PlayToSourceRequest
}
object PlayToSourceRequestedEventArgs {
  
  inline def apply(sourceRequest: PlayToSourceRequest): PlayToSourceRequestedEventArgs = {
    val __obj = js.Dynamic.literal(sourceRequest = sourceRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayToSourceRequestedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlayToSourceRequestedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setSourceRequest(value: PlayToSourceRequest): Self = StObject.set(x, "sourceRequest", value.asInstanceOf[js.Any])
  }
}
