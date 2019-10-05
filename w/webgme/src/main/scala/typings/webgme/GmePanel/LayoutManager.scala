package typings.webgme.GmePanel

import typings.webgme.Global.GmeLogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GmePanel.LayoutManager")
@js.native
class LayoutManager () extends js.Object {
  var _currentLayout: Layout = js.native
  var _currentLayoutName: String = js.native
  var _logger: GmeLogger = js.native
  var _panels: js.Array[PanelBase] = js.native
  def addPanel(name: String, panel: PanelBase, container: Container): Unit = js.native
  def loadLayout(layout: Layout, callback: LayoutCallback): Unit = js.native
  def loadPanel(params: Params, callback: LayoutCallback): Unit = js.native
  def removePanel(name: String): Unit = js.native
  def setPanelReadOnly(readOnly: Boolean): Unit = js.native
}

