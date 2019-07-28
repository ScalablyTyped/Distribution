package typings.winrt.WindowsNs.ApplicationModelNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchPaneSuggestionsRequestedEventArgs extends ISearchPaneQueryChangedEventArgs {
  var request: SearchPaneSuggestionsRequest
}

object ISearchPaneSuggestionsRequestedEventArgs {
  @scala.inline
  def apply(
    language: String,
    linguisticDetails: SearchPaneQueryLinguisticDetails,
    queryText: String,
    request: SearchPaneSuggestionsRequest
  ): ISearchPaneSuggestionsRequestedEventArgs = {
    val __obj = js.Dynamic.literal(language = language, linguisticDetails = linguisticDetails, queryText = queryText, request = request)
  
    __obj.asInstanceOf[ISearchPaneSuggestionsRequestedEventArgs]
  }
}

