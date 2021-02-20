package typings.winrtUwp.Windows.ApplicationModel.Search

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Stores suggestions and information about the request for suggestions. */
@js.native
trait SearchSuggestionsRequest extends StObject {
  
  /**
    * Gets an object that lets an app respond to a request for suggestions asynchronously.
    * @return An object that lets an app signal when it has fulfilled the request for search suggestions.
    */
  def getDeferral(): SearchSuggestionsRequestDeferral = js.native
  
  /** Indicates whether the request for suggestions to display is canceled. */
  var isCanceled: Boolean = js.native
  
  /** The suggestions to display in the search pane or in-app search box for the current query. Apps provide suggestions to display by appending them to this SearchSuggestionCollection object. */
  var searchSuggestionCollection: SearchSuggestionCollection = js.native
}
object SearchSuggestionsRequest {
  
  @scala.inline
  def apply(
    getDeferral: () => SearchSuggestionsRequestDeferral,
    isCanceled: Boolean,
    searchSuggestionCollection: SearchSuggestionCollection
  ): SearchSuggestionsRequest = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), isCanceled = isCanceled.asInstanceOf[js.Any], searchSuggestionCollection = searchSuggestionCollection.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSuggestionsRequest]
  }
  
  @scala.inline
  implicit class SearchSuggestionsRequestMutableBuilder[Self <: SearchSuggestionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDeferral(value: () => SearchSuggestionsRequestDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsCanceled(value: Boolean): Self = StObject.set(x, "isCanceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchSuggestionCollection(value: SearchSuggestionCollection): Self = StObject.set(x, "searchSuggestionCollection", value.asInstanceOf[js.Any])
  }
}
