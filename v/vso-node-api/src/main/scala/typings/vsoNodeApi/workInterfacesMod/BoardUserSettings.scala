package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoardUserSettings extends StObject {
  
  var autoRefreshState: Boolean
}
object BoardUserSettings {
  
  @scala.inline
  def apply(autoRefreshState: Boolean): BoardUserSettings = {
    val __obj = js.Dynamic.literal(autoRefreshState = autoRefreshState.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoardUserSettings]
  }
  
  @scala.inline
  implicit class BoardUserSettingsMutableBuilder[Self <: BoardUserSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoRefreshState(value: Boolean): Self = StObject.set(x, "autoRefreshState", value.asInstanceOf[js.Any])
  }
}
