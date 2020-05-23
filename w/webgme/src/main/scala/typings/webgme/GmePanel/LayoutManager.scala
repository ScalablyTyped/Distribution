package typings.webgme.GmePanel

import typings.webgme.Global_.GmeLogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutManager extends js.Object {
  var _currentLayout: Layout
  var _currentLayoutName: String
  var _logger: GmeLogger
  var _panels: js.Array[PanelBase]
  def addPanel(name: String, panel: PanelBase, container: Container): Unit
  def loadLayout(layout: Layout, callback: LayoutCallback): Unit
  def loadPanel(params: Params, callback: LayoutCallback): Unit
  def removePanel(name: String): Unit
  def setPanelReadOnly(readOnly: Boolean): Unit
}

object LayoutManager {
  @scala.inline
  def apply(
    _currentLayout: Layout,
    _currentLayoutName: String,
    _logger: GmeLogger,
    _panels: js.Array[PanelBase],
    addPanel: (String, PanelBase, Container) => Unit,
    loadLayout: (Layout, LayoutCallback) => Unit,
    loadPanel: (Params, LayoutCallback) => Unit,
    removePanel: String => Unit,
    setPanelReadOnly: Boolean => Unit
  ): LayoutManager = {
    val __obj = js.Dynamic.literal(_currentLayout = _currentLayout.asInstanceOf[js.Any], _currentLayoutName = _currentLayoutName.asInstanceOf[js.Any], _logger = _logger.asInstanceOf[js.Any], _panels = _panels.asInstanceOf[js.Any], addPanel = js.Any.fromFunction3(addPanel), loadLayout = js.Any.fromFunction2(loadLayout), loadPanel = js.Any.fromFunction2(loadPanel), removePanel = js.Any.fromFunction1(removePanel), setPanelReadOnly = js.Any.fromFunction1(setPanelReadOnly))
    __obj.asInstanceOf[LayoutManager]
  }
}

