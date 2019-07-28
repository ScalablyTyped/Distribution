package typings.webgme.GmePanelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GmePanel.IActivePanel")
@js.native
class IActivePanel () extends js.Object {
  def getNodeID(): String = js.native
  def onActivate(): Unit = js.native
  def onDeactivate(): Unit = js.native
  def setActive(isActive: Boolean): Unit = js.native
}

