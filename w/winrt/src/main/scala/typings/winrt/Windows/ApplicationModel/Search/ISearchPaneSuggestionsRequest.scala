package typings.winrt.Windows.ApplicationModel.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchPaneSuggestionsRequest extends js.Object {
  var isCanceled: Boolean
  var searchSuggestionCollection: SearchSuggestionCollection
  def getDeferral(): SearchPaneSuggestionsRequestDeferral
}

object ISearchPaneSuggestionsRequest {
  @scala.inline
  def apply(
    getDeferral: () => SearchPaneSuggestionsRequestDeferral,
    isCanceled: Boolean,
    searchSuggestionCollection: SearchSuggestionCollection
  ): ISearchPaneSuggestionsRequest = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), isCanceled = isCanceled, searchSuggestionCollection = searchSuggestionCollection)
  
    __obj.asInstanceOf[ISearchPaneSuggestionsRequest]
  }
}

