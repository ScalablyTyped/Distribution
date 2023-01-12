package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.`@reactNavigationRoutersDrawerRouterMod`.DrawerActionType
import typings.tuyaPanelKit.tuyaPanelKitStrings.CLOSE_DRAWER
import typings.tuyaPanelKit.tuyaPanelKitStrings.OPEN_DRAWER
import typings.tuyaPanelKit.tuyaPanelKitStrings.TOGGLE_DRAWER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5`
  extends StObject
     with DrawerActionType {
  
  var source: js.UndefOr[String] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
  
  var `type`: OPEN_DRAWER | CLOSE_DRAWER | TOGGLE_DRAWER
}
object `5` {
  
  inline def apply(`type`: OPEN_DRAWER | CLOSE_DRAWER | TOGGLE_DRAWER): `5` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`5`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `5`] (val x: Self) extends AnyVal {
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setType(value: OPEN_DRAWER | CLOSE_DRAWER | TOGGLE_DRAWER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
