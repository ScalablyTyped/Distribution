package typings.winrtUwp.Windows.ApplicationModel.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables the app to signal when it has finished populating a searchSuggestionCollection object while handling the suggestionsrequested event. Apps should use a deferral if and only if they need to respond to a request for suggestions asynchronously. */
trait SearchPaneSuggestionsRequestDeferral extends js.Object {
  /** Signals that the app has finished populating a searchSuggestionCollection object while handling the suggestionsrequested event. */
  def complete(): Unit
}

object SearchPaneSuggestionsRequestDeferral {
  @scala.inline
  def apply(complete: () => Unit): SearchPaneSuggestionsRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[SearchPaneSuggestionsRequestDeferral]
  }
}

