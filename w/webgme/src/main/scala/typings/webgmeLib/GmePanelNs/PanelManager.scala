package typings
package webgmeLib.GmePanelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GmePanel.PanelManager")
@js.native
class PanelManager protected () extends js.Object {
  def this(client: webgmeLib.GmeNs.Client) = this()
  def getActivePanel(): PanelBase = js.native
  def setActivePanel(panel: PanelBase): scala.Unit = js.native
}

