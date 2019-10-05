package typings.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVisibilityChangedEventArgs extends ICoreWindowEventArgs {
  var visible: Boolean
}

object IVisibilityChangedEventArgs {
  @scala.inline
  def apply(handled: Boolean, visible: Boolean): IVisibilityChangedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled, visible = visible)
  
    __obj.asInstanceOf[IVisibilityChangedEventArgs]
  }
}

