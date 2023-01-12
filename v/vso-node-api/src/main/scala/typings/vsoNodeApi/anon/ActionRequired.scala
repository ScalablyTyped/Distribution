package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionRequired extends StObject {
  
  var actionRequired: scala.Double
  
  var actionResolved: scala.Double
  
  var disabled: scala.Double
  
  var enabled: scala.Double
  
  var installed: scala.Double
  
  var uninstalled: scala.Double
  
  var versionUpdated: scala.Double
}
object ActionRequired {
  
  inline def apply(
    actionRequired: scala.Double,
    actionResolved: scala.Double,
    disabled: scala.Double,
    enabled: scala.Double,
    installed: scala.Double,
    uninstalled: scala.Double,
    versionUpdated: scala.Double
  ): ActionRequired = {
    val __obj = js.Dynamic.literal(actionRequired = actionRequired.asInstanceOf[js.Any], actionResolved = actionResolved.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], installed = installed.asInstanceOf[js.Any], uninstalled = uninstalled.asInstanceOf[js.Any], versionUpdated = versionUpdated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionRequired]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionRequired] (val x: Self) extends AnyVal {
    
    inline def setActionRequired(value: scala.Double): Self = StObject.set(x, "actionRequired", value.asInstanceOf[js.Any])
    
    inline def setActionResolved(value: scala.Double): Self = StObject.set(x, "actionResolved", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: scala.Double): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: scala.Double): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setInstalled(value: scala.Double): Self = StObject.set(x, "installed", value.asInstanceOf[js.Any])
    
    inline def setUninstalled(value: scala.Double): Self = StObject.set(x, "uninstalled", value.asInstanceOf[js.Any])
    
    inline def setVersionUpdated(value: scala.Double): Self = StObject.set(x, "versionUpdated", value.asInstanceOf[js.Any])
  }
}
