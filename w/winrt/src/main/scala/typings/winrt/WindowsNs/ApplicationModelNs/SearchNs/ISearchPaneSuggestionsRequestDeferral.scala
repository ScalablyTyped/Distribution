package typings.winrt.WindowsNs.ApplicationModelNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchPaneSuggestionsRequestDeferral extends js.Object {
  def complete(): Unit
}

object ISearchPaneSuggestionsRequestDeferral {
  @scala.inline
  def apply(complete: () => Unit): ISearchPaneSuggestionsRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
  
    __obj.asInstanceOf[ISearchPaneSuggestionsRequestDeferral]
  }
}

