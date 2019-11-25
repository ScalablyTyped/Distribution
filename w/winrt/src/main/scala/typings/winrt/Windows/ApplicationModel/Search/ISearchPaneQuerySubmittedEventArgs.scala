package typings.winrt.Windows.ApplicationModel.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchPaneQuerySubmittedEventArgs extends js.Object {
  var language: String
  var queryText: String
}

object ISearchPaneQuerySubmittedEventArgs {
  @scala.inline
  def apply(language: String, queryText: String): ISearchPaneQuerySubmittedEventArgs = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], queryText = queryText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISearchPaneQuerySubmittedEventArgs]
  }
}

