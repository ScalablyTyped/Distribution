package typings.winrtUwp.global.Windows.ApplicationModel.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Stores suggestions and information about the request for suggestions. */
@JSGlobal("Windows.ApplicationModel.Search.SearchSuggestionsRequest")
@js.native
abstract class SearchSuggestionsRequest ()
  extends typings.winrtUwp.Windows.ApplicationModel.Search.SearchSuggestionsRequest {
  /** Indicates whether the request for suggestions to display is canceled. */
  /* CompleteClass */
  override var isCanceled: Boolean = js.native
  /** The suggestions to display in the search pane or in-app search box for the current query. Apps provide suggestions to display by appending them to this SearchSuggestionCollection object. */
  /* CompleteClass */
  override var searchSuggestionCollection: typings.winrtUwp.Windows.ApplicationModel.Search.SearchSuggestionCollection = js.native
  /**
    * Gets an object that lets an app respond to a request for suggestions asynchronously.
    * @return An object that lets an app signal when it has fulfilled the request for search suggestions.
    */
  /* CompleteClass */
  override def getDeferral(): typings.winrtUwp.Windows.ApplicationModel.Search.SearchSuggestionsRequestDeferral = js.native
}

