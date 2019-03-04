package typings
package winrtLib.WindowsNs.ApplicationModelNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchPaneSuggestionsRequest extends js.Object {
  var isCanceled: scala.Boolean
  var searchSuggestionCollection: SearchSuggestionCollection
  def getDeferral(): SearchPaneSuggestionsRequestDeferral
}

object ISearchPaneSuggestionsRequest {
  @scala.inline
  def apply(
    getDeferral: js.Function0[SearchPaneSuggestionsRequestDeferral],
    isCanceled: scala.Boolean,
    searchSuggestionCollection: SearchSuggestionCollection
  ): ISearchPaneSuggestionsRequest = {
    val __obj = js.Dynamic.literal(getDeferral = getDeferral, isCanceled = isCanceled, searchSuggestionCollection = searchSuggestionCollection)
  
    __obj.asInstanceOf[ISearchPaneSuggestionsRequest]
  }
}

