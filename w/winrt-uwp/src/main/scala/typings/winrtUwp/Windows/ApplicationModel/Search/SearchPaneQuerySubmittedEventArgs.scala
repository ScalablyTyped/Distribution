package typings.winrtUwp.Windows.ApplicationModel.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a querysubmitted event that is associated with a searchPane instance. */
@js.native
trait SearchPaneQuerySubmittedEventArgs extends js.Object {
  /** The Internet Engineering Task Force (IETF) language tag (BCP 47 standard) that identifies the language currently associated with the user's text input device. */
  var language: String = js.native
  /** An object that provides linguistic information about query text that the user is entering through an Input Method Editor (IME). */
  var linguisticDetails: SearchPaneQueryLinguisticDetails = js.native
  /** The text that was submitted through the search pane. */
  var queryText: String = js.native
}

object SearchPaneQuerySubmittedEventArgs {
  @scala.inline
  def apply(language: String, linguisticDetails: SearchPaneQueryLinguisticDetails, queryText: String): SearchPaneQuerySubmittedEventArgs = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], linguisticDetails = linguisticDetails.asInstanceOf[js.Any], queryText = queryText.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPaneQuerySubmittedEventArgs]
  }
  @scala.inline
  implicit class SearchPaneQuerySubmittedEventArgsOps[Self <: SearchPaneQuerySubmittedEventArgs] (val x: Self) extends AnyVal {
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
    def setLinguisticDetails(value: SearchPaneQueryLinguisticDetails): Self = this.set("linguisticDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryText(value: String): Self = this.set("queryText", value.asInstanceOf[js.Any])
  }
  
}

