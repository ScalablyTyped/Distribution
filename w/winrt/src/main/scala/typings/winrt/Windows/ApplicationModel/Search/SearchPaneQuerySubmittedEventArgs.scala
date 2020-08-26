package typings.winrt.Windows.ApplicationModel.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchPaneQuerySubmittedEventArgs extends ISearchPaneQuerySubmittedEventArgs

object SearchPaneQuerySubmittedEventArgs {
  @scala.inline
  def apply(language: String, queryText: String): SearchPaneQuerySubmittedEventArgs = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], queryText = queryText.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPaneQuerySubmittedEventArgs]
  }
}

