package typings.webgme

import typings.webgme.Global_.GmeLogger
import typings.webgme.GmeConfig.LogOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GmePanel {
  
  @js.native
  trait Container extends StObject
  
  @js.native
  trait IActivePanel extends StObject {
    
    def getNodeID(): String = js.native
    
    def onActivate(): Unit = js.native
    
    def onDeactivate(): Unit = js.native
    
    def setActive(isActive: Boolean): Unit = js.native
  }
  object IActivePanel {
    
    @scala.inline
    def apply(
      getNodeID: () => String,
      onActivate: () => Unit,
      onDeactivate: () => Unit,
      setActive: Boolean => Unit
    ): IActivePanel = {
      val __obj = js.Dynamic.literal(getNodeID = js.Any.fromFunction0(getNodeID), onActivate = js.Any.fromFunction0(onActivate), onDeactivate = js.Any.fromFunction0(onDeactivate), setActive = js.Any.fromFunction1(setActive))
      __obj.asInstanceOf[IActivePanel]
    }
    
    @scala.inline
    implicit class IActivePanelMutableBuilder[Self <: IActivePanel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetNodeID(value: () => String): Self = StObject.set(x, "getNodeID", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnActivate(value: () => Unit): Self = StObject.set(x, "onActivate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDeactivate(value: () => Unit): Self = StObject.set(x, "onDeactivate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetActive(value: Boolean => Unit): Self = StObject.set(x, "setActive", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Layout extends StObject
  
  type LayoutCallback = js.Function1[/* self */ LayoutManager, Unit]
  
  @js.native
  trait LayoutManager extends StObject {
    
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
    implicit class LayoutManagerMutableBuilder[Self <: LayoutManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddPanel(value: (String, PanelBase, Container) => Unit): Self = StObject.set(x, "addPanel", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLoadLayout(value: (Layout, LayoutCallback) => Unit): Self = StObject.set(x, "loadLayout", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoadPanel(value: (Params, LayoutCallback) => Unit): Self = StObject.set(x, "loadPanel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemovePanel(value: String => Unit): Self = StObject.set(x, "removePanel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetPanelReadOnly(value: Boolean => Unit): Self = StObject.set(x, "setPanelReadOnly", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_currentLayout(value: Layout): Self = StObject.set(x, "_currentLayout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_currentLayoutName(value: String): Self = StObject.set(x, "_currentLayoutName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_logger(value: GmeLogger): Self = StObject.set(x, "_logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_panels(value: js.Array[PanelBase]): Self = StObject.set(x, "_panels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_panelsVarargs(value: PanelBase*): Self = StObject.set(x, "_panels", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Logger extends StObject {
    
    def createLogger(name: String, options: LogOptions): Logger = js.native
    
    def createWithGmeConfig(name: String, gmeConfig: typings.webgme.GmeConfig.GmeConfig): Logger = js.native
  }
  object Logger {
    
    @scala.inline
    def apply(
      createLogger: (String, LogOptions) => Logger,
      createWithGmeConfig: (String, typings.webgme.GmeConfig.GmeConfig) => Logger
    ): Logger = {
      val __obj = js.Dynamic.literal(createLogger = js.Any.fromFunction2(createLogger), createWithGmeConfig = js.Any.fromFunction2(createWithGmeConfig))
      __obj.asInstanceOf[Logger]
    }
    
    @scala.inline
    implicit class LoggerMutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateLogger(value: (String, LogOptions) => Logger): Self = StObject.set(x, "createLogger", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCreateWithGmeConfig(value: (String, typings.webgme.GmeConfig.GmeConfig) => Logger): Self = StObject.set(x, "createWithGmeConfig", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var LOGGER_INSTANCE_NAME: String = js.native
  }
  object Options {
    
    @scala.inline
    def apply(LOGGER_INSTANCE_NAME: String): Options = {
      val __obj = js.Dynamic.literal(LOGGER_INSTANCE_NAME = LOGGER_INSTANCE_NAME.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLOGGER_INSTANCE_NAME(value: String): Self = StObject.set(x, "LOGGER_INSTANCE_NAME", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OptionsWithHeader extends Options {
    
    var FLOATING_TITLE: String = js.native
    
    var HEADER_TITLE: String = js.native
    
    var NO_SCROLLING: String = js.native
  }
  object OptionsWithHeader {
    
    @scala.inline
    def apply(FLOATING_TITLE: String, HEADER_TITLE: String, LOGGER_INSTANCE_NAME: String, NO_SCROLLING: String): OptionsWithHeader = {
      val __obj = js.Dynamic.literal(FLOATING_TITLE = FLOATING_TITLE.asInstanceOf[js.Any], HEADER_TITLE = HEADER_TITLE.asInstanceOf[js.Any], LOGGER_INSTANCE_NAME = LOGGER_INSTANCE_NAME.asInstanceOf[js.Any], NO_SCROLLING = NO_SCROLLING.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsWithHeader]
    }
    
    @scala.inline
    implicit class OptionsWithHeaderMutableBuilder[Self <: OptionsWithHeader] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFLOATING_TITLE(value: String): Self = StObject.set(x, "FLOATING_TITLE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHEADER_TITLE(value: String): Self = StObject.set(x, "HEADER_TITLE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNO_SCROLLING(value: String): Self = StObject.set(x, "NO_SCROLLING", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PanelBase extends StObject {
    
    var OPTIONS: Options = js.native
    
    def afterAppend(): Unit = js.native
    
    def clear(): Unit = js.native
    
    var control: js.Any = js.native
    
    def destroy(): Unit = js.native
    
    def isReadOnly(): Boolean = js.native
    
    var logger: GmeLogger = js.native
    
    def onReadOnlyChanged(isReadOnly: Boolean): Unit = js.native
    
    def onResize(width: Double, height: Double): Unit = js.native
    
    def setContainerUpdateFn(currentLayout: Layout, sizeUpdateFn: js.Function1[/* layout */ Layout, Double]): Unit = js.native
    
    def setReadOnly(isReadOnly: Boolean): Unit = js.native
    
    def setSize(width: Double, height: Double): Unit = js.native
  }
  object PanelBase {
    
    @scala.inline
    def apply(
      OPTIONS: Options,
      afterAppend: () => Unit,
      clear: () => Unit,
      control: js.Any,
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
    
    @scala.inline
    implicit class PanelBaseMutableBuilder[Self <: PanelBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterAppend(value: () => Unit): Self = StObject.set(x, "afterAppend", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setControl(value: js.Any): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsReadOnly(value: () => Boolean): Self = StObject.set(x, "isReadOnly", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLogger(value: GmeLogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOPTIONS(value: Options): Self = StObject.set(x, "OPTIONS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnReadOnlyChanged(value: Boolean => Unit): Self = StObject.set(x, "onReadOnlyChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResize(value: (Double, Double) => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetContainerUpdateFn(value: (Layout, js.Function1[/* layout */ Layout, Double]) => Unit): Self = StObject.set(x, "setContainerUpdateFn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetReadOnly(value: Boolean => Unit): Self = StObject.set(x, "setReadOnly", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSize(value: (Double, Double) => Unit): Self = StObject.set(x, "setSize", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait PanelBaseWithHeader extends PanelBase {
    
    @JSName("OPTIONS")
    var OPTIONS_PanelBaseWithHeader: OptionsWithHeader = js.native
    
    def getNodeID(): String = js.native
    
    def initUI(options: OptionsWithHeader): Unit = js.native
    
    def setActive(isActive: Boolean): Unit = js.native
    
    def setTitle(text: String): Unit = js.native
  }
  object PanelBaseWithHeader {
    
    @scala.inline
    def apply(
      OPTIONS: OptionsWithHeader,
      afterAppend: () => Unit,
      clear: () => Unit,
      control: js.Any,
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
    
    @scala.inline
    implicit class PanelBaseWithHeaderMutableBuilder[Self <: PanelBaseWithHeader] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetNodeID(value: () => String): Self = StObject.set(x, "getNodeID", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInitUI(value: OptionsWithHeader => Unit): Self = StObject.set(x, "initUI", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOPTIONS(value: OptionsWithHeader): Self = StObject.set(x, "OPTIONS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetActive(value: Boolean => Unit): Self = StObject.set(x, "setActive", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTitle(value: String => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait PanelManager extends StObject {
    
    def getActivePanel(): PanelBase = js.native
    
    def setActivePanel(panel: PanelBase): Unit = js.native
  }
  object PanelManager {
    
    @scala.inline
    def apply(getActivePanel: () => PanelBase, setActivePanel: PanelBase => Unit): PanelManager = {
      val __obj = js.Dynamic.literal(getActivePanel = js.Any.fromFunction0(getActivePanel), setActivePanel = js.Any.fromFunction1(setActivePanel))
      __obj.asInstanceOf[PanelManager]
    }
    
    @scala.inline
    implicit class PanelManagerMutableBuilder[Self <: PanelManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetActivePanel(value: () => PanelBase): Self = StObject.set(x, "getActivePanel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetActivePanel(value: PanelBase => Unit): Self = StObject.set(x, "setActivePanel", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Params extends StObject {
    
    var client: js.Any = js.native
  }
  object Params {
    
    @scala.inline
    def apply(client: js.Any): Params = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params]
    }
    
    @scala.inline
    implicit class ParamsMutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: js.Any): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    }
  }
}
