package typings.wixStyleReact.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewColorsBranding extends StObject {
  
  var newColorsBranding: Requireable[Boolean]
  
  var sidebarExperimentCollapsible: Requireable[Boolean]
}
object NewColorsBranding {
  
  inline def apply(newColorsBranding: Requireable[Boolean], sidebarExperimentCollapsible: Requireable[Boolean]): NewColorsBranding = {
    val __obj = js.Dynamic.literal(newColorsBranding = newColorsBranding.asInstanceOf[js.Any], sidebarExperimentCollapsible = sidebarExperimentCollapsible.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewColorsBranding]
  }
  
  extension [Self <: NewColorsBranding](x: Self) {
    
    inline def setNewColorsBranding(value: Requireable[Boolean]): Self = StObject.set(x, "newColorsBranding", value.asInstanceOf[js.Any])
    
    inline def setSidebarExperimentCollapsible(value: Requireable[Boolean]): Self = StObject.set(x, "sidebarExperimentCollapsible", value.asInstanceOf[js.Any])
  }
}
