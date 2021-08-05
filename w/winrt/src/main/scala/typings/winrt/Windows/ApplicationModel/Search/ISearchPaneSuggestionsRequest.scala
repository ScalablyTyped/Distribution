package typings.winrt.Windows.ApplicationModel.Search

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISearchPaneSuggestionsRequest extends StObject {
  
  def getDeferral(): SearchPaneSuggestionsRequestDeferral
  
  var isCanceled: Boolean
  
  var searchSuggestionCollection: SearchSuggestionCollection
}
object ISearchPaneSuggestionsRequest {
  
  inline def apply(
    getDeferral: () => SearchPaneSuggestionsRequestDeferral,
    isCanceled: Boolean,
    searchSuggestionCollection: SearchSuggestionCollection
  ): ISearchPaneSuggestionsRequest = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), isCanceled = isCanceled.asInstanceOf[js.Any], searchSuggestionCollection = searchSuggestionCollection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchPaneSuggestionsRequest]
  }
  
  extension [Self <: ISearchPaneSuggestionsRequest](x: Self) {
    
    inline def setGetDeferral(value: () => SearchPaneSuggestionsRequestDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    
    inline def setIsCanceled(value: Boolean): Self = StObject.set(x, "isCanceled", value.asInstanceOf[js.Any])
    
    inline def setSearchSuggestionCollection(value: SearchSuggestionCollection): Self = StObject.set(x, "searchSuggestionCollection", value.asInstanceOf[js.Any])
  }
}
