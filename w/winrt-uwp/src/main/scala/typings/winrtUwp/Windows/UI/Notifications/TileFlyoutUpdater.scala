package typings.winrtUwp.Windows.UI.Notifications

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileFlyoutUpdater extends StObject {
  
  var clear: Any
  
  /* unmapped type */
  var setting: Any
  
  /* unmapped type */
  var startPeriodicUpdate: Any
  
  /* unmapped type */
  var stopPeriodicUpdate: Any
  
  /* unmapped type */
  var update: Any
}
object TileFlyoutUpdater {
  
  inline def apply(clear: Any, setting: Any, startPeriodicUpdate: Any, stopPeriodicUpdate: Any, update: Any): TileFlyoutUpdater = {
    val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any], startPeriodicUpdate = startPeriodicUpdate.asInstanceOf[js.Any], stopPeriodicUpdate = stopPeriodicUpdate.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileFlyoutUpdater]
  }
  
  extension [Self <: TileFlyoutUpdater](x: Self) {
    
    inline def setClear(value: Any): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
    
    inline def setSetting(value: Any): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
    
    inline def setStartPeriodicUpdate(value: Any): Self = StObject.set(x, "startPeriodicUpdate", value.asInstanceOf[js.Any])
    
    inline def setStopPeriodicUpdate(value: Any): Self = StObject.set(x, "stopPeriodicUpdate", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: Any): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
  }
}
