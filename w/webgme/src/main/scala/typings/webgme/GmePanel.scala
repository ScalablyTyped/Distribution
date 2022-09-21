package typings.webgme

import typings.webgme.Global_.GmeLogger
import typings.webgme.GmeConfig.LogOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GmePanel {
  
  trait Container extends StObject
  
  trait IActivePanel extends StObject {
    
    def getNodeID(): String
    
    def onActivate(): Unit
    
    def onDeactivate(): Unit
    
    def setActive(isActive: Boolean): Unit
  }
  object IActivePanel {
    
    inline def apply(
      getNodeID: () => String,
      onActivate: () => Unit,
      onDeactivate: () => Unit,
      setActive: Boolean => Unit
    ): IActivePanel = {
      val __obj = js.Dynamic.literal(getNodeID = js.Any.fromFunction0(getNodeID), onActivate = js.Any.fromFunction0(onActivate), onDeactivate = js.Any.fromFunction0(onDeactivate), setActive = js.Any.fromFunction1(setActive))
      __obj.asInstanceOf[IActivePanel]
    }
    
    extension [Self <: IActivePanel](x: Self) {
      
      inline def setGetNodeID(value: () => String): Self = StObject.set(x, "getNodeID", js.Any.fromFunction0(value))
      
      inline def setOnActivate(value: () => Unit): Self = StObject.set(x, "onActivate", js.Any.fromFunction0(value))
      
      inline def setOnDeactivate(value: () => Unit): Self = StObject.set(x, "onDeactivate", js.Any.fromFunction0(value))
      
      inline def setSetActive(value: Boolean => Unit): Self = StObject.set(x, "setActive", js.Any.fromFunction1(value))
    }
  }
  
  trait Layout extends StObject
  
  type LayoutCallback = js.Function1[/* self */ LayoutManager, Unit]
  
  trait LayoutManager extends StObject {
    
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
    
    inline def apply(
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
    
    extension [Self <: LayoutManager](x: Self) {
      
      inline def setAddPanel(value: (String, PanelBase, Container) => Unit): Self = StObject.set(x, "addPanel", js.Any.fromFunction3(value))
      
      inline def setLoadLayout(value: (Layout, LayoutCallback) => Unit): Self = StObject.set(x, "loadLayout", js.Any.fromFunction2(value))
      
      inline def setLoadPanel(value: (Params, LayoutCallback) => Unit): Self = StObject.set(x, "loadPanel", js.Any.fromFunction2(value))
      
      inline def setRemovePanel(value: String => Unit): Self = StObject.set(x, "removePanel", js.Any.fromFunction1(value))
      
      inline def setSetPanelReadOnly(value: Boolean => Unit): Self = StObject.set(x, "setPanelReadOnly", js.Any.fromFunction1(value))
      
      inline def set_currentLayout(value: Layout): Self = StObject.set(x, "_currentLayout", value.asInstanceOf[js.Any])
      
      inline def set_currentLayoutName(value: String): Self = StObject.set(x, "_currentLayoutName", value.asInstanceOf[js.Any])
      
      inline def set_logger(value: GmeLogger): Self = StObject.set(x, "_logger", value.asInstanceOf[js.Any])
      
      inline def set_panels(value: js.Array[PanelBase]): Self = StObject.set(x, "_panels", value.asInstanceOf[js.Any])
      
      inline def set_panelsVarargs(value: PanelBase*): Self = StObject.set(x, "_panels", js.Array(value*))
    }
  }
  
  trait Logger extends StObject {
    
    def createLogger(name: String, options: LogOptions): Logger
    
    def createWithGmeConfig(name: String, gmeConfig: typings.webgme.GmeConfig.GmeConfig): Logger
  }
  object Logger {
    
    inline def apply(
      createLogger: (String, LogOptions) => Logger,
      createWithGmeConfig: (String, typings.webgme.GmeConfig.GmeConfig) => Logger
    ): Logger = {
      val __obj = js.Dynamic.literal(createLogger = js.Any.fromFunction2(createLogger), createWithGmeConfig = js.Any.fromFunction2(createWithGmeConfig))
      __obj.asInstanceOf[Logger]
    }
    
    extension [Self <: Logger](x: Self) {
      
      inline def setCreateLogger(value: (String, LogOptions) => Logger): Self = StObject.set(x, "createLogger", js.Any.fromFunction2(value))
      
      inline def setCreateWithGmeConfig(value: (String, typings.webgme.GmeConfig.GmeConfig) => Logger): Self = StObject.set(x, "createWithGmeConfig", js.Any.fromFunction2(value))
    }
  }
  
  trait Options extends StObject {
    
    var LOGGER_INSTANCE_NAME: String
  }
  object Options {
    
    inline def apply(LOGGER_INSTANCE_NAME: String): Options = {
      val __obj = js.Dynamic.literal(LOGGER_INSTANCE_NAME = LOGGER_INSTANCE_NAME.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setLOGGER_INSTANCE_NAME(value: String): Self = StObject.set(x, "LOGGER_INSTANCE_NAME", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionsWithHeader
    extends StObject
       with Options {
    
    var FLOATING_TITLE: String
    
    var HEADER_TITLE: String
    
    var NO_SCROLLING: String
  }
  object OptionsWithHeader {
    
    inline def apply(FLOATING_TITLE: String, HEADER_TITLE: String, LOGGER_INSTANCE_NAME: String, NO_SCROLLING: String): OptionsWithHeader = {
      val __obj = js.Dynamic.literal(FLOATING_TITLE = FLOATING_TITLE.asInstanceOf[js.Any], HEADER_TITLE = HEADER_TITLE.asInstanceOf[js.Any], LOGGER_INSTANCE_NAME = LOGGER_INSTANCE_NAME.asInstanceOf[js.Any], NO_SCROLLING = NO_SCROLLING.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsWithHeader]
    }
    
    extension [Self <: OptionsWithHeader](x: Self) {
      
      inline def setFLOATING_TITLE(value: String): Self = StObject.set(x, "FLOATING_TITLE", value.asInstanceOf[js.Any])
      
      inline def setHEADER_TITLE(value: String): Self = StObject.set(x, "HEADER_TITLE", value.asInstanceOf[js.Any])
      
      inline def setNO_SCROLLING(value: String): Self = StObject.set(x, "NO_SCROLLING", value.asInstanceOf[js.Any])
    }
  }
  
  trait PanelBase extends StObject {
    
    var OPTIONS: Options
    
    def afterAppend(): Unit
    
    def clear(): Unit
    
    var control: Any
    
    def destroy(): Unit
    
    def isReadOnly(): Boolean
    
    var logger: GmeLogger
    
    def onReadOnlyChanged(isReadOnly: Boolean): Unit
    
    def onResize(width: Double, height: Double): Unit
    
    def setContainerUpdateFn(currentLayout: Layout, sizeUpdateFn: js.Function1[/* layout */ Layout, Double]): Unit
    
    def setReadOnly(isReadOnly: Boolean): Unit
    
    def setSize(width: Double, height: Double): Unit
  }
  object PanelBase {
    
    inline def apply(
      OPTIONS: Options,
      afterAppend: () => Unit,
      clear: () => Unit,
      control: Any,
      destroy: () => Unit,
      isReadOnly: () => Boolean,
      logger: GmeLogger,
      onReadOnlyChanged: Boolean => Unit,
      onResize: (Double, Double) => Unit,
      setContainerUpdateFn: (Layout, js.Function1[/* layout */ Layout, Double]) => Unit,
      setReadOnly: Boolean => Unit,
      setSize: (Double, Double) => Unit
    ): PanelBase = {
      val __obj = js.Dynamic.literal(OPTIONS = OPTIONS.asInstanceOf[js.Any], afterAppend = js.Any.fromFunction0(afterAppend), clear = js.Any.fromFunction0(clear), control = control.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), isReadOnly = js.Any.fromFunction0(isReadOnly), logger = logger.asInstanceOf[js.Any], onReadOnlyChanged = js.Any.fromFunction1(onReadOnlyChanged), onResize = js.Any.fromFunction2(onResize), setContainerUpdateFn = js.Any.fromFunction2(setContainerUpdateFn), setReadOnly = js.Any.fromFunction1(setReadOnly), setSize = js.Any.fromFunction2(setSize))
      __obj.asInstanceOf[PanelBase]
    }
    
    extension [Self <: PanelBase](x: Self) {
      
      inline def setAfterAppend(value: () => Unit): Self = StObject.set(x, "afterAppend", js.Any.fromFunction0(value))
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setControl(value: Any): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setIsReadOnly(value: () => Boolean): Self = StObject.set(x, "isReadOnly", js.Any.fromFunction0(value))
      
      inline def setLogger(value: GmeLogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setOPTIONS(value: Options): Self = StObject.set(x, "OPTIONS", value.asInstanceOf[js.Any])
      
      inline def setOnReadOnlyChanged(value: Boolean => Unit): Self = StObject.set(x, "onReadOnlyChanged", js.Any.fromFunction1(value))
      
      inline def setOnResize(value: (Double, Double) => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction2(value))
      
      inline def setSetContainerUpdateFn(value: (Layout, js.Function1[/* layout */ Layout, Double]) => Unit): Self = StObject.set(x, "setContainerUpdateFn", js.Any.fromFunction2(value))
      
      inline def setSetReadOnly(value: Boolean => Unit): Self = StObject.set(x, "setReadOnly", js.Any.fromFunction1(value))
      
      inline def setSetSize(value: (Double, Double) => Unit): Self = StObject.set(x, "setSize", js.Any.fromFunction2(value))
    }
  }
  
  trait PanelBaseWithHeader
    extends StObject
       with PanelBase {
    
    @JSName("OPTIONS")
    var OPTIONS_PanelBaseWithHeader: OptionsWithHeader
    
    def getNodeID(): String
    
    def initUI(options: OptionsWithHeader): Unit
    
    def setActive(isActive: Boolean): Unit
    
    def setTitle(text: String): Unit
  }
  object PanelBaseWithHeader {
    
    inline def apply(
      OPTIONS: OptionsWithHeader,
      afterAppend: () => Unit,
      clear: () => Unit,
      control: Any,
      destroy: () => Unit,
      getNodeID: () => String,
      initUI: OptionsWithHeader => Unit,
      isReadOnly: () => Boolean,
      logger: GmeLogger,
      onReadOnlyChanged: Boolean => Unit,
      onResize: (Double, Double) => Unit,
      setActive: Boolean => Unit,
      setContainerUpdateFn: (Layout, js.Function1[/* layout */ Layout, Double]) => Unit,
      setReadOnly: Boolean => Unit,
      setSize: (Double, Double) => Unit,
      setTitle: String => Unit
    ): PanelBaseWithHeader = {
      val __obj = js.Dynamic.literal(OPTIONS = OPTIONS.asInstanceOf[js.Any], afterAppend = js.Any.fromFunction0(afterAppend), clear = js.Any.fromFunction0(clear), control = control.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getNodeID = js.Any.fromFunction0(getNodeID), initUI = js.Any.fromFunction1(initUI), isReadOnly = js.Any.fromFunction0(isReadOnly), logger = logger.asInstanceOf[js.Any], onReadOnlyChanged = js.Any.fromFunction1(onReadOnlyChanged), onResize = js.Any.fromFunction2(onResize), setActive = js.Any.fromFunction1(setActive), setContainerUpdateFn = js.Any.fromFunction2(setContainerUpdateFn), setReadOnly = js.Any.fromFunction1(setReadOnly), setSize = js.Any.fromFunction2(setSize), setTitle = js.Any.fromFunction1(setTitle))
      __obj.asInstanceOf[PanelBaseWithHeader]
    }
    
    extension [Self <: PanelBaseWithHeader](x: Self) {
      
      inline def setGetNodeID(value: () => String): Self = StObject.set(x, "getNodeID", js.Any.fromFunction0(value))
      
      inline def setInitUI(value: OptionsWithHeader => Unit): Self = StObject.set(x, "initUI", js.Any.fromFunction1(value))
      
      inline def setOPTIONS(value: OptionsWithHeader): Self = StObject.set(x, "OPTIONS", value.asInstanceOf[js.Any])
      
      inline def setSetActive(value: Boolean => Unit): Self = StObject.set(x, "setActive", js.Any.fromFunction1(value))
      
      inline def setSetTitle(value: String => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    }
  }
  
  trait PanelManager extends StObject {
    
    def getActivePanel(): PanelBase
    
    def setActivePanel(panel: PanelBase): Unit
  }
  object PanelManager {
    
    inline def apply(getActivePanel: () => PanelBase, setActivePanel: PanelBase => Unit): PanelManager = {
      val __obj = js.Dynamic.literal(getActivePanel = js.Any.fromFunction0(getActivePanel), setActivePanel = js.Any.fromFunction1(setActivePanel))
      __obj.asInstanceOf[PanelManager]
    }
    
    extension [Self <: PanelManager](x: Self) {
      
      inline def setGetActivePanel(value: () => PanelBase): Self = StObject.set(x, "getActivePanel", js.Any.fromFunction0(value))
      
      inline def setSetActivePanel(value: PanelBase => Unit): Self = StObject.set(x, "setActivePanel", js.Any.fromFunction1(value))
    }
  }
  
  trait Params extends StObject {
    
    var client: Any
  }
  object Params {
    
    inline def apply(client: Any): Params = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params]
    }
    
    extension [Self <: Params](x: Self) {
      
      inline def setClient(value: Any): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    }
  }
}
