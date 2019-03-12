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
  def apply(setDesiredSize: winrtLib.WindowsNs.FoundationNs.Size => scala.Unit): ICoreWindowPopupShowingEventArgs = {
    val __obj = js.Dynamic.literal(setDesiredSize = js.Any.fromFunction1(setDesiredSize))
  
    __obj.asInstanceOf[ICoreWindowPopupShowingEventArgs]
  }
}

