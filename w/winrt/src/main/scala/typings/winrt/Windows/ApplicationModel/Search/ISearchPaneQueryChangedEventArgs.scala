package typings.winrt.Windows.ApplicationModel.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchPaneQueryChangedEventArgs extends js.Object {
  var language: String
  var linguisticDetails: SearchPaneQueryLinguisticDetails
  var queryText: String
}

object ISearchPaneQueryChangedEventArgs {
  @scala.inline
  def apply(language: String, linguisticDetails: SearchPaneQueryLinguisticDetails, queryText: String): ISearchPaneQueryChangedEventArgs = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], linguisticDetails = linguisticDetails.asInstanceOf[js.Any], queryText = queryText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchPaneQueryChangedEventArgs]
  }
}

