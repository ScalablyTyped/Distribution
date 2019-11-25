package typings.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICharacterReceivedEventArgs extends ICoreWindowEventArgs {
  var keyCode: Double
  var keyStatus: CorePhysicalKeyStatus
}

object ICharacterReceivedEventArgs {
  @scala.inline
  def apply(handled: Boolean, keyCode: Double, keyStatus: CorePhysicalKeyStatus): ICharacterReceivedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], keyStatus = keyStatus.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICharacterReceivedEventArgs]
  }
}

