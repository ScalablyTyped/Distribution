package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables the app to signal when it has finished populating a SearchSuggestionCollection object while handling the SuggestionsRequested event. Use a deferral if and only if your app needs to respond to a request for suggestions asynchronously. */
@JSGlobal("Windows.ApplicationModel.Search.SearchSuggestionsRequestDeferral")
@js.native
abstract class SearchSuggestionsRequestDeferral () extends js.Object {
  /** Signals that the app has finished populating a SearchSuggestionCollection object while handling the SuggestionsRequested event. */
  def complete(): scala.Unit = js.native
}

