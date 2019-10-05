package typings.winrt.Windows.ApplicationModel.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Search.SearchPaneSuggestionsRequest")
@js.native
class SearchPaneSuggestionsRequest () extends ISearchPaneSuggestionsRequest {
  /* CompleteClass */
  override var isCanceled: Boolean = js.native
  /* CompleteClass */
  override var searchSuggestionCollection: SearchSuggestionCollection = js.native
  /* CompleteClass */
  override def getDeferral(): SearchPaneSuggestionsRequestDeferral = js.native
}

