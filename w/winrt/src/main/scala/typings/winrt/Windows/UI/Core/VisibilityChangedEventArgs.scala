package typings.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VisibilityChangedEventArgs extends IVisibilityChangedEventArgs

object VisibilityChangedEventArgs {
  @scala.inline
  def apply(handled: Boolean, visible: Boolean): VisibilityChangedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisibilityChangedEventArgs]
  }
}

