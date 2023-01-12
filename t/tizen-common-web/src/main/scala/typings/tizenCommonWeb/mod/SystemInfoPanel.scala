package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInfoPanel
  extends StObject
     with SystemInfoProperty {
  
  /**
    * The height of the panel in pixels.
    */
  val panelHeight: Double
  
  /**
    * The width of the panel in pixels.
    */
  val panelWidth: Double
}
object SystemInfoPanel {
  
  inline def apply(panelHeight: Double, panelWidth: Double): SystemInfoPanel = {
    val __obj = js.Dynamic.literal(panelHeight = panelHeight.asInstanceOf[js.Any], panelWidth = panelWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoPanel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SystemInfoPanel] (val x: Self) extends AnyVal {
    
    inline def setPanelHeight(value: Double): Self = StObject.set(x, "panelHeight", value.asInstanceOf[js.Any])
    
    inline def setPanelWidth(value: Double): Self = StObject.set(x, "panelWidth", value.asInstanceOf[js.Any])
  }
}
