package typings.winrtUwp.Windows.ApplicationModel.Search

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables the app to signal when it has finished populating a searchSuggestionCollection object while handling the suggestionsrequested event. Apps should use a deferral if and only if they need to respond to a request for suggestions asynchronously. */
trait SearchPaneSuggestionsRequestDeferral extends StObject {
  
  /** Signals that the app has finished populating a searchSuggestionCollection object while handling the suggestionsrequested event. */
  def complete(): Unit
}
object SearchPaneSuggestionsRequestDeferral {
  
  inline def apply(complete: () => Unit): SearchPaneSuggestionsRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[SearchPaneSuggestionsRequestDeferral]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchPaneSuggestionsRequestDeferral] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
