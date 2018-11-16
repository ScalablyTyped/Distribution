package typings
package webgmeLib.GmePanelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GmePanel.LayoutManager")
@js.native
class LayoutManager () extends js.Object {
  var _currentLayout: Layout = js.native
  var _currentLayoutName: java.lang.String = js.native
  var _logger: webgmeLib.GlobalNs.GmeLogger = js.native
  var _panels: js.Array[PanelBase] = js.native
  def addPanel(name: java.lang.String, panel: PanelBase, container: Container): scala.Unit = js.native
  def loadLayout(layout: Layout, callback: LayoutCallback): scala.Unit = js.native
  def loadPanel(params: Params, callback: LayoutCallback): scala.Unit = js.native
  def removePanel(name: java.lang.String): scala.Unit = js.native
  def setPanelReadOnly(readOnly: scala.Boolean): scala.Unit = js.native
}

