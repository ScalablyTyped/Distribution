package typings.winrt.WindowsNs.ApplicationModelNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchPaneVisibilityChangedEventArgs extends js.Object {
  var visible: Boolean
}

object ISearchPaneVisibilityChangedEventArgs {
  @scala.inline
  def apply(visible: Boolean): ISearchPaneVisibilityChangedEventArgs = {
    val __obj = js.Dynamic.literal(visible = visible)
  
    __obj.asInstanceOf[ISearchPaneVisibilityChangedEventArgs]
  }
}

