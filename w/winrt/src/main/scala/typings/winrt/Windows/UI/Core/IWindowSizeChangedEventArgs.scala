package typings.winrt.Windows.UI.Core

import typings.winrt.Windows.Foundation.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWindowSizeChangedEventArgs extends ICoreWindowEventArgs {
  var size: Size
}

object IWindowSizeChangedEventArgs {
  @scala.inline
  def apply(handled: Boolean, size: Size): IWindowSizeChangedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWindowSizeChangedEventArgs]
  }
}

