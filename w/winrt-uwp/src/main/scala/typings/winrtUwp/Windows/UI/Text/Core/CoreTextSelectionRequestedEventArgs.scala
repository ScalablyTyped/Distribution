package typings.winrtUwp.Windows.UI.Text.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the SelectionRequested event. */
trait CoreTextSelectionRequestedEventArgs extends StObject {
  
  /** Gets information about a SelectionRequested event. */
  var request: CoreTextSelectionRequest
}
object CoreTextSelectionRequestedEventArgs {
  
  inline def apply(request: CoreTextSelectionRequest): CoreTextSelectionRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreTextSelectionRequestedEventArgs]
  }
  
  extension [Self <: CoreTextSelectionRequestedEventArgs](x: Self) {
    
    inline def setRequest(value: CoreTextSelectionRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
