package typings
package winrtLib.WindowsNs.ApplicationModelNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchPaneSuggestionsRequestDeferral extends js.Object {
  def complete(): scala.Unit
}

object ISearchPaneSuggestionsRequestDeferral {
  @scala.inline
  def apply(complete: () => scala.Unit): ISearchPaneSuggestionsRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
  
    __obj.asInstanceOf[ISearchPaneSuggestionsRequestDeferral]
  }
}

