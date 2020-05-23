package typings.webgme.GmePanel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelManager extends js.Object {
  def getActivePanel(): PanelBase
  def setActivePanel(panel: PanelBase): Unit
}

object PanelManager {
  @scala.inline
  def apply(getActivePanel: () => PanelBase, setActivePanel: PanelBase => Unit): PanelManager = {
    val __obj = js.Dynamic.literal(getActivePanel = js.Any.fromFunction0(getActivePanel), setActivePanel = js.Any.fromFunction1(setActivePanel))
    __obj.asInstanceOf[PanelManager]
  }
}

