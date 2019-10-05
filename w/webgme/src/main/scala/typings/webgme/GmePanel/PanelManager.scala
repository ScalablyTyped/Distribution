package typings.webgme.GmePanel

import typings.webgme.Gme.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GmePanel.PanelManager")
@js.native
class PanelManager protected () extends js.Object {
  def this(client: Client) = this()
  def getActivePanel(): PanelBase = js.native
  def setActivePanel(panel: PanelBase): Unit = js.native
}

