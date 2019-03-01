package typings
package winrtLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreWindowPopupShowingEventArgs extends js.Object {
  def setDesiredSize(value: winrtLib.WindowsNs.FoundationNs.Size): scala.Unit
}

object ICoreWindowPopupShowingEventArgs {
  @scala.inline
  def apply(setDesiredSize: js.Function1[winrtLib.WindowsNs.FoundationNs.Size, scala.Unit]): ICoreWindowPopupShowingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setDesiredSize")(setDesiredSize)
    __obj.asInstanceOf[ICoreWindowPopupShowingEventArgs]
  }
}

