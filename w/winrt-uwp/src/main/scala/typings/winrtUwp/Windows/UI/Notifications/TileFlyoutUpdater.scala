package typings.winrtUwp.Windows.UI.Notifications

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileFlyoutUpdater extends StObject {
  
  var clear: js.Any
  
  /* unmapped type */
  var setting: js.Any
  
  /* unmapped type */
  var startPeriodicUpdate: js.Any
  
  /* unmapped type */
  var stopPeriodicUpdate: js.Any
  
  /* unmapped type */
  var update: js.Any
}
object TileFlyoutUpdater {
  
  @scala.inline
  def apply(
    clear: js.Any,
    setting: js.Any,
    startPeriodicUpdate: js.Any,
    stopPeriodicUpdate: js.Any,
    update: js.Any
  ): TileFlyoutUpdater = {
    val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any], startPeriodicUpdate = startPeriodicUpdate.asInstanceOf[js.Any], stopPeriodicUpdate = stopPeriodicUpdate.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileFlyoutUpdater]
  }
  
  @scala.inline
  implicit class TileFlyoutUpdaterMutableBuilder[Self <: TileFlyoutUpdater] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClear(value: js.Any): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetting(value: js.Any): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartPeriodicUpdate(value: js.Any): Self = StObject.set(x, "startPeriodicUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopPeriodicUpdate(value: js.Any): Self = StObject.set(x, "stopPeriodicUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: js.Any): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
  }
}
