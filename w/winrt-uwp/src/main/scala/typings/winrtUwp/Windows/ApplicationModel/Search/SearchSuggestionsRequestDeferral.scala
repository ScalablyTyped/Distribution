package typings.winrtUwp.Windows.ApplicationModel.Search

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables the app to signal when it has finished populating a SearchSuggestionCollection object while handling the SuggestionsRequested event. Use a deferral if and only if your app needs to respond to a request for suggestions asynchronously. */
trait SearchSuggestionsRequestDeferral extends StObject {
  
  /** Signals that the app has finished populating a SearchSuggestionCollection object while handling the SuggestionsRequested event. */
  def complete(): Unit
}
object SearchSuggestionsRequestDeferral {
  
  @scala.inline
  def apply(complete: () => Unit): SearchSuggestionsRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[SearchSuggestionsRequestDeferral]
  }
  
  @scala.inline
  implicit class SearchSuggestionsRequestDeferralMutableBuilder[Self <: SearchSuggestionsRequestDeferral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
