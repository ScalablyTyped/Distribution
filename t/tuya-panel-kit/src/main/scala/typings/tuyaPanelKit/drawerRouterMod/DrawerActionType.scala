package typings.tuyaPanelKit.drawerRouterMod

import typings.tuyaPanelKit.anon.NameString
import typings.tuyaPanelKit.tuyaPanelKitStrings.CLOSE_DRAWER
import typings.tuyaPanelKit.tuyaPanelKitStrings.JUMP_TO
import typings.tuyaPanelKit.tuyaPanelKitStrings.OPEN_DRAWER
import typings.tuyaPanelKit.tuyaPanelKitStrings.TOGGLE_DRAWER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.tuyaPanelKit.tabRouterMod.TabActionType
  - typings.tuyaPanelKit.anon.`13`
*/
trait DrawerActionType extends js.Object
object DrawerActionType {
  
  @scala.inline
  def TabActionType(payload: NameString, `type`: JUMP_TO): DrawerActionType = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerActionType]
  }
  
  @scala.inline
  def `13`(`type`: OPEN_DRAWER | CLOSE_DRAWER | TOGGLE_DRAWER): DrawerActionType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerActionType]
  }
}
