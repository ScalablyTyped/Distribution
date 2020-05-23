package typings.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputEnabledEventArgs extends IInputEnabledEventArgs

object InputEnabledEventArgs {
  @scala.inline
  def apply(handled: Boolean, inputEnabled: Boolean): InputEnabledEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], inputEnabled = inputEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputEnabledEventArgs]
  }
}

