package typings.winrtUwp.Windows.UI.Notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileFlyoutUpdater extends js.Object {
  
  var clear: js.Any = js.native
  
   /* unmapped type */ var setting: js.Any = js.native
  
   /* unmapped type */ var startPeriodicUpdate: js.Any = js.native
  
   /* unmapped type */ var stopPeriodicUpdate: js.Any = js.native
  
   /* unmapped type */ var update: js.Any = js.native
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
  implicit class TileFlyoutUpdaterOps[Self <: TileFlyoutUpdater] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClear(value: js.Any): Self = this.set("clear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetting(value: js.Any): Self = this.set("setting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartPeriodicUpdate(value: js.Any): Self = this.set("startPeriodicUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopPeriodicUpdate(value: js.Any): Self = this.set("stopPeriodicUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: js.Any): Self = this.set("update", value.asInstanceOf[js.Any])
  }
}
