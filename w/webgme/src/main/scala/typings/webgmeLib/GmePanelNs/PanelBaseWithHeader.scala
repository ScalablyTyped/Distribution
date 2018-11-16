package typings
package webgmeLib.GmePanelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GmePanel.PanelBaseWithHeader")
@js.native
class PanelBaseWithHeader protected () extends PanelBase {
  def this(options: OptionsWithHeader, layoutManger: LayoutManager) = this()
  @JSName("OPTIONS")
  var OPTIONS_PanelBaseWithHeader: OptionsWithHeader = js.native
  def getNodeID(): java.lang.String = js.native
  def initUI(options: OptionsWithHeader): scala.Unit = js.native
  def setActive(isActive: scala.Boolean): scala.Unit = js.native
  def setTitle(text: java.lang.String): scala.Unit = js.native
}

