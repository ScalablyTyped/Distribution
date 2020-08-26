package typings.winrt.Windows.ApplicationModel.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISearchPaneQuerySubmittedEventArgs extends js.Object {
  var language: String = js.native
  var queryText: String = js.native
}

object ISearchPaneQuerySubmittedEventArgs {
  @scala.inline
  def apply(language: String, queryText: String): ISearchPaneQuerySubmittedEventArgs = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], queryText = queryText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchPaneQuerySubmittedEventArgs]
  }
  @scala.inline
  implicit class ISearchPaneQuerySubmittedEventArgsOps[Self <: ISearchPaneQuerySubmittedEventArgs] (val x: Self) extends AnyVal {
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
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryText(value: String): Self = this.set("queryText", value.asInstanceOf[js.Any])
  }
  
}

