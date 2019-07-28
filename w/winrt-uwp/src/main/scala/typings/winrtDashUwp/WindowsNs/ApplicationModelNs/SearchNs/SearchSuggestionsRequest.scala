package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Stores suggestions and information about the request for suggestions. */
@JSGlobal("Windows.ApplicationModel.Search.SearchSuggestionsRequest")
@js.native
abstract class SearchSuggestionsRequest () extends js.Object {
  /** Indicates whether the request for suggestions to display is canceled. */
  var isCanceled: Boolean = js.native
  /** The suggestions to display in the search pane or in-app search box for the current query. Apps provide suggestions to display by appending them to this SearchSuggestionCollection object. */
  var searchSuggestionCollection: SearchSuggestionCollection = js.native
  /**
    * Gets an object that lets an app respond to a request for suggestions asynchronously.
    * @return An object that lets an app signal when it has fulfilled the request for search suggestions.
    */
  def getDeferral(): SearchSuggestionsRequestDeferral = js.native
}

