package typings.winrt.Windows.ApplicationModel.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISearchPaneResultSuggestionChosenEventArgs extends js.Object {
  var tag: String = js.native
}

object ISearchPaneResultSuggestionChosenEventArgs {
  @scala.inline
  def apply(tag: String): ISearchPaneResultSuggestionChosenEventArgs = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchPaneResultSuggestionChosenEventArgs]
  }
  @scala.inline
  implicit class ISearchPaneResultSuggestionChosenEventArgsOps[Self <: ISearchPaneResultSuggestionChosenEventArgs] (val x: Self) extends AnyVal {
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

