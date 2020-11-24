package typings.webgme.GmePanel

import typings.webgme.Global_.GmeLogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayoutManager extends js.Object {
  
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
  
  @scala.inline
  implicit class LayoutManagerOps[Self <: LayoutManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_currentLayout(value: Layout): Self = this.set("_currentLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_currentLayoutName(value: String): Self = this.set("_currentLayoutName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_logger(value: GmeLogger): Self = this.set("_logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_panelsVarargs(value: PanelBase*): Self = this.set("_panels", js.Array(value :_*))
    
    @scala.inline
    def set_panels(value: js.Array[PanelBase]): Self = this.set("_panels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddPanel(value: (String, PanelBase, Container) => Unit): Self = this.set("addPanel", js.Any.fromFunction3(value))
    
    @scala.inline
    def setLoadLayout(value: (Layout, LayoutCallback) => Unit): Self = this.set("loadLayout", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLoadPanel(value: (Params, LayoutCallback) => Unit): Self = this.set("loadPanel", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemovePanel(value: String => Unit): Self = this.set("removePanel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPanelReadOnly(value: Boolean => Unit): Self = this.set("setPanelReadOnly", js.Any.fromFunction1(value))
  }
}
