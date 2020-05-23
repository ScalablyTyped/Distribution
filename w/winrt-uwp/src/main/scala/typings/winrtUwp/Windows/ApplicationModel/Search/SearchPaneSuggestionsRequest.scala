package typings.winrtUwp.Windows.ApplicationModel.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Stores suggestions and information about the request for suggestions. */
trait SearchPaneSuggestionsRequest extends js.Object {
  /** Indicates whether the request for suggestions to display is canceled. */
  var isCanceled: Boolean
  /** The suggestions to display in the search pane for the current query. Apps provide suggestions to display by appending them to this searchSuggestionCollection object. */
  var searchSuggestionCollection: SearchSuggestionCollection
  /**
    * Retrieves an object that lets an app respond to a request for suggestions asynchronously.
    * @return An object that lets an app signal when it has fulfilled the request for search suggestions.
    */
  def getDeferral(): SearchPaneSuggestionsRequestDeferral
}

object SearchPaneSuggestionsRequest {
  @scala.inline
  def apply(
    getDeferral: () => SearchPaneSuggestionsRequestDeferral,
    isCanceled: Boolean,
    searchSuggestionCollection: SearchSuggestionCollection
  ): SearchPaneSuggestionsRequest = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), isCanceled = isCanceled.asInstanceOf[js.Any], searchSuggestionCollection = searchSuggestionCollection.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPaneSuggestionsRequest]
  }
}

