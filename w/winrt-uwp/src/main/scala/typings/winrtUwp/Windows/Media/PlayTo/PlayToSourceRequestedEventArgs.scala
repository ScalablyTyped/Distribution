package typings.winrtUwp.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the SourceRequested event. */
@js.native
trait PlayToSourceRequestedEventArgs extends StObject {
  
  /** Gets the media object to connect to a Play To target. */
  var sourceRequest: PlayToSourceRequest = js.native
}
object PlayToSourceRequestedEventArgs {
  
  @scala.inline
  def apply(sourceRequest: PlayToSourceRequest): PlayToSourceRequestedEventArgs = {
    val __obj = js.Dynamic.literal(sourceRequest = sourceRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayToSourceRequestedEventArgs]
  }
  
  @scala.inline
  implicit class PlayToSourceRequestedEventArgsMutableBuilder[Self <: PlayToSourceRequestedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceRequest(value: PlayToSourceRequest): Self = StObject.set(x, "sourceRequest", value.asInstanceOf[js.Any])
  }
}
