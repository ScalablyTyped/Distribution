package typings.winrtUwp.Windows.UI.StartScreen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Passed to the SecondaryTile.VisualElementsRequested event handler to provide the visual elements details. */
@js.native
trait VisualElementsRequestedEventArgs extends StObject {
  
  /** Gets the VisualElementsRequest object for the event. */
  var request: VisualElementsRequest = js.native
}
object VisualElementsRequestedEventArgs {
  
  @scala.inline
  def apply(request: VisualElementsRequest): VisualElementsRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualElementsRequestedEventArgs]
  }
  
  @scala.inline
  implicit class VisualElementsRequestedEventArgsMutableBuilder[Self <: VisualElementsRequestedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequest(value: VisualElementsRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
