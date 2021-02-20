package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.drawerRouterMod.DrawerActionType
import typings.tuyaPanelKit.tuyaPanelKitStrings.CLOSE_DRAWER
import typings.tuyaPanelKit.tuyaPanelKitStrings.OPEN_DRAWER
import typings.tuyaPanelKit.tuyaPanelKitStrings.TOGGLE_DRAWER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `13` extends DrawerActionType {
  
  var source: js.UndefOr[String] = js.native
  
  var target: js.UndefOr[String] = js.native
  
  var `type`: OPEN_DRAWER | CLOSE_DRAWER | TOGGLE_DRAWER = js.native
}
object `13` {
  
  @scala.inline
  def apply(`type`: OPEN_DRAWER | CLOSE_DRAWER | TOGGLE_DRAWER): `13` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`13`]
  }
  
  @scala.inline
  implicit class `13MutableBuilder`[Self <: `13`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setType(value: OPEN_DRAWER | CLOSE_DRAWER | TOGGLE_DRAWER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
