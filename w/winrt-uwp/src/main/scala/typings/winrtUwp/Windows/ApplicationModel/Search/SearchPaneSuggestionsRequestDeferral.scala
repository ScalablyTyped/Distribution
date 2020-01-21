package typings.winrtUwp.Windows.ApplicationModel.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables the app to signal when it has finished populating a searchSuggestionCollection object while handling the suggestionsrequested event. Apps should use a deferral if and only if they need to respond to a request for suggestions asynchronously. */
@JSGlobal("Windows.ApplicationModel.Search.SearchPaneSuggestionsRequestDeferral")
@js.native
abstract class SearchPaneSuggestionsRequestDeferral () extends js.Object {
  /** Signals that the app has finished populating a searchSuggestionCollection object while handling the suggestionsrequested event. */
  def complete(): Unit = js.native
}

