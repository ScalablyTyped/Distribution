package typings
package winrtLib.WindowsNs.UINs.ViewManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInputPaneStatics extends js.Object {
  def getForCurrentView(): InputPane
}

object IInputPaneStatics {
  @scala.inline
  def apply(getForCurrentView: js.Function0[InputPane]): IInputPaneStatics = {
    val __obj = js.Dynamic.literal(getForCurrentView = getForCurrentView)
  
    __obj.asInstanceOf[IInputPaneStatics]
  }
}

