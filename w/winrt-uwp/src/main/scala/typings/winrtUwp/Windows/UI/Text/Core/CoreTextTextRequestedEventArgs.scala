package typings.winrtUwp.Windows.UI.Text.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the TextRequested event. */
trait CoreTextTextRequestedEventArgs extends StObject {
  
  /** Gets information about a TextRequested event. */
  var request: CoreTextTextRequest
}
object CoreTextTextRequestedEventArgs {
  
  @scala.inline
  def apply(request: CoreTextTextRequest): CoreTextTextRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreTextTextRequestedEventArgs]
  }
  
  @scala.inline
  implicit class CoreTextTextRequestedEventArgsMutableBuilder[Self <: CoreTextTextRequestedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequest(value: CoreTextTextRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
