package typings.winrt.WindowsNs.UINs.CoreNs

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
    val __obj = js.Dynamic.literal(handled = handled, keyCode = keyCode, keyStatus = keyStatus)
  
    __obj.asInstanceOf[ICharacterReceivedEventArgs]
  }
}

