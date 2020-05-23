package typings.winrtUwp.Windows.ApplicationModel.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a visibilitychanged event that is associated with a searchPane object. */
trait SearchPaneVisibilityChangedEventArgs extends js.Object {
  /** Indicates whether the search pane is open. */
  var visible: Boolean
}

object SearchPaneVisibilityChangedEventArgs {
  @scala.inline
  def apply(visible: Boolean): SearchPaneVisibilityChangedEventArgs = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPaneVisibilityChangedEventArgs]
  }
}

