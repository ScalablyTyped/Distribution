package typings.webgme.GmePanelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GmePanel.PanelBaseWithHeader")
@js.native
class PanelBaseWithHeader protected () extends PanelBase {
  def this(options: OptionsWithHeader, layoutManger: LayoutManager) = this()
  @JSName("OPTIONS")
  var OPTIONS_PanelBaseWithHeader: OptionsWithHeader = js.native
  def getNodeID(): String = js.native
  def initUI(options: OptionsWithHeader): Unit = js.native
  def setActive(isActive: Boolean): Unit = js.native
  def setTitle(text: String): Unit = js.native
}

