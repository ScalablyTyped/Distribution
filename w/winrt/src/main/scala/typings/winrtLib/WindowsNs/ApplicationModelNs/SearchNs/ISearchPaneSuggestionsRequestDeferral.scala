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
  def apply(complete: js.Function0[scala.Unit]): ISearchPaneSuggestionsRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = complete)
  
    __obj.asInstanceOf[ISearchPaneSuggestionsRequestDeferral]
  }
}

