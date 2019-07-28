package typings.winrt.WindowsNs.ApplicationModelNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchPaneStatics extends js.Object {
  def getForCurrentView(): SearchPane
}

object ISearchPaneStatics {
  @scala.inline
  def apply(getForCurrentView: () => SearchPane): ISearchPaneStatics = {
    val __obj = js.Dynamic.literal(getForCurrentView = js.Any.fromFunction0(getForCurrentView))
  
    __obj.asInstanceOf[ISearchPaneStatics]
  }
}

