package typings.winrtUwp.Windows.ApplicationModel.Search

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Stores suggestions and information about the request for suggestions. */
@js.native
trait SearchPaneSuggestionsRequest extends StObject {
  
  /**
    * Retrieves an object that lets an app respond to a request for suggestions asynchronously.
    * @return An object that lets an app signal when it has fulfilled the request for search suggestions.
    */
  def getDeferral(): SearchPaneSuggestionsRequestDeferral = js.native
  
  /** Indicates whether the request for suggestions to display is canceled. */
  var isCanceled: Boolean = js.native
  
  /** The suggestions to display in the search pane for the current query. Apps provide suggestions to display by appending them to this searchSuggestionCollection object. */
  var searchSuggestionCollection: SearchSuggestionCollection = js.native
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
  
  @scala.inline
  implicit class SearchPaneSuggestionsRequestMutableBuilder[Self <: SearchPaneSuggestionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDeferral(value: () => SearchPaneSuggestionsRequestDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsCanceled(value: Boolean): Self = StObject.set(x, "isCanceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchSuggestionCollection(value: SearchSuggestionCollection): Self = StObject.set(x, "searchSuggestionCollection", value.asInstanceOf[js.Any])
  }
}
