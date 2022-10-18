package typings.wordpressAdmin.anon

import org.scalablytyped.runtime.StringDictionary
import typings.lodash.mod.TemplateExecutor
import typings.wordpressAdmin.componentsMediaViewsMod.MediaFrame
import typings.wordpressAdmin.componentsMediaViewsMod.UploaderWindow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attach extends StObject {
  
  def attach(): MediaFrame
  
  // Object properties
  var className: String
  
  def close(): MediaFrame
  
  def createIframeStates(options: Any): Unit
  
  def createMenu(menu: Any): Unit
  
  def createRouter(router: Any): Unit
  
  def createTitle(title: Any): Unit
  
  def createToolbar(toolbar: Any): Unit
  
  def detach(): MediaFrame
  
  def escape(): MediaFrame
  
  var events: StringDictionary[String]
  
  def hijackThickbox(): Unit
  
  def iframeContent(content: Any): Unit
  
  def iframeContentCleanup(): Unit
  
  def iframeMenu(view: Any): Unit
  
  var modal: Any
  
  def open(): MediaFrame
  
  var options: StringDictionary[Any]
  
  var regions: js.Array[String]
  
  def render(): MediaFrame
  
  def restoreThickbox(): Unit
  
  // Object methods
  /**
    * Sets the attributes to be used on the menu ARIA tab panel.
    */
  def setMenuTabPanelAriaAttributes(): Unit
  
  /**
    * Sets the attributes to be used on the router ARIA tab panel.
    */
  def setRouterTabPanelAriaAttributes(): Unit
  
  def template(): String
  def template(data: js.Object): String
  @JSName("template")
  var template_Original: TemplateExecutor
  
  def toggleMenu(event: Any): Unit
  
  var uploader: UploaderWindow
}
object Attach {
  
  inline def apply(
    attach: () => MediaFrame,
    className: String,
    close: () => MediaFrame,
    createIframeStates: Any => Unit,
    createMenu: Any => Unit,
    createRouter: Any => Unit,
    createTitle: Any => Unit,
    createToolbar: Any => Unit,
    detach: () => MediaFrame,
    escape: () => MediaFrame,
    events: StringDictionary[String],
    hijackThickbox: () => Unit,
    iframeContent: Any => Unit,
    iframeContentCleanup: () => Unit,
    iframeMenu: Any => Unit,
    modal: Any,
    open: () => MediaFrame,
    options: StringDictionary[Any],
    regions: js.Array[String],
    render: () => MediaFrame,
    restoreThickbox: () => Unit,
    setMenuTabPanelAriaAttributes: () => Unit,
    setRouterTabPanelAriaAttributes: () => Unit,
    template: TemplateExecutor,
    toggleMenu: Any => Unit,
    uploader: UploaderWindow
  ): Attach = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction0(attach), className = className.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), createIframeStates = js.Any.fromFunction1(createIframeStates), createMenu = js.Any.fromFunction1(createMenu), createRouter = js.Any.fromFunction1(createRouter), createTitle = js.Any.fromFunction1(createTitle), createToolbar = js.Any.fromFunction1(createToolbar), detach = js.Any.fromFunction0(detach), escape = js.Any.fromFunction0(escape), events = events.asInstanceOf[js.Any], hijackThickbox = js.Any.fromFunction0(hijackThickbox), iframeContent = js.Any.fromFunction1(iframeContent), iframeContentCleanup = js.Any.fromFunction0(iframeContentCleanup), iframeMenu = js.Any.fromFunction1(iframeMenu), modal = modal.asInstanceOf[js.Any], open = js.Any.fromFunction0(open), options = options.asInstanceOf[js.Any], regions = regions.asInstanceOf[js.Any], render = js.Any.fromFunction0(render), restoreThickbox = js.Any.fromFunction0(restoreThickbox), setMenuTabPanelAriaAttributes = js.Any.fromFunction0(setMenuTabPanelAriaAttributes), setRouterTabPanelAriaAttributes = js.Any.fromFunction0(setRouterTabPanelAriaAttributes), template = template.asInstanceOf[js.Any], toggleMenu = js.Any.fromFunction1(toggleMenu), uploader = uploader.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attach]
  }
  
  extension [Self <: Attach](x: Self) {
    
    inline def setAttach(value: () => MediaFrame): Self = StObject.set(x, "attach", js.Any.fromFunction0(value))
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClose(value: () => MediaFrame): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setCreateIframeStates(value: Any => Unit): Self = StObject.set(x, "createIframeStates", js.Any.fromFunction1(value))
    
    inline def setCreateMenu(value: Any => Unit): Self = StObject.set(x, "createMenu", js.Any.fromFunction1(value))
    
    inline def setCreateRouter(value: Any => Unit): Self = StObject.set(x, "createRouter", js.Any.fromFunction1(value))
    
    inline def setCreateTitle(value: Any => Unit): Self = StObject.set(x, "createTitle", js.Any.fromFunction1(value))
    
    inline def setCreateToolbar(value: Any => Unit): Self = StObject.set(x, "createToolbar", js.Any.fromFunction1(value))
    
    inline def setDetach(value: () => MediaFrame): Self = StObject.set(x, "detach", js.Any.fromFunction0(value))
    
    inline def setEscape(value: () => MediaFrame): Self = StObject.set(x, "escape", js.Any.fromFunction0(value))
    
    inline def setEvents(value: StringDictionary[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setHijackThickbox(value: () => Unit): Self = StObject.set(x, "hijackThickbox", js.Any.fromFunction0(value))
    
    inline def setIframeContent(value: Any => Unit): Self = StObject.set(x, "iframeContent", js.Any.fromFunction1(value))
    
    inline def setIframeContentCleanup(value: () => Unit): Self = StObject.set(x, "iframeContentCleanup", js.Any.fromFunction0(value))
    
    inline def setIframeMenu(value: Any => Unit): Self = StObject.set(x, "iframeMenu", js.Any.fromFunction1(value))
    
    inline def setModal(value: Any): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: () => MediaFrame): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    
    inline def setOptions(value: StringDictionary[Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setRegions(value: js.Array[String]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    inline def setRegionsVarargs(value: String*): Self = StObject.set(x, "regions", js.Array(value*))
    
    inline def setRender(value: () => MediaFrame): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
    
    inline def setRestoreThickbox(value: () => Unit): Self = StObject.set(x, "restoreThickbox", js.Any.fromFunction0(value))
    
    inline def setSetMenuTabPanelAriaAttributes(value: () => Unit): Self = StObject.set(x, "setMenuTabPanelAriaAttributes", js.Any.fromFunction0(value))
    
    inline def setSetRouterTabPanelAriaAttributes(value: () => Unit): Self = StObject.set(x, "setRouterTabPanelAriaAttributes", js.Any.fromFunction0(value))
    
    inline def setTemplate(value: TemplateExecutor): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setToggleMenu(value: Any => Unit): Self = StObject.set(x, "toggleMenu", js.Any.fromFunction1(value))
    
    inline def setUploader(value: UploaderWindow): Self = StObject.set(x, "uploader", value.asInstanceOf[js.Any])
  }
}
