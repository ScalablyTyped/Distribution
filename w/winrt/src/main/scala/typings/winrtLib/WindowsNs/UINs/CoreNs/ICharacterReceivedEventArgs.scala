package typings
package winrtLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICharacterReceivedEventArgs extends ICoreWindowEventArgs {
  var keyCode: scala.Double
  var keyStatus: CorePhysicalKeyStatus
}

object ICharacterReceivedEventArgs {
  @scala.inline
  def apply(handled: scala.Boolean, keyCode: scala.Double, keyStatus: CorePhysicalKeyStatus): ICharacterReceivedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled, keyCode = keyCode, keyStatus = keyStatus)
  
    __obj.asInstanceOf[ICharacterReceivedEventArgs]
  }
}

