package typings.winrt.Windows.ApplicationModel.Search

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISearchPaneSuggestionsRequest extends StObject {
  
  def getDeferral(): SearchPaneSuggestionsRequestDeferral = js.native
  
  var isCanceled: Boolean = js.native
  
  var searchSuggestionCollection: SearchSuggestionCollection = js.native
}
object ISearchPaneSuggestionsRequest {
  
  @scala.inline
  def apply(
    getDeferral: () => SearchPaneSuggestionsRequestDeferral,
    isCanceled: Boolean,
    searchSuggestionCollection: SearchSuggestionCollection
  ): ISearchPaneSuggestionsRequest = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), isCanceled = isCanceled.asInstanceOf[js.Any], searchSuggestionCollection = searchSuggestionCollection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchPaneSuggestionsRequest]
  }
  
  @scala.inline
  implicit class ISearchPaneSuggestionsRequestMutableBuilder[Self <: ISearchPaneSuggestionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDeferral(value: () => SearchPaneSuggestionsRequestDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsCanceled(value: Boolean): Self = StObject.set(x, "isCanceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchSuggestionCollection(value: SearchSuggestionCollection): Self = StObject.set(x, "searchSuggestionCollection", value.asInstanceOf[js.Any])
  }
}
