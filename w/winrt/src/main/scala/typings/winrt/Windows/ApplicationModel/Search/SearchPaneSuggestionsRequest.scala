package typings.winrt.Windows.ApplicationModel.Search

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchPaneSuggestionsRequest
  extends StObject
     with ISearchPaneSuggestionsRequest
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
