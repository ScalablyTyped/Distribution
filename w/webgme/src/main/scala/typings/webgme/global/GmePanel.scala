package typings.webgme.global

import typings.webgme.Global_.GmeLogger
import typings.webgme.Gme.Client
import typings.webgme.GmeConfig.LogOptions
import typings.webgme.GmePanel.Container
import typings.webgme.GmePanel.LayoutCallback
import typings.webgme.GmePanel.Options
import typings.webgme.GmePanel.OptionsWithHeader
import typings.webgme.GmePanel.Params
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GmePanel")
@js.native
object GmePanel extends js.Object {
  @js.native
  class IActivePanel ()
    extends typings.webgme.GmePanel.IActivePanel {
    /* CompleteClass */
    override def getNodeID(): String = js.native
    /* CompleteClass */
    override def onActivate(): Unit = js.native
    /* CompleteClass */
    override def onDeactivate(): Unit = js.native
    /* CompleteClass */
    override def setActive(isActive: Boolean): Unit = js.native
  }
  
  @js.native
  class Layout ()
    extends typings.webgme.GmePanel.Layout
  
  @js.native
  class LayoutManager ()
    extends typings.webgme.GmePanel.LayoutManager {
    /* CompleteClass */
    override var _currentLayout: typings.webgme.GmePanel.Layout = js.native
    /* CompleteClass */
    override var _currentLayoutName: String = js.native
    /* CompleteClass */
    override var _logger: GmeLogger = js.native
    /* CompleteClass */
    override var _panels: js.Array[typings.webgme.GmePanel.PanelBase] = js.native
    /* CompleteClass */
    override def addPanel(name: String, panel: typings.webgme.GmePanel.PanelBase, container: Container): Unit = js.native
    /* CompleteClass */
    override def loadLayout(layout: typings.webgme.GmePanel.Layout, callback: LayoutCallback): Unit = js.native
    /* CompleteClass */
    override def loadPanel(params: Params, callback: LayoutCallback): Unit = js.native
    /* CompleteClass */
    override def removePanel(name: String): Unit = js.native
    /* CompleteClass */
    override def setPanelReadOnly(readOnly: Boolean): Unit = js.native
  }
  
  @js.native
  class Logger ()
    extends typings.webgme.GmePanel.Logger {
    /* CompleteClass */
    override def createLogger(name: String, options: LogOptions): typings.webgme.GmePanel.Logger = js.native
    /* CompleteClass */
    override def createWithGmeConfig(name: String, gmeConfig: typings.webgme.GmeConfig.GmeConfig): typings.webgme.GmePanel.Logger = js.native
  }
  
  @js.native
  class PanelBase protected ()
    extends typings.webgme.GmePanel.PanelBase {
    def this(options: Options) = this()
    /* CompleteClass */
    override var OPTIONS: Options = js.native
    /* CompleteClass */
    override var control: js.Any = js.native
    /* CompleteClass */
    override var logger: GmeLogger = js.native
    /* CompleteClass */
    override def afterAppend(): Unit = js.native
    /* CompleteClass */
    override def clear(): Unit = js.native
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /* CompleteClass */
    override def isReadOnly(): Boolean = js.native
    /* CompleteClass */
    override def onReadOnlyChanged(isReadOnly: Boolean): Unit = js.native
    /* CompleteClass */
    override def onResize(width: Double, height: Double): Unit = js.native
    /* CompleteClass */
    override def setContainerUpdateFn(
      currentLayout: typings.webgme.GmePanel.Layout,
      sizeUpdateFn: js.Function1[/* layout */ typings.webgme.GmePanel.Layout, Double]
    ): Unit = js.native
    /* CompleteClass */
    override def setReadOnly(isReadOnly: Boolean): Unit = js.native
    /* CompleteClass */
    override def setSize(width: Double, height: Double): Unit = js.native
  }
  
  @js.native
  class PanelBaseWithHeader protected ()
    extends typings.webgme.GmePanel.PanelBaseWithHeader {
    def this(options: OptionsWithHeader, layoutManger: typings.webgme.GmePanel.LayoutManager) = this()
    /* CompleteClass */
    override var OPTIONS: Options = js.native
    /* CompleteClass */
    @JSName("OPTIONS")
    override var OPTIONS_PanelBaseWithHeader: OptionsWithHeader = js.native
    /* CompleteClass */
    override var control: js.Any = js.native
    /* CompleteClass */
    override var logger: GmeLogger = js.native
    /* CompleteClass */
    override def afterAppend(): Unit = js.native
    /* CompleteClass */
    override def clear(): Unit = js.native
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /* CompleteClass */
    override def getNodeID(): String = js.native
    /* CompleteClass */
    override def initUI(options: OptionsWithHeader): Unit = js.native
    /* CompleteClass */
    override def isReadOnly(): Boolean = js.native
    /* CompleteClass */
    override def onReadOnlyChanged(isReadOnly: Boolean): Unit = js.native
    /* CompleteClass */
    override def onResize(width: Double, height: Double): Unit = js.native
    /* CompleteClass */
    override def setActive(isActive: Boolean): Unit = js.native
    /* CompleteClass */
    override def setContainerUpdateFn(
      currentLayout: typings.webgme.GmePanel.Layout,
      sizeUpdateFn: js.Function1[/* layout */ typings.webgme.GmePanel.Layout, Double]
    ): Unit = js.native
    /* CompleteClass */
    override def setReadOnly(isReadOnly: Boolean): Unit = js.native
    /* CompleteClass */
    override def setSize(width: Double, height: Double): Unit = js.native
    /* CompleteClass */
    override def setTitle(text: String): Unit = js.native
  }
  
  @js.native
  class PanelManager protected ()
    extends typings.webgme.GmePanel.PanelManager {
    def this(client: Client) = this()
    /* CompleteClass */
    override def getActivePanel(): typings.webgme.GmePanel.PanelBase = js.native
    /* CompleteClass */
    override def setActivePanel(panel: typings.webgme.GmePanel.PanelBase): Unit = js.native
  }
  
}

