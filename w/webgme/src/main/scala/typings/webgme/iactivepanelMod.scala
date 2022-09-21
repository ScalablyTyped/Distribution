package typings.webgme

import typings.webgme.GmePanel.IActivePanel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iactivepanelMod {
  
  @JSImport("js/PanelManager/IActivePanel", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with IActivePanel {
    
    /* CompleteClass */
    override def getNodeID(): String = js.native
    
    /* CompleteClass */
    override def onActivate(): Unit = js.native
    
    /* CompleteClass */
    override def onDeactivate(): Unit = js.native
    
    /* CompleteClass */
    override def setActive(isActive: Boolean): Unit = js.native
  }
}
