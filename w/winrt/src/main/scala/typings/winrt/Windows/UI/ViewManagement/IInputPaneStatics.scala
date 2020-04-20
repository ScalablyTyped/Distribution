package typings.winrt.Windows.UI.ViewManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInputPaneStatics extends js.Object {
  def getForCurrentView(): InputPane
}

object IInputPaneStatics {
  @scala.inline
  def apply(getForCurrentView: () => InputPane): IInputPaneStatics = {
    val __obj = js.Dynamic.literal(getForCurrentView = js.Any.fromFunction0(getForCurrentView))
    __obj.asInstanceOf[IInputPaneStatics]
  }
}

