package typings.webgme

import typings.webgme.Global_.GmeLogger
import typings.webgme.GmePanel.Layout
import typings.webgme.GmePanel.LayoutManager
import typings.webgme.GmePanel.Options
import typings.webgme.GmePanel.OptionsWithHeader
import typings.webgme.GmePanel.PanelBaseWithHeader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsPanelBasePanelBaseWithHeaderMod {
  
  @JSImport("js/PanelBase/PanelBaseWithHeader", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with PanelBaseWithHeader {
    def this(options: OptionsWithHeader, layoutManger: LayoutManager) = this()
    
    /* CompleteClass */
    var OPTIONS: Options = js.native
    /* CompleteClass */
    @JSName("OPTIONS")
    var OPTIONS_PanelBaseWithHeader: OptionsWithHeader = js.native
    
    /* CompleteClass */
    override def afterAppend(): Unit = js.native
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    var control: Any = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def getNodeID(): String = js.native
    
    /* CompleteClass */
    override def initUI(options: OptionsWithHeader): Unit = js.native
    
    /* CompleteClass */
    override def isReadOnly(): Boolean = js.native
    
    /* CompleteClass */
    var logger: GmeLogger = js.native
    
    /* CompleteClass */
    override def onReadOnlyChanged(isReadOnly: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def onResize(width: Double, height: Double): Unit = js.native
    
    /* CompleteClass */
    override def setActive(isActive: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def setContainerUpdateFn(currentLayout: Layout, sizeUpdateFn: js.Function1[/* layout */ Layout, Double]): Unit = js.native
    
    /* CompleteClass */
    override def setReadOnly(isReadOnly: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def setSize(width: Double, height: Double): Unit = js.native
    
    /* CompleteClass */
    override def setTitle(text: String): Unit = js.native
  }
}
