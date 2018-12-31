package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Stores suggestions and information about the request for suggestions. */
@JSGlobal("Windows.ApplicationModel.Search.SearchPaneSuggestionsRequest")
@js.native
abstract class SearchPaneSuggestionsRequest () extends js.Object {
  /** Indicates whether the request for suggestions to display is canceled. */
  var isCanceled: scala.Boolean = js.native
  /** The suggestions to display in the search pane for the current query. Apps provide suggestions to display by appending them to this searchSuggestionCollection object. */
  var searchSuggestionCollection: SearchSuggestionCollection = js.native
  /**
    * Retrieves an object that lets an app respond to a request for suggestions asynchronously.
    * @return An object that lets an app signal when it has fulfilled the request for search suggestions.
    */
  def getDeferral(): SearchPaneSuggestionsRequestDeferral = js.native
}

