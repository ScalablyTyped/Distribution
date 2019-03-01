package typings
package winrtLib.WindowsNs.ApplicationModelNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchPaneStatics extends js.Object {
  def getForCurrentView(): SearchPane
}

object ISearchPaneStatics {
  @scala.inline
  def apply(getForCurrentView: js.Function0[SearchPane]): ISearchPaneStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getForCurrentView")(getForCurrentView)
    __obj.asInstanceOf[ISearchPaneStatics]
  }
}

