package typings.winrtUwp.Windows.ApplicationModel.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a resultsuggestionchosen event that is associated with a searchPane object. */
@js.native
trait SearchPaneResultSuggestionChosenEventArgs extends js.Object {
  /** The tag for the suggested result that the user selected. */
  var tag: String = js.native
}

object SearchPaneResultSuggestionChosenEventArgs {
  @scala.inline
  def apply(tag: String): SearchPaneResultSuggestionChosenEventArgs = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPaneResultSuggestionChosenEventArgs]
  }
  @scala.inline
  implicit class SearchPaneResultSuggestionChosenEventArgsOps[Self <: SearchPaneResultSuggestionChosenEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
  }
  
}

