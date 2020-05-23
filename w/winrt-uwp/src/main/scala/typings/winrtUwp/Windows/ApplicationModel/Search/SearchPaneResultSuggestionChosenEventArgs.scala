package typings.winrtUwp.Windows.ApplicationModel.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a resultsuggestionchosen event that is associated with a searchPane object. */
trait SearchPaneResultSuggestionChosenEventArgs extends js.Object {
  /** The tag for the suggested result that the user selected. */
  var tag: String
}

object SearchPaneResultSuggestionChosenEventArgs {
  @scala.inline
  def apply(tag: String): SearchPaneResultSuggestionChosenEventArgs = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPaneResultSuggestionChosenEventArgs]
  }
}

