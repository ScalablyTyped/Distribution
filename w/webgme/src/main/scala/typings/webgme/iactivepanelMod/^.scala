package typings.webgme.iactivepanelMod

import typings.webgme.GmePanel.IActivePanel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js/PanelManager/IActivePanel", JSImport.Namespace)
@js.native
class ^ () extends IActivePanel {
  /* CompleteClass */
  override def getNodeID(): String = js.native
  /* CompleteClass */
  override def onActivate(): Unit = js.native
  /* CompleteClass */
  override def onDeactivate(): Unit = js.native
  /* CompleteClass */
  override def setActive(isActive: Boolean): Unit = js.native
}

