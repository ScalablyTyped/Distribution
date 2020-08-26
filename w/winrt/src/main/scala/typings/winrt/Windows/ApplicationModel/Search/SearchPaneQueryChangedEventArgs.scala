package typings.winrt.Windows.ApplicationModel.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchPaneQueryChangedEventArgs extends ISearchPaneQueryChangedEventArgs

object SearchPaneQueryChangedEventArgs {
  @scala.inline
  def apply(language: String, linguisticDetails: SearchPaneQueryLinguisticDetails, queryText: String): SearchPaneQueryChangedEventArgs = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], linguisticDetails = linguisticDetails.asInstanceOf[js.Any], queryText = queryText.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPaneQueryChangedEventArgs]
  }
}

