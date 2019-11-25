package typings.winrt.Windows.ApplicationModel.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchPaneResultSuggestionChosenEventArgs extends js.Object {
  var tag: String
}

object ISearchPaneResultSuggestionChosenEventArgs {
  @scala.inline
  def apply(tag: String): ISearchPaneResultSuggestionChosenEventArgs = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISearchPaneResultSuggestionChosenEventArgs]
  }
}

