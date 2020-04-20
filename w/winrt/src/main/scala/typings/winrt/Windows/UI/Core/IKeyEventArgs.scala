package typings.winrt.Windows.UI.Core

import typings.winrt.Windows.System.VirtualKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyEventArgs extends ICoreWindowEventArgs {
  var keyStatus: CorePhysicalKeyStatus
  var virtualKey: VirtualKey
}

object IKeyEventArgs {
  @scala.inline
  def apply(handled: Boolean, keyStatus: CorePhysicalKeyStatus, virtualKey: VirtualKey): IKeyEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], keyStatus = keyStatus.asInstanceOf[js.Any], virtualKey = virtualKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyEventArgs]
  }
}

