package typings.tuyaPanelKit.drawerRouterMod

import typings.tuyaPanelKit.tabRouterMod.TabActionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit/@react-navigation/routers/DrawerRouter", "DrawerActions")
@js.native
object DrawerActions extends js.Object {
  
  def closeDrawer(): DrawerActionType = js.native
  
  // tslint:disable-next-line no-redundant-undefined
  def jumpTo(name: String): TabActionType = js.native
  def jumpTo(name: String, params: js.Object): TabActionType = js.native
  
  def openDrawer(): DrawerActionType = js.native
  
  // tslint:disable-next-line no-redundant-undefined
  def toggleDrawer(): DrawerActionType = js.native
}
