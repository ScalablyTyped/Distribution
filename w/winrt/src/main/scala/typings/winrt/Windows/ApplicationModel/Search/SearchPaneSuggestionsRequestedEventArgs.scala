package typings.winrt.Windows.ApplicationModel.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Search.SearchPaneSuggestionsRequestedEventArgs")
@js.native
class SearchPaneSuggestionsRequestedEventArgs () extends ISearchPaneSuggestionsRequestedEventArgs {
  /* CompleteClass */
  override var language: String = js.native
  /* CompleteClass */
  override var linguisticDetails: SearchPaneQueryLinguisticDetails = js.native
  /* CompleteClass */
  override var queryText: String = js.native
  /* CompleteClass */
  override var request: SearchPaneSuggestionsRequest = js.native
}

