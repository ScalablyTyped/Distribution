package typings.winrtUwp.Windows.ApplicationModel.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables the app to signal when it has finished populating a searchSuggestionCollection object while handling the suggestionsrequested event. Apps should use a deferral if and only if they need to respond to a request for suggestions asynchronously. */
@js.native
trait SearchPaneSuggestionsRequestDeferral extends js.Object {
  /** Signals that the app has finished populating a searchSuggestionCollection object while handling the suggestionsrequested event. */
  def complete(): Unit = js.native
}

object SearchPaneSuggestionsRequestDeferral {
  @scala.inline
  def apply(complete: () => Unit): SearchPaneSuggestionsRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[SearchPaneSuggestionsRequestDeferral]
  }
  @scala.inline
  implicit class SearchPaneSuggestionsRequestDeferralOps[Self <: SearchPaneSuggestionsRequestDeferral] (val x: Self) extends AnyVal {
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
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
  }
  
}

