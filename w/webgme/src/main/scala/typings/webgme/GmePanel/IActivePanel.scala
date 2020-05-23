package typings.webgme.GmePanel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActivePanel extends js.Object {
  def getNodeID(): String
  def onActivate(): Unit
  def onDeactivate(): Unit
  def setActive(isActive: Boolean): Unit
}

object IActivePanel {
  @scala.inline
  def apply(
    getNodeID: () => String,
    onActivate: () => Unit,
    onDeactivate: () => Unit,
    setActive: Boolean => Unit
  ): IActivePanel = {
    val __obj = js.Dynamic.literal(getNodeID = js.Any.fromFunction0(getNodeID), onActivate = js.Any.fromFunction0(onActivate), onDeactivate = js.Any.fromFunction0(onDeactivate), setActive = js.Any.fromFunction1(setActive))
    __obj.asInstanceOf[IActivePanel]
  }
}

